package org.medex.beans;
import com.google.gson.Gson;

public class AA {

	public static void main(String[] args) {
		
		Gson gson = new Gson(); 
		String j = "{'id':'1','pwd':'aa','role':'erw','name':'dskf'}"; 
		User u=gson.fromJson(j, User.class); 
		System.out.println("from"+j);
	}

}
