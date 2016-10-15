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
public class nodeclass <T> {
    //Atributes
    private T data;
    private nodeclass next;
    //constructor
    public nodeclass(T data){
        this.data = data;
        this.next = null;
    }
    public void setdata(T data){
        this.data = data;
    }
    public T getdata(){
        return this.data;
    }
    public void setnext(nodeclass n){
        this.next = n;
    }

    public nodeclass getnext() {
        return next;
    }
    
}
