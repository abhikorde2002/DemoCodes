public class BubbelSort {
    public static void main(String[] args) {
        int array[]={12,10,1,5};

        for (int i=0;i< array.length;i++){
            for (int j=0;j< array.length-1;j++){
                if (array[j]>array[j+1]){
                    int tem = array[j];
                    array[j]=array[j+1];
                    array[j+1]=tem;
                }
            }
        }
        for (int a:array) {
            System.out.println(a);
        }
    }
}
