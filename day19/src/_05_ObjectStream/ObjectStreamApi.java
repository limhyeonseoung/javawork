package _05_ObjectStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamApi {
	/*
	 ObjectOutputStream 보조 스트림 사용
	-  출력 메서드 : writeObject(객체);
    - 입력 메서드 : readObject()
    */
	
	//객체를파일로 출력
	void fileSave() {
		Phone p1 = new Phone("Galaxy", 2000000);
		Phone p2 = new Phone("iPhone", 1800000);
		Phone p3 = new Phone("Shaomi", 900000);
		
		// 기반스트림 : FileOutputStream (1byte단위로 출력할 수 있는 스트림)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file_object.txt"))){
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

}
