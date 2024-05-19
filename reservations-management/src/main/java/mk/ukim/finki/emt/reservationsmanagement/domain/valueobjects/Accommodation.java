package mk.ukim.finki.emt.reservationsmanagement.domain.valueobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

@Getter
public class Accommodation implements ValueObject {
    private final AccommodationId accommodationId;
    private final String name;
    private final String description;
    private final int price;

    private Accommodation(){
        this.accommodationId=AccommodationId.randomId(AccommodationId.class);
        this.name="";
        this.description="";
        this.price=0;
    }

    @JsonCreator
    public Accommodation(@JsonProperty("id") AccommodationId id,
                         @JsonProperty("name") String name,
                         @JsonProperty("description") String description,
                         @JsonProperty("price") int price) {
        this.accommodationId=id;
        this.name=name;
        this.description=description;
        this.price=price;
    }
}
