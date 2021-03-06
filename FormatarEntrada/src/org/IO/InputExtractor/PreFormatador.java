package org.IO.InputExtractor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class PreFormatador {
	
	public static void main(String[] args) {
		try{  

			BufferedReader br = new BufferedReader(new FileReader("CommentNovo.sql"));  
			File out = new File("Input.txt");
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(out), "UTF-8")); 

			StringBuffer buffer = new StringBuffer();
			
			while(br.ready()){  
				
				String linha = br.readLine(); 
//				String[] info = linha.split(",");
//				String[] useful = {info[0],info[2],info[3]};
//				for (int j = 0; j < useful.length; j++) {
//					if(j + 1 == useful.length){
//						buffer.append(useful[j]+"\n");
//					} else {
//						buffer.append(useful[j]+",");
//					}
//				}
				buffer.append(linha.replaceAll("'","")+"\n");
				
			}  
			
			bw.write(buffer.substring(0, buffer.length()-1));
			
			br.close(); 
			bw.close();
		}catch(IOException ioe){  
			ioe.printStackTrace();  
		}  
	}

}
