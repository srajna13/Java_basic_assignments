public class StaticFinal {

    // static variable shared across all instances
    static int objectCount=0;

    // final constant (cannot be changed)
    final String companyName="Consultadd";

    public StaticFinal(){
        objectCount++; // increment static variable
    }

    // static method to display object count
    static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }

    // regular method
    void displayCompany() {
        System.out.println("Company Name: " + companyName);
    }

    public static void main(String[] args) {
        StaticFinal obj1 = new StaticFinal();
        obj1.displayCompany();

        StaticFinal obj2 = new StaticFinal();
        obj2.displayCompany();

        StaticFinal.displayObjectCount(); // call static method using class name
    }
}
