public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Hogwards!");

        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", 38, 23, 45, 67,58),
                new Gryffindor("Гермиона", "Грейнджер", 43, 45, 32, 45, 24),
                new Gryffindor("Рон","Уизли", 12, 23, 32, 45, 65),
        };
        Puffendye[] puffendyes = {
                new Puffendye("Захария", "Смит", 54, 65, 95, 52, 74),
                new Puffendye("Седрик", "Диггори", 91, 63, 54, 43, 65),
                new Puffendye("Джастин", "Финч-Флетчли", 3, 72, 85, 90, 43),
        };
        Kogtevran[] kogtevrans = {
                new Kogtevran("Чжоу", "Чанг", 2, 34, 51, 64, 52, 74),
                new Kogtevran("Падма", "Патил", 74, 74, 53, 75, 5, 65),
                new Kogtevran("Маркус", "Белби", 8, 62, 75, 85, 2, 5),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 32,12,45,12,43, 43, 54),
                new Slytherin("Грэхэм", "Монтегю", 76,43,43,23, 65, 72, 84),
                new Slytherin("Грегори", "Гойл", 12, 32,43, 78, 63, 26, 74),
        };

        PrintService.print(gryffindors);
        PrintService.print(puffendyes);
        PrintService.print(kogtevrans);
        PrintService.print(slytherins);

        Gryffindor.compareGriff(gryffindors[0], gryffindors[2]);
        Kogtevran.compareKg(kogtevrans[0], kogtevrans[1]);
        Puffendye.comparePuff(puffendyes[2], puffendyes[1]);
        Slytherin.compareSl(slytherins[2], slytherins[0]);

        Hogwarts.compareStudent(gryffindors[0], slytherins[0]);

    }
}