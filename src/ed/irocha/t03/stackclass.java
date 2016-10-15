/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.irocha.t03;

/**
 *
 * @author casa
 * @param <T>
 */
public class stackclass <T> {
    //Atributes
    private nodeclass top;
    private int size;
    
    //constructor
    public stackclass(){
        this.top = null;
        size = 0;
    }
    public nodeclass gettop(){
        return top;
    }
    public int getsize(){
        return size;
    }
    public boolean isempty(){
        return top == null;
    }
    public void push(T data){
        nodeclass node = new nodeclass( data);
        if(isempty()){
            top = node;
        }else {
            node.setnext(top);
            top= node;
        }
        ++size;
    }
    public void pop(){
        if(!isempty()){
            top = top.getnext();
            --size;
        }else{
            System.out.println("la pila esta vacia");
        }
    }
    public void empty(){
        top = null;
        size=0;
    }
    public void showstack(){
        if(!isempty()){
        nodeclass aux = top;
        do{
            
            System.out.println(aux.getdata());
            System.out.println("|");
            System.out.println("V");
            aux = aux.getnext();
        }while(aux!= null);
    }
        System.out.println("null");
}
}