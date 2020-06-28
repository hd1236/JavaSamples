package com.hand.javasamples.Algorithms.CodingInterviews;

import java.util.Arrays;
import java.util.LinkedList;

public class SwordToOffer {


    public static void main(String[] args){
        int[] a = new int[]{
                1,2,3,4,4,4,4,4,5
        };
        System.out.println(GetNumberOfK(a,5));

}

    public static int GetNumberOfK(int [] array , int k) {
        if(array.length == 0){
            return 0;
        }
        int start = 0;
        int end = array.length-1;
        while(array[start] != k && start < end){
            int mid = (start+end)/2;
            if(array[mid] == k){
                start = mid;
            }else if(array[mid] < k){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        int number = 0;
        if(array[start] == k){
            for(int i = start; i < array.length;i++){
                if(array[i] == k){
                    number++;
                }else{
                    break;
                }
            }
            for(int i = start - 1; i > 0;i--){
                if(array[i] == k){
                    number++;
                }else{
                    break;
                }
            }
        }
        return number;
    }

    public static int InversePairs(int [] array) {
        int total = 0;
        for(int i = 0; i< array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    total++;
                }
            }
        }
        return total;
    }

   public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode t = new TreeNode(0);
        constructTree(t,pre,in,1);
        return t.left;
    }

    private static void constructTree(TreeNode father,int[] pre,int[] in,int left){
        if(pre == null || pre.length == 0){
            return ;
        }
        TreeNode t = new TreeNode(pre[0]);
        if(left == 1){
            father.left = t;
        }else{
            father.right = t;
        }
        //分割中序
        int inIndex=0;
        for(int i =0;i<in.length;i++){
            if(in[i] == pre[0]){
                inIndex = i;
            }
        }
        int[] leftIn = Arrays.copyOfRange(in,0,inIndex);
        int[] rightIn = null;
        if(inIndex < in.length - 1){
            rightIn = Arrays.copyOfRange(in,inIndex+1,in.length);
        }
        //分割前序
        int[] leftPre = Arrays.copyOfRange(pre,1,1+inIndex);
        int[] rightPre = Arrays.copyOfRange(pre,1+inIndex,pre.length);
        //递归左
        constructTree(t,leftPre,leftIn,1);
        //递归右
        constructTree(t,rightPre,rightIn,0);
    }

    public static void reOrderArray(int [] array) {
        LinkedList<Integer> list = new LinkedList<>();
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                list.add(array[i]);
            }else{
                array[index] = array[i];
                index++;
            }
        }
        for(int i = index; i < array.length;i++){
            if(!list.isEmpty()){
                array[i] = list.get(0);
                list.removeFirst();
            }else{
                break;
            }
        }
    }

}
