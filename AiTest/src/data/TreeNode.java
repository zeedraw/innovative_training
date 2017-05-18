package data;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
	private T t;
	private TreeNode<T> parent;
	private List<TreeNode<T>> nodeList;
	
	public TreeNode(T type)
	{
		t=type;
		parent=null;
		nodeList=new ArrayList<TreeNode<T>>();
	}
	
	public TreeNode<T> getParent()
	{
		return parent;
	}
	
	public List<TreeNode<T>> geTreeNodes() {
		return nodeList;
	}
	
	public T getT()
	{
		return t;
	}
	
	public TreeNode<T> addChild(T type) {
		TreeNode<T> node=new TreeNode<T>(type);
		nodeList.add(node);
		return node;
		
	}
	
	
	
	

}
