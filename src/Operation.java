public class Operation {
        public static void main(String[] args) {

                // Operator Aritmatika
                int a = 10;
                int b = 5;

                System.out.println(a + b); // Penjumlahan
                System.out.println(a - b); // Pengurangan
                System.out.println(a * b); // Perkalian
                System.out.println(a / b); // Pembagian

                // Augmented Operation
                System.out.println("-".repeat(40));
                int c = 10;
                c = c + 10; // Operator biasa

                c += 10; // Augmented Operation
                // berlaku untuk semua jenis operasi aritmatika -> Explore
                System.out.println(c);

                // Unary Operation
                int d = 1;
                System.out.println(d);
                d = d + 1;
                System.out.println(d);
                System.out.println(d++); // Output 2
                System.out.println(d); // Output 3
                System.out.println(++d); // Output 4
                // Berlaku untuk operator pengurangan

                // Comparison Operator
                System.out.println("-".repeat(40));

                int value1 = 100;
                int value2 = 200;

                System.out.println(value1 > value2);
                System.out.println(value1 < value2);
                // Suruh explore menggunakan operation lainnya
        }
}
