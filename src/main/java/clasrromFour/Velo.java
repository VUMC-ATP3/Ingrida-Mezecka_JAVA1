package clasrromFour;

public class Velo {
    int atrums = 0;
    char bremzuTips; // D vai V

    public void spiestPedalus(){
        System.out.println("cilveks gaazee");
        atrums++;
            }

    public void bremzet(){
        if(bremzuTips == 'D'){
            atrums = atrums -2;
        } else if (bremzuTips == 'V') {
            atrums--;
        } else {
            System.out.println("paligaa, man nav bremzu");
        }



    }

    public void printetAtrumu(){
        System.out.println("atrums ir" + atrums + "km/h");
    };

}
