/**
 * 选择排序
 */
public class Selection extends AbstractSort {
    public Selection(int length) {
        super(length);
    }

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        AbstractSort abstractSort = new Selection(10);
        System.out.println(abstractSort.getClass().getName());
        abstractSort.testSort();
    }
}
