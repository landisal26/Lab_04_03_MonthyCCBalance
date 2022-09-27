public class Main {
    public static void main(String[] args)
    {
        double creditBal = 5000;
        double intRate = 0.17;
        double payment = ((creditBal *= 0.17));
        double noPay = payment + payment;

        System.out.println("Your payments after 1 month $ " +payment);
        System.out.println("Your Payment after 2 month $ " +noPay);
    }
}