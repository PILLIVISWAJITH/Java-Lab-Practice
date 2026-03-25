import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take user inputs
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();
        
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();
        
        // Calculate area in sq cm (Area = 1/2 * base * height)
        double areaSqCm = 0.5 * base * height;
        
        // Convert to sq inches (1 inch = 2.54 cm, so 1 sq inch = 2.54 * 2.54 sq cm)
        double sqCmToSqInchesConversion = 2.54 * 2.54;
        double areaSqInches = areaSqCm / sqCmToSqInchesConversion;
        
        // Display output
        System.out.println("The Area of the triangle in sq in is " + areaSqInches + " and sq cm is " + areaSqCm);
        
        input.close();
    }
}
