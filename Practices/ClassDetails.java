class School {
   String designation = "Teacher";
   String principle = "Shyam kumar";
   void job(){
	System.out.println("Teaching");
   }
}

public class ClassDetails extends School{
   String subject = "Physics";
   int student = 40;

   public static void main(String args[]){

	ClassDetails obj = new ClassDetails();
	System.out.println(obj.principle);
	System.out.println(obj.designation);
	System.out.println(obj.subject);
	obj.job();
   }
}