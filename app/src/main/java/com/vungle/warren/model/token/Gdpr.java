package com.vungle.warren.model.token;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public final class Gdpr {
    @SerializedName("status")
    @Expose

    /* renamed from: a */
    private String f19847a;
    @SerializedName(FirebaseAnalytics.Param.SOURCE)
    @Expose

    /* renamed from: b */
    private String f19848b;
    @SerializedName("message_version")
    @Expose

    /* renamed from: c */
    private String f19849c;
    @SerializedName("timestamp")
    @Expose

    /* renamed from: d */
    private Long f19850d;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Status {
    }

    public Gdpr(String str, String str2, String str3, Long l) {
        this.f19847a = str;
        this.f19848b = str2;
        this.f19849c = str3;
        this.f19850d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Gdpr.class != obj.getClass()) {
            return false;
        }
        Gdpr gdpr = (Gdpr) obj;
        return this.f19847a.equals(gdpr.f19847a) && this.f19848b.equals(gdpr.f19848b) && this.f19849c.equals(gdpr.f19849c) && this.f19850d.equals(gdpr.f19850d);
    }
}
