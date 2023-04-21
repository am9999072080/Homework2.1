package school;

public class Hogwarts {
    private String name;
    private String surname;
    private int powerOfMagic;
    private int transgressionDistance;
    private int sum;

    public Hogwarts(String name, String surname, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
        sum = powerOfMagic + transgressionDistance;
    }

    public int getSum() {
        return sum;
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
        return "У " + name + " "
                + surname + " Сила магии = "
                + powerOfMagic + " баллов, расстояние трансгресии = "
                + transgressionDistance + " баллов, общая сумма баллов по школе = "
                + sum
                ;
    }
}

