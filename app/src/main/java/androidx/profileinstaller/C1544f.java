package androidx.profileinstaller;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.drm.InterfaceC6792o;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: androidx.profileinstaller.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C1544f implements C7417m.InterfaceC7418a, InterfaceC6792o.InterfaceC6794b {
    public /* synthetic */ C1544f() {
    }

    public /* synthetic */ C1544f(AnalyticsListener.C6634a c6634a, int i, long j, long j2) {
    }

    /* renamed from: a */
    public static /* synthetic */ long m10471a(int i) {
        if (i == 1) {
            return 0L;
        }
        if (i == 2) {
            return 1L;
        }
        if (i == 3) {
            return 2L;
        }
        if (i == 4) {
            return 3L;
        }
        if (i == 5) {
            return 4L;
        }
        throw null;
    }

    /* renamed from: b */
    public static /* synthetic */ String m10470b(int i) {
        return i == 1 ? "INITIALIZE" : i == 2 ? "RESOURCE_CACHE" : i == 3 ? "DATA_CACHE" : i == 4 ? "SOURCE" : i == 5 ? "ENCODE" : i == 6 ? "FINISHED" : "null";
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6159m0();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC6792o.InterfaceC6794b
    public void release() {
    }
}
