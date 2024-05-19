package mk.ukim.finki.emt.reviewsmanagement.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class Rating implements ValueObject {
    private final double rating;

    protected Rating(){
        this.rating=0.0;
    }
}
