package com.alibaba.otter.canal.protocol;

import com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author machengyuan 2018-9-13 下午10:31:14
 * @version 1.0.0
 */
public class FlatMessageOnlyData implements Serializable {

    private static final long         serialVersionUID = -1L;
    private long                      id;
    private Map<String, Object>       data;

    public FlatMessageOnlyData() {
    }

    public FlatMessageOnlyData(long id){
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FlatMessage [id=" + id + ", data=" + data + "]";
    }
}
