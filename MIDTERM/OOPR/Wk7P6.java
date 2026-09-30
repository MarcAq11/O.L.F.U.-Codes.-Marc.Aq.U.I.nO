import java.util.Date;

public class Wk7P6 {
    // Class variable (static) to count total students
    private static int noOfStudents = 0;

    // Instance variables
    private String studentNo;
    private String studentName;
    private CustomDate dateOfBirth; // Using custom mock Date to support string constructor requirement
    private Integer tariffPoints;

    // --- PART B: CONSTRUCTORS ---

    // 1. Default Constructor
    public Wk7P6() {
        this.studentNo = "not known";
        this.studentName = "not known";
        this.dateOfBirth = new CustomDate("1st January 1995");
        this.tariffPoints = 20;
        
        noOfStudents++; // Increment student count
    }

    // 2. Parameterized Constructor with 4 arguments
    public Wk7P6(String studentNo, String studentName, CustomDate dateOfBirth, Integer tariffPoints) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        
        // Integrity check for tariff points (Must be between 20 and 280)
        setTariffPoints(tariffPoints);
        
        noOfStudents++; // Increment student count
    }

    // --- PART A: GETTERS AND SETTERS ---

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public CustomDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(CustomDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getTariffPoints() {
        return tariffPoints;
    }

    // Integrity check inside setter
    public void setTariffPoints(Integer tariffPoints) {
        if (tariffPoints >= 20 && tariffPoints <= 280) {
            this.tariffPoints = tariffPoints;
        } else {
            throw new IllegalArgumentException("Tariff points must be between 20 and 280. Setting to minimum default (20).");
        }
    }

    // Static getter to read the total number of students
    public static int getNoOfStudents() {
        return noOfStudents;
    }

    // --- PART C: INSTANTIATION DEMONSTRATION & MAIN METHOD ---
    public static void main(String[] args) {
        // Instantiating an object using the Default Constructor
        Student student1 = new Student();

        // Instantiating an object using the 4-Parameter Constructor
        CustomDate dob = new CustomDate("15th August 2004");
        Student student2 = new Student("STU102", "Alex Smith", dob, 150);

        // Printing the values to verify
        System.out.println("Student 1 Name: " + student1.getStudentName());
        System.out.println("Student 2 Name: " + student2.getStudentName());
        
        // Displaying total tracked instances
        System.out.println("Total instances created (noOfStudents): " + Student.getNoOfStudents());
    }
}

// Helper class to mimic the assumed Date constructor requirement
class CustomDate {
    private String dateString;

    public CustomDate(String dateString) {
        this.dateString = dateString;
    }

    @Override
    public String toString() {
        return dateString;
    }
}
