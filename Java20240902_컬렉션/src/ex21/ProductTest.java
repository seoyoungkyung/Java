package ex21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class ProductTest {
 
	
	static	Set<Product> productoin = new HashSet<>();
	
	public static void main(String[] args) {
		
		addProduct(new Product("p100","TV","20000"));
		addProduct(new Product("p200","Computer","10000"));
		addProduct(new Product("p100","MP3","700"));
		addProduct(new Product("p300","Audio","1000"));
			
		
			System.out.println("제품ID   제품명    가격");
			System.out.println("----------------------");
			for(Product p : productoin)
				System.out.println("  "+p.getProductID()+"  "+p.getProductName()+"  "+p.getProductPrice());
			
			
			
	}
	static void addProduct(Product p)
	{
		//검사
		
		if(productoin.contains(p)){
			System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다. -> "+p.getProductID());//production 여기다가 add;
		}else {
			productoin.add(p);
			System.out.println("성공적으로 저장되었습니다.");
		}
		//production id가 없으면 add 있으면 넘어가기.
	
		
		
	}
	
}
