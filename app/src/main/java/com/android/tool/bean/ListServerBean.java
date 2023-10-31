package com.android.tool.bean;

import java.util.List;

/* loaded from: classes.dex */
public class ListServerBean {
    private int code;
    private String error;
    private List<ResultsBean> results;

    public int getCode() {
        return this.code;
    }

    public String getError() {
        return this.error;
    }

    public List<ResultsBean> getResults() {
        return this.results;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setResults(List<ResultsBean> list) {
        this.results = list;
    }
}
