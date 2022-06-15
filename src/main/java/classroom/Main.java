package classroom;

public class Main {
    public static void main(String[] args) {

        int vecumsSuns = 3;
        String dogName = "Reksis";
        double svarsSuns = 6.2; //daļskaitlis
        float augumsSuns = 60.3F; //daļskaitlis
        boolean isHungry=false; // trule=1, false=0
        byte monthsInYear = 12; //paraugam
        long netIncome = 734637463746734364L; //paraugam
        short autoPrice = 12121; //paraugam

        int vecumsKakis = 14; //vesels skaitlis

        String dogyName = "Reksis";
        String dogNameTwo = "Lesija";
                boolean isStringsTheSame = dogyName.equals(dogNameTwo);
        System.out.println("Vai abi suņu vārdi ir vienādi" + isStringsTheSame);
        char dzimums = 'S';
        char dzimumsDivi = 'V';
        System.out.println("Suņa dzimums ir" + dzimums);
        String catName = "Bazilio"; // teksts
        System.out.println("svars");
        System.out.println(svarsSuns+"kg"); //pieliek arī kg pēdiņās
        System.out.println(); // būs tukša rinda
        System.out.println("Mans kakis");
        System.out.println("Vecums");
        System.out.println(vecumsKakis);
        System.out.println("Vards");
        System.out.println(catName);
        System.out.println("Jura suns");
        System.out.println("Vecums");
        System.out.println(vecumsSuns);
        System.out.println("vards");
        System.out.println(dogyName);
        System.out.println("Mana suņa augstums" + " " + augumsSuns+ " " + "cm");

        System.out.println("Hello World!");

        System.out.println("Kaķa un suņa kopējais vecums");
        System.out.println(vecumsSuns+vecumsKakis);
        System.out.println("Vai mans suns ir izsalcis?");
        System.out.println(isHungry);

        int summa;
        int starpiba;
        double dalijums;
        int reizinajums;
        int x = 5;
        int y = 10;
        int atlikums;

        double z = 5;
        double q = 10;
        double w = 12;

        summa = x + y;
        starpiba = x - y;
        reizinajums = x * y;
        dalijums = z / q;
        atlikums = 12 % 5;

        int skaitlis = 7;
        System.out.println("Ja atbilde ir 0, šis ir pāra skaitlis" + skaitlis%2);
        System.out.println();
        System.out.println("Atlikums ir" + atlikums);


        System.out.println(summa);
        System.out.println(starpiba);
        System.out.println(reizinajums);
        System.out.println(dalijums);

        double lowestTemperature = -20.4;
        float highestTemperature = 40.65512312F;
        System.out.println("Augstaka temp ir " + highestTemperature + "zemaka temp ir " + lowestTemperature);
        String teikums = String.format("Augstākā temperatūra ir %.2f Zemākā temperatūra ir %s",highestTemperature,lowestTemperature);
        System.out.println(teikums);









    }

}
