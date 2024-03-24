public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honour;
    private int courage;

    public GryffindorStudent(String name, int magicPower, int transgressionDistance) {
        super(name, magicPower, transgressionDistance);
    }

    public GryffindorStudent(String name, int magicPower, int transgressionDistance, int nobility, int honour, int courage) {
        super( name, magicPower, transgressionDistance );
        this.nobility = nobility;
        this.honour = honour;
        this.courage = courage;
    }


    public void setNobility(int nobility) {
        if (nobility >= 0 && nobility <= 100) {
            this.nobility = nobility;
        } else {
            System.out.println("входные параметры не верны должны быть от 0 до 100, актуальное значение = " +nobility);
        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return getName();
    }
}
