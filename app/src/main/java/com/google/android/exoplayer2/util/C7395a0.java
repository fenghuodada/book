package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.C6622C;
import com.google.android.exoplayer2.C6633a1;

/* renamed from: com.google.android.exoplayer2.util.a0 */
/* loaded from: classes.dex */
public final class C7395a0 implements InterfaceC7423p {

    /* renamed from: a */
    public final InterfaceC7396b f13878a;

    /* renamed from: b */
    public boolean f13879b;

    /* renamed from: c */
    public long f13880c;

    /* renamed from: d */
    public long f13881d;

    /* renamed from: e */
    public C6633a1 f13882e = C6633a1.f10556d;

    public C7395a0(C7397b0 c7397b0) {
        this.f13878a = c7397b0;
    }

    /* renamed from: a */
    public final void m5128a(long j) {
        this.f13880c = j;
        if (this.f13879b) {
            this.f13881d = this.f13878a.elapsedRealtime();
        }
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7423p
    /* renamed from: c */
    public final C6633a1 mo5052c() {
        return this.f13882e;
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7423p
    /* renamed from: f */
    public final void mo5051f(C6633a1 c6633a1) {
        if (this.f13879b) {
            m5128a(mo5050k());
        }
        this.f13882e = c6633a1;
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7423p
    /* renamed from: k */
    public final long mo5050k() {
        long j;
        long j2 = this.f13880c;
        if (this.f13879b) {
            long elapsedRealtime = this.f13878a.elapsedRealtime() - this.f13881d;
            C6633a1 c6633a1 = this.f13882e;
            if (c6633a1.f10557a == 1.0f) {
                j = C6622C.m6217b(elapsedRealtime);
            } else {
                j = elapsedRealtime * c6633a1.f10559c;
            }
            return j2 + j;
        }
        return j2;
    }
}
