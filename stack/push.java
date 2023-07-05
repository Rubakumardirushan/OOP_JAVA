package stack;

public class push {
    stack1 enterdata(String d,stack1 s0,stack1 s2){
        if(s0==null){
s2.data=d;
s2.next=null;
return s2;


        }else{
            s2.data=d;
            s2.next=s0;
            return s2;

        }

    }
}
