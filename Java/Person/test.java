package Person;

public class test {
    public static void main(String[] args) {
        Student trongdat = new Student("Trong Dat", "ap 2", 9f, 8f, 10f);

        // trongdat.setScoreMath(8f);
        System.out.println(+trongdat.getScoreMath());

        System.out.println(trongdat.toString());

        Teacher me = new Teacher("ada", "asd", "Math");

        me.setSubject("Math");

        System.out.println(me.getSubject());
        System.out.println(me.toString());
    }
}
