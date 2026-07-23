public class labeledIF {
    static void main() {
        labl1:for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==1 && j==1){
                System.out.println("skipping this iteration  from the outerloop ");
                continue labl1;
                }
                System.out.println("i= "+i+" j= "+j);
            }

        }
//        int a=5;
//        outerIf:if(a>0)
//        {
//            System.out.println("number is positive");
//            if(a%2==0)
//            {
//                System.out.println("number is even");
//            }
//            else {
//                System.out.println("number is odd");
//                break outerIf;
//            }
//            System.out.println("this will only be executed if the number is even ");
//        }
//        System.out.println("this is outside the labaled block");
    }
}
