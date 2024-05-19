package mk.ukim.finki.emt.accommodationsmanagement.service.forms;

import lombok.Data;
import mk.ukim.finki.emt.accommodationsmanagement.domain.model.Category;
import mk.ukim.finki.emt.accommodationsmanagement.domain.model.Country;
import mk.ukim.finki.emt.accommodationsmanagement.domain.model.Host;
import mk.ukim.finki.emt.accommodationsmanagement.domain.valueobjects.AvailableRooms;

@Data
public class AccommodationForm {
    String name;
    String description;
    Category category;
    AvailableRooms availableRooms;
    int price;
    Country country;
    Host host;
}
