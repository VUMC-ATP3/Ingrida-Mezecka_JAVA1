package classroomFive.pirmaisUzdevums.encapsulation;

public class Main {
    public static void main(String[] args) {
        Laikapstakli laikapstakli = new Laikapstakli();

    laikapstakli.printLaikaptakli();
    //laikapstakli.metodeDivi();


        laikapstakli.isRaining = true;
        laikapstakli.getTemperatureAtNight = 13.5;



        Human cilveks = new Human();
        Human cilveksDivi = new Human();
        Human cilveksTris = new Human(23, 43.6,"Jancis");


        System.out.println(cilveksTris.toString());
        cilveksTris.setAge(14);
        System.out.println(cilveksTris.getAge());

        System.out.println(cilveksTris.getName());


    }
}
