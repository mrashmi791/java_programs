class Rectangle {
    int height;
    int width;
    public void setRectangle(int height,int width) {
        this.length = length;
        this.width= width;
    }
    public double getArea() {
        return length * width;
    }
}
public class Box extends Rectangle {
    private int height;
    public void setBox(double length, double width, double height){
        setRectangle(length,width); 
      this.height = height;
    }
    public double getVolume() {
      return getArea() * height;
   }

}
public class FindArea {
   public static void main(String[] args)
   {

      FindArea fa = new FindArea();

      fa.setBox(12, 10, 9.5);
      
      System.out.println("Volume is " + fa.getVolume());
   }
}