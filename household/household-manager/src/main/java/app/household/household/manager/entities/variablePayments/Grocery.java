package app.household.household.manager.entities.variablePayments;

import app.household.household.manager.entities.Payment;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Grocery extends Payment {

    @Enumerated(EnumType.STRING)
    private GroceryType groceryType;

}
