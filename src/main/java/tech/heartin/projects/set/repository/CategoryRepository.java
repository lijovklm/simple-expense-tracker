package tech.heartin.projects.set.repository;

import org.springframework.data.repository.CrudRepository;

import tech.heartin.projects.set.domain.Category;

/**
 * CRUD Repository for Category.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
