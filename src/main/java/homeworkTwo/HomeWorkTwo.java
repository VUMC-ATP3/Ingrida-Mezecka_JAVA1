package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {

static void printBusinessCard(){
    System.out.println("Vizītkarte");
    System.out.println("~~~~~~~~~~~~");
    System.out.println("Vārds: Ingrida");
    System.out.println("Uzvārds: Mezecka");
    System.out.println("Telefona nr.: 1234566789");
    System.out.println("Dzimsanas gads: 1234");
    System.out.println("***");
}




    public static void main(String[] args) {

        printBusinessCard();
        printBusinessCard();
        printBusinessCard();


        Scanner scanner = new Scanner(System.in);
        int x = 5;
        System.out.println(x > 0);
        System.out.println(x < 0);

        x = 10;
        System.out.println((x > 5) && (x <= 10));

        x = 6;
        System.out.println(!(x <= 5) && (x < 10));

        System.out.println((x == 0) || (x == 10));

        System.out.println((x * x) > 10);


        int menesis = 4;
        String menesisVards;

        switch (menesis) {
            case 1:
                menesisVards = "Janvaris";
                break;
            case 2:
                menesisVards = "Februaris";
                break;
            case 3:
                menesisVards = "Marts";
                break;
            case 4:
                menesisVards = "Aprilis";
                break;
            case 5:
                menesisVards = "Maijs";
                break;
            case 6:
                menesisVards = "Junijs";
                break;
            case 7:
                menesisVards = "Julijs";
                break;
            case 8:
                menesisVards = "Augusts";
                break;
            case 9:
                menesisVards = "Septembris";
                break;
            case 10:
                menesisVards = "Oktobris";
                break;
            case 11:
                menesisVards = "Novembris";
                break;
            case 12:
                menesisVards = "Decembris";
                break;
            default:
                menesisVards = "Nezināms menesis";
        }
        System.out.println(menesisVards);


        System.out.println("Ievadi pirmo veselo skaitli");
        int a = scanner.nextInt();
        System.out.println("Ievadi otro veselo skaitli");
        int b = scanner.nextInt();
        System.out.println("Ievadi trešo veselo skaitli");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("Lielākais no šiem skaitļiem ir: " + a);
        } else if (b > a && b > c) {
            System.out.println("Lielākais no šiem skaitļiem ir: " + b);
        } else {
            System.out.println("Lielākais no šiem skaitļiem ir: " + c);
        }

        //4.uzd

        System.out.println("Ieraksti vienu no krāsām, lai uzzinātu, vai drīkst šķērsot ielu: sarkans, dzeltens, zaļš");
        String krasa = scanner.next();

        if (krasa.equals("zaļš")) {
            System.out.println("Drīkst šķērsot ielu");
        } else if (krasa.equals("dzeltens")) {
            System.out.println("Nedrīkst šķērsot ielu");
        } else if (krasa.equals("sarkans")) {
            System.out.println("Noteikti nedrīkst šķērsot ielu");
        } else {
            System.out.println("Ja nedeg neviena no gaismām, lūdzu šķērsot ielu saskaņa ar CS noteikumiem");
        }
    }
    }

