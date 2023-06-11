package school;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambitiousness;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, String surname, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambitiousness, int resourcefulness, int thirstForPower) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
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

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambitiousness=" + ambitiousness +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                "} " + super.toString();
    }

    public void compareSlytherin(Slytherin other) {
        System.out.println();
        int result = (this.cunning + this.determination + this.ambitiousness + this.resourcefulness + this.thirstForPower) - (other.cunning + other.determination + other.ambitiousness + other.resourcefulness + other.thirstForPower);
        if (result > 0) {
            System.out.printf("У %s %s  из факультета Слизерин больше баллов, чем у %s %s ", getName(), getSurname(), other.getName(), other.getSurname());
        } else if (result < 0) {
            System.out.printf("У %s %s  из факультета Слизерин меньше баллов, чем у %s %s", getName(), getSurname(), other.getName(), other.getSurname());
        } else {
            System.out.printf("У %s %s и у %s %s одинаковое число баллов", getName(), getSurname(), other.getName(), other.getSurname());
        }
    }
}