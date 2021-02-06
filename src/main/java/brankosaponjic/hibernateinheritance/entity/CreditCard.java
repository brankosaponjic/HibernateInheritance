package brankosaponjic.hibernateinheritance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue(value = "cc")
public class CreditCard extends Payment{

    @Column(name = "cardnumber")
    private String cardNumber;
}
