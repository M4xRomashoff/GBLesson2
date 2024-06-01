/*
Ромашов Максим 2024
 */



import market.Human;
import market.Market;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Vladimir");
        Human human3 = new Human("Наталья");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);

        market.takeInQueue(human1);


        market.update();
    }
}
