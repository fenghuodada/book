package com.google.android.exoplayer2.text.subrip;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.InterfaceC7209c;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.subrip.b */
/* loaded from: classes.dex */
public final class C7253b implements InterfaceC7209c {

    /* renamed from: a */
    public final Cue[] f13227a;

    /* renamed from: b */
    public final long[] f13228b;

    public C7253b(Cue[] cueArr, long[] jArr) {
        this.f13227a = cueArr;
        this.f13228b = jArr;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: a */
    public final int mo5283a(long j) {
        long[] jArr = this.f13228b;
        int m5104b = C7408g0.m5104b(jArr, j, false);
        if (m5104b < jArr.length) {
            return m5104b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: b */
    public final long mo5282b(int i) {
        C7394a.m5134a(i >= 0);
        long[] jArr = this.f13228b;
        C7394a.m5134a(i < jArr.length);
        return jArr[i];
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: c */
    public final List<Cue> mo5281c(long j) {
        Cue cue;
        int m5101e = C7408g0.m5101e(this.f13228b, j, false);
        return (m5101e == -1 || (cue = this.f13227a[m5101e]) == Cue.f12968r) ? Collections.emptyList() : Collections.singletonList(cue);
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: d */
    public final int mo5280d() {
        return this.f13228b.length;
    }
}
