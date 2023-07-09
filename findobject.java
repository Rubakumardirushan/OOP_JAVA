class box{
static int count=0;
  box(){
count++;

  }
  
}
public class findobject{
public static void main(String []args){

box b1=new box();
  box b2=new box();
  box b3= new box();
  System.out.println(count);
}


}
