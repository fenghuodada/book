package com.ambrose.overwall.fragment;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.C6747e;
import com.google.android.exoplayer2.mediacodec.C7024n;
import com.google.android.exoplayer2.mediacodec.C7032u;
import com.google.android.exoplayer2.util.C7417m;
import java.util.regex.Pattern;

/* renamed from: com.ambrose.overwall.fragment.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C2402a implements C7032u.InterfaceC7038f, C7417m.InterfaceC7418a {
    public /* synthetic */ C2402a() {
    }

    public /* synthetic */ C2402a(AnalyticsListener.C6634a c6634a, C6747e c6747e) {
    }

    @Override // com.google.android.exoplayer2.mediacodec.C7032u.InterfaceC7038f
    /* renamed from: a */
    public int mo5556a(Object obj) {
        Pattern pattern = C7032u.f12477a;
        return ((C7024n) obj).f12389a.startsWith("OMX.google") ? 1 : 0;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        analyticsListener.m6152q();
        analyticsListener.m6162l();
    }
}
