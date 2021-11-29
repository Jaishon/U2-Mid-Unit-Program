/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

 */

import javax.swing.*;

public class SalesCommission {

    public static void main(String[] args) {
        hourlyrate();
        hoursWorked();
        commission();
        sales();
        totalEarned();

    }

public static void hourlyrate(){
        double rate = Double.parseDouble(JOptionPane.showInputDialog("What is your hourly rate ?"));
        double hourlyrate = rate;
    }
public static void hoursWorked(){
    double hours = Double.parseDouble(JOptionPane.showInputDialog("How many hours did you work ?"));
    double hoursWorked = hours;
}
public static void commission(){
        double commissionrate = Double.parseDouble(JOptionPane.showInputDialog("What is the percentage of commission you make ?"));
        double commission = commissionrate;
}

public static void sales(){
      double totalSales = Double.parseDouble(JOptionPane.showInputDialog("What is your total sales ?"));
      double sales = totalSales;
}
public static void totalEarned(){
      double total = hourlyrate * hoursWorked;

}






}
