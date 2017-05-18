package data;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Element;

public class Play {
	private List<String> infos;//0 answer,1 time,2 location,3 others
	
	public  Play(Element e)
	{
		infos=new ArrayList<>();
		List<Element> list = e.elements();
		for(Element ele:list)
		{
			infos.add(ele.getStringValue());
		}
		
	}
	
	public List<String> getInfos()
	{
		return infos;
	}
	
	
	
	
	

}
