package _05_interface;

public class MySql implements DataAccess {

	@Override
	public void select() {
		System.err.println("MySql을 검색합니다");
		
	}

	@Override
	public void insert() {
		System.err.println("MySql을 삽입합니다");
		
	}

	@Override
	public void update() {
		System.err.println("MySql을 수정합니다");
		
	}

	@Override
	public void delete() {
		System.err.println("MySql을 삭제합니다");
		
	}

}
