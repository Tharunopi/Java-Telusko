public class looping_statement {
    public static void main(String[] args) {
        int n = 1;                                         //while loop 
        // while(n<=12){
        //     System.out.println("the month is " + n);
        //     int i  = 1;
        //     while (i<=7) {
        //     System.out.println("the days in month is "+ i);    //nested while loop
        //     i++;
        //     }
        //     n++;
        // }
        

        //  {                                    //do-while loop
        //     System.out.println("hi " + n);
        //     n++;
        // }while (n<=10);
        for(int i=1;i<=5;i++){                           //for loop
            System.out.println("Day " + i);
            for(int j=1;j<=9;j++){
                int k = (j+8);
                if(k>12){
                    k = k - 12;
                    System.out.println(k + " pm");
                }else{
                    System.out.println(k + " am");
                }
            }
        }                                           
    }
}
