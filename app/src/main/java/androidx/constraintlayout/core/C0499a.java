package androidx.constraintlayout.core;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* renamed from: androidx.constraintlayout.core.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0499a implements C7417m.InterfaceC7418a, LibraryVersionComponent.VersionExtractor {
    public /* synthetic */ C0499a() {
    }

    public /* synthetic */ C0499a(AnalyticsListener.C6634a c6634a, ExoPlaybackException exoPlaybackException) {
    }

    /* renamed from: a */
    public static RemoteException m12384a(String str, Throwable th) {
        zzbzt.zzh(str, th);
        return new RemoteException();
    }

    /* renamed from: b */
    public static StringBuilder m12383b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        String lambda$getComponents$3;
        lambda$getComponents$3 = FirebaseCommonRegistrar.lambda$getComponents$3((Context) obj);
        return lambda$getComponents$3;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6197M();
    }
}
