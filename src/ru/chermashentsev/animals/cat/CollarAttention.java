package ru.chermashentsev.animals.cat;

public class CollarAttention implements Meowable{
    Meowable cat;
    String message;

    public CollarAttention(Meowable cat, String message) {
        this.cat = cat;
        this.message = message;
    }

    @Override
    public void meow() {
        System.out.println(message);
        cat.meow();
    }
}
