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
  
  public static void main(String[] args) throws IOException, ParseException  {

	JSONArray jsonArray = new JSONArray();
	  
    boolean swi = true; 
		while(swi){
	    System.out.println("-------------------------------------");
		System.out.println("1.상의학목 추가");
		System.out.println("2.바지항목 추가");
		System.out.println("");
		System.out.println("");
		System.out.println("5. json으로 내보내기");
		System.out.println("6. json파일 불러오기");
	    System.out.println("");
			
      
		Scanner scan = new Scanner(System.in); 
		Scanner scanf = new Scanner(System.in); 
		
		System.out.print("> ");
		int choice = scan.nextInt();
		
		
    	
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
					
					break;

				case 4:
					
					break;
          
				case 5:
					
					// @author 신희빈
					// @date 2021-06-03
					
					JSONObject jObj = new JSONObject();			// json오브젝트 저장하기위해 선언
					jObj.put("Dress", jsonArray);				// 출력 할때 앞에 "Dress"가 붙도록
					FileWriter writer = new FileWriter("src/json/mydata.json");	// json파일 저장할 위치
			  		writer.write(jObj.toJSONString());	//String 형태로 저장
			  		writer.flush();
			  		writer.close();
					
					break;

				case 6: 
					JSONParser parser = new JSONParser();		// json파일 파싱하기위해 선언
					Object obj = parser.parse(new FileReader("src/json/mydata.json"));	// 불러올 json 파일 위치선언
					System.out.println(obj);	// json 파일 호출
					break;

				case 7 :
					swi = false;
					break;
				default :
					System.out.println("잘못 입력하셨습니다.");
					break;
			}
    }
  }
}