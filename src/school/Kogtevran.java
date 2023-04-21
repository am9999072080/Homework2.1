package school;

public class Kogtevran extends Hogwarts {
    private int wise;
    private int witty;
    private int fullOfCreativity;
    private int sum3;

    public Kogtevran(String name, String surname, int powerOfMagic, int transgressionDistance, int wise, int witty, int fullOfCreativity) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
        sum3 = wise + witty + fullOfCreativity;
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

    public int getSum3() {
        return sum3;
    }

    @Override
    public String toString() {
        return "У "
                + getName() + " "
                + getSurname()
                + " из факультета Когтевран мудрость = "
                + wise + " баллов, остроумность = "
                + witty + " баллов, творчества = "
                + fullOfCreativity + " баллов" + " баллов, общая сумма баллов по факультету = " + sum3
                ;
    }
}
