public class PuffenduiStudent extends HogwartsStudent {
    private final int hardworking;
    private final int loyal;
    private final int honest;

    public PuffenduiStudent(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super( name, magicPower, transgressionDistance );
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return getName();
    }
}
