package tw.org.iii.classroom;
import java.io.File;
public class hello46 {

	public static void main(String[] args) {
		// 多根系統
		File[] roots = File.listRoots();
		for (File root:roots){
			System.out.println(root.getAbsolutePath());
		}

	}

}
