public class ForLoop {
    public static void main(String[] args) {
        // Mencetak angka 1-10

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int num = 1; // inisiasi variable

        for (;num <= 10;){ // condition
            System.out.println("perulangan ke - " + num);
            num++; // increment
        }
    }
}
