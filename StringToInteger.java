class StringToInteger{
    public static void main(String[] args) {
        String str="     -42";
        str=str.trim();
        int i=Integer.parseInt(str);  
        System.out.println("Integer "+ i);
        float f=Float.parseFloat(str);
        System.out.println("Float " +f);
        double d= Double.parseDouble(str);
        System.out.print("Double "+d);
    }
}