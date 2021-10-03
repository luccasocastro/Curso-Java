public class Main {

    public static void main(String[] args) {
        Subject s = new Subject("Into computer science", "CS1310", 4, "CS");
        Subject s2 = new Subject("Data structures", "CS1315", 4, "CS");
        Class c = new Class(320, 36, s);
        Class c2 = new Class(940, 44, s2);
        Student st = new Student("Luccas Souza", 19, 3, c2);
        System.out.println(st.toString());
    }
}
