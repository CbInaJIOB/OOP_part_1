public class Puffendye extends Hogwarts{    //Пуффендуй
    private int industriousness;    //трудолюбие
    private int loyalty;    //верность
    private int honesty;    //честность

    public Puffendye(String name, String surname, int conjure, int transgress, int industriousness, int loyalty, int honesty) {
        super(name, surname, conjure, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + ", Фамилия: " + getSurname() + ", колдовство: " + getConjure() + ", " +
                "трансгрессирование: " + getTransgress() + ", трудолюбие: " + industriousness + ", верность: " + loyalty + ", честность: "
                + honesty;
    }

    public int fullMagicPuff(){
        return industriousness + loyalty + honesty;
    }

    public static void comparePuff(Puffendye puffendyeOne, Puffendye puffendyeTwo){
        if (puffendyeOne.fullMagicPuff() > puffendyeTwo.fullMagicPuff()){
            System.out.println(puffendyeOne.getName() + " лучший Пуффендуй, чем " + puffendyeTwo.getName());
        } else if (puffendyeOne.fullMagicPuff() < puffendyeTwo.fullMagicPuff()) {
            System.out.println(puffendyeTwo.getName() + " лучший Пуффендуй, чем " + puffendyeOne.getName());
        } else {
            System.out.println("Пуффендуйцы равны!");
        }
    }


}
