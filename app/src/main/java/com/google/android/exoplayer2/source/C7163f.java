package com.google.android.exoplayer2.source;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.C6821f;
import com.google.android.exoplayer2.source.C7147b0;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory;
import com.google.android.exoplayer2.upstream.C7372p;
import com.google.android.exoplayer2.upstream.InterfaceC7363i;

/* renamed from: com.google.android.exoplayer2.source.f */
/* loaded from: classes.dex */
public final class C7163f implements InterfaceC7199w {

    /* renamed from: a */
    public final SparseArray<InterfaceC7199w> f12867a;

    /* renamed from: b */
    public final int[] f12868b;

    public C7163f(Context context, C6821f c6821f) {
        C7372p c7372p = new C7372p(context, null);
        SparseArray<InterfaceC7199w> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (InterfaceC7199w) DashMediaSource$Factory.class.asSubclass(InterfaceC7199w.class).getConstructor(InterfaceC7363i.InterfaceC7364a.class).newInstance(c7372p));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (InterfaceC7199w) SsMediaSource$Factory.class.asSubclass(InterfaceC7199w.class).getConstructor(InterfaceC7363i.InterfaceC7364a.class).newInstance(c7372p));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (InterfaceC7199w) HlsMediaSource$Factory.class.asSubclass(InterfaceC7199w.class).getConstructor(InterfaceC7363i.InterfaceC7364a.class).newInstance(c7372p));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (InterfaceC7199w) RtspMediaSource$Factory.class.asSubclass(InterfaceC7199w.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new C7147b0.C7149b(c7372p, c6821f));
        this.f12867a = sparseArray;
        this.f12868b = new int[sparseArray.size()];
        for (int i = 0; i < this.f12867a.size(); i++) {
            this.f12868b[i] = this.f12867a.keyAt(i);
        }
    }
}
