package com.coding.basic;

public class Stack {

	private ArrayList elementData = new ArrayList();
	public void push(Object o){
		elementData.add(o);
	}

	/**
	 * 移除栈顶并返回他
	 * @return
	 */
	public Object pop(){
		return elementData.remove(elementData.size()-1);
	}
	/**
	 * 得到栈顶元素
	 * @return
	 */
	public Object peek(){
		return elementData.get(elementData.size()-1);
	}
	public boolean isEmpty(){
		return elementData.isEmpty();
	}
	public int size(){
		return elementData.size();
	}
}
