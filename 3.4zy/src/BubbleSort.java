public class BubbleSort {
    public void bubbleSort(int [] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    System.out.println("i value is "+i+"and j value is "+j);
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            for (int k : array) {
                System.out.println(k + ",");
            }
        }
    }
}
