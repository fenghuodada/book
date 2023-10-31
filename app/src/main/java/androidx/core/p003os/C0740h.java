package androidx.core.p003os;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: androidx.core.os.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C0740h implements C7417m.InterfaceC7418a {
    public /* synthetic */ C0740h(AnalyticsListener.C6634a c6634a, int i) {
    }

    /* renamed from: a */
    public static String m11849a(String str, int i, String str2) {
        return str + i + str2;
    }

    /* renamed from: b */
    public static String m11848b(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        analyticsListener.m6172g();
        analyticsListener.m6205E();
    }
}
