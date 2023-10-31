package androidx.appcompat.widget;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: androidx.appcompat.widget.q1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0406q1 implements C7417m.InterfaceC7418a {
    public /* synthetic */ C0406q1(AnalyticsListener.C6634a c6634a, long j) {
    }

    /* renamed from: a */
    public static int m12537a(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    /* renamed from: b */
    public static StringBuilder m12536b(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6158n();
    }
}
