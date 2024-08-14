package implementing_array;

import java.util.Arrays;

public class MyArray{
    int length;
    int capacity;
    Object[] data;
    public MyArray(){
        this.length = 0;
        this.capacity = 1;
        this.data = new Object[capacity];
    }

    public Object get(int index){
        return this.data[index];
    }

    public int push(Object obj){
        if(this.length == this.capacity){
            this.capacity *=2;
            data = Arrays.copyOf(data, this.capacity);

        }
        data[length] = obj;
        length++;
        return length;

    }

    public Object pop(){
        if(this.length == 0){
            return null;
        }
        Object lastItem = this.data[this.length - 1];
        this.data[this.length - 1] = null;
        this.length--;
        return lastItem;
    }

    public Object delete(int index){
        if(index > this.length){
            return null;
        }
        if(index == this.length){
            return this.pop();
        }
        Object deleteItem = this.data[index];
        for(int i = index; i < this.length-1; i++){
            this.data[i] = this.data[i+1];

        }
        pop();
        return deleteItem;
    }
}

