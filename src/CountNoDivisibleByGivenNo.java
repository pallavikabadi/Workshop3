public class CountNoDivisibleByGivenNo {

    static int CountNumber(int array[],int no,int l){
        int count =0;
        for(int i=0;i<l;i++) {
            if (array[i] % no == 0)
                count++;
        }
        return count;

    }
    static int CountNumber2(int array[],int l,int no1) {
        int count = 0;
        for (int j = 0; j < l; j++) {
            if (array[j] % no1 == 0) {
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        CountNoDivisibleByGivenNo countNoDivisibleByGivenNo = new CountNoDivisibleByGivenNo();
        int[] array = {15, 14, 20, 21, 30, 67, 99, 23};
        int no = 5;
        int no1 = 7;
        int l = array.length;
        countNoDivisibleByGivenNo.CountNumber(array, no, l);
        countNoDivisibleByGivenNo.CountNumber2(array, no1, l);




//            System.out.println("no Divisible by 5="+CountNumber(array,no,l));
//            System.out.println("no Divisible by 7="+CountNumber(array,no1,l));
    }
}
