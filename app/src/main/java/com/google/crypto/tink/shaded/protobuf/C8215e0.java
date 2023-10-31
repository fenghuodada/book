package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.e0 */
/* loaded from: classes3.dex */
public class C8215e0 {

    /* renamed from: a */
    public volatile InterfaceC8287r0 f15983a;

    /* renamed from: b */
    public volatile AbstractC8228i f15984b;

    static {
        C8277q.m3569a();
    }

    /* renamed from: a */
    public final InterfaceC8287r0 m3878a(InterfaceC8287r0 interfaceC8287r0) {
        if (this.f15983a == null) {
            synchronized (this) {
                if (this.f15983a == null) {
                    try {
                        this.f15983a = interfaceC8287r0;
                        this.f15984b = AbstractC8228i.f15998b;
                    } catch (C8202b0 unused) {
                        this.f15983a = interfaceC8287r0;
                        this.f15984b = AbstractC8228i.f15998b;
                    }
                }
            }
        }
        return this.f15983a;
    }

    /* renamed from: b */
    public final AbstractC8228i m3877b() {
        if (this.f15984b != null) {
            return this.f15984b;
        }
        synchronized (this) {
            if (this.f15984b != null) {
                return this.f15984b;
            }
            this.f15984b = this.f15983a == null ? AbstractC8228i.f15998b : this.f15983a.mo3557b();
            return this.f15984b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8215e0) {
            C8215e0 c8215e0 = (C8215e0) obj;
            InterfaceC8287r0 interfaceC8287r0 = this.f15983a;
            InterfaceC8287r0 interfaceC8287r02 = c8215e0.f15983a;
            return (interfaceC8287r0 == null && interfaceC8287r02 == null) ? m3877b().equals(c8215e0.m3877b()) : (interfaceC8287r0 == null || interfaceC8287r02 == null) ? interfaceC8287r0 != null ? interfaceC8287r0.equals(c8215e0.m3878a(interfaceC8287r0.mo3464a())) : m3878a(interfaceC8287r02.mo3464a()).equals(interfaceC8287r02) : interfaceC8287r0.equals(interfaceC8287r02);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
