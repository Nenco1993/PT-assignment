package com.example.neven.test1.base;

import java.io.Serializable;

/**
 * Created by Neven on 5.9.2017..
 */

public class RecyclerItem<T> implements Serializable {
    public int type;
    public T data;

    public RecyclerItem() {

    }

    public RecyclerItem(int type) {
        this.type = type;
    }

    public RecyclerItem(int type, T data) {
        this.type = type;
        this.data = data;
    }


}
