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

  public static void main(String[] args) throws IOException, ParseException {


    boolean swi = true; 
		while(swi){
    System.out.println("-------------------------------------");
	System.out.println("1. �Է��ϱ�");
	System.out.println("2. ��ü ��ȸ�ϱ�");
	System.out.println("3. ȣ���� ��ȸ�ϱ�");
	System.out.println("4. json���� ��������");
	System.out.println("5. json���� ��������");
	System.out.println("6. json���� �ҷ�����");
    System.out.println("7. ������");
			
      
		Scanner scan = new Scanner(System.in); 
		Scanner scanf = new Scanner(System.in); 
		
		System.out.print("> ");
		int choice = scan.nextInt();
		
        switch(choice){
                case 1:
                	
                	break;
          
		        case 2:
		        	
		        	break;
          
				case 3: 
					
					break;

				case 4:
					
					break;
          
				case 5:
					
					break;

				case 6: 
					
					break;

				case 7 : // ������
					swi = false;
					break;
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					break;
			}
    }
  }
}