
public class BufferAndBuilder {

	public static void main(String[] args) {
		String s = "JAVA";
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			s = s + "j2EE";
		long endTime = System.currentTimeMillis();
		System.out.println("timetaken by stringclass " + (endTime - startTime));
		StringBuffer sb = new StringBuffer("JAVA");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			sb.append("j2EE");
		endTime = System.currentTimeMillis();
		System.out.println("timetaken by string bufferclass " + (endTime - startTime));
		StringBuilder sl = new StringBuilder("JAVA");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			sb.append("j2EE");
		endTime = System.currentTimeMillis();
	}

}
