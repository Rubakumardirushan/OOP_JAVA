class animal{
  void run(animal a){
System.out.println("run animal");

  }
  void cat1(cat c){

System.out.println("run animal cat");
  }


  
}
class cat extends animal{

void cat(cat c){

System.out.println("run cat in  class cat");
  }



}

public class inheritance {
public static void main(String[] args){

cat c1=new cat();
  animal a1=new animal();
  c1.run(c1);
  c1.run(c1);
  a1.run(a1);


}





}
