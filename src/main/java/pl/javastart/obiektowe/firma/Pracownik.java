package pl.javastart.obiektowe.firma;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private Integer wiek;

    // robimy settery

    void ustawImie(String imie){ this.imie = imie; }

    void ustawNazwisko(String nazwisko){ this.nazwisko = nazwisko; }

    void ustawWiek(int wiek){ this.wiek = wiek; }

    //robimy gettery

    public String wezImie(){ return this.imie; }

    public String wezNaazwisko(){ return this.nazwisko; }

    public int wezWiek(){ return this.wiek; }

    //tworzymy kostruktory

    Pracownik (String imie, String nazwisko, int wiek){
        this.imie= imie;
        this.nazwisko= nazwisko;
        this.wiek= wiek;
    }
    Pracownik(){
        imie = "nie podano";
        nazwisko = "nie podano";
        wiek=null;
        }

    Pracownik(Pracownik pracownik ){
        imie = pracownik.imie;
        nazwisko = pracownik.nazwisko;
        wiek= pracownik.wiek;
    }

    @Override
    public String toString() {
        return
                imie + '\'' + nazwisko + " "+"lat " + wiek;

    }
}
