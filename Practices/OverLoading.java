class OverLoading {
public void rectangle(int length) {
    System.out.println("Length : " + length);
}
public void rectangle(int length, double height) {
    System.out.println("area : " + length*height);
     System.out.println("perimeter : " + 2*(length+height));
}
public void rectangle(double height) {
    System.out.println("height : " + height);
    
}
public static void main(String[] arr) {
    int length = 5;
    double height = 4.5;
OverLoading ol = new OverLoading();
ol.rectangle(height);
ol.rectangle(length);
ol.rectangle(length,height);
}
}