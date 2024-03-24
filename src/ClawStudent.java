public class ClawStudent extends HogwartsStudent {
    private final int smart;
    private final int wise;
    private final int witty;
    private final int fullCreativity;

    public ClawStudent(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int fullCreativity) {
        super( name, magicPower, transgressionDistance );
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullCreativity = fullCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullCreativity() {
        return fullCreativity;
    }

    @Override
    public String toString() {
        return getName();
    }
}
