package stack;

public class pop {
    stack1 deletedata(stack1 s4){
        if(s4==null){
            System.out.println("stack is empty");
            return s4;
        }else{
            System.out.println("pop data is" + " "+s4.data);
            return s4.next;
        }
    }
}
