package androidx.datastore.preferences.protobuf;

import com.adcolony.sdk.C2201m0;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: androidx.datastore.preferences.protobuf.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C1169e implements C7417m.InterfaceC7418a {
    public /* synthetic */ C1169e(AnalyticsListener.C6634a c6634a, boolean z) {
    }

    /* renamed from: a */
    public static int m11131a(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    /* renamed from: b */
    public static StringBuilder m11130b(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    /* renamed from: c */
    public static void m11129c(String str, int i, int i2, boolean z) {
        C2201m0.m9588d().m9689n().m9706d(str, i, i2, z);
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6203G();
    }
}
