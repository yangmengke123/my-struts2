package i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class Internation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Locale loc=Locale.getDefault();
		//System.out.println(loc);
		info();
	}
	
	public static void info(){
		ResourceBundle bundle=ResourceBundle.getBundle("i18n.msg");
		String stu=bundle.getString("stu");
		System.out.println(stu);
	}
	
}
