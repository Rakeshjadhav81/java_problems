package Simple_Code;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileReaderName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename="D:\\CCPP\\fileReader\\read.txt";
		
//		FileReader reder=new FileReader(filename);
//	    FileReader re=new FileReader(filename);
//	    BufferedReader br=new BufferedReader(new FileReader());
	
		Map<String,Integer> map=new HashMap<>();
		
		try(BufferedReader br=new BufferedReader(new FileReader(filename))) {
			String line;
			while((line=br.readLine())!=null) {
				String[] str=line.split("\\s+");
				
				for(String word:str) {
					if(!word.isEmpty()) {
						int count=map.getOrDefault(word, 0);
						map.put(word,count+1);
					}
				}
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		for(Map.Entry<String, Integer> ent:map.entrySet()) {
			System.out.println(ent.getKey()+"  "+ent.getValue());
		}
	}

}
