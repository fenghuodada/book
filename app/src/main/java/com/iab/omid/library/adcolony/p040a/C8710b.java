package com.iab.omid.library.adcolony.p040a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import androidx.fragment.C1435b;
import com.iab.omid.library.adcolony.adsession.C8722l;
import com.iab.omid.library.adcolony.p041b.C8728a;
import com.iab.omid.library.adcolony.p041b.C8734f;
import com.iab.omid.library.adcolony.p041b.C8735g;
import java.util.Collections;

/* renamed from: com.iab.omid.library.adcolony.a.b */
/* loaded from: classes3.dex */
public final class C8710b extends ContentObserver {

    /* renamed from: a */
    public final Context f16523a;

    /* renamed from: b */
    public final AudioManager f16524b;

    /* renamed from: c */
    public final C1435b f16525c;

    /* renamed from: d */
    public final InterfaceC8709a f16526d;

    /* renamed from: e */
    public float f16527e;

    public C8710b(Handler handler, Context context, C1435b c1435b, C8735g c8735g) {
        super(handler);
        this.f16523a = context;
        this.f16524b = (AudioManager) context.getSystemService("audio");
        this.f16525c = c1435b;
        this.f16526d = c8735g;
    }

    /* renamed from: a */
    public final float m3197a() {
        AudioManager audioManager = this.f16524b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        this.f16525c.getClass();
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
    public final void m3196b() {
        float f = this.f16527e;
        C8735g c8735g = (C8735g) this.f16526d;
        c8735g.f16607a = f;
        if (c8735g.f16611e == null) {
            c8735g.f16611e = C8728a.f16591c;
        }
        for (C8722l c8722l : Collections.unmodifiableCollection(c8735g.f16611e.f16593b)) {
            C8734f.m3182a(c8722l.f16573e.m3169f(), "setDeviceVolume", Float.valueOf(f));
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        boolean z2;
        super.onChange(z);
        float m3197a = m3197a();
        if (m3197a != this.f16527e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f16527e = m3197a;
            m3196b();
        }
    }
}
