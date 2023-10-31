package com.google.android.exoplayer2.text;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.AbstractC6749g;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.h */
/* loaded from: classes.dex */
public abstract class AbstractC7238h extends AbstractC6749g implements InterfaceC7209c {
    @Nullable

    /* renamed from: c */
    public InterfaceC7209c f13153c;

    /* renamed from: d */
    public long f13154d;

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: a */
    public final int mo5283a(long j) {
        InterfaceC7209c interfaceC7209c = this.f13153c;
        interfaceC7209c.getClass();
        return interfaceC7209c.mo5283a(j - this.f13154d);
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: b */
    public final long mo5282b(int i) {
        InterfaceC7209c interfaceC7209c = this.f13153c;
        interfaceC7209c.getClass();
        return interfaceC7209c.mo5282b(i) + this.f13154d;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: c */
    public final List<Cue> mo5281c(long j) {
        InterfaceC7209c interfaceC7209c = this.f13153c;
        interfaceC7209c.getClass();
        return interfaceC7209c.mo5281c(j - this.f13154d);
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7209c
    /* renamed from: d */
    public final int mo5280d() {
        InterfaceC7209c interfaceC7209c = this.f13153c;
        interfaceC7209c.getClass();
        return interfaceC7209c.mo5280d();
    }

    /* renamed from: i */
    public final void m5337i(long j, InterfaceC7209c interfaceC7209c, long j2) {
        this.f10929b = j;
        this.f13153c = interfaceC7209c;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f13154d = j;
    }
}
