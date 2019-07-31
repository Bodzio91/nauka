package pl.samouczekprogramisty;

public class Temperature {

    int temperature;

    private static void isPositive (int temperature) {
        if (temperature > 0)
            System.out.println("Temperatura = " + temperature + " jest dodatnia");
        else
            System.out.println("Temperatura = " + temperature + " nie jest dodatnia");
    }

    public static void main(String[] args) {
        isPositive(-50);
        isPositive(25);
    }
}
