package Design_Patterns.Structural.A3_Adapter;

public class SchoolStudentAdapter implements Student{

    private SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getName() {
        return schoolStudent.getFirstName();
    }

    @Override
    public String getEmail() {
        return schoolStudent.getEmailId();
    }
}
