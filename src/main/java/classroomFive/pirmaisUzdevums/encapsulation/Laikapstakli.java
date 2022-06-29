package classroomFive.pirmaisUzdevums.encapsulation;

    public class Laikapstakli {
        boolean isRaining; //default - savas klases un paotnes limeni
        public boolean sunIsShining; // visur
        private boolean isSnowing; //tikai klases ietvaros
        private double temperatureAtDay;
        public double getTemperatureAtNight;


        public void printLaikaptakli(){

            System.out.println("publiska metode");
            System.out.println("araa liist visu dienu");
            metodeDivi();
        }

        private void metodeDivi(){
            System.out.println("si ir privata metode");

        }

        void metodeTris(){
            System.out.println("metode tris default");
        }
}
