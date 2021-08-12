package com.example.tangramjsp.dto;

/**
 * Dto class for request
 */

public class RequestEmployeeDto {

    private Long tz;
    private String name;
    private String lastName;
    private String birthday;
    private String startWork;

    public RequestEmployeeDto(Long tz, String name, String lastName, String birthday, String startWork) {
        this.tz = tz;
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.startWork = startWork;
    }

    public RequestEmployeeDto() {
    }

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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getStartWork() {
        return startWork;
    }

    public void setStartWork(String startWork) {
        this.startWork = startWork;
    }
}

