public class HomeWorkApp {
    public static void main(String[] args){

        int a = 4;
        int b = 8;
        boolean betweenLimit = sumLimitMethod(a, b);
        System.out.println(betweenLimit);

        int d = -7;
        positiveNegative(d);

        int e = -2;
        boolean negNumber = negativeMethod(e);
        System.out.println(negNumber);

        int f = 3;
        wordsPrints("hello!", 3);
    }

    public static boolean sumLimitMethod(int a, int b) {
        int c = a + b;
        if (10 <= c && c <= 20) {
            return true;
        }
        return false;
    }

    public static void positiveNegative(int d) {
        if (d >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
    }
    public static boolean negativeMethod(int e) {
        if (e < 0) {
            return true;
        }
        return false;
    }
    private static void wordsPrints(String word, int f) {
        for (int g =0; g < f; g++) {
            System.out.println(word);
        }
    }
}
// Комментарий