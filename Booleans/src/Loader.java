
public class Loader {
    public static void main(String[] args) {
        int milkAmount = 1000; // ml    old Value 200
        int powderAmount = 500; // g    old Value 5
        int eggsCount = 3; // items     old Value 3
        int sugarAmount = 10; // g      old Value 5
        int oilAmount = 30; // ml       old Value 30
        int appleCount = 8; //          old Value 8



        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml. Примечание: milk - 1 l значит в условии проверка на наличие 1000 ml
        if(powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
            System.out.println("Pancakes");
        } else {
            System.out.println("Not enough ingredients to make pancakes!");
        }

        //milk - 300 ml, powder - 5 g, eggs - 5
        if(milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            System.out.println("Omelette");
        } else {
            System.out.println("Not enough ingredients to make Omelette!");
        }

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            System.out.println("Apple pie");
        } else {
            System.out.println("Not enough ingredients to make Apple pie!");
        }
    }
}