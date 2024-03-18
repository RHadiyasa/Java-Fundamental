public class IFStatement {
    public static void main(String[] args) {

        int score = 51;

        if (score < 60 ){
            System.out.println("Nilai Jelek");
        } else if (score > 60 && score < 80){
            System.out.println("Nilai Bagus");
        } else if (score > 80 && score < 90) {
            System.out.println("Nilai Memuaskan");
        } else {
            System.out.println("Nilai Sempurna");
        }

    }
}
