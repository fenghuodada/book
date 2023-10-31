package com.iab.omid.library.vungle.p051a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import androidx.appcompat.resources.C0176c;
import com.iab.omid.library.vungle.adsession.C8830i;
import com.iab.omid.library.vungle.p052b.C8832a;
import com.iab.omid.library.vungle.p052b.C8838f;
import com.iab.omid.library.vungle.p052b.C8839g;
import java.util.Collections;

/* renamed from: com.iab.omid.library.vungle.a.c */
/* loaded from: classes3.dex */
public final class C8820c extends ContentObserver {

    /* renamed from: a */
    public final Context f16788a;

    /* renamed from: b */
    public final AudioManager f16789b;

    /* renamed from: c */
    public final C0176c f16790c;

    /* renamed from: d */
    public final InterfaceC8819b f16791d;

    /* renamed from: e */
    public float f16792e;

    public C8820c(Handler handler, Context context, C0176c c0176c, C8839g c8839g) {
        super(handler);
        this.f16788a = context;
        this.f16789b = (AudioManager) context.getSystemService("audio");
        this.f16790c = c0176c;
        this.f16791d = c8839g;
    }

    /* renamed from: a */
    public final float m2944a() {
        AudioManager audioManager = this.f16789b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        this.f16790c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = streamVolume / streamMaxVolume;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: b */
    public final void m2943b() {
        float f = this.f16792e;
        C8839g c8839g = (C8839g) this.f16791d;
        c8839g.f16841a = f;
        if (c8839g.f16845e == null) {
            c8839g.f16845e = C8832a.f16829c;
        }
        for (C8830i c8830i : Collections.unmodifiableCollection(c8839g.f16845e.f16831b)) {
            C8838f.m2937a(c8830i.f16824d.m2927e(), "setDeviceVolume", Float.valueOf(f));
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        boolean z2;
        super.onChange(z);
        float m2944a = m2944a();
        if (m2944a != this.f16792e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f16792e = m2944a;
            m2943b();
        }
    }
}
