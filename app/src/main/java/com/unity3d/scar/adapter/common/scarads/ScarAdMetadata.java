package com.unity3d.scar.adapter.common.scarads;

/* loaded from: classes3.dex */
public class ScarAdMetadata {

    /* renamed from: a */
    public final String f18014a;

    /* renamed from: b */
    public final String f18015b;

    /* renamed from: c */
    public final String f18016c;

    /* renamed from: d */
    public final String f18017d;

    /* renamed from: e */
    public final Integer f18018e;

    public ScarAdMetadata(String str, String str2) {
        this(str, str2, null, null, null);
    }

    public ScarAdMetadata(String str, String str2, String str3, String str4, Integer num) {
        this.f18014a = str;
        this.f18015b = str2;
        this.f18016c = str3;
        this.f18017d = str4;
        this.f18018e = num;
    }

    public String getAdString() {
        return this.f18017d;
    }

    public String getAdUnitId() {
        return this.f18016c;
    }

    public String getPlacementId() {
        return this.f18014a;
    }

    public String getQueryId() {
        return this.f18015b;
    }

    public Integer getVideoLengthMs() {
        return this.f18018e;
    }
}
