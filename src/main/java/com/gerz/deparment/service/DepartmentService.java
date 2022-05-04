package com.gerz.deparment.service;

import com.gerz.deparment.entity.Department;
import com.gerz.deparment.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department){
        log.info("Inside saveDeparment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartment(Long departmentId) {
        log.info("Inside findDepartment of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }


    public List<Department> getDepartment() {
        return departmentRepository.findAll();
    }
}
