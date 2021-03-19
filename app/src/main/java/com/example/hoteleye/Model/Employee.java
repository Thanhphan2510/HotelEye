package com.example.hoteleye.Model;

import java.sql.Time;
import java.util.List;

public class Employee extends Person{
    private int employee_id;
    private Account account;
    private String position;
    private List<TimeKeeping> timeKeepings;
    private List<Salary> salaries;
}
