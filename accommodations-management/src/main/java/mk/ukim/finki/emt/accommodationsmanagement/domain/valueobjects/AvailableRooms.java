package mk.ukim.finki.emt.accommodationsmanagement.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class AvailableRooms implements ValueObject {
    private final int numOfAvailableRooms;

    protected AvailableRooms(){
        this.numOfAvailableRooms=0;
    }
    public AvailableRooms(int numOfAvailableRooms){
        this.numOfAvailableRooms=numOfAvailableRooms;
    }

}
