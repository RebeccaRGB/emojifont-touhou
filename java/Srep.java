import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Srep {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream data = new ByteArrayOutputStream();
		byte[] buf = new byte[65536]; int len;
		while ((len = System.in.read(buf)) >= 0) data.write(buf, 0, len);
		String text = new String(data.toByteArray(), "UTF-8");
		for (String arg : args) {
			Scanner scan = new Scanner(new File(arg), "UTF-8");
			while (scan.hasNextLine()) {
				String[] line = scan.nextLine().split("\t", 2);
				if (line[0].length() > 0) {
					String rep = (line.length > 1) ? line[1] : "";
					text = text.replaceAll(line[0], rep);
				}
			}
			scan.close();
		}
		System.out.write(text.getBytes("UTF-8"));
	}
}
