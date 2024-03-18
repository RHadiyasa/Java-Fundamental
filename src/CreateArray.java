public class CreateArray {
    public static void main(String[] args) {

        int[] numbers = new int[]{
          1,2,3,4,5,6,7
        };

        String[] member = {
          "Budi","Gunawan","Sadikin"
        };

        //Mengakses Array
        System.out.println("Angka : " + numbers[2]);
        System.out.println("Nama : " + member[0]);

        //Mengubah Array
        member[0] = "Agus";
        System.out.println("Nama baru : " + member[0]);

        //Mengetahui panjang sebuah Array
        System.out.println("Panjang Array Member : " + member.length);
        System.out.println("Panjang Array Numbers : " + numbers.length);

        System.out.println("-".repeat(40));
        /*
        Index pada array tidak dapat diubah, artinya data yang ada di dalam array tidak bisa dihapus.
        Untuk menghapus data di dalam array, kita bisa melakukan reassign pada data tersebut
         */

        for (String name : member){
            System.out.println(name);
        }
        System.out.println("-".repeat(40));

        member[0] = ""; // Jadikan null atau ""
        for (String name : member){
            System.out.println(name);
        }

    }
}
