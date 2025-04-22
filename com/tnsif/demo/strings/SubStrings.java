public class SubStrings {
    public static void main(String[] args) {
        String name = "Rajini";
        for(int i = 0;i < name.length();i++){
            for(int j = i;j < name.length();j++){
                for(int k = i;k <= j;k++){
                    System.out.print(name.charAt(k)+" ");
                }
                System.out.println();
            }
        }
    }

}
