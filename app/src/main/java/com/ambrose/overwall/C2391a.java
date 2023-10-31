package com.ambrose.overwall;

import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;
import io.reactivex.rxjava3.functions.InterfaceC10174b;

/* renamed from: com.ambrose.overwall.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C2391a implements InterfaceC10174b, C7417m.InterfaceC7418a {
    public /* synthetic */ C2391a() {
    }

    public /* synthetic */ C2391a(AnalyticsListener.C6634a c6634a, MediaMetadata mediaMetadata) {
    }

    @Override // io.reactivex.rxjava3.functions.InterfaceC10174b
    public void accept(Object obj) {
        MyApplication myApplication = MyApplication.f5741c;
        ((Throwable) obj).printStackTrace();
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6153p0();
    }
}
