package com.applovin.impl.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.p003os.C0740h;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinUserSegment;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.sdk.g */
/* loaded from: classes.dex */
public class C3194g implements AppLovinUserSegment {
    @Nullable

    /* renamed from: a */
    private String f8327a;

    @Override // com.applovin.sdk.AppLovinUserSegment
    @Nullable
    public String getName() {
        return this.f8327a;
    }

    @Override // com.applovin.sdk.AppLovinUserSegment
    public void setName(@Nullable String str) {
        if (C3349v.m6862a() && str != null) {
            if (str.length() > 32) {
                C3349v.m6846i("AppLovinUserSegment", "Setting name greater than 32 characters: ".concat(str));
            }
            if (!StringUtils.isAlphaNumeric(str)) {
                C3349v.m6846i("AppLovinUserSegment", "Setting name that is not alphanumeric: ".concat(str));
            }
        }
        this.f8327a = str;
    }

    @NonNull
    public String toString() {
        return C0740h.m11848b(new StringBuilder("AppLovinUserSegment{name="), getName(), '}');
    }
}
