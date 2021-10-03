public class Student {
    private String name;
    private int years_old;
    private int period;
    Class cclass;

    public Student(String name, int years_old, int period, Class cclass) {
        this.name = name;
        this.years_old = years_old;
        this.period = period;
        this.cclass = cclass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", years_old=" + years_old +
                ", period=" + period +
                ", cclass=" + this.cclass.toString() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears_old() {
        return years_old;
    }

    public void setYears_old(int years_old) {
        this.years_old = years_old;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Class getCclass() {
        return cclass;
    }

    public void setCclass(Class cclass) {
        this.cclass = cclass;
    }
}
