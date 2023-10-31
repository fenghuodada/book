package com.iab.omid.library.applovin.p045a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.applovin.a.d */
/* loaded from: classes3.dex */
public final class C8771d extends ContentObserver {

    /* renamed from: a */
    private final Context f16671a;

    /* renamed from: b */
    private final AudioManager f16672b;

    /* renamed from: c */
    private final C8768a f16673c;

    /* renamed from: d */
    private final InterfaceC8770c f16674d;

    /* renamed from: e */
    private float f16675e;

    public C8771d(Handler handler, Context context, C8768a c8768a, InterfaceC8770c interfaceC8770c) {
        super(handler);
        this.f16671a = context;
        this.f16672b = (AudioManager) context.getSystemService("audio");
        this.f16673c = c8768a;
        this.f16674d = interfaceC8770c;
    }

    /* renamed from: a */
    private boolean m3156a(float f) {
        return f != this.f16675e;
    }

    /* renamed from: c */
    private float m3154c() {
        return this.f16673c.m3159a(this.f16672b.getStreamVolume(3), this.f16672b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m3153d() {
        this.f16674d.mo3086a(this.f16675e);
    }

    /* renamed from: a */
    public void m3157a() {
        this.f16675e = m3154c();
        m3153d();
        this.f16671a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void m3155b() {
        this.f16671a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float m3154c = m3154c();
        if (m3156a(m3154c)) {
            this.f16675e = m3154c;
            m3153d();
        }
    }
}
