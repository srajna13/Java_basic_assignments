public class basics {
    public static void main(String[] args) {
        // Variables and Data Types
        int age = 25;
        double salary = 50000.50;
        char grade = 'A';
        boolean isActive = true;
        String name = "Alice";

        // Output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Active: " + isActive);

        System.out.println("\n--Control Statements --");

        // if-else
        if (age > 18) {
            System.out.println(name + " is an adult.");
        } else {
            System.out.println(name + " is a minor.");
        }

        // for loop
        System.out.println("\nFirst 5 natural numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // while loop
        System.out.println("\n\nCountdown from 3:");
        int count = 3;
        while (count > 0) {
            System.out.println(count);
            count--;
        }

        // Arrays
        System.out.println("\nArray of scores:");
        int[] scores = {90, 85, 78, 92};
        for (int score : scores) {
            System.out.println(score);
        }

        // String operations
        System.out.println("\n--String Operations --");
        String welcome = "Hello, " + name + "!";
        System.out.println(welcome);
        System.out.println("Length of name: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Contains 'li': " + name.contains("li"));

    }
}
