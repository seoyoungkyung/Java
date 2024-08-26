package ex01;

public class SamsungTV {
	//power(전원)-> on , off ->boolean
	//sound(소리) -> up , down ->int
	
	private int sound = 0;
	private boolean isActive = false;
	
	
		public void SamsungTV() {}
		
		public SamsungTV(int _sound , boolean _isActive)
	   {
	      sound = _sound;
	      isActive = _isActive;
	   }
	   
	   public void IsActive(boolean _active)
	   {
	      isActive = _active;
	   }
	   
	   public void ChangeSound(int _sound)
	   {
	      if(isActive)
	      {
	         sound += _sound;
	      }
	      else 
	      {
	         System.out.println("전원이 꺼져있습니다.");
	      }
	      
	   }
	   
	   
	   
	}
