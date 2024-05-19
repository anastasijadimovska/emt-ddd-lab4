package mk.ukim.finki.emt.accommodationsmanagement.domain.repository;

import mk.ukim.finki.emt.accommodationsmanagement.domain.model.Host;
import mk.ukim.finki.emt.accommodationsmanagement.domain.model.HostId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostRepository extends JpaRepository<Host, HostId> {
}
