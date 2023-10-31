package com.google.android.exoplayer2;

import com.google.android.exoplayer2.upstream.C7367l;
import com.google.android.exoplayer2.util.C7394a;

/* renamed from: com.google.android.exoplayer2.l */
/* loaded from: classes.dex */
public final class C6998l {

    /* renamed from: a */
    public final C7367l f12253a;

    /* renamed from: b */
    public final long f12254b;

    /* renamed from: c */
    public final long f12255c;

    /* renamed from: d */
    public final long f12256d;

    /* renamed from: e */
    public final long f12257e;

    /* renamed from: f */
    public final int f12258f;

    /* renamed from: g */
    public final long f12259g;

    /* renamed from: h */
    public int f12260h;

    /* renamed from: i */
    public boolean f12261i;

    public C6998l() {
        C7367l c7367l = new C7367l();
        m5618a(2500, 0, "bufferForPlaybackMs", "0");
        m5618a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m5618a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m5618a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m5618a(50000, 50000, "maxBufferMs", "minBufferMs");
        m5618a(0, 0, "backBufferDurationMs", "0");
        this.f12253a = c7367l;
        long j = 50000;
        this.f12254b = C6622C.m6217b(j);
        this.f12255c = C6622C.m6217b(j);
        this.f12256d = C6622C.m6217b(2500);
        this.f12257e = C6622C.m6217b(5000);
        this.f12258f = -1;
        this.f12260h = 13107200;
        this.f12259g = C6622C.m6217b(0);
    }

    /* renamed from: a */
    public static void m5618a(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 21);
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        C7394a.m5133b(z, sb.toString());
    }

    /* renamed from: b */
    public final void m5617b(boolean z) {
        int i = this.f12258f;
        if (i == -1) {
            i = 13107200;
        }
        this.f12260h = i;
        this.f12261i = false;
        if (z) {
            C7367l c7367l = this.f12253a;
            synchronized (c7367l) {
                if (c7367l.f13777a) {
                    c7367l.m5170b(0);
                }
            }
        }
    }
}
