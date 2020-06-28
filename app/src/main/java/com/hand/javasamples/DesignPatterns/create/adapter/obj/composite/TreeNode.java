package com.hand.javasamples.DesignPatterns.create.adapter.obj.composite;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	
	private String name;
	
	private TreeNode parent;
	
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public TreeNode getParent() {
		return parent;
	}

	private List<TreeNode> children = new ArrayList<>();
	
	public TreeNode(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void add(TreeNode e){
		children.add(e);
	}
	
	public boolean remove(TreeNode e){
		return children.remove(e);
	}

	public List<TreeNode> getChildren() {
		return children;
	}

}
