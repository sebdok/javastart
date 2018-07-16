package pl.javastart.obiektowe.punkt;

public class UstawPunkt {
    public static void main(String[] args) {


        Punkt punkt = new Punkt();
        punkt.ustawX(10);
        punkt.ustawY(20);
        System.out.println(punkt);
    }
}
