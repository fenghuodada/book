package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C6966f1;
import com.google.android.exoplayer2.source.InterfaceC7164f0;
import com.google.android.exoplayer2.trackselection.InterfaceC7296g;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.n */
/* loaded from: classes.dex */
public interface InterfaceC7185n extends InterfaceC7164f0 {

    /* renamed from: com.google.android.exoplayer2.source.n$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7186a extends InterfaceC7164f0.InterfaceC7165a<InterfaceC7185n> {
        /* renamed from: b */
        void mo5395b(InterfaceC7185n interfaceC7185n);
    }

    /* renamed from: c */
    long mo5408c();

    /* renamed from: e */
    void mo5407e() throws IOException;

    /* renamed from: f */
    long mo5406f(long j);

    /* renamed from: g */
    boolean mo5405g(long j);

    /* renamed from: h */
    boolean mo5404h();

    /* renamed from: i */
    long mo5403i(long j, C6966f1 c6966f1);

    /* renamed from: k */
    long mo5402k();

    /* renamed from: l */
    void mo5401l(InterfaceC7186a interfaceC7186a, long j);

    /* renamed from: m */
    long mo5400m(InterfaceC7296g[] interfaceC7296gArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j);

    /* renamed from: n */
    C7178k0 mo5399n();

    /* renamed from: q */
    long mo5398q();

    /* renamed from: r */
    void mo5397r(long j, boolean z);

    /* renamed from: s */
    void mo5396s(long j);
}
