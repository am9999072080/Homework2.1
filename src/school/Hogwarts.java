package school;

public class Hogwarts {
    private String name;
    private String surname;
    private int powerOfMagic;
    private int transgressionDistance;


    public Hogwarts(String name, String surname, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public int getPowerOfMagic() {

        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {

        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public void compareHogwarts(Hogwarts other) {
        int result = (this.powerOfMagic + this.transgressionDistance) - (other.powerOfMagic + other.powerOfMagic);
        if (result > 0) {
            System.out.printf("У студента из школы магии и волшебства Хогвартс %s %s больше баллов, чем у %s %s", getName(), getSurname(), other.getName(), other.getSurname());
        } else if (result < 0) {
            System.out.printf("%s %s обладает меньшей мощностью магии, чем у %s %s", other.getName(), other.getSurname(), getName(), getSurname());
        } else {
            System.out.println("Студенты равны по силе магии");
        }
    }
}
