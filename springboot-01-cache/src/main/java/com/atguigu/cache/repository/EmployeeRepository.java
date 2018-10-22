package com.atguigu.cache.repository;

import com.atguigu.cache.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
