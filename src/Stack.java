public class Stack{
    // Last In First Out (LIFO)
    int top;
    int max;
    Object[] a;

    void initialise(int max)
    {
        top=-1;
        this.max = max;
        a = new Object[max];
        
    }

    boolean isEmpty()
    {
        return(top==-1);
    }

    boolean isFull()
    {
        return(top==max);
    }

    void push(Object o)
    {
        a[++top] = o;
    }

    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        else
        {
            System.out.print(a[top--]);
        }
    }

    void peek()
    {
        System.out.print(a[top]);
    }

}