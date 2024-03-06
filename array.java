class student{
    int rollnum;
    String name;
    int marks;
}


public class array {
    public static void main(String[] args) {
        // int num[] = {20, 30, 93, 75};                                //1d array
        // // System.out.println(num[0]);
        // for (int i = 0; i < num.length; i++) {
        //     System.out.println(num[i]);
        // }

        int num[][] = {{10, 30, 103}, {39, 9, 34}, {29, 48, 0}};                             //2d array
        
        // for(int i = 0;i<4;i++){
        //     for(int j=0;j<3;j++){
        //         num[i][j] = (int) Math.random() * 100 ;
        //     }
        // }



        // for(int i = 0;i<3;i++){                        //classical for-loop
        //     for(int j=0;j<3;j++){
        //         System.out.print(num[i][j] + " ");
        //     }
        //    System.out.println();
        // }

        // for(int n[] : num){                             //advanced for-loop
        //     for(int m :n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }
        
        student students = new student();

        student s1 = new student();
        s1.name = "tharun";
        s1.rollnum = 58;
        s1.marks = 99;

        student s2 = new student();
        s2.name = "harish";
        s2.rollnum = 99;
        s2.marks = 35;

        student stu[] = new student[2];
        stu[0] = s1;
        stu[1] = s2;

        for(int i=0;i<stu.length;i++){
            System.out.println(stu[i].marks + " : " + stu[i].name);
        }


    }
}
