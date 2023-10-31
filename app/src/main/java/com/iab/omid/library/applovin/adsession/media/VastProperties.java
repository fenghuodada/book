package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.p048d.C8792c;
import com.iab.omid.library.applovin.p048d.C8794e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f16688a;

    /* renamed from: b */
    private final Float f16689b;

    /* renamed from: c */
    private final boolean f16690c;

    /* renamed from: d */
    private final Position f16691d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f16688a = z;
        this.f16689b = f;
        this.f16690c = z2;
        this.f16691d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C8794e.m3038a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C8794e.m3038a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m3132a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f16688a);
            if (this.f16688a) {
                jSONObject.put("skipOffset", this.f16689b);
            }
            jSONObject.put("autoPlay", this.f16690c);
            jSONObject.put("position", this.f16691d);
        } catch (JSONException e) {
            C8792c.m3043a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f16691d;
    }

    public Float getSkipOffset() {
        return this.f16689b;
    }

    public boolean isAutoPlay() {
        return this.f16690c;
    }

    public boolean isSkippable() {
        return this.f16688a;
    }
}
