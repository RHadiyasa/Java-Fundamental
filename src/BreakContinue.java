public class BreakContinue {
    public static void main(String[] args) {

        // BREAK
        for (int i = 1; i <= 10; i++) {
            System.out.println("Cetak = " + i);
            if (i == 4){
                break; // berhenti ketika perulangan ke-4
            }
        }

        System.out.println("Perulangan berhenti");
        System.out.println("-".repeat(50));

        // CONTINUE
        for (int num = 1; num <= 100; num++){
            if (num % 2 == 0){ // Cek apakah angka habis dibagi 2
                System.out.println("Angka genap");
                continue;
            }
            System.out.println("Angka ganjil : " + num);
        }
    }
}
