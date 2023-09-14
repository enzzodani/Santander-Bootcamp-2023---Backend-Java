public class ter {
    public static void main(String[] args) {
        // operators java
            int a, b;

            a = 5;
            b = 6;

            String result = "";

            // EXAMPLE OF CONDITIONAL USING AN IF/ELSE STRUCTURE
            if(a==b)
               result = "true";
            else
               result = "false";

        System.out.println(result);


            //SAME CONDITIONAL, BUT THIS TIME, USING THE TERNARY CONDITIONAL OPERATOR
                    String result2 = (a==b) ? "true" : "false";

                    System.out.println(result2);

            a=6;
            String result3 = (a==b) ? "true" : "false";
        System.out.println(result3);
    }
}