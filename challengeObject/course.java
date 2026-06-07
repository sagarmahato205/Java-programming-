package challengeObject;

public class course {
    static int maxCapacity = 100;

    String courseName;
    int Enrollments;
    int totalStudent;

    String[] enRolledstudent ;
    {
        totalStudent = 0;
    }

    course(String courseName){
        this.courseName = courseName;
        this.Enrollments = 0;
        this.enRolledstudent = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        course.maxCapacity = maxCapacity;
    }

    void enRolledstudent(String studentName){
        enRolledstudent[Enrollments] = studentName;
        System.out.println("Student enrolled  : "+studentName+" in "+this.courseName);
        Enrollments++;
        totalStudent++;
        System.out.println(totalStudent);
    }

    void unEnRolledStudents(String studentName){
        System.out.println("Student Removed : "+studentName);
        Enrollments--;
        totalStudent--;
        System.out.println(totalStudent);
    }
    public static void main(String[] args) {
        course java = new course("java");
        java.enRolledstudent("Sagar");
        java.enRolledstudent("raz");
        java.unEnRolledStudents("raz");
    }

}
