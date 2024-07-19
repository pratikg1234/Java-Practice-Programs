class switchcase{
    public static void main(String[] args){
        String day = "Sunday";
        String res ="";
        res = switch(day){
            case "Sunday" -> "Good Morning";
            case "Monday" -> "Good Evening";
            default ->"default";
        };
        System.out.println(res);
    }
}