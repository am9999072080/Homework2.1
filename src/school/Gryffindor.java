package school;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    private int sum1;

    public Gryffindor(String name, String surname, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        sum1 = nobility + honor + bravery;
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

    public int getSum1() {
        return sum1;
    }

    @Override
    public String toString() {
        return "У "
                + getName() + " "
                + getSurname()
                + " из факультета Гриффиндор благородство = "
                + nobility +
                " баллов, честь = " + honor +
                " баллов, храбрость = " + bravery + " баллов, общая сумма баллов по факультету = " + sum1
                ;

    }
}