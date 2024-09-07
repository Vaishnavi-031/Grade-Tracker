import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Double> grades = new ArrayList<>();
            System.out.println("Enter student grades. Type 'done' to finish:");
            
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("done")) {
                    break;
                }
                try {
                    double grade = Double.parseDouble(input);
                    grades.add(grade);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid grade or 'done' to finish.");
                }
            }
            
            if (grades.isEmpty()) {
                System.out.println("No grades entered.");
            } else {
                double sum = 0;
                double highest = Double.MIN_VALUE;
                double lowest = Double.MAX_VALUE;
                
                for (double grade : grades) {
                    sum += grade;
                    if (grade > highest) {
                        highest = grade;
                    }
                    if (grade < lowest) {
                        lowest = grade;
                    }
                }
                
                double average = sum / grades.size();
                System.out.printf("Average grade: %.2f%n", average);
                System.out.printf("Highest grade: %.2f%n", highest);
                System.out.printf("Lowest grade: %.2f%n", lowest);
            }
        }
    }
}

