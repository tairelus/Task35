package bjs.task35;

public class Main {

    public static void main(String[] args) {
        Apples apples;

        //Print price of all apple types
        for (Apples apple: Apples.values()) {
            System.out.println(apple + " costs " + apple.getPrice() + " cents" );
        }
    }
}

/*
JONATHAN costs 10 cents
GOLDEN costs 9 cents
WINESAP costs 15 cents
CORTLAND costs 8 cents
 */