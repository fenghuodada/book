package com.google.android.exoplayer2;

import android.net.Uri;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6843k;
import com.google.android.exoplayer2.util.C7417m;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.s */
/* loaded from: classes.dex */
public final /* synthetic */ class C7136s implements C7417m.InterfaceC7418a, InterfaceC6843k {
    @Override // com.google.android.exoplayer2.extractor.InterfaceC6843k
    /* renamed from: a */
    public final Extractor[] mo5492a(Uri uri, Map map) {
        return m5491b();
    }

    /* renamed from: b */
    public final Extractor[] m5491b() {
        return new Extractor[0];
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public final void invoke(Object obj) {
        ((Player.InterfaceC6626b) obj).onPlayerError(new ExoPlaybackException(2, new ExoTimeoutException(1), 1003));
    }
}
