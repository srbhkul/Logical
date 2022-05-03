package collection;

import java.util.Date;

public class datecl {

	public static void main(String[] args) {
	Date d=new Date();
    System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
    
   System.out.println (d.getDate()+":"+(d.getMonth()+1)+":"+(d.getYear()+1900));
	}

}
