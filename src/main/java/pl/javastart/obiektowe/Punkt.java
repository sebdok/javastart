package pl.javastart.obiektowe;

public class Punkt {
    int wspX;
    int wspy;

    public void ustawX(int x){
        wspX = x;
    }

    public void ustawY(int y){
        wspy = y;
    }

    public int dajX(){
        return wspX;
    }

    public int dajY(){
        return wspy;
    }
}
