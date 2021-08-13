package com.example.tangramjsp.model;

import java.time.LocalDate;
import java.util.Objects;

/**
 * class Entity of employee
 */

public class Employee {

    private Long id;
    private Long tz;
    private String name;
    private String lastName;
    private LocalDate birthday;
    private LocalDate startWork;

    public Employee(Long tz, String name, String lastName, LocalDate birthday, LocalDate startWork) {
        this.tz = tz;
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.startWork = startWork;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getTz() {
        return tz;
    }

    public void setTz(Long tz) {
        this.tz = tz;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getStartWork() {
        return startWork;
    }

    public void setStartWork(LocalDate startWork) {
        this.startWork = startWork;
    }

    public Employee() {
    }

    public Employee(Long id, String name, String lastName, Long tz, LocalDate birthday, LocalDate startWork) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.tz = tz;
        this.birthday = birthday;
        this.startWork = startWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id.equals(employee.id) && tz.equals(employee.tz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tz);
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", lastName='" + lastName + '\'' +
            ", tz='" + tz + '\'' +
            ", birthday='" + birthday + '\'' +
            ", startWork='" + startWork + '\'' +
            '}';
    }
}
