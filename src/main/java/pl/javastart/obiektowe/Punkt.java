package pl.javastart.obiektowe;

public class Punkt {
    private int wspX;
    private int wspY;

    void ustawX(int x){
        wspX = x;
    }

    void ustawY(int y){
        wspY = y;
    }

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
