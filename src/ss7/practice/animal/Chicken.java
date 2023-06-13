package ss7.practice.animal;

import ss7.Edible.Edible;

public class Chicken extends Animal {
    @Override
    public String howToEat() {
        return "Chicken : eating ";
    }

    @Override
    public String makeSound() {
        return "Chicken : cluck-cluck!";
    }
}
