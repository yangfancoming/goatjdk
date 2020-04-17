# Java8  为什么说是革命性的一个版本
    1. Lambda 表达式  ： 代码量更少 
    2. 函数式接口 Functional
    3. 方法引用于构造器引用
    4. Stream流  ： 内部迭代 查询效率更高
    5. Optional 类 ： 减少空指针异常 
    6. hashmap ： 底层结构 改为 红黑树实现   查询效率更高
    
    
# idefault  java8 接口中可以出现默认方法
    应运而生：
        default方法是java 8中新引入进的，它充许接口中除了有抽象方法以外，还可以拥用具有实现体的方法，这一点跟jdk8之前的版本已经完全不一样了，为什么要这样做呢？
        拿List接口举例，在java 8以前的老系统中有一个开发人员自己写了一个类DefinedList，它继承于List接口。
        毫无疑问，DefinedList将会实现List接口中的所有抽象方法。
        在java 8中，甲骨文觉得其实可让List做更多的事，比如开发中常用的给List数据进行排序，于是它们想加一个sort方法。
        但是由于List是接口，在接口里面加抽象方法定会让其实现类都增加sort方法的实现，除了java中List的实现如ArryaList，LinkedList需要加sort方法的实现，我们自己写的DefinedList也必需得加这个sort的实现。
        如果老系统中的java由7升级到8，那么代码一定会报错。
        而为了解决java版本向后兼容问题，在List中的sort方法中加入了实现体
        @SuppressWarnings({"unchecked", "rawtypes"})
            default void sort(Comparator<? super E> c) {
                Object[] a = this.toArray();
                Arrays.sort(a, (Comparator) c);
                ListIterator<E> i = this.listIterator();
                for (Object e : a) {
                    i.next();
                    i.set((E) e);
                }
            }
        如果此时再由java7升级到java8，那么DefinedList会一并的继承sort方法，DefinedList也不会报错，这样就可以完美的解决java向后兼容的问题。
        
         