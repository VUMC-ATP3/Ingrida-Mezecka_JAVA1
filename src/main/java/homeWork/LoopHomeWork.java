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


        // 4.uzdevums


        int[] skaitluMasivsSimts = new int[100];

        int paraSkaitli = 2;
        for (int i = 0; i < skaitluMasivsSimts.length; i = i + 2) {
            skaitluMasivsSimts[i] = paraSkaitli;
            System.out.print(paraSkaitli + " ");
            paraSkaitli = paraSkaitli + 2;

        }


//3.uzd.
        int[] skaituMasivs = {1, 2, 3, 4};
        String[] varduMasivs = {"vasara", "rudens", "ziema", "pavasaris"};
        char[] simboli = {'*', '#', '@', '$'};



    }
    }

