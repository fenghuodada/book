package androidx.fragment.app;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: androidx.fragment.app.t */
/* loaded from: classes.dex */
public final /* synthetic */ class C1431t implements C7417m.InterfaceC7418a {
    public /* synthetic */ C1431t(AnalyticsListener.C6634a c6634a, int i) {
    }

    /* renamed from: a */
    public static String m10577a(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6170h();
    }
}
