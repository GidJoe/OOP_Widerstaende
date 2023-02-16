import java.util.HashMap;

public class Widerstand {

    private String ring1, ring2, ring3, ring4, ring5;
    private static HashMap<String, Integer> hshRingFarben = new HashMap<>();

    static {
        hshRingFarben.put("Schwarz", 0);
        hshRingFarben.put("Braun", 1);
        hshRingFarben.put("Rot", 2);
        hshRingFarben.put("Orange", 3);
        hshRingFarben.put("Gelb", 4);
        hshRingFarben.put("Grün", 5);
        hshRingFarben.put("Blau", 6);
        hshRingFarben.put("Violett", 7);
        hshRingFarben.put("Grau", 8);
        hshRingFarben.put("Weiß", 9);
        hshRingFarben.put("Gold", -1);
        hshRingFarben.put("Silber", -2);
    }


    private static HashMap<String, Double> hshRingFarben2 = new HashMap<>();

    static {
        hshRingFarben2.put("Schwarz", 0.0);
        hshRingFarben2.put("Braun", 1.0);
        hshRingFarben2.put("Rot", 2.0);
        hshRingFarben2.put("Orange", 0.0);
        hshRingFarben2.put("Gelb", 0.0);
        hshRingFarben2.put("Grün", 0.5);
        hshRingFarben2.put("Blau", 0.25);
        hshRingFarben2.put("Violett", 0.10);
        hshRingFarben2.put("Grau", 0.05);
        hshRingFarben2.put("Weiß", 0.0);
        hshRingFarben2.put("Gold", 5.0);
        hshRingFarben2.put("Silber", 10.0);
    }










    // Konstruktor
    public Widerstand(String ring1, String ring2, String ring3, String ring4, String ring5) {
        this.ring1 = ring1;
        this.ring2 = ring2;
        this.ring3 = ring3;
        this.ring4 = ring4;
        this.ring5 = ring5;


    }

    public int decoder() {

        int zahlenwert = hshRingFarben.get(ring1) * 100 + hshRingFarben.get(ring2)*10 + hshRingFarben.get(ring3);
       zahlenwert *= Math.pow(10, hshRingFarben.get(ring4));


        return zahlenwert;
    }

    public double Toleranz() {
        double tol = hshRingFarben.get(ring5);
        return tol;
    };


}