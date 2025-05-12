public class Hogwarts {
    private String name;
    private  String surname;
    private int conjure;    //колдовать
    private int transgress; //трансгрессировать

    public Hogwarts(String name, String surname, int conjure, int transgress){
        this.name = name;
        this.surname = surname;
        this.conjure = conjure;
        this.transgress = transgress;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getConjure() {
        return conjure;
    }

    public int getTransgress() {
        return transgress;
    }


    public static void compareStudent(Hogwarts student1, Hogwarts student2){
        int stud1 = student1.getConjure() + student1.getTransgress();
        int stud2 = student2.getConjure() + student2.getTransgress();
        if (stud1 > stud2){
            System.out.println(student1.getName() + " " + student1.getSurname() + " сильнее, чем " + student2.getName() + " "  + student2.getSurname());
        } else if (stud1 < stud2) {
            System.out.println(student2.getName() + " "  + student2.getSurname() + " сильнее, чем " + student1.getName() + " "  + student1.getSurname());
        } else {
            System.out.println(" Силы студентов равны!");
        }
    }
}
