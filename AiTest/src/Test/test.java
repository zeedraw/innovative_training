package Test;

import java.util.ArrayList;
import java.util.List;

import utils.CategoryLoader;

public class test {
	public static void main(String[] args) {
	
		CategoryLoader loader=CategoryLoader.getInstance();
		loader.load();
		Brain.getInstance().build();
	//	 Brain.getInstance().showMind();
		 List<String> question=new ArrayList<>();
		 question.add("������");
		 question.add("����");
		 question.add("");
		 
		 String answer=Brain.getInstance().think(question);
		 System.out.println(answer);
		
		
		
	}

}
