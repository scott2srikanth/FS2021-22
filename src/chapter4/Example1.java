package chapter4;

public class Example1 {
    public static void main( String[] args ) {
        VarargOverload obj = new VarargOverload();
        obj.test(1, 2, 3);
        obj.test(true, "hello", "world");
    }
}
class VarargOverload {

    public void test(int ... args){
        int sum = 0;
        for (int i: args) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public void test(boolean p, String ... args){
        boolean negate = !p;
        System.out.println("negate = " + negate);
        System.out.println("args.length = "+ args.length);
    }

}