package book;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IO2 {

	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;

		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream()	;
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		
		try {
			while(input.available()>0) {
				input.read(temp);
				output.write(temp);
				System.out.println("------------------------");
				System.out.println("temp : " + Arrays.toString(temp));
				System.out.println("----printArrays 메서드에서 나온 출력");
				outSrc = output.toByteArray();
				printArrays(temp, outSrc);
			}
		} catch (Exception e) {
		}
	}	//	main 끝

	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}
}
