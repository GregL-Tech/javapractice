public class CounterTester {
    public static void main(String[] args)
    {
        Counter myNum = new Counter();
        myNum.click();
        myNum.click();
        myNum.click();
        System.out.println(myNum.getClicks());
        myNum.reset();
        System.out.println(myNum.getClicks());
    }
}
