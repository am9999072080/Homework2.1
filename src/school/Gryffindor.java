package school;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                "} " + super.toString();

    }

    public void compareGryffindor(Gryffindor other) {
        System.out.println();
        int result = (this.nobility + this.honor + this.bravery) - (other.nobility + other.honor + other.bravery);
        if (result > 0) {
            System.out.printf("У %s %s  из факультета Гриффиндор больше баллов(благородство=%s баллов, честь= %s баллов, храбрость=%s баллов), чем у %s %s (благородство=%s баллов, честь= %s баллов, храбрость=%s баллов)", getName(), getSurname(), getNobility(), getHonor(), getBravery(), other.getName(), other.getSurname(), other.nobility, other.getHonor(), other.getBravery());
        } else if (result < 0) {
            System.out.printf("У %s %s  из факультета Гриффиндор меньше баллов(благородство=%s баллов, честь= %s баллов, храбрость=%s баллов), чем у %s %s (благородство=%s баллов, честь= %s баллов, храбрость=%s баллов)", getName(), getSurname(), getNobility(), getHonor(), getBravery(), other.getName(), other.getSurname(), other.nobility, other.getHonor(), other.getBravery());
        } else {
            System.out.printf("У %s %s  из факультета Гриффиндор общая сумма баллов (благородство=%s баллов, честь= %s баллов, храбрость=%s баллов), равно с %s %s (благородство=%s баллов, честь= %s баллов, храбрость=%s баллов)", getName(), getSurname(), getNobility(), getHonor(), getBravery(), other.getName(), other.getSurname(), other.nobility, other.getHonor(), other.getBravery());
        }
    }
}