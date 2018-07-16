package pl.javastart.obiektowe.firma;

public class Firma {
    public static void main(String[] args) {

        Pracownik prac1 =new Pracownik();
        Pracownik prac2 =new Pracownik();

        prac1.ustawImie("Adam");
        prac1.ustawNazwisko("Kowalski");
        prac1.ustawWiek(25);

        prac2.ustawImie("Jan");
        prac2.ustawNazwisko("Banach");
        prac2.ustawWiek(30);

        System.out.println(prac1);
        System.out.println(prac2);
    }
}
