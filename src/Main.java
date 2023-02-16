public class Main {
    public static void main(String[] args) {



        Widerstand w1 = new Widerstand("Rot","Rot","Rot","Rot", "Rot");

        System.out.println(w1.decoder() + " Ohm " + "Toleranz +/- " + w1.Toleranz() + "%");




    }
}