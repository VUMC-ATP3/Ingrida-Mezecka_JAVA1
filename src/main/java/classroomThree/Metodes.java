package classroomThree;

import java.util.Scanner;

public class Metodes {
    public static void main(String[] args) {
        Scanner skeneris = new Scanner(System.in);


        // metode, kas aprēķina kvadrāta laukumu
        // int tips, ko atgriež
        // kvadrata laukums - metodes nosaukums
        // int mala ir arguments/parametrs



        int a = kvadataLaukums(3);
                int b = 9;
        float c = taisnsturaLaukums(4.5f, 75.8f);
        System.out.println("Kvadrāta laukuma "+ a);
        System.out.println("Taisnstura laukums "+ c);
printetTekstu(a, c); // te padod vērtību nevis mainigo
printetTekstu(a, c);
        System.out.println(prettyPrint("sdssdsdsdsdsdsdd"));

    }

static String prettyPrint (String a){
        return "asdadghdasdhas" + a + "sjdasdajs";

}




    static void printetTekstu(int a, float c){ //ja grib vairākas reizes izprintēt, lai nav jāraksta daudz reizes
        System.out.println("Kvadrata laukums "+ a);
        System.out.println("Taisnstura laukums "+ c);


    }

    static float taisnsturaLaukums(float a, float b){
        float s = a*b;
        return s;
    }
    static int kvadataLaukums(int mala){
        int laukums = mala * mala;
        return laukums;



    }

}
