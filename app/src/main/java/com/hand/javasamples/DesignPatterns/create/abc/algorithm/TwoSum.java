package com.hand.javasamples.DesignPatterns.create.abc.algorithm;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Map;

public class TwoSum {
	
	public static void main(String []args){
		TwoSum ts = new TwoSum();
		
//		ListNode l1= ts.new ListNode(9);
////		ListNode l2= ts.new ListNode(4);
////		ListNode l3= ts.new ListNode(3);
////		l1.next = l2;
////		l2.next = l3;
//		
//		ListNode n1= ts.new ListNode(1);
//		ListNode n2= ts.new ListNode(9);
//		ListNode n3= ts.new ListNode(9);
//		ListNode n4= ts.new ListNode(9);
//		ListNode n5= ts.new ListNode(9);
//		ListNode n6= ts.new ListNode(9);
//		ListNode n7= ts.new ListNode(9);
//		ListNode n8= ts.new ListNode(9);
//		ListNode n9= ts.new ListNode(9);
//		ListNode n10= ts.new ListNode(9);
//
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = n5;
//		n5.next = n6;
//		n6.next = n7;
//		n7.next = n8;
//		n8.next = n9;
//		n9.next = n10;
		
//		ListNode l1= ts.new ListNode(2);
//		ListNode l2= ts.new ListNode(4);
//		ListNode l3= ts.new ListNode(3);
//		l1.next = l2;
//		l2.next = l3;
//		
//		ListNode n1= ts.new ListNode(5);
//		ListNode n2= ts.new ListNode(6);
//		ListNode n3= ts.new ListNode(4);
//
//		n1.next = n2;
//		n2.next = n3;
		
		ListNode n1= ts.new ListNode(1);
		ListNode n2= ts.new ListNode(1);
		ListNode n3= ts.new ListNode(1);
		ListNode n4= ts.new ListNode(1);
		ListNode n5= ts.new ListNode(1);
		ListNode n6= ts.new ListNode(1);
		ListNode n7= ts.new ListNode(1);
		ListNode n8= ts.new ListNode(1);
		ListNode n9= ts.new ListNode(1);
		ListNode n10= ts.new ListNode(1);
		ListNode n11= ts.new ListNode(1);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
		n10.next = n11;
		
		ListNode l1= ts.new ListNode(1);
		ListNode l2= ts.new ListNode(1);
		ListNode l3= ts.new ListNode(1);
		ListNode l4= ts.new ListNode(1);
		ListNode l5= ts.new ListNode(1);
		ListNode l6= ts.new ListNode(1);
		ListNode l7= ts.new ListNode(1);
		ListNode l8= ts.new ListNode(1);
		ListNode l9= ts.new ListNode(1);
		ListNode l10= ts.new ListNode(1);
		ListNode l11= ts.new ListNode(1);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
		l8.next = l9;
		l9.next = l10;
		l10.next = l11;
		
		
		
		ListNode a = ts.addTwoNumbers(l1, n1);
		ListNode b = a;
		while(b.next != null){
			System.out.println("\n"+b.val);
			b = b.next;
		}
		
		System.out.println("\n"+b.val);
	}

	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        BigDecimal a = (ListNodeConvertToInteger(l1)+ListNodeConvertToInteger(l2));
		BigDecimal a = ListNodeConvertToInteger(l1).add(ListNodeConvertToInteger(l2));
        return getHead(a);
    }
    
    private BigDecimal ListNodeConvertToInteger(ListNode l){
        if(l == null){
            return new BigDecimal(0);
        }
        return getNumber(l);
    }
    
    private BigDecimal getNumber(ListNode l){
        if(l == null){
            return new BigDecimal(0);
        }
        BigDecimal a = getNumber(l.next);
        return a.multiply(new BigDecimal(10)).add(new BigDecimal(l.val));
        
    }
    
    private ListNode getHead(BigDecimal a){
        ListNode head = new ListNode( a.remainder(new BigDecimal(10)).intValue());
        ListNode middle = head;
        a = a.divide(new BigDecimal(10));
        
        while(a.compareTo(BigDecimal.TEN) >= 0){
            ListNode l = new ListNode(a.remainder(new BigDecimal(10)).intValue());
            middle.next = l;
            
            middle = l;
            
            a = a.divide(new BigDecimal(10));
        }
        ListNode last = new ListNode(a.intValue());
        middle.next = last;
        return head;
    }
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
