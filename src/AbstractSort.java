import java.util.Arrays;
import java.util.Random;

public abstract class AbstractSort {

    private int length;

    private int[] array;

    public AbstractSort(int length) {
        this.length = length;
        setRandomArray();
    }

    public void setRandomArray(){
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            Random random=new Random();
            a[i] = random.nextInt(100);
        }
        this.array=a;
    }

    public String arrayToString(){
        StringBuffer sb=new StringBuffer("");
        for(int i:array){
            sb.append(i+"\n");
        }
        return sb.toString();
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public abstract void sort(int[] array);


    public void testSort(){
        System.out.println(arrayToString());
        sort(getArray());
        System.out.println("-------------------------------------");
        System.out.println(arrayToString());
    }

}
