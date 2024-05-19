package mk.ukim.finki.emt.reservationsmanagement.domain.repository;

import mk.ukim.finki.emt.reservationsmanagement.domain.model.Reservation;
import mk.ukim.finki.emt.reservationsmanagement.domain.model.ReservationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationsRepository extends JpaRepository<Reservation, ReservationId> {
}
