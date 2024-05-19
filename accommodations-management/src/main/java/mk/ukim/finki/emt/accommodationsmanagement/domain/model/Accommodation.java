package mk.ukim.finki.emt.accommodationsmanagement.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.accommodationsmanagement.domain.valueobjects.AvailableRooms;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

@Entity
@Table(name = "accommodation")
@Getter
public class Accommodation extends AbstractEntity<AccommodationId> {
    @Column(name="acc_name")
    private String name;
    private String description;
    private Category category;
    private AvailableRooms availableRooms;
    private int price;
    @OneToOne
    private Country country;

    @OneToOne
    private Host host;

    private Accommodation(){
        super(AccommodationId.randomId(AccommodationId.class));
    }

    public static Accommodation build(String name, String description, Category category, AvailableRooms availableRooms,
                                      int price, Country country, Host host){
        Accommodation a = new Accommodation();
        a.name = name;
        a.description = description;
        a.category = category;
        a.availableRooms = availableRooms;
        a.price = price;
        a.country = country;
        a.host = host;
        return  a;
    }

    public void reserve(){
        this.availableRooms = new AvailableRooms(this.availableRooms.getNumOfAvailableRooms() + 1);
    }

    public void remove(){
        this.availableRooms = new AvailableRooms(this.availableRooms.getNumOfAvailableRooms()-1);
    }
}
