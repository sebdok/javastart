package pl.javastart.obiektowe.firma;

public class Firma {
    public static void main(String[] args) {

       Pracownik[] pracownicy = new Pracownik[3];

       pracownicy[0]= new Pracownik("Sebastian","Dokladny", 25);
       pracownicy[1]= new Pracownik();
       pracownicy[2]= new Pracownik(pracownicy[0]);

       /* prac1.ustawImie("Adam");
        prac1.ustawNazwisko("Kowalski");
        prac1.ustawWiek(25);

        prac2.ustawImie("Jan");
        prac2.ustawNazwisko("Banach");
        prac2.ustawWiek(30);
*/
       for(Pracownik p :pracownicy) {
           System.out.println(p);
       }
    }
}
