package tech.heartin.projects.set.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


/**
 * Expense entity.
 */
@Data
@Entity
public class CategoryGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupId;
    private String groupName;
//    @OneToMany(mappedBy = "categoryGroup")
//    private Set<Category> category;
// //    @ManyToMany
//    @JoinTable(name = "tag_expense", joinColumns = @JoinColumn(name = "expense_id"),
//            inverseJoinColumns = @JoinColumn(name = "tag_id"))
//    private Set<Tag> tags;

}
