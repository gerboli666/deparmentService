package com.gerz.deparment.controller;
import com.gerz.deparment.entity.Department;
import com.gerz.deparment.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{departmentId}")
    public Department findDepartment(@PathVariable Long departmentId){
        log.info("Inside findDepartment method of DepartmentController");
        return departmentService.findDepartment(departmentId);
    }
    @GetMapping("/")
    public List<Department> getDepartment(Department department){
        return departmentService.getDepartment();
    }

}
