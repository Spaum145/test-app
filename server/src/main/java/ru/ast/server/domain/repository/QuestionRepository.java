package ru.ast.server.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.ast.server.domain.entity.Question;

/**
 * @author Fenix
 */
@Transactional
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
