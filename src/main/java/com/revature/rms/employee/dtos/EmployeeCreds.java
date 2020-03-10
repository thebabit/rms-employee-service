package com.revature.rms.employee.dtos;

import com.revature.rms.employee.entities.Department;

public class EmployeeCreds {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String title;
    private Department department;
    private int resourceId;

    public EmployeeCreds(int id, String firstName, String lastName, String email, String title, Department department, int resourceId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
        this.department = department;
        this.resourceId = resourceId;
    }

    public EmployeeCreds() {super();
    }

    public EmployeeCreds(String firstName, String lastName, String email, String title, Department department, int resourceId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
        this.department = department;
        this.resourceId = resourceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public String toString() {
        return "employeeCreds{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", department=" + department +
                ", resourceId=" + resourceId +
                '}';
    }
}
