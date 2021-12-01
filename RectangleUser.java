public class RectangleUser {
   
  public static void main(String[] args) {

     int r1Area;
     Rectangle r1 = new Rectangle();
     r1.length = 10;
     r1.width = 20;
     r1Area = r1.calcArea();

     System.out.println("r1 area = " + r1Area);

     int r2Area;
     int r2Perimeter;
     Rectangle r2 = new Rectangle();
     r2.length = 5;
     r2.width = 3;
     r2Area = r2.calcArea();
   
     System.out.println("r2 area = " + r2Area);

     r2Perimeter = r2.calcPerimeter();
     System.out.println("r2 perimeter = " + r2Perimeter);
     
 
  }

}