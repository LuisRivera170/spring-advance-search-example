package com.lara.employee.controller;

import com.lara.employee.service.EmployeeService;
import com.lara.employee.core.EmployeeSpecificationBuilder;
import com.lara.employee.domain.Employee;
import com.lara.employee.dto.SearchCriteria;
import com.lara.employee.dto.request.EmployeeSearch;
import com.lara.employee.dto.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/search")
    public ResponseEntity<ApiResponse> advanceSearchEmployees(
            @RequestParam(name = "pageNum", defaultValue = "0") int pageNum,
            @RequestParam(name = "pageSize", defaultValue = "10") int pageSize,
            @RequestBody EmployeeSearch employeeSearch
            ) {
        EmployeeSpecificationBuilder builder = new EmployeeSpecificationBuilder();

        List<SearchCriteria> criteriaList = employeeSearch.getSearchCriteriaList();
        if (criteriaList != null) {
            criteriaList.forEach(criteria -> {
                criteria
                        .setDataOption(employeeSearch.getDataOption());
                builder.with(criteria);
            });
        }

        Pageable page = PageRequest.of(pageNum,
                pageSize,
                Sort
                    .by("firstName")
                    .ascending()
                    .and(Sort.by("lastName"))
                    .ascending()
                    .and(Sort.by("department"))
                    .ascending()
        );

        Page<Employee> employeePage =
                employeeService.findBySearchCriteria(builder.build(), page);

        ApiResponse apiResponse = ApiResponse.builder()
                .data(employeePage)
                .responseCode(HttpStatus.OK)
                .message("Successfully retrieved employee records")
                .build();

        return ResponseEntity.ok(apiResponse);
    }

}
