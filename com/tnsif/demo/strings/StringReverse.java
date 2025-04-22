public class StringReverse {
    public static void main(String[] args) {
        String name = "Rajini";
        // StringBuffer sb = new StringBuffer(name);
        // sb.reverse();
        // System.out.println(sb.toString());
        //using for loop
        String reverse = "";
        for(int i = name.length() - 1;i >= 0;i--){
            reverse += name.charAt(i);
        }
        System.out.println(reverse);
        
    }

}
