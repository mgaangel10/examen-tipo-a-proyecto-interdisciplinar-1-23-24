package com.salesianostriana.dam.rest.task.repo;

import com.salesianostriana.dam.rest.task.GetTaskDto;
import com.salesianostriana.dam.rest.task.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

 /* @Query("""
          select com.salesianostriana.dam.rest/task/GetTaskDto(
          t.id,
          t.title,
          t.deadline
          ) from Task t
          """)
    List<GetTaskDto>listTask();*/

}
