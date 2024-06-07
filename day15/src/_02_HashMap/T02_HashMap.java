package _02_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T02_HashMap {

	public static void main(String[] args) {
		//사용자의 id(키)와 pw(값)을 hashMap에 저장 (데이터 3개)
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("myId", "1234");
		map.put("idkim", "162");
		map.put("imji", "152");
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id 입력 : ");
			String id = sc.next();
			
			
			if(map.containsKey(id)) {
				System.out.println("pw 입력 : ");
				String pw = sc.next();
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 되었습니다");	
					break;
				}else {
					System.out.println("pw가 틀렸습니다. 다시 입력하세요");
				}
				
			}else
				System.out.println("id가 틀렸습니다. 다시 입력하세요");
		}
		
			
		
		
		
		
		
		
		
		//사용자로부터 id와 pw를 받아서
		//1.id가 없으면 : 입력한 id는 없습니다
		//2.pw가 틀리면 : pw가 맞지 않습니다
		//3.id와 pw가 맞으면 종료
		
		
		


	

    }
}
