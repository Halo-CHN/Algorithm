package base;

/**
 * 暴露带有String类型参数的构造器，供外部使用
 */
public class CommonTest {

    public CommonTest() {
        System.out.println("TESTING *******");
    }

    public CommonTest(String textFlag) {
        System.out.println("TESTING ******* For " + textFlag);
    }
}
