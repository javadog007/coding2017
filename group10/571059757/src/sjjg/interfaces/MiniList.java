package sjjg.interfaces;
/**
 * 抽象出List标准
 * @author mengluo
 *
 */
public interface MiniList {
	/**
	 * @return List集合中元素的个数
	 */
	 int size();
	 
	 /**
	  * @return 如果List集合中没有任何元素,返回true
	  */
	 boolean isEmpty();

	 /**
	  * 如果被测试元素包含在List集合中,则返回true
	  * @param o 被测试元素
	  * @return 返回ture说明被测试元素包含在List集合中
	  */
	 boolean contains(Object o);
	 
	/**
	 * 把List集合中的数据全都变成数组
	 * @return
	 */
	 Object[] toArray();
	 
	 /**
	  * 在List集合最后端添加元素
	  * @param e
	  */
	 void add(Object e);
	 
	 /**
	  * 删除该元素在List集合中最小下标的数
	  * @param o
	  * @return
	  */
	 boolean remove(Object o);
	 
	 /**
	  * 清空List
	  */
	 void clear();
	 
	 /**
	  * 根据索引返回元素
	  * @param index
	  * @return
	  */
	 Object get(int index);
	 
	 /**
	  * 把特定位置的元素替换掉
	  * @param index 索引
	  * @param element 元素
	  * @return
	  */
	 Object set(int index, Object element);
	 
	 /**
	  * 在特定的索引处插入元素
	  * @param index 索引
	  * @param element 被插入的元素
	  */
	 void add(int index, Object element);
	 
	 /**
	  * 移除索引处的元素
	  * @param index
	  * @return
	  */
	 Object remove(int index);
	 
	 /**
	  * 返回元素的索引
	  * @param o
	  * @return
	  */
	 int indexOf(Object o);
	 
	 /**
	  * 返回元素最后一处索引
	  * @param o
	  * @return
	  */
	 int lastIndexOf(Object o);
	 
	 //... 迭代器先不实现
	 
	 
}
