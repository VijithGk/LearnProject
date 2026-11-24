package Collections;

public class Marks 
{
    private double marks;
    private String studentName;
    private int rollNo;
    private int classNo;
    
    public Marks(int marks, String studentName, int rollNo, int classNo) {
        this.marks = marks;
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.classNo = classNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    @Override
    public String toString() {
        return "Marks of the Student: [marks =" + marks + ", \nstudentName =" + studentName + ", \nrollNo=" + rollNo + ", \nclassNo=" + classNo
                + "]";
    }

    
}
