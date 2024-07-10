public class Exception {
    public static void main(String[] args) {
        int i=0;
        int j=2;
        int nums[]=new int[5];
        try{
            j=18/i;//it will throw ArithmeticException / by zero exception
            System.out.println(nums[1]);
            System.out.println(nums[5]);//it will throw ArrayIndexOutOfBoundsException
        }
        //If we catch Exception then it can be any type of exception not specific exception
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException"+e);
        }
       
    }
}
