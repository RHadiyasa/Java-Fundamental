public class ForEach {
    public static void main(String[] args) {
        String[] members = {
                "Ilham","Olla","Adinda","Rahma","Rani"
        };

        for (int i = 0 ; i < members.length; i++){
            System.out.println("For Loop : " + members[i]);
        }

        System.out.println("-".repeat(50));
        // FOR EACH
        // Inisiasi nama variablenya
        // Kemudian nama arraynya
        for (String name : members){
            System.out.println("For Each : " + name);
        }
    }
}
