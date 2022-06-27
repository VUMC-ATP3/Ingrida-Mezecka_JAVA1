package clasrromFour;

import java.sql.Timestamp;

public class Rinkis {
    final double PI = 3.14;
    // konsantes vienmer raksta ar lielo burtu!

    double radiuss;
    double laukums;
    double rinkaLinijasGarums;
    Timestamp timestamp;


    Rinkis(){
        System.out.println("Mēs veidojam rinki");

        long dateTime = System.currentTimeMillis();
        timestamp = new Timestamp(dateTime);

           }

           public void printCreatedTime(){
               System.out.println("print current time: " + timestamp);
    }

    Rinkis(double padotaisRadiuss){
        radiuss = padotaisRadiuss;
    }
    public double aprekinatLaukumu() {
        System.out.println("aprekinu laukumu");
        return ((radiuss * radiuss) * PI);
        // return Math.pow(radiuss, 2) * Math.PI;

    }
    public double aprekinatRinkaLinijasGarumu(){
        System.out.println("aprekinu rl garumu");
        return 2 * Math.PI * radiuss;
    }

}