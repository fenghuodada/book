package com.vungle.warren;

import androidx.annotation.RestrictTo;
import com.google.gson.annotations.SerializedName;
import com.vungle.warren.AdConfig;

/* renamed from: com.vungle.warren.o */
/* loaded from: classes3.dex */
public class C9903o {
    @SerializedName("settings")

    /* renamed from: a */
    protected int f19889a;
    @SerializedName("adSize")

    /* renamed from: b */
    private AdConfig.AdSize f19890b;

    /* renamed from: c */
    public boolean f19891c;

    public C9903o() {
    }

    public C9903o(C9903o c9903o) {
        this.f19890b = c9903o.m1425a();
        this.f19889a = c9903o.f19889a;
    }

    /* renamed from: a */
    public final AdConfig.AdSize m1425a() {
        AdConfig.AdSize adSize = this.f19890b;
        return adSize == null ? AdConfig.AdSize.VUNGLE_DEFAULT : adSize;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: b */
    public final int m1424b() {
        return this.f19889a;
    }

    /* renamed from: c */
    public final void m1423c(AdConfig.AdSize adSize) {
        this.f19890b = adSize;
    }

    /* renamed from: d */
    public final void m1422d(boolean z) {
        this.f19889a = z ? this.f19889a | 1 : this.f19889a & (-2);
        this.f19891c = true;
    }
}
