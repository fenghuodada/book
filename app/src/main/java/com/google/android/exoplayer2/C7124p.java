package com.google.android.exoplayer2;

import android.util.Log;
import android.view.Display;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.C7417m;
import com.google.android.exoplayer2.video.C7459k;

/* renamed from: com.google.android.exoplayer2.p */
/* loaded from: classes.dex */
public final /* synthetic */ class C7124p implements C7417m.InterfaceC7418a, C7459k.InterfaceC7460a.InterfaceC7461a {

    /* renamed from: b */
    public final /* synthetic */ Object f12637b;

    /* renamed from: a */
    public final void m5502a(Display display) {
        long j;
        C7459k c7459k = (C7459k) this.f12637b;
        c7459k.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            c7459k.f14090j = refreshRate;
            j = (refreshRate * 80) / 100;
        } else {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
            c7459k.f14090j = -9223372036854775807L;
        }
        c7459k.f14091k = j;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public final void invoke(Object obj) {
        ((Player.InterfaceC6626b) obj).onStaticMetadataChanged(((C7508z0) this.f12637b).f14265j);
    }
}
