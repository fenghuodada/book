package com.applovin.impl.sdk.p029ad;

import android.net.Uri;
import com.applovin.impl.adview.AbstractC2774i;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p028a.C3048c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.a */
/* loaded from: classes.dex */
public final class C3075a extends AbstractC3080e {

    /* renamed from: a */
    private final String f7642a;

    /* renamed from: b */
    private final String f7643b;

    /* renamed from: c */
    private final String f7644c;

    /* renamed from: d */
    private final C3048c f7645d;

    public C3075a(JSONObject jSONObject, JSONObject jSONObject2, EnumC3076b enumC3076b, C3214m c3214m) {
        super(jSONObject, jSONObject2, enumC3076b, c3214m);
        this.f7642a = m8006b();
        this.f7643b = m8002i();
        this.f7644c = m8007aM();
        this.f7645d = new C3048c(this);
    }

    /* renamed from: aM */
    private String m8007aM() {
        return getStringFromAdObject("stream_url", "");
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e
    /* renamed from: a */
    public void mo7948a() {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.f7642a);
            JsonUtils.putString(this.adObject, "stream_url", this.f7644c);
        }
    }

    /* renamed from: a */
    public void m8009a(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    /* renamed from: a */
    public void m8008a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    /* renamed from: b */
    public String m8006b() {
        String string;
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, "html", "");
        }
        return string;
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e
    /* renamed from: c */
    public C3048c mo7884o() {
        return this.f7645d;
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e
    /* renamed from: d */
    public String mo7894d() {
        return this.f7643b;
    }

    /* renamed from: e */
    public String m8004e() {
        return this.f7644c;
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e
    /* renamed from: f */
    public boolean mo7890f() {
        return this.adObject.has("stream_url");
    }

    /* renamed from: g */
    public void m8003g() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject deepCopy;
        synchronized (this.fullResponseLock) {
            deepCopy = JsonUtils.deepCopy(this.fullResponse);
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(deepCopy, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject, "html", this.f7642a);
            JsonUtils.putString(jSONObject, "video", this.f7643b);
            JsonUtils.putString(jSONObject, "stream_url", this.f7644c);
        }
        return deepCopy;
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e
    /* renamed from: h */
    public Uri mo7887h() {
        String m8007aM = m8007aM();
        if (StringUtils.isValidString(m8007aM)) {
            return Uri.parse(m8007aM);
        }
        String m8002i = m8002i();
        if (StringUtils.isValidString(m8002i)) {
            return Uri.parse(m8002i);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return mo7887h() != null;
    }

    /* renamed from: i */
    public String m8002i() {
        return getStringFromAdObject("video", "");
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e, com.applovin.impl.sdk.p028a.InterfaceC3039a
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e
    /* renamed from: j */
    public Uri mo7886j() {
        String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e
    /* renamed from: k */
    public Uri mo7885k() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : mo7886j();
    }

    /* renamed from: l */
    public float m8001l() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    /* renamed from: m */
    public boolean m8000m() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    /* renamed from: n */
    public AbstractC2774i.EnumC2775a m7999n() {
        return m7947a(getIntFromAdObject("expandable_style", AbstractC2774i.EnumC2775a.INVISIBLE.m8947a()));
    }
}
