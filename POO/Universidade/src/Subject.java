public class Subject {
    private String subject_name;
    private String course_number;
    private int credit_hours;
    private String department;

    public Subject(String subject_name, String course_number, int credit_hours, String department) {
        this.subject_name = subject_name;
        this.course_number = course_number;
        this.credit_hours = credit_hours;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject_name='" + subject_name + '\'' +
                ", course_number='" + course_number + '\'' +
                ", credit_hours=" + credit_hours +
                ", department='" + department + '\'' +
                '}';
    }

    public void print_subject(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-");
        System.out.println(this.getSubject_name());
        System.out.println(this.getCourse_number());
        System.out.println(this.getCredit_hours());
        System.out.println(this.getDepartment());
        System.out.println("=-=-=-=-=-=-=-=-=-=-");
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getCourse_number() {
        return course_number;
    }

    public void setCourse_number(String course_number) {
        this.course_number = course_number;
    }

    public int getCredit_hours() {
        return credit_hours;
    }

    public void setCredit_hours(int credit_hours) {
        this.credit_hours = credit_hours;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
