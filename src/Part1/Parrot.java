package Part1;

public class Parrot extends Bird{
    private String text;

    public Parrot(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Введите текст");
        }
        this.text = text;
    }

    @Override
    void sing() {
        char[] textAsChars = text.toCharArray();

        char tempChar;

        for (int index = 0; index < textAsChars.length; index++) {
            int randomPlace = (int) (Math.random() * text.length());

            tempChar = textAsChars[randomPlace];
            textAsChars[randomPlace] = textAsChars[index];
            textAsChars[index] = tempChar;
        }
        System.out.println(textAsChars);
    }
}
