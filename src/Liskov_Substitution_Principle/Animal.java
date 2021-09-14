package Liskov_Substitution_Principle;

interface Animal{
    static void makeNoise() {

        System.out.println("Lion can making noise when they hear noise");
    }
}

class Lion implements Animal {
    public static void makeNoise() {

        System.out.println("lion eat fresh flesh");
    }
}
class Panther implements Animal {

    public static void makeNoise()
    {
        System.out.println("panther can eat any type flesh");
    }
}
class DumbPanther implements Animal{

    public static void main(String[] args) {
        {
            System.out.println("I am from Liskov_Substitution Principle");

            Panther.makeNoise();
            Animal.makeNoise();
            Lion.makeNoise();


        }
    }
}
