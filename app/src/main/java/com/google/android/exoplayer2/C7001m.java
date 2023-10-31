package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7395a0;
import com.google.android.exoplayer2.util.C7397b0;
import com.google.android.exoplayer2.util.InterfaceC7423p;

/* renamed from: com.google.android.exoplayer2.m */
/* loaded from: classes.dex */
public final class C7001m implements InterfaceC7423p {

    /* renamed from: a */
    public final C7395a0 f12264a;

    /* renamed from: b */
    public final InterfaceC7002a f12265b;
    @Nullable

    /* renamed from: c */
    public Renderer f12266c;
    @Nullable

    /* renamed from: d */
    public InterfaceC7423p f12267d;

    /* renamed from: e */
    public boolean f12268e = true;

    /* renamed from: f */
    public boolean f12269f;

    /* renamed from: com.google.android.exoplayer2.m$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7002a {
    }

    public C7001m(InterfaceC7002a interfaceC7002a, C7397b0 c7397b0) {
        this.f12265b = interfaceC7002a;
        this.f12264a = new C7395a0(c7397b0);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7423p
    /* renamed from: c */
    public final C6633a1 mo5052c() {
        InterfaceC7423p interfaceC7423p = this.f12267d;
        if (interfaceC7423p != null) {
            return interfaceC7423p.mo5052c();
        }
        return this.f12264a.f13882e;
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7423p
    /* renamed from: f */
    public final void mo5051f(C6633a1 c6633a1) {
        InterfaceC7423p interfaceC7423p = this.f12267d;
        if (interfaceC7423p != null) {
            interfaceC7423p.mo5051f(c6633a1);
            c6633a1 = this.f12267d.mo5052c();
        }
        this.f12264a.mo5051f(c6633a1);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7423p
    /* renamed from: k */
    public final long mo5050k() {
        if (this.f12268e) {
            return this.f12264a.mo5050k();
        }
        InterfaceC7423p interfaceC7423p = this.f12267d;
        interfaceC7423p.getClass();
        return interfaceC7423p.mo5050k();
    }
}
