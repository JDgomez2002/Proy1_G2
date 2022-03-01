
import java.util.Vector;

/**
 * Defines all the methods that our Vector-Stack should have.
 */

public class StackLisp<E> implements iStack<E>{
    
    Vector<E> myStack = new Vector<E>(5,5);
    Vector<E> myStack2 = new Vector<E>();
    private int espacios;
    private int recorrido;

    /**
     * Constructor.
     */
    public StackLisp(){
        this.espacios = 0;
        this.recorrido = 0;
    }

    /**
     * add an item to the stack. Will be popped next.
     * @param String
     */
    public void add(E item){
        this.myStack.add(item);
        this.myStack2.add(item);
        this.espacios += 1;
        this.recorrido += 1;
    }

    /**
     * If the Stack is not empty, the most recent item will be removed and returned.
     * @return String
     */
    public E remove(){
        E s = null;
        int last = this.espacios-1;

        if((!this.myStack.isEmpty()&&(this.espacios>0))){
            s = this.myStack.get(last);
            myStack.remove(last);
            myStack2.remove(last);
            this.espacios -= 1;
            this.recorrido -= 1;
        }

        return s;
    }

    /**
     * Get the current Item on the Stack (without popping it).
     * @return String
     */
    public E peek(){
        E s = null;
        int last = this.espacios-1;

        if((!this.myStack.isEmpty()&&(this.espacios>0))){
            s = this.myStack.get(last);
        }

        return s;
    }

    /**
     * Check if the Stack is empty.
     * @return Boolean indicating if the Stack is empty
     */
    public boolean empty(){
        boolean vacio = false;
        
        if(this.espacios<=0){
            vacio = true;
        }

        return vacio;
    }

    /**
     * Get the size of the Stack.
     * @return Integer indicating the size of the Stack
     */
    public int size(){
        return this.espacios;
    }


}
