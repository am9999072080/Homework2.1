import school.*;

public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Hogwarts("Гарри", "Поттер", 10, 20),
                new Hogwarts("Гермиона", "Грейнджер", 11, 21),
                new Hogwarts("Рон", "Уизли", 15, 10),

                new Hogwarts("Захария", "Смит", 2, 5),
                new Hogwarts("Седрик", "Диггори", 7, 15),
                new Hogwarts("Джастин", "Финч-Флетчли", 15, 5),

                new Hogwarts("Чжоу", "Чанг", 4, 9),
                new Hogwarts("Падма", "Патил", 10, 14),
                new Hogwarts("Маркус", "Белби", 12, 8),

                new Hogwarts("Драко", "Малфой", 24, 12),
                new Hogwarts("Грэхэм", "Монтегю", 12, 12),
                new Hogwarts("Грегори", "Гойл", 11, 11),
        };

        Gryffindor[] students1 = {
                new Gryffindor("Гарри", "Поттер", 10, 20, 11, 13, 13),
                new Gryffindor("Гермиона", "Грейнджер", 11, 21, 12, 11, 12),
                new Gryffindor("Рон", "Уизли", 15, 10, 13, 9, 16),
        };

        Puffendoo[] students2 = {
                new Puffendoo("Захария", "Смит", 2, 5, 15, 11, 12),
                new Puffendoo("Седрик", "Диггори", 7, 15, 16, 14, 11),
                new Puffendoo("Джастин", "Финч-Флетчли", 15, 5, 15, 12, 10),
        };

        Kogtevran[] students3 = {
                new Kogtevran("Чжоу", "Чанг", 4, 9, 11, 12, 11),
                new Kogtevran("Падма", "Патил", 10, 14, 14, 8, 11),
                new Kogtevran("Маркус", "Белби", 12, 8, 14, 13, 10),
        };

        Slytherin[] students4 = {
                new Slytherin("Драко", "Малфой", 24, 12, 12, 15, 10, 12, 13),
                new Slytherin("Грэхэм", "Монтегю", 12, 12, 12, 12, 14, 15, 9),
                new Slytherin("Грегори", "Гойл", 11, 11, 5, 6, 9, 12, 8),
        };

        PrintService printService = new PrintService();
        printService.print(students);
        printService.print(students1);
        printService.print(students2);
        printService.print(students3);
        printService.print(students4);
    }
}
