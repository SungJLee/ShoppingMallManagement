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

  
  
  public static JSONObject AddTop(){

		Scanner scanf = new Scanner(System.in);
		String tempId = scanf.nextLine();
		String tempName = scanf.nextLine();
		String tempSize = scanf.nextLine();
		String tempColor = scanf.nextLine();
		String tempType = scanf.nextLine();
		
		Top tops = new Top(tempId,tempName, tempSize,tempColor,tempType);
		

		JSONObject obj1 = new JSONObject();
	  	obj1.put("id",tempId);
	  	obj1.put("name",tempName);
	  	obj1.put("size",tempSize);
	  	obj1.put("color",tempColor);
	  	obj1.put("type",tempType);
	  	
	  	return obj1;
	  	
	  }
	  
  public static JSONObject AddPants(){
		  
		  	Scanner scanf = new Scanner(System.in);
			String tempId = scanf.nextLine();
			String tempName = scanf.nextLine();
			String tempSize = scanf.nextLine();
			String tempColor = scanf.nextLine();
			String tempType = scanf.nextLine();
			
			Pants pants= new Pants(tempId,tempName, tempSize,tempColor,tempType);
			

			JSONObject obj1 = new JSONObject();
		  	obj1.put("id",tempId);
		  	obj1.put("name",tempName);
		  	obj1.put("size",tempSize);
		  	obj1.put("color",tempColor);
		  	obj1.put("type",tempType);
		  
		  	return obj1;
		
	  }
  
  public static void ShowProducts(JSONArray jsonArray) {
	  Scanner scanf = new Scanner(System.in);
	  String checkName = scanf.nextLine();
	  Iterator it2 = jsonArray.iterator();
		while(it2.hasNext()) {
  		
  		JSONObject o = (JSONObject)it2.next();
  		if(o.get("name").equals(checkName)) {
  			String jsonId = o.get("id").toString();
      		String jsonName = o.get("name").toString();
      		String jsonSize = o.get("size").toString();
      		String jsonColor = o.get("color").toString();
      		String jsonType = o.get("type").toString();
      		System.out.println("상품id : " + jsonId + "상품명 : " + jsonName + " 사이즈 : " + jsonSize + " 색 : " + jsonColor + " 종류 : " + jsonType);
      		break;
  		}	   
	}
		
  }
  
  public static void DeleteProducts(JSONArray jsonArray) {
	  int count = 0;
	  
	  Scanner scanf = new Scanner(System.in);
	  String checkName = scanf.nextLine();
	  Iterator it2 = jsonArray.iterator();
	  
		while(it2.hasNext()) {
  		
  		JSONObject o = (JSONObject)it2.next();
  		if(o.get("name").equals(checkName)) {
  			
  			jsonArray.remove(count);
  			break;
  		}
  		count++;
	}
		
  }
  
  
  
  public static void main(String[] args)  {

	JSONArray jsonArray = new JSONArray();
	  
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

		System.out.println("");

    	
        switch(choice){
                case 1:
                	System.out.println("상의항목을 추가합니다.");
                	System.out.println("Id , 이름 ,  사이즈 , 색깔, 반팔 / 긴팔");
                	jsonArray.add(AddTop());
                	break;
          
		        case 2:
		        	System.out.println("바지항목을 추가합니다.");
		        	System.out.println("Id는 10이상으로 주세요");
                	System.out.println("Id , 이름 ,  사이즈 , 색깔, 반바지 / 긴바지");
                	jsonArray.add(AddPants());
		        	break;
          
				case 3: 
					System.out.println("상품을 조회합니다.");
					System.out.println("상품명을 입력해주세요");
					ShowProducts(jsonArray);

				case 4:
					System.out.println("상품을 제거합니다.");
					System.out.println("제거할 상품명을 입력해주세요");
					DeleteProducts(jsonArray);
					break;
          
				case 5:
					
					break;

				case 6: 
					
					break;

				case 7 :
					swi = false;
					break;
				default :
					System.out.println("占쎌삋筌륁궡�뿯占쎌젾占쎈릭占쎈�뀐옙�뮸占쎈빍占쎈뼄.");
					break;
			}
    }
  }
}