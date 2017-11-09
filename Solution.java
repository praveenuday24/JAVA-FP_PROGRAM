import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.valueOf(bf.readLine());
		float b = Float.valueOf(bf.readLine());
		double d= Double.valueOf(bf.readLine());
		byte by=Byte.valueOf(bf.readLine());
		System.out.println(r);
		System.out.println(b);
		System.out.println(d);
		System.out.println(by);
	}

}