package classroomThree;

import java.util.Random;
import java.util.Scanner;

public class Masivi {
    public static void main(String[] args) {
        Random skaitluGenerators = new Random();
        for (int i = 0; i < 1000; i++) {
            System.out.println(skaitluGenerators.nextInt(1000));
        }
        int nejaussSkaitlis = skaitluGenerators.nextInt(50);
        System.out.println(nejaussSkaitlis);

//        int y = 0;
//        do{
//            System.out.println("DO WHILE" + y);
//            y++;
//
//        }while (y<10);
//
        Scanner scanner = new Scanner(System.in);
//        String parole = "Parole123";
//        String lietotajaIevaditaParole;
//
//        do {
//            System.out.println("Ievadi paroli");
//            lietotajaIevaditaParole = scanner.nextLine();
//            System.out.println("notiek parbaude");
//        }while (!lietotajaIevaditaParole.equals(parole));
//        System.out.println("pareiza parole");


// pozitivs sk

//        int number;
//        do {
//            System.out.println("ievadi pozitivu skaitli");
//            number = scanner.nextInt();
//        }while (number<=0);
//        System.out.println("der" + number);


        for (int i = 0; i < 5; i++) {
            System.out.println("for cikls" + i);
        }

        String[] mansMasivs = {"Juris", "Anna"};
        for (String randomString : mansMasivs) {
            System.out.println(randomString); //ja būtu 4, tad izprintetu 4x
        }

        for (int j = 0; j < mansMasivs.length; j++) {
            System.out.println(mansMasivs[j]);
        }


        System.out.println("sakums");
        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                System.out.println("ja i ir 5, lauzam ciklu");
                break;
            }
            System.out.println("print break example" + i);
        }
        System.out.println("beigas");
    }
}
//majuParbaude(1, 50, 19);
//        int sakotnejs = 1;
//        while (sakotnejs <= 1000) {
//        System.out.println(sakotnejs);
//        sakotnejs++; // sakotnejs = sakotnejs + 1;
//    }





//        String pietura = "Centrālā stacija";
//        //saraksts array masivs zemak
//        String[] pieturas = {"Centrālā stacija", "Marijas iela", "Bērnu pasaule", "Ziedoņdārzs"};
//
//
//        printetTekstaMasivu(pieturas);
//
//
////        int sakotnejs = 1;
////        while (sakotnejs<=1000){
////            System.out.println(sakotnejs);
////            sakotnejs = sakotnejs + 1;
////            sakotnejs++;
////        }
////
////        int sakotnejsS = 0;
////        while (sakotnejsS<=1000){
////            System.out.println(sakotnejsS);
////            sakotnejsS = sakotnejsS + 2;
//
//
//
//
//
//        int[] majuNumuri = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//        printetIntegerMasivu(majuNumuri);
//        int e = 0;
//
//        while (e < 9) {
//            System.out.println("Mājas numurs: " + majuNumuri[e]);
//            e = e + 1;
//
//        }
//        char[] patskani = {'a', 'i', 'e'};
//
//        System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);
//        pieturas[3] = "Zemitanu stacija";
//
//        System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);
//
//        System.out.println("CIk pieturas ir masīvā? " + pieturas.length);
//        System.out.println("cik majas ir uz ielas?" + majuNumuri.length);
//
//        String[] hokejaCempioniTopTris = new String[3]; // stringā gribu saglabaat 3 vertibas
//        System.out.println("Cik vietas ir čempionātā?" + hokejaCempioniTopTris.length);
//        String pirmaVieta = "Somija";
//        String otraVieta = "Kanada";
//        String tresaVieta = "Čehija";
//
//        hokejaCempioniTopTris[0] = pirmaVieta;
//        hokejaCempioniTopTris[1] = otraVieta;
//        hokejaCempioniTopTris[2] = tresaVieta;
//
//        System.out.println(hokejaCempioniTopTris[0] + "/n" + hokejaCempioniTopTris[1] + "/n" + hokejaCempioniTopTris[2]);
//
//
//        //MASĪVI
//        int i = 0;
//        //infinite loop -bezgaligais cikls
//        System.out.println("cikls sakas");
//
//        while (i < 5) { //nosacijums
//            //kods, kas izpildas, ja nosacijums ir patiess
//            System.out.println(i);
//            i = i + 1;
//        }
//        System.out.println("cikls beidzas");
//    }
//
//
//    static void printetTekstaMasivu(String[] randomMasivs){ //universala metode jebkuram masīvam!!!!!!!!!!!
//        int skaititajs = 0; // definee saakumu
//        while (skaititajs < randomMasivs.length) {
//            System.out.println(randomMasivs[skaititajs]);
//            skaititajs = skaititajs + 1;
//        }
//
//    }
//
//static void printetIntegerMasivu(int[] kauKo){
//        int i = 0;
//    System.out.println("====Masivs sakas+++++++");
//        while (i< kauKo.length){
//            System.out.println(kauKo[i]);
//            i++;
//        }
//            System.out.println("++++++masivs beidzas+++++");
//}
//
//
//static void majuParbaude(int sakums, int beigas, int iznemums){
//        int majuNumuri = 1;
//        while (majuNumuri<=50){
//            if (majuNumuri%3==0 || majuNumuri%5==0 || majuNumuri==13){
//                System.out.println("šie neder" + majuNumuri);
//            } else {
//                System.out.println("šie DER" + majuNumuri);
//            }
//
//            majuNumuri++;
//        }
//}



// }






