package com.google.android.exoplayer2;

import android.net.Uri;
import android.util.Log;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6843k;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.source.C7178k0;
import com.google.android.exoplayer2.trackselection.C7303k;
import com.google.android.exoplayer2.util.C7417m;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C6964f implements C7417m.InterfaceC7418a, InterfaceC6843k, TextInputLayout.InterfaceC7855f {
    public /* synthetic */ C6964f() {
    }

    public /* synthetic */ C6964f(AnalyticsListener.C6634a c6634a, C7178k0 c7178k0, C7303k c7303k) {
    }

    /* renamed from: c */
    public static void m5792c(int i, String str, int i2, String str2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        Log.w(str2, sb.toString());
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6843k
    /* renamed from: a */
    public Extractor[] mo5492a(Uri uri, Map map) {
        return m5793b();
    }

    /* renamed from: b */
    public Extractor[] m5793b() {
        return new Extractor[]{new MatroskaExtractor()};
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6157n0();
    }
}
