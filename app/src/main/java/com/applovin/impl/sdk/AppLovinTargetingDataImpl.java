package com.applovin.impl.sdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdContentRating;
import com.applovin.sdk.AppLovinGender;
import com.applovin.sdk.AppLovinTargetingData;
import com.google.android.gms.common.Scopes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AppLovinTargetingDataImpl implements AppLovinTargetingData {

    /* renamed from: a */
    private final Map<String, String> f7537a = new HashMap();

    /* renamed from: b */
    private final Object f7538b = new Object();
    @Nullable

    /* renamed from: c */
    private Integer f7539c = null;
    @Nullable

    /* renamed from: d */
    private AppLovinGender f7540d = null;
    @Nullable

    /* renamed from: e */
    private AppLovinAdContentRating f7541e = null;
    @Nullable

    /* renamed from: f */
    private String f7542f = null;
    @Nullable

    /* renamed from: g */
    private String f7543g = null;
    @Nullable

    /* renamed from: h */
    private List<String> f7544h = null;
    @Nullable

    /* renamed from: i */
    private List<String> f7545i = null;

    /* renamed from: a */
    private void m8085a(String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f7538b) {
            if (StringUtils.isValidString(str2)) {
                this.f7537a.put(str, str2);
            } else {
                this.f7537a.remove(str);
            }
        }
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void clearAll() {
        synchronized (this.f7538b) {
            this.f7537a.clear();
        }
    }

    public Map<String, String> getAllData() {
        HashMap hashMap;
        synchronized (this.f7538b) {
            hashMap = new HashMap(this.f7537a);
        }
        return hashMap;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public String getEmail() {
        return this.f7542f;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public AppLovinGender getGender() {
        return this.f7540d;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public List<String> getInterests() {
        return this.f7545i;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public List<String> getKeywords() {
        return this.f7544h;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public AppLovinAdContentRating getMaximumAdContentRating() {
        return this.f7541e;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public String getPhoneNumber() {
        return this.f7543g;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    @Nullable
    public Integer getYearOfBirth() {
        return this.f7539c;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setEmail(@Nullable String str) {
        m8085a(Scopes.EMAIL, str != null ? StringUtils.toFullSHA1Hash(str.toLowerCase().trim()) : str);
        this.f7542f = str;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setGender(@Nullable AppLovinGender appLovinGender) {
        String str;
        if (appLovinGender != null) {
            if (appLovinGender == AppLovinGender.FEMALE) {
                str = "F";
            } else if (appLovinGender == AppLovinGender.MALE) {
                str = "M";
            } else if (appLovinGender == AppLovinGender.OTHER) {
                str = "O";
            }
            m8085a("gender", str);
            this.f7540d = appLovinGender;
        }
        str = null;
        m8085a("gender", str);
        this.f7540d = appLovinGender;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setInterests(@Nullable List<String> list) {
        m8085a("interests", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f7545i = list;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setKeywords(@Nullable List<String> list) {
        m8085a("keywords", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f7544h = list;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setMaximumAdContentRating(@Nullable AppLovinAdContentRating appLovinAdContentRating) {
        m8085a("maximum_ad_content_rating", (appLovinAdContentRating == null || appLovinAdContentRating == AppLovinAdContentRating.NONE) ? null : Integer.toString(appLovinAdContentRating.ordinal()));
        this.f7541e = appLovinAdContentRating;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setPhoneNumber(@Nullable String str) {
        m8085a("phone_number", str != null ? StringUtils.toFullSHA1Hash(str.replaceAll("[^0-9]", "")) : str);
        this.f7543g = str;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setYearOfBirth(@Nullable Integer num) {
        m8085a("year_of_birth", num == null ? null : Integer.toString(num.intValue()));
        this.f7539c = num;
    }
}
