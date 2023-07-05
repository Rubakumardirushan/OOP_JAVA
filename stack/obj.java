package stack;
import java.util.Scanner;
public class obj {
   
    public static void main(String [] args){
         stack1 top=null;
        objectcreate object1= new objectcreate();
        System.out.println("you want push  1  pop 2  exist 3!!!");
Scanner scan =new  Scanner(System.in);
int x=scan.nextInt();
while(x==1 || x==2){
    if(x==1){
    stack1 s1= object1.objectcreater();
    System.out.println("enter the data");
    scan.nextLine();
    String data1=scan.nextLine();
    push p1=new push();
   top= p1.enterdata(data1,top,s1);}
   if(x==2){
    pop p2=new pop();
    top=p2.deletedata(top);
   }
    System.out.println("you want node push 1  pop 2  exist 3!!!");
    x=scan.nextInt();
}


System.out.println("you want to display!!yes  3 no 4");
int dis=scan.nextInt();
if(dis==3){
    display d1=new display();
    d1.showdata(top);
}
    }
}
