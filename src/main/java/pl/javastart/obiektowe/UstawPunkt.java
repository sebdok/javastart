package pl.javastart.obiektowe;

public class UstawPunkt {
    public static void main(String[] args) {


        Punkt punkt = new Punkt();
        punkt.wspX = 10;
        punkt.wspy = 20;
        System.out.println("to jest punkt o wspolrzednych 'x','y' gdzie: \n" +
                "x = " + punkt.wspX + "\n" +
                "y = " + punkt.wspy);
    }
}
