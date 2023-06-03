import java.util.Random;

public class Main {
    // дз на сообразительность
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(80);
    }

    //дз
    public static String chek(int age, int temperature) {
        if (age >= 20 && age < 45 && temperature >= -20 && temperature < 30
                || age < 20 && temperature >= 0 && temperature < 28
                || age > 45 && temperature >= -10 && temperature < 25) {
            return "true";
        } else return "false";
    }

    public static void main(String[] args) {
        if (chek(30, 20).equals("true"))
            System.out.println("Можно идти гулять");
        else System.out.println("Оставайтесь дома");

        if (chek(18, 15).equals("true"))
            System.out.println("Можно идти гулять");
        else System.out.println("Оставайтесь дома");

        if (chek(50, 20).equals("true"))
            System.out.println("Можно идти гулять");
        else System.out.println("Оставайтесь дома");


        if (chek(5, 30).equals("true"))
            System.out.println("Можно идти гулять");
        else System.out.println("Оставайтесь дома");

        if (chek(65, -20).equals("true"))
            System.out.println("Можно идти гулять");
        else System.out.println("Оставайтесь дома");


        // дз на сообразительность

        if (chek(generateRandomAge(), 10).equals("true"))
            System.out.println("Можно идти гулять");
        else System.out.println("Оставайтесь дома");

    }
}