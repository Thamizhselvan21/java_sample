package testprograms;

class Student {
    int regNo;
    String name;

    public Student(int regNo, String name) {
        this.regNo = regNo;
        this.name = name;
    }
}

class MarkList extends Student {
    int m1, m2, m3;
    int total;
    double average;
    String status;

    public MarkList(int regNo, String name, int m1, int m2, int m3) {
        super(regNo, name);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.total = m1 + m2 + m3;
        this.average = total / 3.0;

        // Determine pass/fail status
        this.status = (average >= 40) ? "Pass" : "Fail";
    }

    public void displayDetails() {
        System.out.println("Registration Number: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Marks - Subject 1: " + m1 + ", Subject 2: " + m2 + ", Subject 3: " + m3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Status: " + status);
        System.out.println();
    }
    
 // New methods to get total, average, and status
    public int getTotal() {
        return total;
    }

    public double getAverage() {
        return average;
    }

    public String getStatus() {
        return status;
    }
}

public class StudentMarkList {
    public static void main(String[] args) {
        // Create an array of MarkList objects
        MarkList[] students = new MarkList[3];

        // Initialize the array with student details
        students[0] = new MarkList(101, "Thamizh", 85, 90, 78);
        students[1] = new MarkList(102, "karthik", 65, 70, 75);
        students[2] = new MarkList(103, "aakash", 45, 30, 55);
        
        System.out.println("i m making changes ...");
        // Display details for each student
        for (MarkList student : students) {
            student.displayDetails();
        }
    }
}

