public class Counter {
    private int num;

    public int getClicks()
    {
        return num;
    }

    public void click()
    {
        this.num = ++num;
    }

    public void reset()
    {
        this.num = 0;
    }
}
