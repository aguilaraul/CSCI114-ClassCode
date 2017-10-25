/**
 * @author Raul Aguilar
 */
package csci114_20171810code2;

class dynamicArray {
    int[] array;
    int totalSize = 1;
    int currentSize = 0;

    public dynamicArray() {
        array = new int[totalSize];
    }
    public void add(int element) {
        if(currentSize < totalSize)
            array[currentSize] = element;
        else {
            int[] tempArray = new int[totalSize * 2];
            totalSize = totalSize * 2;
            for(int i = 0; i < currentSize; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
            array[currentSize] = element;
        } // end else
        currentSize++;
    }// end add()
    public String toString() {
        String str  = "";
        for(int i = 0; i < currentSize; i++) {
            str = str + array[i] + ",";
        }
        return str;
    }

} // end dynamicArray

public class Csci114_20171810code2 {

    public static void main(String[] args) {
        dynamicArray da = new dynamicArray();
        for(int i = 0; i < 30; i++) { da.add(i*i); }
        System.out.println(da);
    } // end Main

}