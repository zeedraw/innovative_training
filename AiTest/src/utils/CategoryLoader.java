package utils;

import java.io.File;
import java.net.URLDecoder;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import Test.Brain;
import data.Play;

public class CategoryLoader {
	
	private static CategoryLoader loader;
	
	  public static CategoryLoader getInstance() {
		    if (loader == null) {
		      synchronized (CategoryLoader.class) {
		        if (loader == null) {
		          loader = new CategoryLoader();
		        }
		      }
		    }
		    return loader;
    }
	@Test
	public void load()
	{
		String path=URLDecoder.decode(ClassLoader.getSystemResource
		          ("resource").getPath());
		File[] files = new File(path).listFiles();
		SAXReader reader = new SAXReader();
		if(files!=null)
		{
			for(File file:files)
			{
				Document document;
				try {
					document = reader.read(file);
					 Element root = document.getRootElement();
			         List<Element> childElements = root.elements();
			         for (Element element : childElements) {
			        	String name = element.getName().toLowerCase();
			        	 if(name.equals("play"))
			        	 {
			        		 Play play=new Play(element);
			        		 Brain brain=Brain.getInstance();
			        				 brain.addPalys(play);
			        		 
			        	 }
			         }
			         
				} catch (DocumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
	
		
	}
	  
	

}
