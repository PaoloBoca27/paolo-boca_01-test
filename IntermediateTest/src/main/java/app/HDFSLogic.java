package app;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HDFSLogic {

	public static void write(String filePath,String content) {
		Path path=new Path(filePath);
		FileSystem fs = null;

		try {
			fs = FileSystem.get(new Configuration());
			FSDataOutputStream outputStream = null;
			if(fs.exists(path))
			{
				outputStream = fs.append(path);
			}
			else {
				outputStream = fs.create(path);
			}
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream)); // ho bisogno di un buffered writer
			writer.append(content+"\n"); 
			writer.flush(); 
			writer.close(); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


















}
