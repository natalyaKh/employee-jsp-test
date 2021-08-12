package com.example.tangramjsp.dto;

import java.time.LocalDate;

/**
 * Dto class for response
 */

public class ResponseEmployeeDto {
    private Long tz;
    private String name;
    private String lastName;
    private LocalDate birthday;
    private Long workExperience;

    public Long getTz() {
        return tz;
    }

    public void setTz(Long tz) {
        this.tz = tz;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Long getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(Long workExperience) {
        this.workExperience = workExperience;
    }

    public ResponseEmployeeDto() {
    }

    public ResponseEmployeeDto(Long tz, String name, String lastName, LocalDate birthday, Long workExperience) {
        this.tz = tz;
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.workExperience = workExperience;
    }
}
