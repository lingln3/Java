package com.collection.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class CacheManager {

	static SortedMap<String,Cache> cacheMap=new TreeMap<String,Cache>();
	static final int MAX_CACHE_NUM=5;//最大五个缓存

	private static class ValueComparator implements Comparator<Map.Entry<String,Cache>>
	{
		public int compare(Map.Entry<String,Cache> m,Map.Entry<String,Cache> n)
		{
			return n.getValue().usedcount-m.getValue().usedcount;
		}
	}

	
	public static Cache getCache(String id)
	{
		if(cacheMap.get(id)==null)
		{
			Object val=getFromDB(id);
			cacheMap.put(id, new Cache(id,val));
		}
		Cache res=cacheMap.get(id);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		res.addCount();
		return cacheMap.get(id);
	}

	public static void putCache(Cache cache)
	{
		cacheMap.put(cache.id, cache);
	}

	public static Object getFromDB(String id)
	{
		System.out.println("缓慢地从内存中读取id="+id+"对应的数据。。。");	
		return new String("value"+id);
	}

	public static void refreshCaches()
	{
		System.out.println("刷新缓存。。。");

		List<Map.Entry<String,Cache>> list=new ArrayList();
		list.addAll(cacheMap.entrySet());
		ValueComparator comparator=new ValueComparator();
		Collections.sort(list,comparator);

		for(int i=MAX_CACHE_NUM;i<list.size();i++)
		{
			String id=(String) list.get(i).getKey();
			Object val=getFromDB(id);
			cacheMap.put(id, new Cache(id,val));
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Cache cache1=new Cache("1","value1");
		Cache cache2=new Cache("2","value2");
		Cache cache3=new Cache("3","value2");
		Cache cache4=new Cache("4","value2");
		Cache cache5=new Cache("5","value2");
		Cache cache6=new Cache("6","value2");
		Cache cache7=new Cache("7","value2");
		CacheManager.putCache(cache1);
		CacheManager.putCache(cache2);
		CacheManager.putCache(cache3);
		CacheManager.putCache(cache4);
		CacheManager.putCache(cache5);
		CacheManager.putCache(cache6);
		CacheManager.putCache(cache7);
		CacheManager.getCache("1");
		CacheManager.getCache("1");
		CacheManager.getCache("2");
		CacheManager.getCache("3");
		CacheManager.getCache("3");
		CacheManager.getCache("4");
		CacheManager.getCache("4");
		CacheManager.getCache("6");
		CacheManager.getCache("5");
		CacheManager.getCache("5");
		CacheManager.getCache("6");
		CacheManager.getCache("6");
		refreshCaches();

		Thread refreshTD=new Thread()
		{
			public void run()
			{
				while(true)
				{
					refreshCaches();
					try {
						Thread.sleep(1000);//每一秒刷新一次
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
				refreshTD.start();
	}
}

class Cache
{

	String id;//相当于主键
	Object val;
	Date startdt;//标记新建时间
	int usedcount=0;//标记使用次数
	
	
	public Cache(String id,Object val)
	{
		this.id=id;
		this.val=val;
		this.startdt=new Date();
		usedcount++;
	}
	
	public void setValue(Object val)
	{
		this.val=val;
	}
	
	public void addCount()
	{
		usedcount++;
	}
	
	public void showInfo()
	{
		System.out.println("Cache的ID是:   "+id+"   Cache的值是:   "+val);
	}
	
	/**
	 * 往往刚刚新建的被访问机会是最少的
	 * @param o
	 * @return
	 */
	public int compareTo(Object o) {
		if(o instanceof Cache)
		{
			Cache c=(Cache) o;
			if(this.usedcount>c.usedcount)
				return 1;
			else
				return -1;
		}
		return 0;
	}
}