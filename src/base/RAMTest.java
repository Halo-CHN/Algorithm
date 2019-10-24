package base;

/**
 * 实例变量初始化过程分析
 * 初始实例变量的有：
 * ① 实例变量定义时初始化、
 * ② 非静态代码块初始化、
 * ③ 构造函数实例变量初始化
 */
public class RAMTest {

    public RAMTest() {
        System.out.println("init in constructor");
    }

    {
        System.out.println("init in block");
    }

    CommonTest commonTest = new CommonTest(RAMTest.class.getCanonicalName());

}