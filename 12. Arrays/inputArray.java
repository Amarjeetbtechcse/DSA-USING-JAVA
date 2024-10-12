import java.util.Scanner;
public class inputArray {
    public static void main(String[] args){
    int marks[] = new int [100];

    Scanner sc = new Scanner(System.in);
    
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();
    marks[3] = sc.nextInt();

    System.out.println("phy= " +marks[0]);
    System.out.println("chem= " +marks[1]);
    System.out.println("maths= " +marks[2]);
    System.out.println("biology= " +marks[3]);

    marks[2]= marks[2]+75;
    System.out.println("maths = "+marks[2]);

    int percentage = (marks[0] + marks[1]+ marks[2] + marks[3])/3;
    System.out.println("percentage =" +percentage + "%");

    System.out.println("length of this array is:" +marks.length);

}
}