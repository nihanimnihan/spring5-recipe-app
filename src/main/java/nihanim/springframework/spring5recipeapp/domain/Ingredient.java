package nihanim.springframework.spring5recipeapp.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String description;
    @Column
    private BigDecimal amount;
    @OneToOne(cascade = CascadeType.ALL)
    private UnitOfMeasure uom;
    @ManyToOne
    private Recipe recipe;

}
