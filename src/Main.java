public class Main {
    public static void main(String[] args) {
        int dizi[] = { 3, 5, 8, 5, 3, 1, 2, 8, 7, 8 };
        int sekizSayiAdeti = 0,yediSayiAdeti = 0,besSayiAdeti = 0,ucSayiAdeti = 0, ikiSayiAdeti = 0, birSayiAdeti = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == 8)
                sekizSayiAdeti++;
            else if (dizi[i] == 7)
                yediSayiAdeti++;
            else if (dizi[i] == 5)
                besSayiAdeti++;
            else if (dizi[i] == 3)
                ucSayiAdeti++;
            else if (dizi[i] == 2)
                ikiSayiAdeti++;
            else if (dizi[i] == 1)
                birSayiAdeti++;
        }
        System.out.println("8 den şu kadar adet var : " + sekizSayiAdeti);
        System.out.println("7 den şu kadar adet var : " + yediSayiAdeti);
        System.out.println("5 den şu kadar adet var : " + besSayiAdeti);
        System.out.println("3 den şu kadar adet var : " + ucSayiAdeti);
        System.out.println("2 den şu kadar adet var : " + ikiSayiAdeti);
        System.out.println("1 den şu kadar adet var : " + birSayiAdeti);

    }

}