package school;

public class Puffendoo extends Hogwarts {
    private int hardworking;
    private int faithful;
    private int honest;
    private int sum2;

    public Puffendoo(String name, String surname, int powerOfMagic, int transgressionDistance, int hardworking, int faithful, int honest) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.faithful = faithful;
        this.honest = honest;
        sum2 = hardworking + hardworking + faithful + honest;
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

    public int getSum2() {
        return sum2;
    }

    @Override
    public String toString() {
        return "У "
                + getName() + " "
                + getSurname()
                + " из факультета Пуффендуя трудолюбство = "
                + hardworking +
                " баллов, верность = " + faithful +
                " баллов, честность =" + honest + " баллов" + " баллов, общая сумма баллов по факультету = " + sum2
                ;
    }
}
