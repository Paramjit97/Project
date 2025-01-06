package dec21;

public class Reverse {
    public void reverseArray(int[] arr) {
        for(int i=0;i<arr.length/2;i++){
            int num=arr[i];
            arr[i]=arr[((arr.length)-1)-i];
            arr[((arr.length)-1)-i]=num;
        }

    }
}
