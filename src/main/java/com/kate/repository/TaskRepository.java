package com.kate.repository;

import com.kate.model.Task;
import org.springframework.data.repository.PagingAndSortingRepository;


/**
 * Created by je4282oi on 4/5/2018.
 */
public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {

}
