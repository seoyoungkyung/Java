package 확인문제7_인터페이스;

public class MysqlDao implements DataAccessObiect {

	@Override
	public void select() {
		System.out.println("Mysql DB에서 검색"); 
	}

	@Override
	public void insert() {
		System.out.println("Mysql DB에서 삽입");
	}

	@Override
	public void update() {
		System.out.println("Mysql DB에서 수정");
	}

	@Override
	public void delete() {
		System.out.println("Mysql DB에서 삭제");
	}

}
