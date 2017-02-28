package sjjg.miniArrayList.test;

import org.junit.Assert;
import org.junit.Test;

import sjjg.miniArrayList.MiniArrayList;
/**
 * MiniArrayList的测试用例
 * @author mengluo
 *
 */
public class JTestMiniArrayList {

	private static MiniArrayList miniArrayList = new MiniArrayList();
	
	/**
	 * 测试add、get、size、isEmpty、indexOf、contains、remove(int index)、remove(Object o)、clear()、get(int index)函数
	 * 
	 */
	@Test
	public void test1(){
		miniArrayList.add("aa");
		Assert.assertEquals(miniArrayList.get(0), "aa");
		Assert.assertEquals(miniArrayList.size(),1);
		Assert.assertTrue(!miniArrayList.isEmpty());
		Assert.assertEquals(miniArrayList.indexOf("aa"), 0);
		Assert.assertEquals(miniArrayList.indexOf("bb"), -1);
		Assert.assertTrue(miniArrayList.contains("aa"));
		
		miniArrayList.remove(0);
		Assert.assertTrue(miniArrayList.isEmpty());
		
		miniArrayList.add("aa");
		Assert.assertEquals(miniArrayList.get(0), "aa");
		miniArrayList.remove("aa");
		Assert.assertTrue(miniArrayList.isEmpty());

		miniArrayList.add("aa");
		miniArrayList.add("bb");
		miniArrayList.add("cc");
		Assert.assertEquals(miniArrayList.size(),3);
		miniArrayList.clear();
		Assert.assertEquals(miniArrayList.size(),0);
		
		miniArrayList.add("aa");
		Assert.assertNotNull(miniArrayList.get(0));

	}

	
}
