import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class main {
	
  public void AddTop{
	
	Top tops = = new Top();
	
	JSONObject obj1 = new JSONObject();
  	obj1.put("houseNumber",temp_houseNumber);
  	obj1.put("houseName",temp_houseName);
  	obj1.put("phoneNumber",temp_phoneNumber);
  	obj1.put("houseType",temp_houseType);
  	jsonArray.add(obj1);
  	
  }
  
  public void AddPants{
	  
	Pants pants = = new Pants();
		
	JSONObject obj1 = new JSONObject();
	obj1.put("houseNumber",temp_houseNumber);
	obj1.put("houseName",temp_houseName);
	obj1.put("phoneNumber",temp_phoneNumber);
	obj1.put("houseType",temp_houseType);
	jsonArray.add(obj1);  
	
  }

  public static void main(String[] args)  {


    boolean swi = true; 
		while(swi){
	    System.out.println("-------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	    System.out.println("");
			
      
		Scanner scan = new Scanner(System.in); 
		Scanner scanf = new Scanner(System.in); 
		
		System.out.print("> ");
		int choice = scan.nextInt();
		
		
    	
        switch(choice){
                case 1:
                	System.out.println("상의를 추가합니다.");
                	System.out.println("Id , 이름 , 사이즈, 색깔, 긴팔 / 반팔");
                	AddDress();
                	break;
          
		        case 2:
		        	System.out.println("하의를 추가합니다.");
                	System.out.println("Id , 이름 , 사이즈, 색깔, 긴바지 / 반바지");
                	AddDress();
		        	break;
          
				case 3: 
					
					break;

				case 4:
					
					break;
          
				case 5:
					
					break;

				case 6: 
					
					break;

				case 7 :
					swi = false;
					break;
				default :
					System.out.println("�옒紐살엯�젰�븯�뀲�뒿�땲�떎.");
					break;
			}
    }
  }
}