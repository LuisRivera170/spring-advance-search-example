package com.lara.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchCriteria {

    private String filterKey;
    private Object value;
    private String operation;
    private String dataOption;

    public SearchCriteria(String filterKey, String operation,
                          Object value){
        super();
        this.filterKey = filterKey;
        this.operation = operation;
        this.value = value;
    }

}
