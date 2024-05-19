package mk.ukim.finki.emt.reservationsmanagement.service;

import mk.ukim.finki.emt.reservationsmanagement.domain.valueobjects.Accommodation;
import mk.ukim.finki.emt.reservationsmanagement.xport.AccommodationsClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class AccommodationServiceImplTest {
    @Autowired
    private AccommodationsClient accommodationsClient;

    @Test
    public void testListAccommodations(){
        List<Accommodation> a = accommodationsClient.findAll();
        System.out.println(a);
    }

}
