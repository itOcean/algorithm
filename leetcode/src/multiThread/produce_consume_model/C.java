package multiThread.produce_consume_model;

/**
 * @Author James Wang
 * @Date 2018/2/6 20:26
 */


public class C {
    private MyStack myStack;
    public C(MyStack myStack){
        super();
        this.myStack = myStack;
    }

    public void popService(){
        myStack.pop();
    }
}