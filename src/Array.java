public class Array {
    public static void main(String[] args) {
        // Dalam membuat Array kita menggunakan []
        String[] arrayString;
        arrayString = new String[3];  // Angka 3 berarti hanya menampung 4 data
        // Kata kunci "New" untuk membuat instance baru -> akan di bahas di OOP

        arrayString[0] = "Muhammad";
        arrayString[1] = "Rafi";
        arrayString[2] = "Hadiyasa";
        // arrayString[3] = "Rafi Hadiyasa"; // Error : Index out of bounds

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

    }
}
