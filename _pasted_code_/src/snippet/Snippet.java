package snippet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Snippet {
	try{  

		BufferedReader br = new BufferedReader(new FileReader("c:/arquivo.html"));  

		while(br.ready()){  
			String linha = br.readLine();  
			System.out.println(linha);  
		}  
		br.close();  
	}catch(IOException ioe){  
		ioe.printStackTrace();  
	}  
}

