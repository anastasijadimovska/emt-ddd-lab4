package mk.ukim.finki.emt.reservationsmanagement.domain.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import mk.ukim.finki.emt.reservationsmanagement.domain.valueobjects.AccommodationId;
import mk.ukim.finki.emt.reservationsmanagement.domain.valueobjects.CustomerId;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

import java.time.LocalDateTime;

@Entity
@Table(name = "reservation")
@Getter
public class Reservation extends AbstractEntity<ReservationId> {
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private PaymentMethod paymentMethod;

    @AttributeOverride(name="id", column =
    @Column(name = "customer_id",nullable = false))
    private CustomerId customerId;

    @AttributeOverride(name = "id", column =
    @Column(name="accommodation_id",nullable = false))
    private AccommodationId accommodationId;


    private Reservation(){
        super(ReservationId.randomId(ReservationId.class));
    }

    public static Reservation build(LocalDateTime startDate, LocalDateTime endDate, PaymentMethod paymentMethod, CustomerId customerId, AccommodationId accommodationId){
        Reservation r = new Reservation();
        r.startDate = startDate;
        r.endDate = endDate;
        r.paymentMethod = paymentMethod;
        r.customerId = customerId;
        r.accommodationId = accommodationId;

        return r;
    }
}
