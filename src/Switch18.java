import java.util.Scanner;

public class Switch18 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        int a=s.nextInt();
//        if(a>40){
//            System.out.println("S grade");
//        }
//        else if(a>30)
//        {
//            System.out.println("A grade");
//        }
//        else {
//            System.out.println("Fail");
//        }

// without brackets it works
        String var="scahin";
        switch(var){
            case "ryde":
                System.out.println("hiii rydr");
                break;
            case "scahin":
            {
                System.out.println("hii scahin");
                break;
            }
            default:
            {
                System.out.println("hii nobody");
                break;
            }
        }

//        switch (var) {
//            case "ryde" -> System.out.println("hiii rydr");
//            case "Scahin" -> {
//                System.out.println("hii scahin");
//            }
//            default -> {
//                System.out.println("hii nobody");
//            }
//        }

    }
}
