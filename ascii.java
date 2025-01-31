import java.util.Scanner;
    public class ASCII {
        static Scanner userinput = new Scanner(System.in);
        public static void main(String[] args) {
            int number;


            System.out.println("Pick a number between 0 and 255");
            number =  userinput.nextInt();
            String binary = Integer.toBinaryString(number);
            String hex = Integer.toHexString(number);
            String ascii = Character.toString(number);


            System.out.println(number +' '+binary +' '+ hex +' '+ ascii);
