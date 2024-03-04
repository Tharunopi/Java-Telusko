class calac{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }
}


public class method_overloading {
    public static void main(String[] args) {
        calac cal = new calac();
        int result = cal.add(10, 40, 90);
        System.out.println(result);
    }
}
