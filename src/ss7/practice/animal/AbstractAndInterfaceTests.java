package ss7.practice.animal;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal value : animals) {
            value.makeSound();

//             if (value instanceof Chicken) {
//                System.out.println(((Chicken)value).howToEat());
//            }
            if (value instanceof Tiger){
                System.out.println(((Tiger)value).hunting());

            }
        }

    }
}


