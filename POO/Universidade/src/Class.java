public class Class {
    private int class_number;
    private int quant_students;
    Subject subject;

    public Class(int class_number, int quant_students, Subject subject) {
        this.class_number = class_number;
        this.quant_students = quant_students;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Class{" +
                "class_number=" + class_number +
                ", quant_students=" + quant_students +
                ", subject=" + this.subject.toString() +
                '}';
    }

    public int getClass_number() {
        return class_number;
    }

    public void setClass_number(int class_number) {
        this.class_number = class_number;
    }

    public int getQuant_students() {
        return quant_students;
    }

    public void setQuant_students(int quant_students) {
        this.quant_students = quant_students;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
