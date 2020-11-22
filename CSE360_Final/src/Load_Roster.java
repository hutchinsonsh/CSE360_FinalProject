import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Load_Roster {
     
	static ArrayList Student = new ArrayList();
	
	public static void read(String csvFile) throws IOException {
		 Scanner input = new Scanner(new File(csvFile));

	        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
	        
	        String[] tempArr;
	        String tempStr;
	        

	        while (input.hasNextLine())
	        {
	        	ArrayList<String> row = new ArrayList<>();
	            tempStr = input.nextLine(); 
	            tempArr = tempStr.split(","); 
	            Collections.addAll(row, tempArr);
	            arrayList.add(row);
	        }

	        System.out.println(arrayList);
	}
	   
	public static void main(String[] args) throws IOException
	{
	      String csvFile = "C:\\Users\\omara\\Downloads\\test.csv";
	      Load_Roster.read(csvFile);
		
	}
}
