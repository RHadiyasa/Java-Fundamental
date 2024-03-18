public class NonPrimitiveDataType {
    public static void main(String[] args) {
        String name = "Rafi";
        Integer age = 25;

        System.out.println(name + " " + age);

        String name1; // Error jika tidak diinisiasi
        name1 = "Hadiyasa";
        Integer age1;
        age1 = age; // Bisa di reassign dari variable sebelumnya
        age1 = 26;
        System.out.println(name1 + " " + age1);

        Integer age2 = null;
        // int age3 = null; // error tidak bisa bernilai null
        System.out.println(age2);

        // Mendapatkan nilai dari tipe data non primitive untuk dimasukkan ke dalam tipe data primitive
        int iniInteger = age1.intValue();
        System.out.println(iniInteger);
    }
}
