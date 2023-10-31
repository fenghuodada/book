package com.iab.omid.library.adcolony.adsession.media;

import androidx.constraintlayout.motion.widget.C0561g;
import com.iab.omid.library.adcolony.adsession.C8722l;
import com.iab.omid.library.adcolony.p041b.C8734f;
import com.iab.omid.library.adcolony.p041b.C8735g;
import com.iab.omid.library.adcolony.p043d.C8742a;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.adsession.media.b */
/* loaded from: classes3.dex */
public final class C8724b {

    /* renamed from: a */
    public final C8722l f16582a;

    public C8724b(C8722l c8722l) {
        this.f16582a = c8722l;
    }

    /* renamed from: a */
    public final void m3187a() {
        EnumC8723a enumC8723a = EnumC8723a.CLICK;
        C8722l c8722l = this.f16582a;
        C0561g.m12179d(c8722l);
        JSONObject jSONObject = new JSONObject();
        C8742a.m3174c(jSONObject, "interactionType", enumC8723a);
        C8734f.m3182a(c8722l.f16573e.m3169f(), "publishMediaEvent", "adUserInteraction", jSONObject);
    }

    /* renamed from: b */
    public final void m3186b(float f) {
        if (f > 0.0f) {
            C8722l c8722l = this.f16582a;
            C0561g.m12179d(c8722l);
            JSONObject jSONObject = new JSONObject();
            C8742a.m3174c(jSONObject, "duration", Float.valueOf(f));
            C8742a.m3174c(jSONObject, "mediaPlayerVolume", Float.valueOf(1.0f));
            C8742a.m3174c(jSONObject, "deviceVolume", Float.valueOf(C8735g.m3181a().f16607a));
            C8734f.m3182a(c8722l.f16573e.m3169f(), "publishMediaEvent", "start", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media duration");
    }

    /* renamed from: c */
    public final void m3185c(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            C8722l c8722l = this.f16582a;
            C0561g.m12179d(c8722l);
            JSONObject jSONObject = new JSONObject();
            C8742a.m3174c(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
            C8742a.m3174c(jSONObject, "deviceVolume", Float.valueOf(C8735g.m3181a().f16607a));
            C8734f.m3182a(c8722l.f16573e.m3169f(), "publishMediaEvent", "volumeChange", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }
}
