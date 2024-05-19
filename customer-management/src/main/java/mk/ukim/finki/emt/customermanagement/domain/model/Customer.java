package mk.ukim.finki.emt.customermanagement.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.userinfo.UserInfo;

@Entity
@Table(name = "customer")
@Getter
public class Customer extends AbstractEntity<CustomerId> {

    @AttributeOverrides({
            @AttributeOverride(name="gender", column =
            @Column(name="customer_gender")),
            @AttributeOverride(name="name", column =
            @Column(name="customer_name")),
            @AttributeOverride(name="surname", column =
            @Column(name="customer_surname")),
            @AttributeOverride(name="email", column =
            @Column(name="customer_email")),
            @AttributeOverride(name="password", column =
            @Column(name="customer_password")),
    })
    private UserInfo customerInfo;

    private Customer(){
        super(CustomerId.randomId(CustomerId.class));
    }
}
