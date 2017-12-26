import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class Clean {
	private static Path desktop = Paths.get("C:", "Users", "mei", "Desktop");
	private static List<String> target;
	static {
		target = new ArrayList<String>();
		target.add("EFFIA");
		target.add("AFKLM");
	}

	public static void main(String a[]) {
		System.out.println("Test");
		try {
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(desktop);
			for (Path f : dirStream) {
				Path file = desktop.resolve(f);
				if (!Files.isDirectory(file)) {
					for (String t : target) {
						if(file.toString().toUpperCase().contains(t.toUpperCase())){
							System.out.println(Paths.get("D:",t).resolve(f.getFileName()).toString());
							Files.move(file,Paths.get("D:",t).resolve(f.getFileName()),StandardCopyOption.REPLACE_EXISTING);
						}
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
