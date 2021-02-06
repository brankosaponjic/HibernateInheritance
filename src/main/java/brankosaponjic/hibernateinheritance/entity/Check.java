package brankosaponjic.hibernateinheritance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue(value = "ch")
public class Check extends Payment{

    @Column(name = "checknumber")
    private String checkNumber;
}
