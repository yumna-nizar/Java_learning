public class PrintPattern2 {

    static void main() {
 //pattern 4
//        int cols=4;
//        int rows=2*cols-1;                            //pattern 4
//        for(int i=1;i<=rows;i++)                      // *
//        {                                             // **
//            if(i<=cols) {                             // ***
//                //upper half                          // ****
//                for (int j = 1; j <= i; j++) {        // ***
//                    System.out.print("*");            // **
//                }                                     // *
//            }
//            else
//            {//lower half
//                for(int j=1;j<=(2*cols-i);j++)
//                {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
        //pattern 4 another approach
//        int cols=4;
//        int rows=2*cols-1;
//        int noOfStars=0;
//        for(int i=1;i<=rows;i++)
//        {
//            noOfStars=i;
//            if(i>cols)
//            {
//               noOfStars=2*cols-i;
//            }
//                for (int j = 1; j <= noOfStars; j++) {
//                    System.out.print("*");
//                }
//
//            System.out.println();
//        }





//pattern 5
//        for(int i=6;i>=1;i--)
//        {
//            for(int j=6;j>=1;j--){                //pattern 5
//                if(j-i<=0)                        // *****
//                {                                 //  ****
//                    System.out.print("*");        //   ***
//                }                                 //    **
//                else {                            //     *
//                    System.out.print(" ");
//                }
//
//
//            }
//            System.out.println();
//        }


//pattern 6
        int rows=4;
        int cols=rows*2-1;
        int noOFStars=1;
        outerloop:for(int i=1;i<=rows;i++)  //     *
        {                                   //    ***
            for(int j=1;j<=rows-i;j++)      //   *****
            {                               //  *******
                System.out.print(" ");
            }
            for(int j=1;j<=noOFStars;j++)
            {
                System.out.print("*");
            }
            noOFStars+=2;
            System.out.println();
        }
        {

        }

    }
}
