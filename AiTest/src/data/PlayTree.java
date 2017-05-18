package data;

import java.util.ArrayList;
import java.util.List;


public class PlayTree extends Tree<CategoryInfo> {
	
	public PlayTree()
	{
		super();
		root=new TreeNode<CategoryInfo>(null);

	}
	
	public void creatTree(List<Play> plays) {
			TreeNode<CategoryInfo> tNode=null,t=null;
			for(Play p:plays)
			{
				List<String> infos=p.getInfos();
				tNode=root;
				for(int i=1;i<infos.size();i++)
				{
					t=search(infos.get(i),tNode);
					if(t==null)
					{
						tNode=tNode.addChild(new CategoryInfo(1,infos.get(i)));
					}
					else {
						tNode=t;
					}
				}
				tNode.addChild(new CategoryInfo(0, infos.get(0)));//添加答案
			}
		
		
	}
	
	public TreeNode<CategoryInfo> search(String info,TreeNode<CategoryInfo> input)
	{
		TreeNode<CategoryInfo> tNode=null;
		for(TreeNode<CategoryInfo> node:input.geTreeNodes())
		{
			if(node.getT().getId()==1&&node.getT().getInfo().equals(info))
			{
				tNode=node;
				break;
			}
		}
		return tNode;
	}
	
	public void showTree()
	{
		show(root);
	}
	
	private void show(TreeNode<CategoryInfo> input)
	{
		if(input.geTreeNodes().size()==0)
		{
			System.out.println();
		}
		for(TreeNode<CategoryInfo> node:input.geTreeNodes())
		{
			System.out.print(node.getT().getInfo()+" ");
			show(node);
		}
	}
	
	public String getAnswer(List<String> infos)
	{
		TreeNode<CategoryInfo> tNode=root,t=null;
		for(String info:infos)
		{
			t=search(info,tNode);
			if(t==null)
			{
				return new String("抱歉，我不知道");
			}
			else {
				tNode=t;
			}
		}
		return tNode.geTreeNodes().get(0).getT().getInfo();
	}

}
