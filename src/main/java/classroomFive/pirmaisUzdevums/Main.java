package classroomFive.pirmaisUzdevums;

import classroomFive.pirmaisUzdevums.encapsulation.Laikapstakli;

public class Main {

    Laikapstakli laikapstakli = new Laikapstakli();

    public static void main(String[] args) {
        Author JKRowling = new Author("JK Rowling", "rowling@gmail.com",'F');
        Author Aspazija = new Author("Aspazija","aspazija@gmail.com", 'F');


        Book gramataViens = new Book("Supergramata", Aspazija, new Cena(15.99, '$'));
        Book gramataDivi = new Book("Poters", JKRowling, new Cena(10.09, 'E'));

        //atlaides
        System.out.println(gramataViens.toString());
        gramataViens.price.discount(30);
        System.out.println(gramataViens.toString());

        System.out.println("otra atlaide gramatai");
        System.out.println(gramataDivi.toString());
        gramataDivi.price.discount(50);
        System.out.println(gramataDivi.toString());


        System.out.println(gramataViens.toString());
        System.out.println(gramataDivi.toString());


        Rinkis mansRinkis = new Rinkis(5, "dzeltens");
        mansRinkis.getRadiuss();
        mansRinkis.getKrasa();

        Rinkis rinkisDivi = new Rinkis();
        mansRinkis.setKrasa("zila");
        mansRinkis.setRadiuss(28.76);



    }
}
