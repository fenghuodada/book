package com.vungle.warren.model.token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.vungle.warren.model.token.c */
/* loaded from: classes3.dex */
public final class C9885c {
    @SerializedName("battery_saver_enabled")
    @Expose

    /* renamed from: a */
    private Boolean f19855a;
    @SerializedName("language")
    @Expose

    /* renamed from: b */
    private String f19856b;
    @SerializedName("time_zone")
    @Expose

    /* renamed from: c */
    private String f19857c;
    @SerializedName("volume_level")
    @Expose

    /* renamed from: d */
    private Double f19858d;
    @SerializedName("extension")
    @Expose

    /* renamed from: e */
    private C9886d f19859e;

    public C9885c(Boolean bool, String str, String str2, Double d, C9886d c9886d) {
        this.f19855a = bool;
        this.f19856b = str;
        this.f19857c = str2;
        this.f19858d = d;
        this.f19859e = c9886d;
    }
}
