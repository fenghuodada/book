package com.vungle.warren.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.vungle.warren.model.token.C9883a;
import com.vungle.warren.model.token.C9885c;
import com.vungle.warren.model.token.C9887e;

/* renamed from: com.vungle.warren.model.e */
/* loaded from: classes3.dex */
public final class C9865e {
    @SerializedName("device")
    @Expose

    /* renamed from: a */
    private C9885c f19820a;
    @SerializedName("request")
    @Expose

    /* renamed from: b */
    private C9887e f19821b;
    @SerializedName("consent")
    @Expose

    /* renamed from: c */
    private C9883a f19822c;

    public C9865e(C9885c c9885c, C9887e c9887e, C9883a c9883a) {
        this.f19820a = c9885c;
        this.f19821b = c9887e;
        this.f19822c = c9883a;
    }
}
