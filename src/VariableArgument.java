public class VariableArgument {
    public static void main(String[] args) {

        int[] values = {90, 70, 80, 60, 59, 100, 100, 99, 90};
        isPassed("Rafi", values);
        isPassed("Hadiyasa", 50, 60, 70, 80, 90, 80);
    }

    static void isPassed(String name, int... values) { // Variable Argument
        //Variable argument bisa menggunakan [] atau ...
        int total = 0;

        for (int value : values) { // Perulangan nilai di dalam Array
            total += value; // Menjumlahkan setiap nilai di dalam Array
        }

        // Mencari rata-rata nilai
        // Casting tipe data menjadi double dari int
        double finalValue = (double) total / (double) values.length; // casting bisa salah satu aja

        if (finalValue >= 75) {
            System.out.println("Final Score : " + String.format("%.2f", finalValue));
            System.out.println("Congratulation " + name + " you're passed!");
        } else {
            System.out.println("Final Score : " + String.format("%.2f", finalValue));
            System.out.println("Unfortunately " + name + ", you're not passed...");
        }
    }
}
