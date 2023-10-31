package android.support.p000v4.media.session;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.C7174j;
import com.google.android.exoplayer2.source.C7184m;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: android.support.v4.media.session.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0017a implements C7417m.InterfaceC7418a {
    public /* synthetic */ C0017a(AnalyticsListener.C6634a c6634a, C7174j c7174j, C7184m c7184m) {
    }

    /* renamed from: a */
    public static String m13071a(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6156o();
    }
}
