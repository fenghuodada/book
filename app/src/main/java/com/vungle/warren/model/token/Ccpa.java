package com.vungle.warren.model.token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public final class Ccpa {
    @SerializedName("status")
    @Expose

    /* renamed from: a */
    private String f19846a;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Status {
    }

    public Ccpa(String str) {
        this.f19846a = str;
    }
}
