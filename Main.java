import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //we need to create a method that takes in 2 params (num, length)

        //we return an array containing all multiples of num up to length

        //num and length should be int
        //length must be positive

        Scanner scan = new Scanner(System.in);

        //first we save the user inputs

        System.out.print("num: ");
        int num = scan.nextInt();

        System.out.print("length: ");
        int length = scan.nextInt();

        //then we pass the arguments into the static method
        //and we display the results
        System.out.print("Multiples of " + num + " [");

        for(int i : arrayOfMultiples(num, length)){
            System.out.print(i +", ");
        }

        System.out.println("]");
    }

    private static int[] arrayOfMultiples(int num, int length){
        int[] multipleArray = new int[length];

        //we populate the array with multiples of num
        for(int i=0, count=1; i<length; i++, count++){
            multipleArray[i] = (num*count);
        }

        //then we return the array
        return multipleArray;
    }
}