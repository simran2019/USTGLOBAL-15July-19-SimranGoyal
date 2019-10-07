package com.ustglobal.ustspringbootfinalpro.reposatory;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ustglobal.ustspringbootfinalpro.dto.Task;

public interface TaskReposatory extends JpaRepository<Task, Integer> {
	@Transactional
	@Modifying
	@Query("update Task t set t.end_date=:end_date where t.id=:id")
	public void update(@Param("end_date") Date end_date , @Param("id") int id);
}
