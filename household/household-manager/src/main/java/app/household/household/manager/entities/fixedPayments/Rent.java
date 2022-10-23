package app.household.household.manager.entities.fixedPayments;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Rent extends FixedPayment{

    private double amount;

    private String address;
}
