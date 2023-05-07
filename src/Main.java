// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13676;
        int pricePerMile = 20;
        int bonusPerMile = 1;
        int mile = ticketPrice / pricePerMile * bonusPerMile;

        System.out.println("Ваше количество бонусных миль за билет = " + mile);
    }
}