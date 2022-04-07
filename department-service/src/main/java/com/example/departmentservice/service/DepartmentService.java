package com.example.departmentservice.service;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.repository.DepartmentRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class DepartmentService {

    private DepartmentRepository departmentRespository;

    public DepartmentService(DepartmentRepository departmentRespository) {
        this.departmentRespository = departmentRespository;
    }

    public Department saveDepartment(Department department) {
        log.info("Save department, DepartmentService.");

        return departmentRespository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Find by Id, DepartmentService.");

        return departmentRespository.findByDepartmentId(departmentId);
    }
}
