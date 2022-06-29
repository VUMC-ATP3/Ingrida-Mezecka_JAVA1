package classroomFive.pirmaisUzdevums.encapsulation;

public class Human {

    private int age;
    private double hight;
    private String name;
    private String personalCode;

    public Human(int age, double hight, String name) {
        this.age = age;
        this.hight = hight;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        if age < 0 {
//            System.out.println("vecums nedrikst but mazaks par nulli");
//        } else {
//            this.age = age;
//        }

    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Human(){
        System.out.println("uztaiam jaunu cilveku");
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", hight=" + hight +
                ", name='" + name + '\'' +
                '}';
    }
}
