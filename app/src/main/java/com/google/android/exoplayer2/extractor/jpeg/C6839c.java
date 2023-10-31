package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.InterfaceC6832h;
import com.google.android.exoplayer2.util.C7394a;

/* renamed from: com.google.android.exoplayer2.extractor.jpeg.c */
/* loaded from: classes.dex */
public final class C6839c implements InterfaceC6832h {

    /* renamed from: a */
    public final InterfaceC6832h f11197a;

    /* renamed from: b */
    public final long f11198b;

    public C6839c(C6820e c6820e, long j) {
        boolean z;
        this.f11197a = c6820e;
        if (c6820e.f11126d >= j) {
            z = true;
        } else {
            z = false;
        }
        C7394a.m5134a(z);
        this.f11198b = j;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    /* renamed from: a */
    public final boolean mo5930a(byte[] bArr, int i, int i2, boolean z) {
        return this.f11197a.mo5930a(bArr, i, i2, z);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    /* renamed from: b */
    public final void mo5929b(int i, byte[] bArr, int i2) {
        this.f11197a.mo5929b(i, bArr, i2);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    /* renamed from: d */
    public final boolean mo5928d(byte[] bArr, int i, int i2, boolean z) {
        return this.f11197a.mo5928d(bArr, i, i2, z);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    /* renamed from: e */
    public final long mo5927e() {
        return this.f11197a.mo5927e() - this.f11198b;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    /* renamed from: f */
    public final void mo5926f(int i) {
        this.f11197a.mo5926f(i);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    public final long getLength() {
        return this.f11197a.getLength() - this.f11198b;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    public final long getPosition() {
        return this.f11197a.getPosition() - this.f11198b;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    /* renamed from: i */
    public final void mo5925i() {
        this.f11197a.mo5925i();
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    /* renamed from: j */
    public final void mo5924j(int i) {
        this.f11197a.mo5924j(i);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h, com.google.android.exoplayer2.upstream.InterfaceC7361g
    public final int read(byte[] bArr, int i, int i2) {
        return this.f11197a.read(bArr, i, i2);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    public final void readFully(byte[] bArr, int i, int i2) {
        this.f11197a.readFully(bArr, i, i2);
    }
}
