package mk.ukim.finki.emt.accommodationsmanagement.domain.repository;

import mk.ukim.finki.emt.accommodationsmanagement.domain.model.Country;
import mk.ukim.finki.emt.accommodationsmanagement.domain.model.CountryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, CountryId> {
}
