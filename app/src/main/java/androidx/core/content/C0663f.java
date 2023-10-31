package androidx.core.content;

import com.google.android.exoplayer2.C6633a1;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: androidx.core.content.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0663f implements C7417m.InterfaceC7418a {
    public /* synthetic */ C0663f(AnalyticsListener.C6634a c6634a, C6633a1 c6633a1) {
    }

    /* renamed from: a */
    public static String m12005a(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6198L();
    }
}
