package ru.shmvsky.tasks.Task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskCategoryRepository extends JpaRepository<TaskCategory, Long> {

//    Optional<TaskCategory> findByName(String name);

}
