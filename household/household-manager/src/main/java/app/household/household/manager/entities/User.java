
package app.household.household.manager.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @ManyToMany(targetEntity = Payment.class ,fetch = FetchType.LAZY, cascade = CascadeType.ALL)
            @JoinTable(name = "user_vs_payment",
                    joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "userId"),
                    inverseJoinColumns = @JoinColumn(name = "payment_id", referencedColumnName = "paymentId")
            )

    private List<Payment> outComePayments = new java.util.ArrayList<>();

    private String firstName;
    private String lastName;
    private String email;
    @JsonIgnore
    private String password;





    @Override
    public String toString() {
        return "User{" + "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + '}';
    }

}
