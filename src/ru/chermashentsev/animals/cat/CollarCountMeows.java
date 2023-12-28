package ru.chermashentsev.animals.cat;

public class CollarCountMeows implements Meowable{

    Meowable cat;
    private int count = 0;

    public CollarCountMeows(Meowable cat) {
        this.cat = cat;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void meow() {
        cat.meow();
        count++;
    }
}
