package TV문제;

public class SaleTV extends TV {

	int price;
	
	public SaleTV() {}
	public SaleTV(String model,int size,int channel,int price) {
		super(model,size,channel);
		this.price = price;
	}
	
	public void play() {
		System.out.println("판매 TV 채널"+channel+"번의 프로를 플레이 합니다.");
		
	}
	public void sale() {
		System.out.println(model+"모델의 상품을 판매합니다."+price+"원을 지불해 주세요.");
	}
	public String toString() {
		return ("판매상품정보 : 모델명("+model+"),가격("+price+"원),크기("+size+")" );
	}
}
