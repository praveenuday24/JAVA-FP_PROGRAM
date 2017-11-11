import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1st Array Size:");
		int n1 = Integer.valueOf(bf.readLine());
		int m[] = new int[n1];
		System.out.println("Array Elements:");
		for(int i=0;i<n1;i++){
			m[i] = Integer.valueOf(bf.readLine());
		}
		System.out.println("2nd Array Size:");
		int n2 = Integer.valueOf(bf.readLine());
		int n[] = new int[n2];
		System.out.println("Array Elements:");
		for(int i=0;i<n2;i++){
			n[i] = Integer.valueOf(bf.readLine());
		}
		int i = 0, j = 0, k = 0;
		
		int merg[] = new int[n1 + n2];
		
		while (i < n1 && j < n2) {
			if (m[i] < n[j])
				merg[k++] = m[i++];
			else
				merg[k++] = n[j++];
		}
		while (i < n1)
			merg[k++] = m[i++];
		while (j < n2)
			merg[k++] = n[j++];
		
		for(i=0;i<k;i++)
			System.out.println(merg[i]);

		Arrays.sort(merg);
		
		double median = 0;
		if (merg.length % 2 == 0)
			median = (double) (merg[merg.length / 2] + merg[merg.length / 2 - 1]) / 2;
		else
			median = (double) merg[merg.length / 2];
		System.out.println("MEdian:");
		System.out.println(median);

	}
}
