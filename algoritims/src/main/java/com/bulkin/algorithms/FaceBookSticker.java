package com.bulkin.algorithms;

public class FaceBookSticker {
    //count how many letters are in the Sticker
    private int Facef=1;
    private int Facea=1;
    private int Facec=1;
    private int Facee=1;
    private int Faceb=1;
    private int Faceo=2;
    private int Facek=1;
    //counter for the new word to compare with the sticker word
    int f = 0;
    int a = 0;
    int c = 0;
    int e = 0;
    int b = 0;
    int o = 0;
    int k = 0;

    private int numOfStickers=1;

    public   int countStickers(String word){
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'f':
                    f++;
                    if (f > Facef)
                        addToLetters();
                    break;
                case 'a':
                    a++;
                    if (a > Facea)
                        addToLetters();
                    break;
                case 'c':
                    c++;
                    if (c > Facec)
                        addToLetters();
                    break;
                case 'e':
                    e++;
                    if (e > Facee)
                        addToLetters();
                    break;
                case 'b':
                    b++;
                    if (b > Faceb)
                        addToLetters();
                    break;
                case 'o':
                    o++;
                    if (o > Faceo)
                        addToLetters();
                    break;
                case 'k':
                    k++;
                    if (k > Facek)
                        addToLetters();
                    break;
            }
        }
        return numOfStickers;
    }

    private void restartAll() {
        Facef = 1;
        Facea = 1;
        Facec = 1;
        Facee = 1;
        Faceb = 1;
        Faceo = 2;
        Facek = 1;
        numOfStickers=1;
        f = 0;
        a = 0;
        c = 0;
        e = 0;
        b = 0;
        o = 0;
        k = 0;
    }

    private void addToLetters() {
        numOfStickers++;
        Facef++;
        Facea++;
        Facec++;
        Facee++;
        Faceb++;
        Faceo = Faceo + 2;
        Facek++;
    }
}
