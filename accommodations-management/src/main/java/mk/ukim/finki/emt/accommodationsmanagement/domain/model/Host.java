package mk.ukim.finki.emt.accommodationsmanagement.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.userinfo.UserInfo;

@Entity
@Table(name = "host")
@Getter
public class Host extends AbstractEntity<HostId> {

    @AttributeOverrides({
            @AttributeOverride(name="gender", column =
            @Column(name="host_gender")),
            @AttributeOverride(name="name", column =
            @Column(name="host_name")),
            @AttributeOverride(name="surname", column =
            @Column(name="host_surname")),
            @AttributeOverride(name="email", column =
            @Column(name="host_email")),
            @AttributeOverride(name="password", column =
            @Column(name="host_password")),
    })
    private UserInfo hostInfo;
    private int phoneNumber;

    private Host(){
        super(HostId.randomId(HostId.class));
    }

    public Host(@NonNull UserInfo hostInfo, int phoneNumber) {
        super(HostId.randomId(HostId.class));
        this.hostInfo = hostInfo;
        this.phoneNumber = phoneNumber;
    }
}
