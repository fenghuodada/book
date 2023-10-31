package com.applovin.impl.adview;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.s */
/* loaded from: classes.dex */
public class C2802s {

    /* renamed from: a */
    private final int f6687a;

    /* renamed from: b */
    private final int f6688b;

    /* renamed from: c */
    private final int f6689c;

    /* renamed from: d */
    private final int f6690d;

    /* renamed from: e */
    private final boolean f6691e;

    /* renamed from: f */
    private final int f6692f;

    /* renamed from: g */
    private final int f6693g;

    /* renamed from: h */
    private final int f6694h;

    /* renamed from: i */
    private final float f6695i;

    /* renamed from: j */
    private final float f6696j;

    public C2802s(JSONObject jSONObject, C3214m c3214m) {
        if (C3349v.m6862a()) {
            C3349v m7487A = c3214m.m7487A();
            m7487A.m6853c("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f6687a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f6688b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f6689c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f6690d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f6691e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f6692f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f6693g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f6694h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f6695i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f6696j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    /* renamed from: a */
    public int m8885a() {
        return this.f6687a;
    }

    /* renamed from: b */
    public int m8884b() {
        return this.f6688b;
    }

    /* renamed from: c */
    public int m8883c() {
        return this.f6689c;
    }

    /* renamed from: d */
    public int m8882d() {
        return this.f6690d;
    }

    /* renamed from: e */
    public boolean m8881e() {
        return this.f6691e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2802s c2802s = (C2802s) obj;
        return this.f6687a == c2802s.f6687a && this.f6688b == c2802s.f6688b && this.f6689c == c2802s.f6689c && this.f6690d == c2802s.f6690d && this.f6691e == c2802s.f6691e && this.f6692f == c2802s.f6692f && this.f6693g == c2802s.f6693g && this.f6694h == c2802s.f6694h && Float.compare(c2802s.f6695i, this.f6695i) == 0 && Float.compare(c2802s.f6696j, this.f6696j) == 0;
    }

    /* renamed from: f */
    public long m8880f() {
        return this.f6692f;
    }

    /* renamed from: g */
    public long m8879g() {
        return this.f6693g;
    }

    /* renamed from: h */
    public long m8878h() {
        return this.f6694h;
    }

    public int hashCode() {
        int i = ((((((((((((((this.f6687a * 31) + this.f6688b) * 31) + this.f6689c) * 31) + this.f6690d) * 31) + (this.f6691e ? 1 : 0)) * 31) + this.f6692f) * 31) + this.f6693g) * 31) + this.f6694h) * 31;
        float f = this.f6695i;
        int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f6696j;
        return floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }

    /* renamed from: i */
    public float m8877i() {
        return this.f6695i;
    }

    /* renamed from: j */
    public float m8876j() {
        return this.f6696j;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f6687a + ", heightPercentOfScreen=" + this.f6688b + ", margin=" + this.f6689c + ", gravity=" + this.f6690d + ", tapToFade=" + this.f6691e + ", tapToFadeDurationMillis=" + this.f6692f + ", fadeInDurationMillis=" + this.f6693g + ", fadeOutDurationMillis=" + this.f6694h + ", fadeInDelay=" + this.f6695i + ", fadeOutDelay=" + this.f6696j + '}';
    }
}
