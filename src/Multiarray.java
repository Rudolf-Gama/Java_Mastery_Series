public class Multiarray {
    public static void main(String[] args) {
//       int [][]flats=new int[2][3];

        int [][]flats={{ 4, 5, 6 }, { 1, 3, 2 } };

   //print arrays
//        for (int i = 0; i < flats.length; i++) {
//            for (int j = 0; j < flats[i].length; j++) {
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }

        for (int[] flat : flats) {
            for (int j = 0; j < flat.length; j++) {
                System.out.print(flat[j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
