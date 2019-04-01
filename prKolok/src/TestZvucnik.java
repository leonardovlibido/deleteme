


public class TestZvucnik {
    public static void main(String[] args) {
        Zvucnik zv1 = new Zvucnik("Zvucnik",  "Yamaha HS8", 75);
        Zvucnik zv2 = new Zvucnik("Zvucnik",  "Yamaha IS8", 60);
        Zvucnik zv3 = new Zvucnik("Zvucnik",  "Yamaha ZS8", 25);
        System.out.println(zv1);
        System.out.println(zv2);
        System.out.println(zv3);

        Prostorija pr1 = new Prostorija("Lotus", 5, 10);
        System.out.println(pr1);

        Skladiste sk1 = new Skladiste("Lotus", 5, 10, 3);
        System.out.println(sk1);
        sk1.dodajPalete(3);
        System.out.println(sk1);
        sk1.dodajPalete(3);
        System.out.println(sk1);
        sk1.dodajPalete(1);
        System.out.println(sk1);
    }

}
