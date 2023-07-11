package com.lara.employee.service;

import com.lara.employee.domain.Employee;
import com.lara.employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Page<Employee> findBySearchCriteria(Specification<Employee> specification, Pageable pageable) {
        return employeeRepository.findAll(specification, pageable);
    }

}
