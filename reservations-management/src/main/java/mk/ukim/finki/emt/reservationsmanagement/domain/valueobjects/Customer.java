package mk.ukim.finki.emt.reservationsmanagement.domain.valueobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;
import mk.ukim.finki.emt.sharedkernel.userinfo.Gender;
import mk.ukim.finki.emt.sharedkernel.userinfo.UserInfo;

@Getter
public class Customer implements ValueObject {
    private final CustomerId id;
    private final UserInfo userInfo;

    private Customer() {
        this.id = CustomerId.randomId(CustomerId.class);
        this.userInfo = UserInfo.valueOf(Gender.FEMALE, "", "", "", "");
    }

    @JsonCreator
    public Customer(@JsonProperty("id") CustomerId id,
                    @JsonProperty("userInfo") UserInfo userInfo) {
        this.id = id;
        this.userInfo = userInfo;
    }
}
