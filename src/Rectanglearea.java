import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class FindArea {
    double a, b, area;

    void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Calculation of the area of a rectangle ");
        System.out.println("Please enter the length of side a ");
        a = Double.parseDouble(br.readLine());
        System.out.println("Enter the length of side b:");
        b = Double.parseDouble(br.readLine());
    }


     void computeField(){ area = a * b ;}

    void fieldDisplay(){
         System.out.print("The area of the rectangle with the side a = ");
         System.out.printf("%2.2f" , a);
         System.out.print("The area of the rectangle with side b is ");
         System.out.printf("%2.2f" , b);
         System.out.print("The area is :");
         System.out.printf("%2.2f.\n",area);

    }

}


 public class Rectanglearea {
    public static void main(String[] args) throws IOException{
        FindArea  obj = new FindArea();
        obj.getData();
        obj.computeField();
        obj.fieldDisplay();
    }
}

//so the naming convention is important //yess
