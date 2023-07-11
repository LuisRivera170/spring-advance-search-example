package com.lara.employee.dto.request;

import com.lara.employee.dto.SearchCriteria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeSearch {

    private String dataOption;
    private List<SearchCriteria> searchCriteriaList;

}
