import java.util.ArrayList;

public class Teacher extends Person{
    Private String teacherID;
    Private ArrayList<Person> students;
    Private int teachingExperience;

    public Teacher(String f, String l, String id, int exp) {
        super(f, l);
        teacherID = id;
        teachingExperience = exp;
    }

    public ArrayList<Person> getStudents() {
        return students;
    }

    public String getTeachingExperience() {
        return teachingExperience;
    }

    public void setTeacherID(int id) {
        teacherID = id;
    }

    public void increaseTeachingExperience() {
        teachingExperience++;
    }

    public void addStudent(Person p) {
        students.add(p);
    }
    @Override
    public String toString() {
        for (Person student : students) {
            System.out.print(student);
        }

        System.out.println(super.toString() + " Teacher [teacherID="+teacherID+", "teachingExperience="+teachingExperience+"]");

        return super.toString() + " Teacher [teacherID="+teacherID+", ";
    }
}
