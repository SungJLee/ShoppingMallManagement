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

  
  /*
   * @ 메소드명 : AddTop
   * @ breif  : 상의 상품을 추가시키는 기능
   * @ detail : 상의 상품항목을 jsonObject에 저장해서 return해준다
   * @ 작성자   : 이성재
   * @ 작성일자 :2021 - 06 -03
   * @ return : (JSONObject (상품id , name , size , color , type))
   * @ why    : Top클래스 생성자를 이용해서 JSONObject 객체에 저장해 리턴해서 그걸 JSONArray에 넣기 위해 이렇게 만들었습니다. 
   */
	
  public JSONObject AddTop(){

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
	  
  /*
   * @ 메소드명 : AddPants
   * @ breif  : 하의 상품을 추가시키는 기능
   * @ detail : 하의 상품항목을 jsonObject에 저장해서 return해준다
   * @ 작성자   : 이성재
   * @ 작성일자 : 2021 - 06 -03
   * @ return : (JSONObject (상품id , name , size , color , type))
   * @ why    : Pants클래스 생성자를 이용해서 JSONObject 객체에 저장해 리턴해서 그걸 JSONArray에 넣기 위해 이렇게 만들었습니다.
   */
  
  public JSONObject AddPants(){
		  
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
  
  /*
   * @ 메소드명 : ShowProducts
   * @ breif  : 상품을 조회하는 기능
   * @ detail : 상품명으로 검색해서 해당 상품명이 있으면 jsonArray를  그 상품에 id랑 상품명 사이즈 색 종류를 출력시켜준다
   * @ 작성자   : 이성재
   * @ 작성일자 : 2021 - 06 -03
   * @ param  : 상품목록이 들어가있는 jsonArray객체를 조회하기 위해 받아옴(JSONArray jsonArray)
   * @ why    : 상품명이 어디 인덱스에 있는지 잘 모르기 때문에 전체를 돌아서 해당 값을 찾아서 그 jsonObject에 해당 값들을 출력하기 위해 이렇게 만들었습니다.
   */
  
  public void ShowProducts(JSONArray jsonArray) {
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
      		System.out.println("상품id : " + jsonId + " 상품명 : " + jsonName + " 사이즈 : " + jsonSize + " 색 : " + jsonColor + " 종류 : " + jsonType);
      		break;
  		}	   
	}
		
  }
  
  /*
   * @ 메소드명 : DeleteProducts
   * @ breif  : 상품을 삭제하는 기능
   * @ detail : 상품명으로 검색해서 해당 상품명이 있으면 jsonArray를 그 상품을 삭제한다
   * @ 작성자   : 이성재
   * @ 작성일자 : 2021 - 06 -03
   * @ param  : 상품목록이 들어가있는 jsonArray객체를 조회하기 위해 받아옴(JSONArray jsonArray)
   * @ why    : 상품명이 어디 인덱스에 있는지 잘 모르기 때문에 전체를 돌아서 해당 값을 찾아서 그 jsonObject에 해당하는 걸 삭제하기 위해서 이렇게 만들었습니다.
   */
  
  public void DeleteProducts(JSONArray jsonArray) {
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
  
  /*
   * @ 메소드명 : SaveJson
   * @ breif  : Json파일을 저장하는 기능
   * @ detail : jsonObject에 저장된 내용을 선언한 위치에 Json파일로 내보냅니다.
   * @ 작성자   : 신희빈
   * @ 작성일자 : 2021 - 06 -03
   */
  
  public void SaveJson(JSONArray jsonArray) throws IOException {
	  JSONObject jObj = new JSONObject();			// json오브젝트 저장하기위해 선언
		jObj.put("Dress", jsonArray);				// 출력 할때 앞에 "Dress"가 붙도록
		FileWriter writer = new FileWriter("src/json/mydata.json");	// json파일 저장할 위치
		writer.write(jObj.toJSONString());	//String 형태로 저장
		writer.flush();
		writer.close();
  }
  
  /*
   * @ 메소드명 : GetJson
   * @ breif  : Json파일을 불러오는기능
   * @ detail : 선언한 위치에  Json파일로 불러옵니다.
   * @ 작성자   : 신희빈
   * @ 작성일자 : 2021 - 06 -03
   */
  
 public void GetJson(JSONArray jsonArray) throws IOException, ParseException {
	 JSONParser parser = new JSONParser();		// json파일 파싱하기위해 선언
		Object obj = parser.parse(new FileReader("src/json/mydata.json"));	// 불러올 json 파일 위치선언
		System.out.println(obj);	// json 파일 호출
 }
  
  public static void main(String[] args) throws IOException, ParseException {

	main Main = new main();
	JSONArray jsonArray = new JSONArray();
	  
    boolean swi = true; 
		while(swi){
	    System.out.println("-------------------------------------");
		System.out.println("1. 신상품추가(상의)");
		System.out.println("2. 신상품추가(하의)");
		System.out.println("3. 상품조회");
		System.out.println("4. 상품제거");
		System.out.println("5. json으로 내보내기");
		System.out.println("6. json으로 불러오기");
	    System.out.println("7. 나가기");
			
      
		Scanner scan = new Scanner(System.in); 
		Scanner scanf = new Scanner(System.in); 
		
		System.out.print("> ");
		int choice = scan.nextInt();

		System.out.println("");

    	
        switch(choice){
                case 1:
                	System.out.println("상의항목을 추가합니다.");
                	System.out.println("Id , 이름 ,  사이즈 , 색깔, 반팔 / 긴팔");           
                	jsonArray.add(Main.AddTop());
                	break;
          
		        case 2:
		        	System.out.println("바지항목을 추가합니다.");
		        	System.out.println("Id는 10이상으로 주세요");
                	System.out.println("Id , 이름 ,  사이즈 , 색깔, 반바지 / 긴바지");
                	jsonArray.add(Main.AddPants());
		        	break;
          
				case 3: 
					System.out.println("상품을 조회합니다.");
					System.out.println("상품명을 입력해주세요");
					Main.ShowProducts(jsonArray);
					Main.ShowProducts(jsonArray);
					break;

				case 4:
					System.out.println("상품을 제거합니다.");
					System.out.println("제거할 상품명을 입력해주세요");
					Main.DeleteProducts(jsonArray);
					break;
          
				case 5:
					
					System.out.println("파일을 내보냅니다.");
					Main.SaveJson(jsonArray);
					
					break;

				case 6: 
					System.out.println("파일을 불러옵니다.");
					Main.GetJson(jsonArray);
					
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