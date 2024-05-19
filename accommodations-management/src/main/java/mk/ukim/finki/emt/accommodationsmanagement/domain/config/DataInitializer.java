package mk.ukim.finki.emt.accommodationsmanagement.domain.config;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.accommodationsmanagement.domain.model.Accommodation;
import mk.ukim.finki.emt.accommodationsmanagement.domain.model.Category;
import mk.ukim.finki.emt.accommodationsmanagement.domain.model.Country;
import mk.ukim.finki.emt.accommodationsmanagement.domain.model.Host;
import mk.ukim.finki.emt.accommodationsmanagement.domain.repository.AccommodationsRepository;
import mk.ukim.finki.emt.accommodationsmanagement.domain.repository.CountryRepository;
import mk.ukim.finki.emt.accommodationsmanagement.domain.repository.HostRepository;
import mk.ukim.finki.emt.accommodationsmanagement.domain.valueobjects.AvailableRooms;
import mk.ukim.finki.emt.sharedkernel.userinfo.Gender;
import mk.ukim.finki.emt.sharedkernel.userinfo.UserInfo;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@AllArgsConstructor
public class DataInitializer {
    private final AccommodationsRepository accommodationsRepository;
    private final CountryRepository countryRepository;
    private final HostRepository hostRepository;

    @PostConstruct
    public void init(){
        Country c = new Country("Macedonia","Europe");
        Country c1 = new Country("North Macedonia","Europe");
        countryRepository.saveAll(Arrays.asList(c,c1));

        Host h =new Host(UserInfo.valueOf(Gender.FEMALE,"Anastasija","Dimovska","ad@gmail.com","emt"),075123456);
        Host h1 =new Host(UserInfo.valueOf(Gender.FEMALE,"Anastasija","Dimovska","ad@gmail.com","emt"),075123);
        hostRepository.saveAll(Arrays.asList(h,h1));


        Accommodation a1 = Accommodation.build("Epinal","Hotel in Bitola", Category.HOTEL, new AvailableRooms(3),500,c,h);
        Accommodation a2 = Accommodation.build("Shirok Sokak Apartments","Apartements in Bitola",Category.APARTMENT, new AvailableRooms(3),300,c1,h1);

        if(accommodationsRepository.findAll().isEmpty()) {
            accommodationsRepository.saveAll(Arrays.asList(a1, a2));
        }
    }
}
