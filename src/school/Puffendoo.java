package school;

public class Puffendoo extends Hogwarts {
    private int hardworking;
    private int faithful;
    private int honest;

    public Puffendoo(String name, String surname, int powerOfMagic, int transgressionDistance, int hardworking, int faithful, int honest) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.faithful = faithful;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getFaithful() {
        return faithful;
    }

    public void setFaithful(int faithful) {
        this.faithful = faithful;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Puffendoo{" +
                "hardworking=" + hardworking +
                ", faithful=" + faithful +
                ", honest=" + honest +
                "} " + super.toString();
    }

    public void comparePuffendoo(Puffendoo other) {
        System.out.println();
        int result = (this.hardworking + this.faithful + this.honest) - (other.hardworking + other.faithful + other.honest);
        if (result > 0) {
            System.out.printf("У %s %s  из факультета Пуффендуя больше баллов(трудолюбство=%s баллов, верность= %s баллов, честность=%s баллов), чем у %s %s (трудолюбство=%s баллов, верность= %s баллов, честность=%s баллов)", getName(), getSurname(), getHardworking(), getFaithful(), getHonest(), other.getName(), other.getSurname(), other.getHardworking(), other.getFaithful(), other.getHonest());
        } else if (result < 0) {
            System.out.printf("У %s %s  из факультета Пуффендуя меньше баллов(трудолюбство=%s баллов, верность= %s баллов, честность=%s баллов), чем у %s %s (трудолюбство=%s баллов, верность= %s баллов, честность=%s баллов)", getName(), getSurname(), getHardworking(), getFaithful(), getHonest(), other.getName(), other.getSurname(), other.getHardworking(), other.getFaithful(), other.getHonest());
        } else {
            System.out.printf("У %s %s  из факультета Пуффендуя общая сумма баллов (трудолюбство=%s баллов, верность= %s баллов, честность=%s баллов), равно с %s %s (трудолюбство=%s баллов, верность= %s баллов, честность=%s баллов)", getName(), getSurname(), getHardworking(), getFaithful(), getHonest(), other.getName(), other.getSurname(), other.getHardworking(), other.getFaithful(), other.getHonest());
        }
    }
}


