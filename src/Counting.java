public class Counting {
    int count=0;
    int count1=0;
    void CountingNumbers(int array[],int l,int no,int no1){

        for (int i=0;i<l;i++){
            if(array[i] % no ==0 ){
                count++;
            }
            if(array[i] % no1 ==0 ){
                count1++;
            }
        }
        System.out.println("no divided by 5 are ="+count);
        System.out.println("no divided by 7 are ="+count1);

    }
    public static void main(String[] args) {
        Counting counting = new Counting();

        int no = 5;
        int no1 = 7;
        int array[] = {15, 14, 20, 21, 30, 67, 99, 23};
        int l = array.length;
        counting.CountingNumbers(array, l, no, no1);





    }
}
