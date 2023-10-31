package androidx.concurrent.futures;

import android.content.Context;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.C7174j;
import com.google.android.exoplayer2.source.C7184m;
import com.google.android.exoplayer2.util.C7417m;
import com.google.common.base.InterfaceC7939h;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* renamed from: androidx.concurrent.futures.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0484a implements C7417m.InterfaceC7418a, InterfaceC7939h, LibraryVersionComponent.VersionExtractor {
    public /* synthetic */ C0484a() {
    }

    public /* synthetic */ C0484a(AnalyticsListener.C6634a c6634a, C7174j c7174j, C7184m c7184m) {
    }

    /* renamed from: a */
    public static String m12392a(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.common.base.InterfaceC7939h
    public boolean apply(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        return FirebaseCommonRegistrar.m3409b((Context) obj);
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6149t();
    }
}
