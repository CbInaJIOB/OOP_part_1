public class Slytherin extends Hogwarts{    //Слизерин
    private int trick;  //хитрость
    private int determination;  //решительность
    private int ambition;  //амбициозность
    private int resourcefulness;  //находчивость
    private int power;  //жажда власти

    public Slytherin(String name, String surname, int conjure, int transgress, int trick, int determination, int ambition, int resourcefulness, int power) {
        super(name, surname, conjure, transgress);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + ", Фамилия: " + getSurname() + ", колдовство: " + getConjure() + ", " +
                "трансгрессирование: " + getTransgress() + ", хитрость: " + trick + ", решительность: " + determination + ", амбициозность: "
                + ambition + ", находчивость: " + resourcefulness + ", жажда власти: " + power;
    }

    public int fullMagicSl(){
        return trick + determination + ambition + resourcefulness + power;
    }

    public static void compareSl(Slytherin slytherinOne, Slytherin slytherinTwo){
        if (slytherinOne.fullMagicSl() > slytherinTwo.fullMagicSl()){
            System.out.println(slytherinOne.getName() + " лучший Слизерин, чем " + slytherinTwo.getName());
        } else if (slytherinOne.fullMagicSl() < slytherinTwo.fullMagicSl()) {
            System.out.println(slytherinTwo.getName() + " лучший Слизерин, чем " + slytherinOne.getName());
        } else {
            System.out.println("Слизеринцы равны!");
        }
    }

}
