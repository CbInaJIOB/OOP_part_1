public class Kogtevran extends Hogwarts { //Когтевран
    private int mind;   //ум
    private int wisdom;   //мудрость
    private int wit;   //остроумие
    private int creativity;   //творчество

    public Kogtevran(String name, String surname, int conjure, int transgress, int mind, int wisdom, int wit, int creativity) {
        super(name, surname, conjure, transgress);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + ", Фамилия: " + getSurname() + ", колдовство: " + getConjure() + ", " + "трансгрессирование: " + getTransgress() + ", ум: " + mind + ", мудрость: " + wisdom + ", остроумие: " + wit + ", творчество" + creativity;
    }

    public int fullMagicKg() {
        return mind + wisdom + wisdom + creativity;
    }

    public static void compareKg(Kogtevran kogtevransOne, Kogtevran kogtevransTwo){
        if (kogtevransOne.fullMagicKg() > kogtevransTwo.fullMagicKg()){
                System.out.println(kogtevransOne.getName() + " лучший Когтевран, чем " + kogtevransTwo.getName());
        } else if (kogtevransOne.fullMagicKg() < kogtevransTwo.fullMagicKg()) {
                System.out.println(kogtevransTwo.getName() + " лучший Когтевран, чем " + kogtevransOne.getName());
        } else {
                System.out.println("Когтевранцы равны!");
        }


    }
}




