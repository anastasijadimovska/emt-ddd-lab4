package mk.ukim.finki.emt.accommodationsmanagement.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.accommodationsmanagement.domain.exceptions.AccommodationNotFoundException;
import mk.ukim.finki.emt.accommodationsmanagement.domain.model.Accommodation;
import mk.ukim.finki.emt.accommodationsmanagement.domain.model.AccommodationId;
import mk.ukim.finki.emt.accommodationsmanagement.domain.repository.AccommodationsRepository;
import mk.ukim.finki.emt.accommodationsmanagement.service.AccommodationsService;
import mk.ukim.finki.emt.accommodationsmanagement.service.forms.AccommodationForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class AccommodationsServiceImpl implements AccommodationsService {
    private final AccommodationsRepository accommodationsRepository;

    @Override
    public List<Accommodation> findAll() {
        return accommodationsRepository.findAll();
    }

    @Override
    public Accommodation findById(AccommodationId id) {
        return accommodationsRepository.findById(id).orElseThrow(AccommodationNotFoundException::new);
    }

    @Override
    public Accommodation createAccommodation(AccommodationForm accommodationForm) {
        Accommodation a = Accommodation.build(accommodationForm.getName(), accommodationForm.getDescription(),
                accommodationForm.getCategory(), accommodationForm.getAvailableRooms(), accommodationForm.getPrice(),
                accommodationForm.getCountry(), accommodationForm.getHost());

        accommodationsRepository.save(a);
        return a;
    }

    @Override
    public Accommodation reservationCreated(AccommodationId accommodationId) {
        Accommodation a = accommodationsRepository.findById(accommodationId).orElseThrow(AccommodationNotFoundException::new);
        a.reserve();
        return a;
    }

    @Override
    public Accommodation reservationRemoved(AccommodationId accommodationId) {
        Accommodation a = accommodationsRepository.findById(accommodationId).orElseThrow(AccommodationNotFoundException::new);
        a.remove();
        return a;
    }

}
