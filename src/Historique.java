import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Historique {

	private Path sourcePath;

	{
		sourcePath = Paths.get("D:", "Historique", "log.txt");

	}

	public void log(String h) {

		File file = sourcePath.toFile();
		try (FileWriter fw = new FileWriter(file,true);BufferedWriter br=new BufferedWriter(fw);){
			DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,Locale.FRANCE);
			br.newLine();
			br.append(df.format(new Date())+" "+h);
			br.flush();
		} catch (Exception ex) {
			
		}

	}
}
