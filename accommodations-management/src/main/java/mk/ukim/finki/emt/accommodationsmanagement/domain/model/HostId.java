package mk.ukim.finki.emt.accommodationsmanagement.domain.model;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class HostId extends DomainObjectId {
    private HostId() {
        super(HostId.randomId(HostId.class).getId());
    }

    public HostId(String uuid) {
        super(uuid);
    }

}
