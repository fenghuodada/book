package com.vungle.warren.model.token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.vungle.warren.model.token.d */
/* loaded from: classes3.dex */
public final class C9886d {
    @SerializedName("is_sideload_enabled")
    @Expose

    /* renamed from: a */
    private Boolean f19860a;
    @SerializedName("sd_card_available")
    @Expose

    /* renamed from: b */
    private Boolean f19861b;
    @SerializedName("sound_enabled")
    @Expose

    /* renamed from: c */
    private Boolean f19862c;

    public C9886d(Boolean bool, Boolean bool2, Boolean bool3) {
        this.f19860a = bool;
        this.f19861b = bool2;
        this.f19862c = bool3;
    }
}
