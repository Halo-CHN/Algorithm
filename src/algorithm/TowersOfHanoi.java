package algorithm;

/**
 * 汉诺塔
 */
public class TowersOfHanoi {

    private static final char TOWER_BEGIN = '左';
    private static final char TOWER_TEMP = '中';
    private static final char TOWER_TARGET = '右';

    private int step; //每次计算过程所用步数

    public int getStep() {
        return step;
    }

    /**
     * @param n 需移动的stuff数量
     */
    public void moveTower(int n) {
        moveTower(n, TOWER_BEGIN, TOWER_TEMP, TOWER_TARGET);
    }

    /**
     * @param n      需移动的stuff数量
     * @param from   起始
     * @param temp   过渡
     * @param target 落点
     */
    public void moveTower(int n, char from, char temp, char target) {
        if (n <= 0) {
            step = 0;
            System.out.println("no steps");
        }
        step = 1;
        move(n, from, temp, target);
    }

    /**
     * @param n      需移动的stuff数量
     * @param from   起始
     * @param temp   过渡
     * @param target 落点
     */
    private void move(int n, char from, char temp, char target) {
        //一个目标的时候直接移到目标tower
        if (n == 1) {
            step(from, target);
        } else {
            //先移动上面的所有，到TEMP
            move(n - 1, from, target, temp);
            //移动最下面的到target
            step(from, target);
            //移动上面的到target
            move(n - 1, temp, from, target);
        }
    }

    /**
     * 打印每次移动的起始位置
     *
     * @param from   起始
     * @param target 落点
     */
    private void step(char from, char target) {
        System.out.println("第" + step++ + "步：\t" + from + " --> " + target);
    }
}