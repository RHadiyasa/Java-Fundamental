import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
        String[][] regions = {
                {"Jawa","Timur"},
                {"DKI","Jakarta"},
                {"Nusa","Tenggara","Barat"},
                {"Nusa","Tenggara","Timur"},
                {"Bandung"},
                {"Bogor"}
        };

        System.out.println(regions[1][1]);
        System.out.println(regions[2][1]);
        System.out.println(regions[2]); // Array of String

        // Mencetak semua nilai yang ada di dalam Array regions[2]
        System.out.println(Arrays.toString(regions[2]));

        System.out.println("-".repeat(40));

        // Atau bisa menggunakan for each
        for (String region : regions[2]){
            System.out.println(region);
        }
    }
}
