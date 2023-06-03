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
            return "Можно идти гулять";
        } else return "Оставайтесь дома";
    }

    public static void main(String[] args) {
        System.out.println(chek(30, 20));
        System.out.println(chek(18, 15));
        System.out.println(chek(50, 20));
        System.out.println(chek(5, 30));
        System.out.println(chek(65, -20));


        // дз на сообразительность

        System.out.println(chek(generateRandomAge(), 10));

    }
}