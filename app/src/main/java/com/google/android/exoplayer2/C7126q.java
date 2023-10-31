package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: com.google.android.exoplayer2.q */
/* loaded from: classes.dex */
public final /* synthetic */ class C7126q implements C7417m.InterfaceC7418a {

    /* renamed from: b */
    public final /* synthetic */ int f12638b;

    /* renamed from: c */
    public final /* synthetic */ Object f12639c;

    public /* synthetic */ C7126q(Object obj, int i) {
        this.f12638b = i;
        this.f12639c = obj;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public final void invoke(Object obj) {
        switch (this.f12638b) {
            case 0:
                ((Player.InterfaceC6626b) obj).onMediaMetadataChanged((MediaMetadata) this.f12639c);
                return;
            default:
                ((AnalyticsListener) obj).m6163k0();
                return;
        }
    }
}
