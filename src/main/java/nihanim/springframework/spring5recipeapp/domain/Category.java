package nihanim.springframework.spring5recipeapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String description;
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;
}
