package jframe.practice;
import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;

public class JframePractice {

    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("dd");
        int idate = parseInt(sd.format(d));
        SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM");
        int brd=idate+10;
        System.out.println(ss.format(d)+"-"+brd);
        
    }
    

}

