package app.household.household.manager.entities.fixedPayments;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Loan extends FixedPayment{

    private int paymentNumber;

    private String lender;


}
