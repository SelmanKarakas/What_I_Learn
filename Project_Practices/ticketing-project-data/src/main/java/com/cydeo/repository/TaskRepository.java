package com.cydeo.repository;

import com.cydeo.dto.TaskDTO;
import com.cydeo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {



}
