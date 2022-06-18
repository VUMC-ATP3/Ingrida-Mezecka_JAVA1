package homeWork;

import java.util.Scanner;


public class LoopHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //   1.uzd.

       int skaitlisPirmais;

        int summa = 0;

        while (summa <= 100) {
         System.out.println("Ieraksti veselu skaitli");
            skaitlisPirmais = scanner.nextInt();
            summa = summa + skaitlisPirmais;

        }

        System.out.println("Gatavs");


// 2.uzdevums

// 3.uzdevums
        int[] skaituMasivs = {1, 2, 3, 4};
        String[] varduMasivs = {"vasara", "rudens", "ziema", "pavasaris"};
        char[] simboli = {'*', '#', '@', '$'};

    int z = 0;
    while (z<4){
        System.out.println("Cipari: " + skaituMasivs[z]);
        z++;
    }

    int simbolsChar = 0;
    while (simbolsChar<4) {
        System.out.println("Simboli: " + simboli[simbolsChar]);
        simbolsChar++;
    }

    int gadalaiks = 0;
    while (gadalaiks < 4) {
        System.out.println("Gadalaiki: " + varduMasivs[gadalaiks]);
        gadalaiks++;
    }

    int m = 0;
    do {
        System.out.println("Cipari ar do while: " + skaituMasivs[m]);
        m++;
    }
        while (m < 4);

    int x = 0;
    do{
    System.out.println("Simboli ar do while: " + simboli[x]);
    x++;
    }
    while (x<4);

    int f = 0;
    do {
    System.out.println("Gadalaiki ar do while: " + varduMasivs[f]);
    f++;
    }
    while (f<4);


        for (int t = 0; t < 4; t++) {
            System.out.println("FOR cikls: " + skaituMasivs[t]);
        }


        for (int u = 0; u < 4; u++) {
            System.out.println("FOR cikls: " + varduMasivs[u]);
        }


        for (int y = 0; y < 4; y++) {
            System.out.println("FOR simboli: " + simboli[y]);
        }



            for (String randomString : varduMasivs){
                System.out.println("For each cikls: " + randomString);
            }


    for (int randomInt : skaituMasivs){
        System.out.println("For each cikls: " + randomInt);
    }


    for (char randomChar : simboli){
        System.out.println("For each: " + randomChar);
    }

        // 4.uzdevums


        int[] skaitluMasivsSimts = new int[100];

        int paraSkaitli = 2;
        for (int i = 0; i < skaitluMasivsSimts.length; i = i + 2) {
            skaitluMasivsSimts[i] = paraSkaitli;
            System.out.print(paraSkaitli + " ");
            paraSkaitli = paraSkaitli + 2;
        }



    }
}

