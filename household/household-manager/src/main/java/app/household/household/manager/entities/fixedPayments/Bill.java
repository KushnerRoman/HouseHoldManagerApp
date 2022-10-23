package app.household.household.manager.entities.fixedPayments;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Bill extends FixedPayment {

    @Enumerated(EnumType.STRING)
    private BillType billType;

}
