
package com.example.neven.test1.model.data_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Crimes implements Serializable {

    @SerializedName("Category")
    @Expose
    public String category;
    @SerializedName("arrest_count")
    @Expose
    public String arrestCount;


}
