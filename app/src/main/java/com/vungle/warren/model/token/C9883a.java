package com.vungle.warren.model.token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.vungle.warren.model.token.a */
/* loaded from: classes3.dex */
public final class C9883a {
    @SerializedName("ccpa")
    @Expose

    /* renamed from: a */
    private Ccpa f19851a;
    @SerializedName("gdpr")
    @Expose

    /* renamed from: b */
    private Gdpr f19852b;
    @SerializedName("coppa")
    @Expose

    /* renamed from: c */
    private C9884b f19853c;

    public C9883a(Ccpa ccpa, Gdpr gdpr, C9884b c9884b) {
        this.f19851a = ccpa;
        this.f19852b = gdpr;
        this.f19853c = c9884b;
    }
}
