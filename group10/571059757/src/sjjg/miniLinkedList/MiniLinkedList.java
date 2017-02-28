package sjjg.miniLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;

import sjjg.interfaces.MiniList;

/**
 * 模拟实现链表结构
 * @author mengluo
 *
 */
@SuppressWarnings("all")
public class MiniLinkedList implements MiniList{
	
	private static int size; //链表长度
	
	private MiniNode header = new MiniNode(null,null,null);
	
	/**
	 * 构造一个空的链表
	 * header是空,且header的前一个节点和后一个节点都是空,因此是一个空的链表
	 */
	public MiniLinkedList() {
		header.next = header.pre = header;
	}
	
	/**********************实现List标准    START***************************/

	/**
	 * 链表的长度
	 */
	@Override
	public int size() {
		return size;
	}

	/**
	 * 如果链表是空,就返回true
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * 返回元素对应的索引  
	 * 如果没有这个元素,返回-1
	 */
	@Override
	public int indexOf(Object o) {
		int index = 0;
		if(o == null){
			for(MiniNode miniNode = header.next; miniNode != header ; miniNode = miniNode.next){
				if(miniNode.element == null){
					return index;
				}
				index++;
			}

		}else{
			for(MiniNode miniNode = header.next; miniNode != header ; miniNode = miniNode.next){
				if(o.equals(miniNode.element)){
					return index;
				}
				index++;
			}
		}
		return -1;
	}
	
	/**
	 * 如果包含这个元素,就返回true
	 * 否则，返回false
	 */
	@Override
	public boolean contains(Object o) {
		return indexOf(o)!=-1;
	}

	/**
	 * 在链表后添加一个元素
	 */
	@Override
	public void add(Object e) {
		
	}

	@Override
	public Object[] toArray() {
		
		return null;
	}


	@Override
	public boolean remove(Object o) {
		
		return false;
	}


	@Override
	public void clear() {
		
		
	}


	@Override
	public Object get(int index) {
		
		return null;
	}


	@Override
	public Object set(int index, Object element) {
		
		return null;
	}


	@Override
	public void add(int index, Object element) {
		
		
	}


	@Override
	public Object remove(int index) {
		
		return null;
	}


	@Override
	public int lastIndexOf(Object o) {
		
		return 0;
	}
	
	/**********************实现List标准    END***************************/
	
	
	
	/**
	 * 节点
	 * @author mengluo
	 *
	 */
	private static class MiniNode{
		Object element; //数据
		MiniNode next; //指向下一个数据的指针
		MiniNode pre; //指向上一个数据的指针
		
		MiniNode(Object element, MiniNode next, MiniNode pre) {
			this.element = element;
			this.next = next;
			this.pre = pre;
		}
		
		/**
		 * 在miniNode节点前添加一个元素
		 * @param element
		 * @param miniNode
		 * @return
		 */
		private MiniNode addBefore(Object element,MiniNode miniNode){
			MiniNode newNode = new MiniNode(element, miniNode, miniNode.pre);
			newNode.pre.next = newNode; //本节点前一个节点的下一个指针指向本节点
			newNode.next.pre = newNode; //本节点下一个节点的上一个指针指向本节点
			size++;
			return newNode;
		}
		
		
	}
}


