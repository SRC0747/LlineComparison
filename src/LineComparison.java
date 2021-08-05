public class LineComparison {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch.");
        int x11=5;
        int x12=7;
        int y11=9;
        int y12=11;
        int lengthOfLine1=(int) Math.sqrt((x12-x11) * (x12-x11) + (y12-y11) * (y12-y11));
        System.out.println("Length of Line1 is:"+lengthOfLine1);
        int x21=7;
        int x22=47;
        int y21=11;
        int y22=21;
        int lengthOfLine2=(int) Math.sqrt((x22-x21) * (x22-x21) + (y22-y21) * (y22-y21));
        System.out.println("Length of Line2:"+lengthOfLine2);
    }
}
