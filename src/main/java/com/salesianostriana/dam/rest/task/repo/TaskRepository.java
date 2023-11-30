package com.salesianostriana.dam.rest.task.repo;

import com.salesianostriana.dam.rest.task.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
