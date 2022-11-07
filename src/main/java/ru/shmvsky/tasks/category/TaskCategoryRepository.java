package ru.shmvsky.tasks.category;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shmvsky.tasks.category.TaskCategory;

import java.util.Optional;

public interface TaskCategoryRepository extends JpaRepository<TaskCategory, Long> {

    Optional<TaskCategory> findByName(String name);

}
