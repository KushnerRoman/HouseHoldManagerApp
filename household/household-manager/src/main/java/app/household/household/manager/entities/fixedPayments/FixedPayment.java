package app.household.household.manager.entities.fixedPayments;


import app.household.household.manager.entities.Payment;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Setter
@Getter
@ToString
public abstract class FixedPayment extends Payment {




    private Date fixedPayDate;

    private double amount;

    //TODO: check and create period date for sql







}

