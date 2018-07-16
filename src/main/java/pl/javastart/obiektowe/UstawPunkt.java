package pl.javastart.obiektowe;

public class UstawPunkt {
    public static void main(String[] args) {


        Punkt punkt = new Punkt();
        punkt.ustawX(10);
        punkt.ustawY(20);
        System.out.println("to jest punkt o wspolrzednych 'x','y' gdzie: \n" +
                "x = " + punkt.dajX() + "\n" +
                "y = " + punkt.dajY());
    }
}
