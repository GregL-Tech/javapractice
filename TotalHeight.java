class TotalHeight {

    public static void main(String args[])
    {
        int feet = 5;
        double inches = 2.5;
        System.out.println("Your height (the feet part) is " + feet);
        System.out.println("and the inches part is " + inches);
        System.out.println("Your total height is " + ((feet * 12) + inches));

        double meter = feet / 3.281;
        double centimeters = inches * 2.54;
        System.out.println("Your height (the meter part) is " + meter);
        System.out.println("and the centimeters part is " + centimeters);
        System.out.println("Your total height is " + ((meter * 100) + centimeters));
    }
}
