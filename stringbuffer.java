public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity());//by default size is 16 & plus Hello i.e. +5 =21
        sb.append(" World");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
