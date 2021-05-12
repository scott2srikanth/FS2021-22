package questions.arraylist;

public class WaterBottel {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(9, 3));
    }
    public static int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;
        int empty = numBottles;
        while(empty >= numExchange){
            drink += (empty/numExchange);
            empty = empty - ((empty/numExchange)*numExchange) + (empty/numExchange);
        }
        return drink;
    }
}
