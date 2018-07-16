package pl.javastart.obiektowe.firma;

public class FirmaTablice {
    public static void main(String[] args) {

        Pracownik[] pracownicy = new Pracownik[3];
        String[] imiona = {"Staszek","Zbychu","Florek"};
        String[] nazwiska = {"Kowalski", "Banach", "Badura"};
        int[] wiek = {18,20,40};

        for (int i =0; i <3; i++){
            pracownicy[i]= new Pracownik();
            pracownicy[i].ustawImie(imiona[i]);
            pracownicy[i].ustawNazwisko(nazwiska[i]);
            pracownicy[i].ustawWiek(wiek[i]);

            System.out.println(pracownicy[i]);
        }
    }
}
