
/*	
	@ 클래스명 	: Pants
	@ brief 	: 옷 기능을 상속받은 클래스 
   	@ details	: 상의에 관한 내용들이 들어있다.
   	@ 작성자		: 신희빈
   	@ 작성일자		: 2021-06-03
*/

public class Pants extends Dress {
	
       /*
	   * @ 메소드명 : Pants()
	   * @ breif  : 상품에 상세 내용을 추가하는 메소드
	   * @ detail : 상품에 id값과 상품이름과 상품사이즈(S,M,L)과 색(빨간색,파란색...), type(반바지,긴바지)를 매개변수로 받아 저장합니다.
	   * @ 작성자   : 이성재
	   * @ 작성일자 : 2021 - 06 -03
	   * @ param  : 하의 상품에 관련된 id값 이름 크기 색 종류(반바지/긴바지)(String id,String name, String size,String color,String type)
	   * @ why    : 하의 상품에 대한 정보를 객체에 담기 위해서 생성자를 사용했습니다.
	   */
	
	public Pants(String tempId, String tempName, String tempSize, String tempColor, String tempType) {
		this.id = id;
		this.name = name;
		this.size = size;
		this.color = color;
		this.type = type;
	}

	
}
