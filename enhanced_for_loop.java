
class student{
    String name;
    int marks;
    int rollnum;
}
public class enhanced_for_loop {

    public static void main(String[] args) {
        student st = new student();
        student st1 = new student();
        st.name = "tharun";
        st.marks = 100;
        st.rollnum = 21;
        st1.name = "harish";
        st1.marks = 34;
        st1.rollnum = 99;
        student nums[] = new student[2];
        nums[0] = st;
        nums[1] = st1;
        for(student n : nums){
            System.out.println(n.name + " " + n.marks + " " + n.rollnum);
        }
    }
}