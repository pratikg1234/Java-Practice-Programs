class PratikException extends Throwable{
    public PratikException(String string){
        super(string);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                throw new PratikException("I dont want to print this exception");
            }
        }
        catch(PratikException e){
            j=18/1;
            System.out.println("Thats the default output " +e);
        }
    }
}