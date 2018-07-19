package pl.javastart.obiektowe.punkt;

public class UstawPunkt {
    public static void main(String[] args) {


        Punkt punkt = new Punkt(10,20);
        punkt.ustawX(25);
        punkt.ustawY(3);
        Punkt punkt1 = new Punkt(punkt);
        System.out.println(punkt);
        System.out.println(punkt1);
    }
}
