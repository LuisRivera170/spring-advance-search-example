package com.lara.employee.core;

import com.lara.employee.domain.Employee;
import com.lara.employee.domain.SearchOperation;
import com.lara.employee.dto.SearchCriteria;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSpecificationBuilder {

    private final List<SearchCriteria> params;

    public EmployeeSpecificationBuilder() {
        this.params = new ArrayList<>();
    }

    public final EmployeeSpecificationBuilder with(String key, String operation, Object value) {
        params.add(new SearchCriteria(key, operation, value));
        return this;
    }

    public final EmployeeSpecificationBuilder with(SearchCriteria searchCriteria) {
        params.add(searchCriteria);
        return this;
    }

    public Specification<Employee> build() {
        if (params.size() == 0) {
            return null;
        }

        Specification<Employee> result = new EmployeeSpecification(params.get(0));
        for (SearchCriteria criteria: params) {
            result = SearchOperation.getDataOption(criteria.getDataOption()) == SearchOperation.ALL ?
                    Specification.where(result).and(new EmployeeSpecification(criteria)) :
                    Specification.where(result).or(new EmployeeSpecification(criteria));
        }

        return result;
    }

}
