package stack;

public class display {
    void showdata(stack1 s3){
        stack1 temp=s3;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
