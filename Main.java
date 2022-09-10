import java.util.Scanner;

public class Main {

    public static class Ders {
        String name;
        int sinav, sozlu;
        double not;

        Ders(String name, int sinav, int sozlu,double not) {
            not = (sinav * 80 / 100) + (sozlu * 20 / 100);
            this.name = name;
            this.sinav = sinav;
            this.sozlu = sozlu;
            this.not = not;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dersin adı:");
            String a = sc.next();
            System.out.println("Sınav notu:");
            int b = sc.nextInt();
            System.out.println("Sözlü notu:");
            int c = sc.nextInt();
            double d = (b*80/100)+(c*20/100);
            Ders ders = new Ders(a,b,c,d);
            System.out.println("Ders: "+a+"\nSınav: "+b+"\nSözlü: "+c+ "\nNot: "+d);
        }
    }
}