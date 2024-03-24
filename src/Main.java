public class Main {
    public static void main(String[] args) {

        GryffindorStudent gryffindor1 = new GryffindorStudent("Гарри",6, 4);
        gryffindor1.setNobility(100);

        GryffindorStudent gryffindor2 = new GryffindorStudent("Гермиона",8, 7, 68, 45, 3);
        GryffindorStudent gryffindor3 = new GryffindorStudent("Рон",5, 3, 65, 33, 8);
        Hogwarts hogwarts = new Hogwarts();
        hogwarts.compare(gryffindor2, gryffindor3);

        ClawStudent claw1 = new ClawStudent("Джоу", 5, 323, 45, 6, 7, 12);
        ClawStudent claw2 = new ClawStudent("Падма", 8, 455, 32, 4, 5, 17);
        ClawStudent claw3 = new ClawStudent("Маркус", 16, 352, 44, 6, 1, 28);
        hogwarts.compare(claw2, claw3);

        PuffenduiStudent puffendui1 = new PuffenduiStudent("Захария", 4, 232, 14, 5, 45);
        PuffenduiStudent puffendui2 = new PuffenduiStudent("Седрик", 3, 150, 12, 4, 32);
        PuffenduiStudent puffendui3 = new PuffenduiStudent("Захария", 1, 100, 64, 9, 28);
        hogwarts.compare(puffendui1, puffendui2);

        SlytherinStudent slytherin1 = new SlytherinStudent("Драко", 12, 300, 8, 5, 18, 2, 64);
        SlytherinStudent slytherin2 = new SlytherinStudent("Грэхэм", 19, 232, 14, 8, 45, 25, 35);
        SlytherinStudent slytherin3 = new SlytherinStudent("Грегори", 2, 180, 3, 12, 33, 20, 77);
        hogwarts.compare(slytherin1, slytherin2);
    }
}