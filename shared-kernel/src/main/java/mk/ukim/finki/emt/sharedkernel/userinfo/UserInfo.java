package mk.ukim.finki.emt.sharedkernel.userinfo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NonNull;

@Embeddable
@Getter
public class UserInfo {
    @Enumerated(value = EnumType.STRING)
    private final Gender gender;
    private final String name;
    private final String surname;
    private final String email;
    private final String password;

    protected UserInfo(){
        this.gender=null;
        this.name=null;
        this.surname=null;
        this.email=null;
        this.password=null;
    }

    public UserInfo(@NonNull Gender gender,
                    @NonNull String name,
                    @NonNull String surname,
                    @NonNull String email,
                    @NonNull String password) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public static UserInfo valueOf(Gender gender, String name, String surname, String email, String password){
        return new UserInfo(gender, name, surname, email, password);
    }
}
