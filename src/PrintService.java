public class PrintService {
    public static void print(Gryffindor[] gryffindors) {
        System.out.println("Список студентов Gryffindor: ");
        for (int i = 0; i < gryffindors.length; i++) {
            System.out.println("Имя: " + gryffindors[i].getName() + ", Фамилия: " + gryffindors[i].getSurname() + ", "
                    + "колдовство: " + gryffindors[i].getConjure() + ", трансгрессирование: " + gryffindors[i].getTransgress() + ", благородство: " + gryffindors[i].getNobility() + ", честь: " + gryffindors[i].getHonor() + ", храбрость: " + gryffindors[i].getBravery());
        }
        System.out.println();
    }

    public static void print(Puffendye[] puffendyes) {
        System.out.println("Список студентов Puffendye: ");
        for (int i = 0; i < puffendyes.length; i++) {
            System.out.println("Имя: " + puffendyes[i].getName() + ", Фамилия: " + puffendyes[i].getSurname() + ", " + "колдовство: " + puffendyes[i].getConjure() + ", трансгрессирование: " + puffendyes[i].getTransgress() + ", трудолюбие: " + puffendyes[i].getIndustriousness() + ", верность: " + puffendyes[i].getLoyalty() + ", честность: " + puffendyes[i].getHonesty());
        }
        System.out.println();
    }

    public static void print(Kogtevran[] kogtevrans) {
        System.out.println("Список студентов Kogtevran: ");
        for (int i = 0; i < kogtevrans.length; i++) {
            System.out.println("Имя: " + kogtevrans[i].getName() + ", Фамилия: " + kogtevrans[i].getSurname() + ", " + "колдовство: " + kogtevrans[i].getConjure() + ", " + "трансгрессирование: " + kogtevrans[i].getTransgress() + ", ум: " + kogtevrans[i].getMind() + ", мудрость: " + kogtevrans[i].getWisdom() + ", остроумие: " + kogtevrans[i].getWit() + ", творчество" + kogtevrans[i].getCreativity());
        }
        System.out.println();
    }

    public static void print(Slytherin[] slytherins) {
        System.out.println("Список студентов Slytherin: ");
        for (int i = 0; i < slytherins.length; i++) {
            System.out.println("Имя: " + slytherins[i].getName() + ", фамилия: " + slytherins[i].getSurname() + ", " + "хитрость: " + slytherins[i].getTrick() + ", решительность: " + slytherins[i].getDetermination() + ", амбициозность: " + slytherins[i].getAmbition() + ", находчивость: " + slytherins[i].getResourcefulness() + ", жажда власти: " + slytherins[i].getPower());
        }
        System.out.println();
    }

}
