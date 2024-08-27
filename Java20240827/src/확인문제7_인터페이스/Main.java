package 확인문제7_인터페이스;

public class Main {

	public static void main(String[] args) {
		
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
	}
	
	
	public static void dbWork(DataAccessObiect dao) {
		
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
}
