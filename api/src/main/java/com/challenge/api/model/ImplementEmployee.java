package com.challenge.api.model;

import java.time.Instant;
import java.util.UUID;
// class implementing interface

public class ImplementEmployee implements Employee {
    private UUID uuid;
    private String firstName;
    private String lastName;
    private String fullName;
    private Integer salary;
    private Integer age;
    private String jobTitle;
    private String email;
    private Instant chDate;
    private Instant ctDate;

    // constructor
    public ImplementEmployee(
            String firstName, String lastName, Integer salary, Integer age, String jobTitle, String email) {
        this.uuid = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.salary = salary;
        this.age = age;
        this.jobTitle = jobTitle;
        this.email = email;
        this.chDate = Instant.now();
    }

    /**
     * Set by either the Service or Data layer.
     * @param uuid required non-null
     */
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setFullName(String name) {
        this.fullName = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Instant getContractHireDate() {
        return chDate;
    }

    public void setContractHireDate(Instant date) {
        this.chDate = date;
    }

    /**
     * Nullable.
     * @return null, if Employee has not been terminated.
     */
    public Instant getContractTerminationDate() {
        if (ctDate != null) {
            return ctDate;
        }
        return null;
    }

    public void setContractTerminationDate(Instant date) {
        this.ctDate = date;
    }
}
