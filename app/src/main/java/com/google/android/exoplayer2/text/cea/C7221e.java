package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.InterfaceC7209c;
import com.google.android.exoplayer2.util.C7394a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.cea.e */
/* loaded from: classes.dex */
public final class C7221e implements InterfaceC7209c {

    /* renamed from: a */
    public final List<Cue> f13098a;

    public C7221e(List<Cue> list) {
        this.f13098a = list;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: a */
    public final int mo5283a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: b */
    public final long mo5282b(int i) {
        C7394a.m5134a(i == 0);
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: c */
    public final List<Cue> mo5281c(long j) {
        return j >= 0 ? this.f13098a : Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: d */
    public final int mo5280d() {
        return 1;
    }
}
