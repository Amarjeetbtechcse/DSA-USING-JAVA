
public class arrayAsFunction {
    public static void update(int marks[]){
        for(int i =0; i<marks.length; i++){
            marks[i] = marks[i] +5;
        }
    }
    public static void main(String[] args) {
        int marks[]={1,2,3,4,5};
        update(marks);
        for(int i =0; i<marks.length; i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}
