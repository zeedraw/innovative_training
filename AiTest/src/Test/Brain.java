package Test;

import java.util.ArrayList;
import java.util.List;

import data.Play;
import data.PlayTree;

public class Brain {
	
	private static Brain brain;
	
	private PlayTree playTree;
	
	private List<Play> plays;
	

	public Brain() {
	// TODO Auto-generated constructor stub
		plays=new ArrayList<Play>();
		playTree=new PlayTree();
	}
	
	
	public static Brain getInstance()
	{
		if(brain==null)
		{
			synchronized (Brain.class) {
				brain=new Brain();
				
			}
		}
		return brain;
	}
	
	public void addPalys(Play play)
	{
		plays.add(play);
	}
	
	public void build()
	{
		playTree.creatTree(plays);
	}
	
	public void showMind()
	{
		playTree.showTree();
	}
	
	public String think(List<String> infos)
	{
		return playTree.getAnswer(infos);
	}
	

}
