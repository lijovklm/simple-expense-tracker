package tech.heartin.projects.set.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

/**
 * Category for an expense.
 */
@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Byte[] image;

    @OneToMany(mappedBy = "category")
    private Set<Expense> expenses;

    //TODO: Add Categories to Group. Hint: Refer to category grouping in data.xml.
}
