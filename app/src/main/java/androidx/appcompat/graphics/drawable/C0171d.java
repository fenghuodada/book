package androidx.appcompat.graphics.drawable;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: androidx.appcompat.graphics.drawable.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0171d implements C7417m.InterfaceC7418a {
    public /* synthetic */ C0171d(int i, long j, AnalyticsListener.C6634a c6634a) {
    }

    /* renamed from: a */
    public static float m12907a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6166j();
    }
}
