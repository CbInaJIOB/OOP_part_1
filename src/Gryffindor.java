public class Gryffindor extends Hogwarts {   //Гриффиндор
    private int nobility;   //благородство
    private int honor;      //честь
    private int bravery;      //храбрость

    public Gryffindor(String name, String surname, int conjure, int transgress, int nobility, int honor, int bravery) {
        super(name, surname, conjure, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + ", Фамилия: " + getSurname() + ", колдовство: " + getConjure() + ", " +
                "трансгрессирование: " + getTransgress() + ", благородство: " + nobility + ", честь: " + honor + ", " +
                "храбрость: " + bravery;
    }

    public int fullMagicGr(){
        return nobility + honor + bravery;
    }

    public static void compareGriff(Gryffindor gryffindorOne, Gryffindor gryffindorTwo) {
        if (gryffindorOne.fullMagicGr() > gryffindorTwo.fullMagicGr()){
            System.out.println(gryffindorOne.getName() + " лучший Гриффиндорец, чем " + gryffindorTwo.getName());
        } else if (gryffindorOne.fullMagicGr() < gryffindorTwo.fullMagicGr()) {
            System.out.println(gryffindorTwo.getName() + " лучший Гриффиндорец, чем " + gryffindorOne.getName());
        } else {
            System.out.println("Гриффиндорцы равны!");
        }
    }
}
