package tech.heartin.projects.set.repository;

import org.springframework.data.repository.CrudRepository;

import tech.heartin.projects.set.domain.Tag;

/**
 * CRUD Repository for Tag.
 */
public interface TagRepository extends CrudRepository<Tag, Long> {
}
