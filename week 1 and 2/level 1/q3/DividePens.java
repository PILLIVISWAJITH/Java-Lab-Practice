class DividePens {
    public static void main(String[] args) {
        // Variables for total pens and students
        int totalPens = 14;
        int numberOfStudents = 3;
        
        // Compute quotient and remainder
        int pensPerStudent = totalPens / numberOfStudents;
        int remainingPens = totalPens % numberOfStudents;
        
        // Display output
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
