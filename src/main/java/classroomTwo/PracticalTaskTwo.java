package classroomTwo;


import java.util.Scanner;

public class PracticalTaskTwo {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ievadi savu vārdu!");
//        String name = scanner.nextLine();
//// sistēma gaida ievadi
//        System.out.println("Ievadi savu vecumu");
//
//        int age = scanner.nextInt();
//
//        System.out.println(String.format("Esi sveicināta: %s !", name));
//        System.out.println("Jūsu vecums ir: " + age + "gadi");

//        System.out.println("Ievadi pirmo skaitli");
//        int a = scanner.nextInt();
//        System.out.println("Ievadi otro skaitli");
//        int b = scanner.nextInt();
//        int summa = a + b;
//        // augstāk esošais ir labāks
//
//        System.out.println("Skaitļu summa ir " + summa);
//        System.out.println("Skaitļu summa ir " + (a + b));


//SALIDZINA TIAKI CIPARUS!!!
//        int a = 5;
//        int b = 10;
//        int c = 5;
//        int d = 11;
//        //Lielāks
//        System.out.println(b > a); //true
//        System.out.println(a > b); //false
//
//        //mazāks
//        System.out.println(a < b); //t
//        System.out.println(b < a); //f
//
//        //vienads, nav vienads
//        System.out.println(a == c); //t
//        System.out.println(a != c); //f
//
//        // mazāks vienāds, lieāks vienads
//        System.out.println(a <= c); //t
//        System.out.println(b >= d); //f
//
//
//        int vecums = 18;
//        boolean vaiDrikstBalsot = (vecums >= 18);
//        System.out.println("Vai drīkst balsot? " + vaiDrikstBalsot);
//
//        String name = "Ingrida";
//        String nameTwo = "Inga";
//        boolean vaiVardiSakrit = (name.equals(nameTwo));
//        System.out.println("Vai vārdi sakrīt? " + vaiVardiSakrit);
//
//        int e = 4;
//        boolean vaiIrPatiess = ((e < 5) && (e < 10)); //UN
//        System.out.println(vaiIrPatiess);
//
//        e = 5;
//        vaiIrPatiess = ((e < 5) || (e < 10)); //VAI
//        System.out.println(vaiIrPatiess);
//
//        vaiIrPatiess = ((e < 5)); // nē
//        System.out.println(vaiIrPatiess);
//
//        vaiIrPatiess = (!(e < 5)); // ir nepatiess? sagaidām nepatiesību, jo ir nepareizš
//        System.out.println(vaiIrPatiess);
//        System.out.println(!(false == true));
//
//
//        int vecumsDivi = 18;
//        if (vecumsDivi >= 18)
//        //ja nav patiess, šo ignorē
//        {
//            System.out.println("Cilvēks drīkst balstot");
//            System.out.println("Koda turpinājums");
//            System.out.println("Ievadi savu vecumu:");
//        } else {
//            System.out.println("Cilvēks nedrīkst balstot");
//        }
//
//        int vecumsTris = scanner.nextInt();
//        if (vecumsTris >= 18) {
//            System.out.println("Tu drīksti balsot");
//        } else {
//            System.out.println("Nedrīkst balstot");
//        }
//        System.out.println("Koda turpinājums");
//
//
//        System.out.println("Ievadi skaitkli");
//        int skaitlisViens = scanner.nextInt();
//        if (skaitlisViens == 10) {
//            System.out.println("Printē skaitli 10");
//        } else if (skaitlisViens == 15) {
//            System.out.println("Printē skaitli 15");
//
//        } else if (skaitlisViens == 20) {
//            System.out.println("Printē skaitli 20");
//        } else {
//            System.out.println("Skaitlis ir nezināms");
//        }
//
//        System.out.println("Koda turpinājums");


        //jānodefinē cilvēks
        //vecums
        //dzimums - v vai s
        //sieviete pensijā no 60
        //vīrietis pensijā 65
//
//char dzimums = 'S';
//int vecumsPensija = 15;
//
//if (dzimums=='V' && vecumsPensija >=65){
//    System.out.println("vīrieši drīkst iet pensijā no 65");
//}
//else if (dzimums == 'S' && vecumsPensija >=60){
//    System.out.println("Sievietes no 60 gadiem");
//    }
//else {
//    System.out.println("Tu nedrīksti, vēl jāstrādā");
//
//
//    int cilvekaVecums = 65;
//    char cilvekaDzimums = 'V';
//    boolean drikstDotiesPensijā = false;
//
//    if (cilvekaVecums >=65 && cilvekaDzimums == 'V'){
//        drikstDotiesPensijā = true;
//    }
//    else if (cilvekaVecums >=60 && cilvekaDzimums == 'S'){
//        drikstDotiesPensijā = true;
//
//    }
//    System.out.println("Koda turpinājums");


//    //
//    int diena = 1;
//    String dienasVards;
//
//    switch(diena)
//
//    {
//        case 1:
//            dienasVards = "Pirmdiena";
//            break;
//        case 2:
//            dienasVards = "Otrdiena";
//            break;
//        case 3:
//            dienasVards = "Trešdiena";
//            break;
//        case 4:
//            dienasVards = "Ceturtdiena";
//            break;
//        case 5:
//            dienasVards = "Piektdiena";
//            break;
//        case 6:
//            dienasVards = "Sestdiena";
//            break;
//        case 7:
//            dienasVards = "Svētdiena";
//            break;
//        default:
//            dienasVards = "Nezināma diena";
//
//            System.out.println(dienasVards);
//    }
//
//    int diena = 1;
//    String dienasVards;
//        switch(diena)
//
//    {
//        case 1:
//            dienasVards = "Pirmdiena";
//            break;
//        case 2:
//            dienasVards = "Otrdiena";
//            break;
//        case 3:
//            dienasVards = "Trešdiena";
//            break;
//        case 4:
//            dienasVards = "Ceturdiena";
//            break;
//        case 5:
//            dienasVards = "Piektdiena";
//            break;
//        case 6:
//            dienasVards = "Sestdiena";
//            break;
//        case 7:
//            dienasVards = "Svētdiena";
//            break;
//        default:
//            dienasVards = "Nezināma diena";
//    }
//
//            System.out.println(dienasVards);

//        try {
//            skaitlis = scanner.nextInt();
//            if (skaitlis > 0) {
//                System.out.println("Lielaks par 0");
//            } else if (skaitlis < 0){
//                System.out.println("Mazaks par 0");
//            } else{
//                System.out.println("Skaitlis ir 0");
//            }
//        }
//        catch (InputMismatchException e){
//            System.out.println("Tas nav skaitlis");
//        }
//

        System.out.println("Ievadi skaitli");
        int skaitlisViens = scanner.nextInt();
        boolean irLielaksParNulli = (skaitlisViens > 0);
        System.out.println("Vai ievadītais skaitlis ir lielāks par nulli? " + irLielaksParNulli);

        int skaitlisJauns = 5;
        if(skaitlisJauns%2==0){
            System.out.println("Skaitlis ir para skaitlis");
        }else{
            System.out.println("Skaitlis ir nepara skaitlis");
        }
    }

}



