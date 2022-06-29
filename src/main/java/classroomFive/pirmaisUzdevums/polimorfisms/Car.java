package classroomFive.pirmaisUzdevums.polimorfisms;

public class Car extends Vehicle {

    @Override
    public void move() {
        super.move();
        System.out.println("car moves with 4 weels");
    }
}
