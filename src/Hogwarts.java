public class Hogwarts {

    public void compare(HogwartsStudent student1, HogwartsStudent student2) {
        int resultStudent1 = student1.getMagicPower() + student1.getTransgressionDistance();
        int resultStudent2 = student2.getMagicPower() + student2.getTransgressionDistance();
        if (resultStudent1 > resultStudent2) {
            System.out.println(student1 + " лучше чем " + student2);
        } else {
            System.out.println(student2 + " лучше чем " + student1);
        }
    }

    public void compare(GryffindorStudent student1, GryffindorStudent student2) {
        int resultStudent1 = student1.getCourage() + student1.getHonour() + student1.getNobility();
        int resultStudent2 = student2.getCourage() + student2.getHonour() + student2.getNobility();
        if (resultStudent1 < resultStudent2) {
            System.out.println(student1 + " лучше чем " + student2);
        } else {
            System.out.println(student2 + " лучше чем " +student1);
        }
    }

    public void compare (ClawStudent student1, ClawStudent student2) {
        int resultStudent1 = student1.getFullCreativity() + student1.getWitty() + student1.getWise() + student1.getSmart();
        int resultStudent2 = student2.getFullCreativity() + student2.getWitty() + student2.getWise() + student1.getSmart();
        if (resultStudent1 < resultStudent2) {
            System.out.println(student1 + " лучше чем " + student2);
        } else {
            System.out.println(student2 + " лучше чем " +student1);
        }
    }

    public void compare (PuffenduiStudent student1, PuffenduiStudent student2) {
        int resultStudent1 = student1.getHonest() + student1.getLoyal() + student1.getHardworking();
        int resultStudent2 = student2.getHonest() + student2.getLoyal() + student2.getHardworking();
        if (resultStudent1 < resultStudent2) {
            System.out.println(student1 + " лучше чем " + student2);
        } else {
            System.out.println(student2 + " лучше чем " +student1);
        }
    }

    public void compare (SlytherinStudent student1, SlytherinStudent student2) {
        int resultStudent1 = student1.getThirstPower() + student1.getResourcefulness() + student1.getAmbition() + student1.getDecisiveness() + student1.getCunning();
        int resultStudent2 = student1.getThirstPower() + student2.getResourcefulness() + student2.getAmbition() + student2.getDecisiveness() + student2.getCunning();
        if (resultStudent1 < resultStudent2) {
            System.out.println(student1 + " лучше чем " + student2);
        } else {
            System.out.println(student2 + " лучше чем " + student1);
        }
    }
}
