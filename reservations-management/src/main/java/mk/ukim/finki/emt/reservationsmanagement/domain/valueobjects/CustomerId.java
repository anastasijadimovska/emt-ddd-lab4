package mk.ukim.finki.emt.reservationsmanagement.domain.valueobjects;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class CustomerId extends DomainObjectId {
    private CustomerId() {
        super(CustomerId.randomId(CustomerId.class).getId());
    }

    public CustomerId(String uuid) {
        super(uuid);
    }
}
