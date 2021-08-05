public class LineComparison {
        public static final int x11=5;
        public static final int x12=7;
        public static final int y11=9;
        public static final int y12=11;
        static void length_line_1()
        {
            int lengthOfLine1=(int) Math.sqrt((x12-x11) * (x12-x11) + (y12-y11) * (y12-y11));
            System.out.println("Length of Line1 is:"+lengthOfLine1);
        }
        public static final int x21=7;
        public static final int x22=47;
        public static final int y21=11;
        public static final int y22=21;
        static void length_line_2()
        {
            int lengthOfLine2=(int) Math.sqrt((x22-x21) * (x22-x21) + (y22-y21) * (y22-y21));
            System.out.println("Length of Line2:"+lengthOfLine2);

        }
        static void equals()
        {
            int m1,m2;
            m1=(y12-y11)/(x12-x11);
            m2=(y22-y21)/(x22-x21);
            if(m1 == m2)
                System.out.println("Two lines are equal.");
            else
                System.out.println("Two lines are not equal.");
        }

}
class Demo
{
    public static void main(String args[])
    {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch.");
        LineComparison ob=new LineComparison();
        ob.length_line_1();
        ob.length_line_2();
        ob.equals();
    }
}
