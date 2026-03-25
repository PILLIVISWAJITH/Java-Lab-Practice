import java.util.Scanner;

class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take user input for Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        
        // Compute Fahrenheit: (°C × 9/5) + 32 = °F
        double fahrenheitResult = (celsius * 9.0 / 5.0) + 32;
        
        // Display output
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
        
        input.close();
    }
}
