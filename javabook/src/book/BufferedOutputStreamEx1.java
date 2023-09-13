package book;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("res/0to9.txt");
																							//버퍼 크기를 5로 함
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			
			for(int i ='0'; i<='9';i++) {
				bos.write(i);		
			}
			fos.close();
		} catch (IOException e) {
				e.printStackTrace();		// 버퍼크기를 5로 하여 0 1 2 3 4만 작성됨
		}
	}

}
