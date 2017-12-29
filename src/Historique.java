import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Historique {

	private Path sourcePath;

	{
		sourcePath = Paths.get("D:", "Historique", "log.txt");

	}

	public void log(String h) {

		File file = sourcePath.toFile();
		try (FileWriter fw = new FileWriter(file,true);BufferedWriter br=new BufferedWriter(fw);){
			
			br.newLine();
			br.append(h);
			br.flush();
		} catch (Exception ex) {
			
		}

	}
}
