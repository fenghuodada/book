package com.google.android.exoplayer2.analytics;

import android.media.UnsupportedSchemeException;
import android.util.Log;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.drm.C6798s;
import com.google.android.exoplayer2.drm.C6803x;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.util.C7417m;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.analytics.o */
/* loaded from: classes.dex */
public final /* synthetic */ class C6654o implements C7417m.InterfaceC7418a, ExoMediaDrm.InterfaceC6762b {
    public /* synthetic */ C6654o() {
    }

    public /* synthetic */ C6654o(int i, Player.C6629e c6629e, Player.C6629e c6629e2, AnalyticsListener.C6634a c6634a) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.InterfaceC6762b
    /* renamed from: a */
    public ExoMediaDrm mo6005a(UUID uuid) {
        try {
            try {
                return new C6803x(uuid);
            } catch (UnsupportedSchemeException e) {
                throw new UnsupportedDrmException(e);
            } catch (Exception e2) {
                throw new UnsupportedDrmException(e2);
            }
        } catch (UnsupportedDrmException unused) {
            String valueOf = String.valueOf(uuid);
            StringBuilder sb = new StringBuilder(valueOf.length() + 53);
            sb.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            sb.append(valueOf);
            sb.append(".");
            Log.e("FrameworkMediaDrm", sb.toString());
            return new C6798s();
        }
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        analyticsListener.m6187W();
        analyticsListener.m6169h0();
    }
}
