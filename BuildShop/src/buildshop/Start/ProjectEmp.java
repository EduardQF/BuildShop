 
package BuildShop.Start;

import java.util.Calendar;

public class ProjectEmp {
/*
 ahutor Carrion Cristobal, Darigo Giaccomo, Queupumil Eduardo.    
*/
    public static void main(String[] args) throws InterruptedException {
          // Launcher.main(null);
    	System.out.println((Calendar.getInstance().getTime().getYear()+1900)+"-"+
    			(Calendar.getInstance().getTime().getMonth()+1)+"-"+
    			Calendar.getInstance().getTime().getDate()+"-"+
    			Calendar.getInstance().getTime().getHours()+"-"+
    			Calendar.getInstance().getTime().getMinutes()+"-"+
    			Calendar.getInstance().getTime().getSeconds());
    }
    
}
