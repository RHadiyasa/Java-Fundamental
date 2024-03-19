public class ReturnParameter {
    public static void main(String[] args) {

        int a = 1600;
        int b = 500;

        int total = sum(a, b);
        System.out.println("Penjumlahan " + a + " + " + b + " = " + total);
        System.out.println("Penjumlahan " + a + " + " + b + " = " + sum(a, b));
        System.out.println("Penjumlahan = " + sum(200, 400));

        System.out.println("-".repeat(50));

        int add = operation(10, "-", 20);
        int subtract = operation(10, "+", 20);
        int wrong = operation(10, "hah", 20);
        System.out.println(add);
        System.out.println(subtract);
        System.out.println(wrong);
    }

    static int sum(int value1, int value2) {
        int total = value1 + value2;
        return total;
    }

    static int operation(int value1, String operation, int value2) {
        switch (operation) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
