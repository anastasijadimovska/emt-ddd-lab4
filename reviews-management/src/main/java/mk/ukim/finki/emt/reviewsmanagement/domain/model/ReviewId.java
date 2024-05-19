package mk.ukim.finki.emt.reviewsmanagement.domain.model;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class ReviewId extends DomainObjectId {
    private ReviewId() {
        super(ReviewId.randomId(ReviewId.class).getId());
    }

    public ReviewId(String uuid) {
        super(uuid);
    }
}
