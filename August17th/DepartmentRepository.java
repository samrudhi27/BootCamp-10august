package com.telstra.springboot.repository;

import com.telstra.springboot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    //public Department findByDepartmentName(String departmentName);
    public Department findByDepartmentName(String departmentName);

    //public Department findByDepartmentNameIgnoreCase(String departmentName);
}
