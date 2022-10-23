package app.household.household.manager.entities;



import lombok.Getter;

import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Payment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long paymentId;

    @OneToMany(mappedBy = "userId", fetch = FetchType.LAZY,cascade = CascadeType.ALL, orphanRemoval = true)
    private List<User> payersList;

    private Date paymentDate;

    private String description;

    private double totalAmount;

    private int credit;

    private double currentAmount;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    private String reception;


}
