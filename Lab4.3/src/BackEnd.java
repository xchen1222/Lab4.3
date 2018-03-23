import java.io.BufferedReader;
import java.io.IOException; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List; 


public class BackEnd {
	
	public static List<String> readScores(String fileName) {
		List<String> scores = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		
	       try (BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII)) {
	    	   String line = br.readLine();
	    	   while (line != null) {
	    		   String[] attributes = line.split(",");
	    		   String score = createScore(attributes);
	    		   scores.add(score);
	    	   }
	       } 
	       catch (IOException ioe) {
	    	   ioe.printStackTrace(); 
	       } 
	       
	       return scores;


	}
	
	private static String createScore(String[] metadata) {
		String name = metadata[0];
		String score = metadata[1];
		
		return name+score;
	}
	
}
