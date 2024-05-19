package mk.ukim.finki.emt.accommodationsmanagement.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

@Entity
@Table(name="country")
@Getter
public class Country extends AbstractEntity<CountryId> {

    @Column(name = "country_name")
    private String name;
    private String continent;

    private Country(){
        super(CountryId.randomId(CountryId.class));
    }
    public Country(@NonNull String name, @NonNull String continent) {
        super(CountryId.randomId(CountryId.class));
        this.name = name;
        this.continent = continent;
    }
}
