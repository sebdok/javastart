package pl.javastart.obiektowe.firma;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private int wiek;

    // robimy settery

    void ustawImie(String imie){ this.imie = imie; }

    void ustawNazwisko(String nazwisko){ this.nazwisko = nazwisko; }

    void ustawWiek(int wiek){ this.wiek = wiek; }

    //robimy gettery

    public String wezImie(){ return this.imie; }

    public String wezNaazwisko(){ return this.nazwisko; }

    public int wezWiek(){ return this.wiek; }

    @Override
    public String toString() {
        return
                imie + '\'' + nazwisko + '\'' + wiek;

    }
}
