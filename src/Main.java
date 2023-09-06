public class Main {

    public static void checkScore(double score) {
        if (score > 0 && score <= 50.00) {
            System.out.println("Punteggio medio");
        } else if (score > 50.00 && score <= 100.00) {
            System.out.println("Punteggio molto buono");
        } else {
            throw new ArithmeticException("Il punteggio è fuori scala!");
        }
    }

    public static void main(String[] args) {
        try {
            checkScore(2.15);
            checkScore(50);
            checkScore(95.02);
            checkScore(100.01);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}