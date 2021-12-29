package avocado.ecommercebackend.user.model;

import avocado.ecommercebackend.base.UtilTimeSetter;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class User extends UtilTimeSetter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String loginId;
    private String userName;
    private String userPassword;
    private String userPhone;
    private String userAddress;
    private String userEmail;
    private String userBirth;


    @Builder
    public User(String loginId, String userName, String userPassword, String userPhone, String userAddress, String userEmail, String userBirth) {
        this.loginId = loginId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.userEmail = userEmail;
        this.userBirth = userBirth;
    }
}