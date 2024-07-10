public class array {
    public static void main(String[] args) {
        int arr[][]=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=(int) (Math.random() * 10);
            }
        }
        for(int n[]:arr){
            for(int i=0;i<4;i++){
                System.out.print(n[i]+" ");
            }
            System.out.println();
        }
    }
}
