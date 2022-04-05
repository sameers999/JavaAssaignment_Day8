
package EmployeeWage;

import java.util.Random;

public class EmployeeWage_Uc7 {

	static final int WAGE_PER_HR = 20; 
	static final int FULL_TIME_HRS = 8;
	static final int PART_TIME_HRS = 4;
	static final int MAX_WORKING_DAYS = 20;
	static final int MAX_HRS_PER_MONTH = 100;
	static final int IS_FULL_TIME = 0;
	static final int IS_PART_TIME = 1;
	
	public void employeeWage() {
		System.out.println("*****Welcome To Employee Wage Program*****");
		Random random = new Random();
		int dailyEmpWage;
		int totalWage = 0;
		int totalWorkingHrs = 0;
		int totalWorkingDays = 0;
		int empHrs = 0;
		while (totalWorkingHrs < MAX_HRS_PER_MONTH && totalWorkingDays < MAX_WORKING_DAYS) {
			totalWorkingDays++;
			double empCheck = (Math.floor(Math.random() * 10) % 3);
			switch ((int) empCheck) {
			case IS_FULL_TIME:
				System.out.println("Employee Is Present");
				empHrs = FULL_TIME_HRS;
				break;
			case IS_PART_TIME:
				System.out.println("Employe Is Half Day Present");
				empHrs = PART_TIME_HRS;
				break;
			default:
				System.out.println("Employee Is Absent");
				empHrs = 0;
			}
			totalWorkingHrs += empHrs;
		}
		totalWage = totalWorkingHrs * WAGE_PER_HR;
		System.out.println("Total Wage: " + totalWage);
		System.out.println("total Working Hours: " + totalWorkingHrs);
		System.out.println("Total Working Days: " + totalWorkingDays);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeWage_Uc7 empWage = new EmployeeWage_Uc7();
		empWage.employeeWage();
	}

}
