public class LogicOperation {
    public static void main(String[] args) {
        int nilaiUas = 80;
        int nilaiUts = 70;

        boolean lulusUas = nilaiUas > 75;
        boolean lulusUts = nilaiUts > 75;

        boolean isLulus = lulusUas && lulusUts;
        System.out.println("Apakah lulus : " + isLulus);

        boolean isLulus1 = lulusUas || lulusUts;
        System.out.println("Apakah lulus : " + isLulus1);

        System.out.println("Apakah lulus UTS : " + lulusUts);
        System.out.println("Apakah tidak lulus UTS : " + !lulusUts); // NOT operation
    }
}
