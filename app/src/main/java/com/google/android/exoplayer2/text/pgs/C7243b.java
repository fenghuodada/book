package com.google.android.exoplayer2.text.pgs;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.InterfaceC7209c;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.pgs.b */
/* loaded from: classes.dex */
public final class C7243b implements InterfaceC7209c {

    /* renamed from: a */
    public final List<Cue> f13183a;

    public C7243b(List<Cue> list) {
        this.f13183a = list;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: a */
    public final int mo5283a(long j) {
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: b */
    public final long mo5282b(int i) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: c */
    public final List<Cue> mo5281c(long j) {
        return this.f13183a;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: d */
    public final int mo5280d() {
        return 1;
    }
}
