//@creatorvision
import java.util.*;
import java.io.*;

class dyn_disp{

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		String str =sc.nextLine();
		System.out.println();
		display(str);

	}

	public static void display(String s){	

			for (int i=0;i<s.length();i++ ) 
			{
				System.out.print(s.substring(i));
				System.out.println(s.substring(0,i));
					
				/*try {
				Runtime.getRuntime().exec("clear");
				} catch(IOException ioe){
					ioe.printStackTrace();
				}*/
				try {
					Thread.sleep(1500);
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}

				if(i<s.length()-1){
				final String ANSI_CLS = "\u001b[2J";
		        final String ANSI_HOME = "\u001b[H";
		        System.out.print(ANSI_CLS + ANSI_HOME);
		        System.out.flush();
		    	}
			}
	}
}