package tech.heartin.projects.set.repository;

import org.springframework.data.repository.CrudRepository;

import tech.heartin.projects.set.domain.Expense;

/**
 * CRUD Repository for Expense.
 */
public interface ExpenseRepository extends CrudRepository<Expense, Long> {
}
