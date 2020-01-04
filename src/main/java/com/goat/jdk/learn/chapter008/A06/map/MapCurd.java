package com.goat.jdk.learn.chapter008.A06.map;




import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//sos 在测试环境里 除了需要导入junit-4.11.jar 还要导入hamcrest-core-1.3.jar ！！！   在非测试环境只需要导入junit-4.11.jar

/**
    * HashMap  TreeMap  LinkedHashMap 的区别
    我们用的最多的是HashMap,在Map 中插入、删除和定位元素，HashMap 是最好的选择。
    但如果您要按自然顺序或自定义顺序遍历键，那么 TreeMap 会更好。
    如果需要输出的顺序和输入的相同,那么用 LinkedHashMap 可以实现,它还可以按读取顺序来排列
     * @Date:   2018/8/6
*/
public class MapCurd extends MapBase{

    private static final Logger log = LoggerFactory.getLogger(MapCurd.class);

    @Before
    public void testBefore() {
        map.put("01","goat1"); // 如果map中没有对应的key 则返回null 如果map中已经存在本次put的key 那么覆盖原有的value并返回原有的value
        map.put("02","goat2");
        map.put("03","goat3");

        map1.put("04","goat4");
        map1.put("05","goat5");
        map1.put("06","goat6");
        map1.put("06","goat6666"); //由于key相同  goat6666 会覆盖掉  goat6
        map1.put("AA","AAAAAAAA");

        map2.put(1,"goat1");
        map2.put(2,"goat2");
        map2.put(3,"goat3");

        map4.add(map);
    }

    /** map 判断null  */
    @Test
    public void Map11(){
        log.info("map4.isEmpty()： {}", map4.isEmpty());
        log.info("map4==null： {}", map4==null);
        log.info("map4.get(0) == null： {}", map4.get(0) == null);
        System.out.println("-------------------很骚的分割线----------------");
        log.info("map5.isEmpty()： {}", map5.isEmpty());
        log.info("map5==null：{}", map5==null);
    }
    /** map的key是区分大小写的 */
    @Test
    public void test(){
        map2.put(null,"1");
        log.info(" map2.get(null)：{}",  map2.get(null));
    }

    /** map的key是区分大小写的 */
    @Test
    public void CaseSensitive(){
        System.out.println(map1.containsKey("AA")); // true
        System.out.println(map1.containsKey("aa"));// false
    }

    @Test
    public void Map(){
        System.out.println(map.containsKey("022")); //判断map集合中是否存在某个键
        System.out.println(map.containsValue("goat3")); //  判断是否包含指定value
        System.out.println(map.remove("02")); // 如果存在，则从该Map中移除对应的键值对。
        System.out.println(map.get("022")); // 返回指定的键映射的89值,如果这个Map不包含的键映射返回null
        System.out.println(map.values()); // 返回该map中的所有值
        System.out.println(map);
        map.clear(); // 删除集合中所有 键值对 元素
        System.out.println(map);
    }

    /**  将来两个map 进行合并！！！ */
    @Test
    public void putAll(){
        System.out.println(map);  // 合并前
        System.out.println(map1); // 合并前
        map.putAll(map1);  // 合并操作
        System.out.println(map); // 合并后
    }


}
