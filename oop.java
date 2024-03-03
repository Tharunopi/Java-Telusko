
class calc{
    int i = 1;
    public int add(int a){
        if(a<=10){
            for(;i<=10;i++){
                System.out.println("good morning "+i);
            }
        }
        return 0;
    }
}






public class oop {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        // int result = a + b;
        calc var = new calc();
        
        var.add(a);
    }
}
