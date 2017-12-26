import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Clean {
	
	private static Path desktop=Paths.get("C:","Users","mei","Desktop");
	
	
	public static void main(String a []){
		
		try {
			DirectoryStream<Path> dirStream=Files.newDirectoryStream(desktop);
			for(Path file:dirStream){
					System.out.println(file.getFileName());				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
