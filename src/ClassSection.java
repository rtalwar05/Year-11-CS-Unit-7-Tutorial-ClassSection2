import java.util.ArrayList;

public class ClassSection {

    String subject;
    int capacity;
    int yearLevel;
    ArrayList<Student> students = new ArrayList<>();

    public ClassSection() {}

    public ClassSection(String subject, int capacity, int yearLevel) {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent (Student a)
    {
        if (a.getYearLevel() == yearLevel ) {
            if (!students.contains(a))
            {
                students.add(a);
            }
        }
    }

    public void removeStudent (Student a)
    {
        students.remove(a);
    }

    public boolean isStudentEnrolled (Student a)
    {
        for (Student s : students)
        {
            if (s.equals(a))
            {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "ClassSection{" +
                "subject='" + subject + '\'' +
                ", capacity=" + capacity +
                ", students=" + students +
                '}';
    }
}
