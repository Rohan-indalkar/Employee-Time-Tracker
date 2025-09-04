package com.version2jdbc;


import java.util.ArrayList;

import com.attendance.model.Attendance;

import java.sql.*;

public class AttendanceDAO {
    private ArrayList<Attendance> records = new ArrayList<>();

    public void checkIn(int empId) {
        Attendance att = new Attendance(empId);
        records.add(att);
        System.out.println("Checked in successfully for Employee ID: " + empId);
    }

    public void checkOut(int empId) {
        for(Attendance att : records) {
            if(att.getEmpId() == empId && att.getCheckOut() == null) {
                att.checkOut();
                System.out.println("Checked out successfully. Hours worked: " + att.getHoursWorked());
                return;
            }
        }
        System.out.println("No check-in record found for Employee ID: " + empId);
    }

    public void viewAttendance() {
        System.out.println("EmpID | Date | CheckIn | CheckOut | Hours Worked");
        for(Attendance att : records) {
            System.out.println(att.getEmpId() + " | " +
                               att.getDate() + " | " +
                               att.getCheckIn() + " | " +
                               att.getCheckOut() + " | " +
                               att.getHoursWorked());
        }
    }
}
