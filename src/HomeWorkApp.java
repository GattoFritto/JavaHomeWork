public class HomeWorkApp {
    public static void main(String[] args){
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();
    }

    private static void compareNumbers() {
        int a = 88;
        int b = 66;
        if (a >= b){
            System.out.println("a >= b");
        }
        if (a < b){
            System.out.println("a < b");
        }
    }

    private static void printColor() {
        int value = 8;
        if (value  <= 0){
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }
        if (value > 100){
            System.out.println("Зеленый");
        }
    }

    private static void checkSumSign() {
        int a = -4;
        int b = 7;
        if (a + b > 0){
            System.out.println("Сумма положительная");
        }
        if (a + b < 0){
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}
// Комментарий