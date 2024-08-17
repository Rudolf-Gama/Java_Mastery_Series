public class foreachloop27 {
    public static void main(String[] args) {
        int []marks={100,29,33,32};
        System.out.println(marks.length);

        String []student={"rudolf","Rachel","daddy","mummy"};
        System.out.println(student.length);
        System.out.println("length above");

        System.out.println("\n");

        System.out.println("reverse order");
        for (int i = marks.length-1;i>=0; i--) {
            System.out.println(marks[i]);
        }
        System.out.println("\n");

        System.out.println("using enhanced loop");
// enhanced for loop or for each
        for (String s : student) {
            System.out.println(s);
        }

        for (int m:marks) {
            System.out.println(m);
        }


    }
}
