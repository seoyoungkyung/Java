package ex04;

/*
 * 멤버이너클래스 생성
 */


class NetWork{
	public void message(String content) {
		SendMessage message = new SendMessage(content);
		System.out.println(message.getMsg());
	}
	class SendMessage{
		private String msg;
		public SendMessage(String msg) {
			this.msg = msg;
		}
		String getMsg() {return msg;}
	}

}

public class MumberInnerClass {

	public static void main(String[] args) {

		NetWork network = new NetWork();
		network.message("이 문장을 전송해 주세요!!");
		
		
	}

}
