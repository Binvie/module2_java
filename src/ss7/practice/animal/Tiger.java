package ss7.practice.animal;

import ss7.Edible.Edible;

public class Tiger extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Tiger : roarrrr";
    }

    @Override
    public String howToEat() {
       return "Tiger : eat meat";
    }

    @Override
    public String hunting() {
        return null;
    }
}

