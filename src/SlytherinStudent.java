public class SlytherinStudent extends HogwartsStudent {
    private final int cunning;
    private final int decisiveness;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstPower;

    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int cunning, int decisiveness, int ambition, int resourcefulness, int thirstPower) {
        super( name, magicPower, transgressionDistance );
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    @Override
    public String toString() {
        return getName();
    }
}
