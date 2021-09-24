package search;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;



public class Main
{
	static void modifyFile(String filePath, String oldString, String newString)
	{
		File fileToBeModified = new File(filePath);
		String oldContent = "";
		BufferedReader reader = null;
		FileWriter writer = null;
		try{
			reader = new BufferedReader(new FileReader(fileToBeModified));
			String line = reader.readLine();
			while(line !=null){
				oldContent = oldContent + line +System.lineSeparator();
				line = reader.readLine();
			}
			String newContent = oldContent.replaceAll(oldString, newString);
			writer = new FileWriter(fileToBeModified);
			writer.write(newContent);
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				reader.close();
				writer.close();
			}catch (IOException e){
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args){
		modifyFile("E:/Users/owner/workspace/eclipse work/search/input.txt","Consectetur adipiscing elit","########### ########## ####");
		System.out.println("done");
	    

}
}
