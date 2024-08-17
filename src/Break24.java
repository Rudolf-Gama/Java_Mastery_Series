public class Break24 {
    public static void main(String[] args) {
//        break using loops

//        for (int i=0;i<5;i++)
//        {
//            System.out.println(i);
//            System.out.println("hii java there");
//            if(i==3)
//            {
//                break;
//            }
//        }
//        System.out.println("exit the loop");

//        int i=0;
//        while(i<5)
//        {
//            System.out.println(i);
//            System.out.println("hii java there");
//            if(i==2)
//            {
//                break;
//            }
//            i++;
//        }
//        System.out.println("exit while loop");

//        int i=0;
//        do
//        {
//            System.out.println(i);
//            System.out.println("hii java there");
//            if(i==1)
//            {
//                break;
//            }
//            i++;
//        }while(i<5);
//       System.out.println("exit while loop");

//        continue statements
//        for (int i=0;i<5;i++)
//        {
//            if(i==3)
//            {
//                System.out.println("exit");
//                continue;
//            }
//
//            System.out.println(i);
//            System.out.println("hii java there");
//        }

        int i=0;
        do
        {
            i++;
            if(i==1)
            {
                System.out.println("continue");
                continue;
            }
            System.out.println(i);
            System.out.println("hii java there");
        }while(i<5);
    }
}
