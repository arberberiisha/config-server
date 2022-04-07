package com.example.departmentservice.controller;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Save department, DepartmentController.");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable("id") Long departmentId){
        log.info("Find by Id, DepartmentController.");

        return departmentService.findDepartmentById(departmentId);
    }
}
