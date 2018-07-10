/**
 * 冒泡排序
 */
public class Bubble extends AbstractSort {

    public Bubble(int length) {
        super(length);
    }

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        AbstractSort abstractSort = new Bubble(10);
        abstractSort.testSort();
    }
}
