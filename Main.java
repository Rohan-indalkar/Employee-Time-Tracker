package com.version2jdbc;


import java.util.Scanner;
import com.utildb.DBConnection;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO empDao = new EmployeeDAO();
        AttendanceDAO attDao = new AttendanceDAO();

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Check-In");
            System.out.println("4. Check-Out");
            System.out.println("5. View Attendance");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Department: ");
                    String dept = sc.nextLine();
                    empDao.addEmployee(name, dept);
                    break;
                case 2:
                    empDao.viewEmployee();
                    break;
                case 3:
                    System.out.print("Enter Employee ID: ");
                    int idIn = sc.nextInt();
                    if (empDao.isEmployeeExist(idIn))
                        attDao.checkIn(idIn);
                    else
                        System.out.println("Employee not found!");
                    break;
                case 4:
                    System.out.print("Enter Employee ID: ");
                    int idOut = sc.nextInt();
                    if (empDao.isEmployeeExist(idOut))
                        attDao.checkIn(idOut);
                    else
                        System.out.println("Employee not found!");
                    break;
                case 5:
                    attDao.viewAttendance();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
