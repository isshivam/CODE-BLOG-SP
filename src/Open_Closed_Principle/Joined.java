package Open_Closed_Principle;

public class Joined extends Employee_ID {
    String date = "19th July 2021";


    void onboarding(String name, String n) {
        String company = "Knoldus Inc";
        int emp = 1612;
        System.out.println("I am from Open Closed Principle.");
        System.out.println("Hi, All Knolder "+name+ " has joined " + company + " on " + date);
        System.out.println("And his Employee ID is " + emp+ " and salary "+salary);
    }

    public static void main(String[] args) {
        Intern I = new Intern();
        Employee_ID E = new Employee_ID();
        Joined J = new Joined();
        J.onboarding(J.name, E.name);
    }
}
