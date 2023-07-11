package com.lara.employee.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import static jakarta.persistence.GenerationType.AUTO;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "EMP_ID")
    private Long id;

    @Column(name = "EMP_LASTNM")
    private String lastName;

    @Column(name = "EMP_FIRSTNM")
    private String  firstName;

    @Column(name = "JOB_NM")
    private String jobName;

    @Column(name = "MGR_ID", nullable = true)
    private Long managerId;

    @Column(name = "HIREDT")
    private Date hireDate;

    @Column(name = "SALARY")
    private double salary;

    @Column(name = "COMMISSION", nullable = true)
    private double commission;

    @ManyToOne
    @JoinColumn(name = "DEPT_ID")
    private Department department;

}
