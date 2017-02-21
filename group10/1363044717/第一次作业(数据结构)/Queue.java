package com.coding.basic;

public class Queue {

	private ArrayList elementData = new ArrayList();

	/**
	 * 进队列
	 * @param o
	 */
	public void enQueue(Object o){
		elementData.add(o);
	}

	/**
	 * 出队列
	 * @return
	 */
	public Object deQueue(){
		return elementData.remove(elementData.size()-1);
	}
	
	public boolean isEmpty(){
		return elementData.isEmpty();
	}
	
	public int size(){
		 return elementData.size();
	}
}
