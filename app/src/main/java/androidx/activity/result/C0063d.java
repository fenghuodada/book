package androidx.activity.result;

import android.content.Context;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.text.span.InterfaceC7245b;
import com.google.android.exoplayer2.util.C7417m;
import com.google.common.base.InterfaceC7939h;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* renamed from: androidx.activity.result.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0063d implements C7417m.InterfaceC7418a, InterfaceC7939h, LibraryVersionComponent.VersionExtractor {
    public /* synthetic */ C0063d() {
    }

    public /* synthetic */ C0063d(AnalyticsListener.C6634a c6634a, int i, long j, long j2) {
    }

    /* renamed from: a */
    public static String m13053a(String str, String str2) {
        return str + str2;
    }

    /* renamed from: b */
    public static StringBuilder m13052b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    @Override // com.google.common.base.InterfaceC7939h
    public boolean apply(Object obj) {
        return !(obj instanceof InterfaceC7245b);
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        String lambda$getComponents$1;
        lambda$getComponents$1 = FirebaseCommonRegistrar.lambda$getComponents$1((Context) obj);
        return lambda$getComponents$1;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6204F();
    }
}
