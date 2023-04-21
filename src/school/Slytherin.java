package school;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambitiousness;
    private int resourcefulness;
    private int thirstForPower;
    private int sum4;

    public Slytherin(String name, String surname, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambitiousness, int resourcefulness, int thirstForPower) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
        sum4 = cunning + determination + ambitiousness + resourcefulness + thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public int getSum4() {
        return sum4;
    }

    @Override
    public String toString() {
        return "У "
                + getName() + " "
                + getSurname()
                + " из факультета Слизерин хитрость = "
                + cunning +
                " баллов, " + determination +
                " баллов, решительность = " + ambitiousness +
                " баллов, амбициозность = " + resourcefulness +
                " баллов, находчивость и жажда власти = " + thirstForPower + " баллов" + " баллов, общая сумма баллов по факультету = " + sum4
                ;
    }
}
