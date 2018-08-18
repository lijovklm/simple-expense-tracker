package tech.heartin.projects.set.repository;

import org.springframework.data.repository.CrudRepository;

import tech.heartin.projects.set.domain.CategoryGroup;


/**
 * CRUD Repository for Category.
 */
public interface CategoryGroupRepository extends CrudRepository<CategoryGroup, Long> {
}
