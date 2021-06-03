public class Dress {

/*	
	@ 메소드명 		: Id, Name, Size, Color, Type getter,setter 선언
	@ brief 	: 상의, 하의 상품을 저장할 변수 
   	@ details	: 변수를 String으로 선언 후 getter,setter를 설정 후 저장한 값 리턴
   	@ 작성자		: 신희빈
   	@ 작성일자		: 2021-06-03
   	@ return 	(id   : 상품의 고유번호
   			  	name : 상품의 이름
   			  	size : 상품의 크기
   			  	color: 상품의 색깔
   			  	type : 상품의 종류(반팔/긴팔))
*/
	String id;
	String name;
	String size;
	String color;
	String type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
