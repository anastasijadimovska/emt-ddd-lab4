package mk.ukim.finki.emt.accommodationsmanagement.domain.model;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class CountryId extends DomainObjectId {
    private CountryId() {
        super(CountryId.randomId(CountryId.class).getId());
    }

    public CountryId(String uuid) {
        super(uuid);
    }
}
