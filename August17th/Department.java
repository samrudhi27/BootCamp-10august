package com.telstra.springboot.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentID;

   @NotBlank(message="Please Add Department Name")
    private String departmentName;
    private String DepartmentAddress;

    private  String departmentCode;


/*
    public Department(String departmentName, String departmentAddress, long departmentID, String departmentCode) {
        DepartmentName = departmentName;
        DepartmentAddress = departmentAddress;
        this.departmentID = departmentID;
        this.departmentCode = departmentCode;
    }

    public Department() {
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return DepartmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        DepartmentAddress = departmentAddress;
    }

    public long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(long departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "DepartmentName='" + DepartmentName + '\'' +
                ", DepartmentAddress='" + DepartmentAddress + '\'' +
                ", departmentID=" + departmentID +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }*/
}
