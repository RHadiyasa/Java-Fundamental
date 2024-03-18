public class SwitchStatement {
    public static void main(String[] args) {
        String name = "Rafi Hadiyasa";
        char grade = 'A';

        System.out.println("Nama : " + name);
        System.out.println("Nilai mahasiswa : " + grade);
        System.out.print("Keterangan : ");
        switch (grade){
            case 'A':
                System.out.println("Anda lulus dengan nilai memuaskan");
                break;
            case 'B':
                System.out.println("Anda lulus dengan nilai baik");
                break;
            case 'C':
                System.out.println("Anda tidak lulus, harus mengulang");
                break;
            case 'D':
                System.out.println("Mungkin Anda salah jurusan");
                break;
            default:
                System.out.println("Anda Bukan mahasiwa");
                break;
        }
    }
}
