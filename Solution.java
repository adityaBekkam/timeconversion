import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        char arr[] = time.toCharArray();
        String hh,mm,sec ;
        hh = time.substring( 0,2 ) ;
        mm = time.substring( 3,5 ) ;
        sec = time.substring( 6,8 ) ;
        if( time.charAt(8)=='P' && hh.compareTo("12")!=0 ){
          hh = Integer.toString( Integer.parseInt(hh)+12 ) ;
        }
        else if( time.charAt(8)!='P' && hh.compareTo("12")==0 ){
          hh = "00" ;
        }
        System.out.println( hh + ":" + mm + ":" + sec );
    }
}
