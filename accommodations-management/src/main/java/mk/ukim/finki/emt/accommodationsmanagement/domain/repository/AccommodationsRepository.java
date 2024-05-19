package mk.ukim.finki.emt.accommodationsmanagement.domain.repository;

import mk.ukim.finki.emt.accommodationsmanagement.domain.model.Accommodation;
import mk.ukim.finki.emt.accommodationsmanagement.domain.model.AccommodationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccommodationsRepository extends JpaRepository<Accommodation, AccommodationId> {
}
