class AverageMarks {
    public static void main(String[] args) {
        // Variables for subjects
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        
        // Compute average, using 3.0 to ensure implicit double conversion for accurate decimal 
        double average = (maths + physics + chemistry) / 3.0;
        
        // Display output
        System.out.println("Sam’s average mark in PCM is " + average);
    }
}
