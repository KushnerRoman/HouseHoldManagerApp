package app.household.household.manager.entities.variablePayments;

import app.household.household.manager.entities.Payment;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OutDoor extends Payment {

    private String place;

    private String purpose;


}
