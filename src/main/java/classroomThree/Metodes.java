package classroomThree;

public class Metodes {
    public static void main(String[] args) {
        int a = kvadataLaukums(3);
                int b = 9;
        float c = taisnsturaLaukums(4.5f, 75.8f);
        System.out.println("Kvadrāta laukuma "+ a);
        System.out.println("Taisnstura laukums "+ c);



    }

    // metode, kas aprēķina kvadrāta laukumu
    // int tips, ko atgriež
    // kvadrata laukuma - metodes nosaukums
    // int mala ir arguments/parametrs


    static float taisnsturaLaukums(float a, float b){
        float s = a*b;
        return s;
    }
    static int kvadataLaukums(int mala){
        int laukums = mala * mala;
        return laukums;



    }

}
