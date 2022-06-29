package classroomFive.pirmaisUzdevums.polimorfisms;

public class Main {
    public static void main(String[] args) {
       Calculator calc = new Calculator();
        System.out.println(calc.sum(4, 5));
        System.out.println(calc.sum(5.8, 8.9));
        System.out.println(calc.sum(2, 3, 4));

        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        car.move();
        motorcycle.move();
        car.stop();
        motorcycle.stop();

    }
}
