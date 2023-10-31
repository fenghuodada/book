package com.applovin.impl.mediation.debugger.p016a;

import androidx.annotation.Nullable;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.a.b */
/* loaded from: classes.dex */
public class C2903b {

    /* renamed from: a */
    private final String f7045a;
    @Nullable

    /* renamed from: b */
    private DTBAdSize f7046b;

    /* renamed from: com.applovin.impl.mediation.debugger.a.b$a */
    /* loaded from: classes.dex */
    public enum EnumC2904a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    public C2903b(String str, @Nullable JSONObject jSONObject, MaxAdFormat maxAdFormat) {
        this.f7045a = str;
        this.f7046b = m8432a(JsonUtils.getInt(jSONObject, "type", m8431a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    @Nullable
    /* renamed from: a */
    private DTBAdSize m8432a(int i, MaxAdFormat maxAdFormat, String str) {
        try {
            if (EnumC2904a.VIDEO.ordinal() == i) {
                return new DTBAdSize.DTBVideo(320, 480, str);
            }
            if (EnumC2904a.DISPLAY.ordinal() == i) {
                return new DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (EnumC2904a.INTERSTITIAL.ordinal() == i) {
                return new DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private EnumC2904a m8431a(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? EnumC2904a.DISPLAY : EnumC2904a.INTERSTITIAL;
    }

    @Nullable
    /* renamed from: a */
    public DTBAdSize m8433a() {
        return this.f7046b;
    }
}
