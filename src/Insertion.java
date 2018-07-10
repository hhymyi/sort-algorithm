/**
 * 插入排序
 */
public class Insertion extends AbstractSort {
    public Insertion(int length) {
        super(length);
    }

    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++)         // 类似抓扑克牌排序
        {
            int get = array[i];                 // 右手抓到一张扑克牌
            int j = i - 1;                  // 拿在左手上的牌总是排序好的
            while (j >= 0 && array[j] > get)    // 将抓到的牌与手牌从右向左进行比较
            {
                array[j + 1] = array[j];            // 如果该手牌比抓到的牌大，就将其右移
                j--;
            }
            array[j + 1] = get; // 直到该手牌比抓到的牌小(或二者相等)，将抓到的牌插入到该手牌右边(相等元素的相对次序未变，所以插入排序是稳定的)
        }
    }

//    @Override
//    public void sort(int[] array) {
//        int N = array.length;
//        int i, j;
//        for (i = 1; i < N; i++) {
//            for (j = i - 1; j >= 0 && array[i] < array[j]; j--) {
//
//            }
//            //这里跳出内层循环，array[i]应被插入到array[j]后
//            int tmp = array[i];
//            for (int k = i; k > j + 1; k--) {
//                array[k] = array[k-1];
//            }
//            array[j+1] = tmp;
//        }
//    }

//    @Override
//    public void sort(int[] array) {
//        for(int i=1;i<array.length;i++){
//            int j;//需要插入的位置
//            for(j=0;j<i;j++){
//                if(array[i]<array[j]){
//                    break;
//                }
//            }
//            int temp=array[i];
//            for(int k=i;k>j;k--){
//                array[k]=array[k-1];
//            }
//            array[j]=temp;
//        }
//    }

    public static void main(String[] args) {
        AbstractSort abstractSort = new Insertion(10);
        abstractSort.testSort();
    }
}
