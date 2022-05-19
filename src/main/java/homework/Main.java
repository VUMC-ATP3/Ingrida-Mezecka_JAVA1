package homework;

public class Main {
    public static void main(String[] args) {

        String valstsNosaukums = "Senā valsts";
        int iedzivotajuSkaits = 12345678;
        double valstsPlatiba = 646.65;
        String valstsGalvaspilseta =  "Lielpilsēta";
        String valstsValoda = "Senā valoda";
        boolean isEUMember = false;
        char valuta = '#';

        System.out.println("Valsts nosaukums: " + valstsNosaukums);
        System.out.println("Iedzīvotāju skaits: " + iedzivotajuSkaits);
        System.out.println("Platība: " + valstsPlatiba);
        System.out.println("Galvaspilsēta: " + valstsGalvaspilseta);
        System.out.println("Oficiālā valoda: " + valstsValoda);
        System.out.println("Vai ir ES dalībvalsts?: " + isEUMember);
        System.out.println("Valūta: " + valuta + "\n");

        System.out.println("Šo valsti sauc" + " " + valstsNosaukums + ". Lielākā pilsēta šajā valstī ir" + " " + valstsGalvaspilseta + ". Šī ir viena no lielākajām valstīm kontinentā, jo tās platību veido" + " " + valstsPlatiba + "mk2." + "\n");

        int summa;
        int summaDivi;
        int summaTris;
        int starpiba;
        int starpibaDivi;
        int starpibaTris;
        double dalijums;
        double dalijumsDivi;
        double dalijumsTris;
        int reizinajums;
        int reizinajumsDivi;
        int reizinajumsTris;
        int a = 5;
        int b = 15;
        int f = 3;
        int g = 10;
        double c = 25;
        double d = 40;
        double e = 50;

        summa = a + b;
        summaDivi = b + f;
        summaTris = g + a;
        starpiba = a - b;
        starpibaDivi = g - f;
        starpibaTris = f - b;
        reizinajums = a * b;
        reizinajumsDivi = b * f;
        reizinajumsTris = g * b;
        dalijums = c / d;
        dalijumsDivi = d / e;
        dalijumsTris = e / c;


        System.out.println("Pirmā summa ir " + summa);
        System.out.println("Otrā summa ir " + summa);
        System.out.println("Trešā summa ir " + summaTris + "\n");
        System.out.println("Pirmā starpība ir " + starpiba);
        System.out.println("Otrā starpība ir "+ starpibaDivi);
        System.out.println("Trešā starpība ir " + starpibaTris + "\n");
        System.out.println("Pirmais reiznājums ir " + reizinajums);
        System.out.println("Otrais reiznājums ir " + reizinajumsDivi);
        System.out.println("Trešais reizinājums ir " + reizinajumsTris + "\n");
        System.out.println("Pimais dalījums ir " + dalijums + ", otrais ir " + dalijumsDivi + ", savukārt, trešais ir " + dalijumsTris + ". " + "\n");



    }
}
