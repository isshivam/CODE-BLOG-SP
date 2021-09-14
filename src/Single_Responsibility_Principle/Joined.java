package Single_Responsibility_Principle;

public class Joined
{
    public String name;
    String date="19th July 2021";

    public void onboarding(String name, String n)
    {
        String company = "Knoldus Inc";
        int emp=1612;
        System.out.println("I am from Single Responsibility and here to let you that");
        System.out.println(name+" has joined "+company+" on "+date+" And his Employee ID is "+emp);
    }

    public static void main(String[] args) {
        Intern I=new Intern();
        Employee_ID E=new Employee_ID();
        Joined J=new Joined();
        J.onboarding(I.name,J.name);

    }
}
