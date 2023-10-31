package com.android.tool.bean;

/* loaded from: classes.dex */
public class PingBean {

    /* renamed from: ms */
    private Long f6042ms;
    private int position;

    public PingBean(int i, Long l) {
        this.position = i;
        this.f6042ms = l;
    }

    public Long getMs() {
        return this.f6042ms;
    }

    public int getPosition() {
        return this.position;
    }

    public void setMs(Long l) {
        this.f6042ms = l;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public String toString() {
        return "TestBean{position=" + this.position + ", ms='" + this.f6042ms + "'}";
    }
}
