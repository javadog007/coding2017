package sjjg.miniArrayList;

import java.util.ArrayList;
import java.util.Arrays;

import sjjg.interfaces.MiniList;

/**
 * 模拟实现链表结构
 * @author mengluo
 *
 */
@SuppressWarnings("all")
public class MiniArrayList implements MiniList{

	private Object[] array; //底层数组
	
	private int size; //数组长度
	
	/**
	 * 含参构造初始化MiniArrayList底层数组长度
	 * @param init 初始化长度
	 */
	public MiniArrayList(int init) {
		if(init < 0)
			  throw new IllegalArgumentException("初始化长度不能为负数:" + init);
		this.array = new Object[init];
	}
	
	/**
	 * 如果调用的是无参构造,默认数组长度是10
	 */
	public MiniArrayList() {
		this(10);
	}
	
	
	
	/* List标准下的函数   START */
	/**
	 * 返回MiniArrayList中元素的长度
	 */
	@Override
	public int size() {
		return size;
	}

	/**
	 * 如果MiniArrayList中没有元素就返回true
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * 返回元素在ArrayList中的索引,如果没有这个元素返回-1
	 */
	@Override
	public int indexOf(Object o) {
		if(o == null){
			for (int i = 0; i < size; i++) {
				if(array[i] == null)
					return i;
			}
		}else{
			for (int i = 0; i < size; i++) {
				if(o.equals(array[i]))
					return i;
			}
		}
		return -1;
	}
	
	/**
	 * 元素如果包含在集合中就返回true
	 */
	@Override
	public boolean contains(Object o) {
		return indexOf(o) != -1;
	}

	/**
	 * 在List后面追加一个元素
	 */
	@Override
	public void add(Object e) {
		//先扩容
		extend(size + 1);
		array[size++] = e;
	}
	
	/**
	 * 删除指定索引处的元素,并返回被删除的元素
	 */
	@Override
	public Object remove(int index) {
		Object oldValue = array[index];
		int numMoved = size - index - 1; //需要移动的位数
		if(numMoved > 0)
			System.arraycopy(array, index + 1, array, index, numMoved);
		array[size--] = null;
		return oldValue;
	}

	/**
	 * 删除元素
	 * 如果没有这个元素,就返回false,否则都返回true
	 */
	@Override
	public boolean remove(Object o) {
		if(o == null){
			for (int i = 0; i < size; i++) {
				if(array[i] == null){
					remove(i);
					return true;
				}
			}
		}else{
			for (int i = 0; i < array.length; i++) {
				if(array[i].equals(o)){
					remove(i);
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 清空集合
	 */
	@Override
	public void clear() {
		for (int i = 0; i < size; i++) 
			array[i] = null;
		size = 0;
	}

	/**
	 * 根据下标获取元素
	 */
	@Override
	public Object get(int index) {
		checkIndex(index);
		return array[index];
	}

	/**
	 * 把元素添加到指定索引处
	 */
	@Override
	public void add(int index, Object element) {
		checkIndex(index);
		extend(size + 1);
		System.arraycopy(array, index, array, index + 1, size - index);
		array[size++] = element;
	}

	@Override
	public int lastIndexOf(Object o) {
		
		return 0;
	}
	
	@Override
	public Object[] toArray() {
		
		return null;
	}
	
	@Override
	public Object set(int index, Object element) {
		
		return null;
	}

	/* List标准下的函数   END */
	
	
	
	
	/* 帮助内部函数  START */

	/**
	 * 数组扩容
	 * @param minLength 指定所需的最小容量
	 */
	private void extend(int mustLength) {
		int oldLength = array.length;
		if(oldLength < mustLength){
			Object[] oldArray = array;
			int newLength = oldLength + (oldLength >> 1); //扩容50%
			if(newLength < mustLength){
				newLength = mustLength;
			}
			array = Arrays.copyOf(array, newLength);
		}
	}
	
	/**
	 * 检查下标
	 * @param index
	 */
	private void checkIndex(int index){
		if(index >= size){
			 throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
		}else if(index < 0){
			throw new IllegalArgumentException("下标不能为负数:" + index);
		}
	}
	
	/* 帮助内部函数  END */
}
