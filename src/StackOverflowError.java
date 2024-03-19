public class StackOverflowError {
    public static void main(String[] args) {
        loop(10000);
    }

    static void loop(int number) {
        if (number == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Looping ke - " + number);
            loop(number - 1);
        }

    }
}
