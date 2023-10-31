package com.vungle.warren.model.token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: com.vungle.warren.model.token.e */
/* loaded from: classes3.dex */
public final class C9887e {
    @SerializedName("config_extension")
    @Expose

    /* renamed from: a */
    private String f19863a;
    @SerializedName("ordinal_view")
    @Expose

    /* renamed from: b */
    private Integer f19864b;
    @SerializedName("precached_tokens")
    @Expose

    /* renamed from: c */
    private List<String> f19865c;
    @SerializedName("sdk_user_agent")
    @Expose

    /* renamed from: d */
    private String f19866d;

    public C9887e(String str, Integer num, List<String> list, String str2) {
        this.f19863a = str;
        this.f19864b = num;
        this.f19865c = list;
        this.f19866d = str2;
    }
}
