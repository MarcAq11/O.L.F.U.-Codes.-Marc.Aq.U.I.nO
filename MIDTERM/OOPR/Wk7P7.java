import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Employee {
    private int eno;
    private String ename;
    private String mobile;

    public Employee(int eno, String ename, String mobile) {
        this.eno = eno;
        this.ename = ename;
        this.mobile = mobile;
    }

    public int getEno() { return eno; }
    public String getEname() { return ename; }
    public String getMobile() { return mobile; }
}

public class Wk7P7 {
    private static final String FILE_PATH = "data.txt"; 

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        System.out.println("Reading tab-separated records from file...");

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.trim().toLowerCase().startsWith("eno") || line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split("\t");

                if (data.length >= 3) {
                    int eno = Integer.parseInt(data[0].trim());
                    String ename = data[1].trim();
                    String mobile = data[2].trim();

                    employeeList.add(new Employee(eno, ename, mobile));
                }
            }

            System.out.println("\n-------------------------------------------");
            System.out.printf("%-10s %-20s %-15s\n", "eno", "ename", "mobile");
            System.out.println("-------------------------------------------");
            
            for (Employee emp : employeeList) {
                System.out.printf("%-10d %-20s %-15s\n", emp.getEno(), emp.getEname(), emp.getMobile());
            }
            System.out.println("-------------------------------------------");

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Data format error (Invalid ID): " + e.getMessage());
        }
    }
}
