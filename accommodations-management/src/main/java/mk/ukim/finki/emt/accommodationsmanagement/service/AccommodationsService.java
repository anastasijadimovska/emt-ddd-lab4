package mk.ukim.finki.emt.accommodationsmanagement.service;

import mk.ukim.finki.emt.accommodationsmanagement.domain.model.Accommodation;
import mk.ukim.finki.emt.accommodationsmanagement.domain.model.AccommodationId;
import mk.ukim.finki.emt.accommodationsmanagement.service.forms.AccommodationForm;

import java.util.List;

public interface AccommodationsService {
    List<Accommodation> findAll();
    Accommodation findById(AccommodationId id);
    Accommodation createAccommodation(AccommodationForm accommodationForm);
    Accommodation reservationCreated(AccommodationId accommodationId);
    Accommodation reservationRemoved(AccommodationId accommodationId);
}
