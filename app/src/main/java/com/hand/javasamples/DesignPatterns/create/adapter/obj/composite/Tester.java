 package com.hand.javasamples.DesignPatterns.create.adapter.obj.composite;


/**
 * 对象的适配-组合模式
 * 多个对象组合在一起，常用语表示属性结构
 * 
 * @author admin
 *
 */
public class Tester {
	public static void main(String[] args){
		TreeNode tree = new TreeNode("root");
		
		TreeNode nodeA = new TreeNode("A");  
        TreeNode nodeB = new TreeNode("B");  
        TreeNode nodeC = new TreeNode("C");
        
        tree.add(nodeA);
        tree.add(nodeB);
        nodeB.add(nodeC);
		
	}
}
