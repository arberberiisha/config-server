package com.example.departmentservice.repository;

import com.example.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Query("SELECT d from Department d where d.departmentId = ?1")
    Department findByDepartmentId(Long departmentId);
}
