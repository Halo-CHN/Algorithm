package algorithm;

public class TowersOfHanoi {

    private static final char TOWER_BEGIN = '左';
    private static final char TOWER_TEMP = '中';
    private static final char TOWER_TARGET = '右';

    private int step;

    public void moveTower(int n) {
        if (n <= 0) {
            System.out.println("no steps");
        }
        step = 1;
        moveTower(n, TOWER_BEGIN, TOWER_TEMP, TOWER_TARGET);
    }

    private void moveTower(int n, char from, char temp, char target) {
        //一个目标的时候直接移到目标tower
        if (n == 1) {
            doMove(from, target);
        } else {
            //先移动上面的所有，到TEMP
            moveTower(n - 1, from, target, temp);
            //移动最下面的到target
            doMove(from, target);
            //移动上面的到target
            moveTower(n - 1, temp, from, target);
        }
    }

    private void doMove(char from, char target) {
        System.out.println("第" + step++ + "步：\t" + from + " --> " + target);
    }
}