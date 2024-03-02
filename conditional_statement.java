public class conditional_statement {
    public static void main(String[] args) {
        // boolean a = false;                                    //if-else statement
        // if (a){
        //     System.out.println("true");
        // }
        // else{
        //     System.out.println("false");
        // }

        // int a = 30;                                           //ternary operator
        // int b = 20;
        // int max = 0;
        // max = (a>b) ? a : b;
        // System.out.println(max);

        String a = "moday";
        switch (a) {
            case "monday":
                System.out.println("monday");                  //switch statement
                break;
            case "tuesday":
                System.out.println("tuesday");
                break;
            case "wednesday":
                System.out.println("wednesday");
                break;
            default:
                System.out.println("wrong");
        }
    }
}
