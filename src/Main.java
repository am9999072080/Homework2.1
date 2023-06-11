import school.Gryffindor;
import school.Kogtevran;
import school.Puffendoo;
import school.Slytherin;

public class Main {
    public static void main(String[] args) {

        Gryffindor hogwarts1 = new Gryffindor("Гарри", "Поттер", 10, 20, 11, 13, 13);
        Gryffindor hogwarts2 = new Gryffindor("Гермиона", "Грейнджер", 11, 21, 12, 11, 12);
        Gryffindor hogwarts3 = new Gryffindor("Рон", "Уизли", 15, 10, 12, 11, 12);

        Puffendoo hogwarts4 = new Puffendoo("Захария", "Смит", 2, 5, 15, 11, 12);
        Puffendoo hogwarts5 = new Puffendoo("Седрик", "Диггори", 7, 15, 16, 14, 11);
        Puffendoo hogwarts6 = new Puffendoo("Джастин", "Финч-Флетчли", 15, 5, 15, 12, 10);

        Kogtevran hogwarts7 = new Kogtevran("Чжоу", "Чанг", 4, 9, 11, 12, 11);
        Kogtevran hogwarts8 = new Kogtevran("Падма", "Патил", 10, 14, 14, 8, 11);
        Kogtevran hogwarts9 = new Kogtevran("Маркус", "Белби", 12, 8, 14, 13, 10);

        Slytherin hogwarts10 = new Slytherin("Драко", "Малфой", 24, 12, 12, 15, 10, 12, 13);
        Slytherin hogwarts11 = new Slytherin("Грэхэм", "Монтегю", 12, 12, 12, 12, 14, 15, 9);
        Slytherin hogwarts12 = new Slytherin("Грегори", "Гойл", 11, 11, 5, 6, 9, 12, 8);


        hogwarts1.compareHogwarts(hogwarts5);
        System.out.println();
        hogwarts3.compareGryffindor(hogwarts1);
        System.out.println();
        hogwarts5.comparePuffendoo(hogwarts4);
        System.out.println();
        hogwarts7.compareKogtevran(hogwarts8);
        System.out.println();
        hogwarts10.compareSlytherin(hogwarts12);
    }
}
