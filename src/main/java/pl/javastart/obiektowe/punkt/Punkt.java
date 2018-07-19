package pl.javastart.obiektowe.punkt;

public class Punkt {
    private int wspX;
    private int wspY;

    Punkt(int x, int y){wspX = x; wspY = y; }

    Punkt(Punkt pkt){wspX = pkt.wspX; wspY = pkt.wspY; }

    void ustawX(int x){
        wspX = x;
    }

    void ustawY(int y){ wspY = y; }

    public int dajX(){
        return wspX;
    }

    public int dajY(){
        return wspY;
    }

    @Override
    public String toString() {
        return "to jest punkt o wspolrzednych 'x','y' gdzie: \n" +
                "x = " + wspX + "\n" +
                "y = " + wspY;
    }
}
