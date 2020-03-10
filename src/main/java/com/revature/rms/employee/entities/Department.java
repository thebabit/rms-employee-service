package com.revature.rms.employee.entities;

public enum Department {

    TRAINING("TRAINING"), STAGING("STAGING"), QC("QC"), RETENTION("RETENTION"), HR("HR");

    private String departmentName;

    Department(String name) {
        this.departmentName = name;
    }

    public static Department getByName(String name) {
        for (Department department : Department.values()) {
            if (department.departmentName == name) {
                return department;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.departmentName;
    }

}
