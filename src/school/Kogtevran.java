package school;

public class Kogtevran extends Hogwarts {
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Kogtevran(String name, String surname, int powerOfMagic, int transgressionDistance, int wise, int witty, int fullOfCreativity) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                "wise=" + wise +
                ", witty=" + witty +
                ", fullOfCreativity=" + fullOfCreativity +
                "} " + super.toString();
    }

    public void compareKogtevran(Kogtevran other) {
        System.out.println();
        int result = (this.wise + this.witty + this.fullOfCreativity) - (other.wise + other.witty + other.fullOfCreativity);
        if (result > 0) {
            System.out.printf("У %s %s  из факультета Когтевран больше баллов(мудрость=%s баллов, остроумность= %s баллов, творчества=%s баллов), чем у %s %s (мудрость=%s баллов, остроумность= %s баллов, творчества=%s баллов)", getName(), getSurname(), getWise(), getWitty(), getFullOfCreativity(), other.getName(), other.getSurname(), other.getWise(), other.getWitty(), other.getFullOfCreativity());
        } else if (result < 0) {
            System.out.printf("У %s %s  из факультета Когтевран меньше баллов(мудрость=%s баллов, остроумность= %s баллов, творчества=%s баллов), чем у %s %s (мудрость=%s баллов, остроумность= %s баллов, творчества=%s баллов)", getName(), getSurname(), getWise(), getWitty(), getFullOfCreativity(), other.getName(), other.getSurname(), other.getWise(), other.getWitty(), other.getFullOfCreativity());
        } else {
            System.out.printf("У %s %s  из факультета Когтевран общая сумма баллов(мудрость=%s баллов, остроумность= %s баллов, творчества=%s баллов), равно с %s %s (мудрость=%s баллов, остроумность= %s баллов, творчества=%s баллов)", getName(), getSurname(), getWise(), getWitty(), getFullOfCreativity(), other.getName(), other.getSurname(), other.getWise(), other.getWitty(), other.getFullOfCreativity());
        }
    }
}
