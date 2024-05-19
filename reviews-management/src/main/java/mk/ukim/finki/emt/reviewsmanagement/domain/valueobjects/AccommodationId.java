package mk.ukim.finki.emt.reviewsmanagement.domain.valueobjects;

import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class AccommodationId extends DomainObjectId {
    private AccommodationId(){
        super(AccommodationId.randomId(AccommodationId.class).getId());
    }
    public AccommodationId(@NonNull String uuid){
        super(uuid);
    }
}
