package mk.ukim.finki.emt.reservationsmanagement.domain.model;

import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class ReservationId extends DomainObjectId {
    private ReservationId() {
        super(ReservationId.randomId(ReservationId.class).getId());
    }

    public ReservationId(@NonNull String uuid) {
        super(uuid);
    }

}
