package classroomThree;

public class Masivi {
    public static void main(String[] args) {


//        int sakotnejs = 1;
//        while (sakotnejs <= 1000) {
//        System.out.println(sakotnejs);
//        sakotnejs++; // sakotnejs = sakotnejs + 1;
//    }


        String pietura = "Centrālā stacija";
        //saraksts array masivs
        String[] pieturas = {"Centrālā stacija", "Marijas iela", "Bērnu pasaule", "Ziedoņdārzs"};


        int skaititajs = 0; // definee saakumu
        while (skaititajs<4){
            System.out.println(pieturas[skaititajs]);
            skaititajs = skaititajs + 1;
     }
        int[] majuNumuri = {1, 2, 3, 4, 5, 6, 7, 8};
        char[] patskani = {'a', 'i', 'e'};

        System.out.println(pieturas[0] + pieturas[1] + pieturas[2]+ pieturas[3]);
        pieturas[3] = "Zemitanu stacija";

        System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);

        System.out.println("CIk pieturas ir masīvā? " + pieturas.length);
        String [] hokejaCempioniTopTris = new String[3];
        System.out.println("Cik vietas ir čempionātā?"+ hokejaCempioniTopTris.length);
        String pirmaVieta = "Somija";
        String otraVieta = "Kanada";
        String tresaVieta = "Čehija";

        hokejaCempioniTopTris[0] = pirmaVieta;
        hokejaCempioniTopTris[1] = otraVieta;
        hokejaCempioniTopTris[2] = tresaVieta;

        System.out.println(hokejaCempioniTopTris[0] + "/n" + hokejaCempioniTopTris[1] + "/n" + hokejaCempioniTopTris[2]);



        //MASĪVI
        int i = 0;
        //infinite loop -bezgaligais cikls
        System.out.println("cikls sakas");

        while (i <5) { //nosacijums
            //kods, kas izpildas, ja nosacijums ir patiess
            System.out.println(i);
            i = i+ 1;


        }
        System.out.println("cikls beidzas");

    }



    }




