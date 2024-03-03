class computer{
    public void play_music(){
        System.out.println("playing music....");
    }

    public String get_pen(int cost){
        if(cost>=10)
            return "pen 2";
        else
            return "give some more cost";
    }
}



public class methods {
    public static void main(String[] args) {
        computer com = new computer();
        String music = com.get_pen(0);
        com.play_music();
        System.out.println(music);
    }
}
