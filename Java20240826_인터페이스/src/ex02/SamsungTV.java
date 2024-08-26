package ex02;

public class SamsungTV implements TV{
	
	private int sound = 0;
	private boolean isPower = false;
	   
	   @Override
	   public void powerOn()
	   {
	      isPower= true;
	      System.out.println("전원이 켜졌습니다.");
	   }

	   @Override
	   public void powerOff()
	   {
	      isPower= false;
	      System.out.println("전원이 꺼졌습니다.");
	    }

	   @Override
	   public void soundUp()
	   {
	      sound++;
	   }

	   @Override
	   public void soundDown()
	   {      
	      sound--;
	      if(sound <= 0)
	      {
	         sound = 0;
	      }
	   }
	   
	   public int getSound()
	   {
	      return sound;
	   }
	   
	   public boolean getPower() {
	      return isPower;
	   }
}
