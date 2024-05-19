package mk.ukim.finki.emt.reviewsmanagement.domain.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import mk.ukim.finki.emt.reviewsmanagement.domain.valueobjects.AccommodationId;
import mk.ukim.finki.emt.reviewsmanagement.domain.valueobjects.CustomerId;
import mk.ukim.finki.emt.reviewsmanagement.domain.valueobjects.Rating;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

@Entity
@Table(name = "reviews")
@Getter
public class Review extends AbstractEntity<ReviewId> {

    private Rating rating;
    private String comment;
    @AttributeOverride(name="id", column =
    @Column(name = "cust_id",nullable = false))
    private CustomerId customerId;

    @AttributeOverride(name = "id", column =
    @Column(name="accom_id",nullable = false))
    private AccommodationId accommodationId;


    private Review(){
        super(ReviewId.randomId(ReviewId.class));
    }
}
