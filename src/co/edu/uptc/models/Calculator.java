package co.edu.uptc.models;

import java.util.List;

public class Calculator <T>{

    private List<T> list = null;
    private int result = 0;

    public Calculator(List<T> list){
        this.list = list;
    }

    public void sumData(){

        for (int i = 0; i < list.size(); i++) {
            result += (int)list.get(i);
        }

    }

    public int getResult() {
        return result;
    }
    
}
