public class jagged_array {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0]=new int[4];
        arr[1]=new int[2];
        arr[2]=new int[3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=(int) (Math.random() * 10);
            }
        }
        for(int n[]:arr){
            for(int i:n){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
