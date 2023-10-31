package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.n0 */
/* loaded from: classes3.dex */
public final class C8262n0 implements InterfaceC8259m0 {
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8259m0
    /* renamed from: a */
    public final C8256l0 mo3644a(Object obj, Object obj2) {
        C8256l0 c8256l0 = (C8256l0) obj;
        C8256l0 c8256l02 = (C8256l0) obj2;
        if (!c8256l02.isEmpty()) {
            if (!c8256l0.f16047a) {
                if (c8256l0.isEmpty()) {
                    c8256l0 = new C8256l0();
                } else {
                    c8256l0 = new C8256l0(c8256l0);
                }
            }
            c8256l0.m3669b();
            if (!c8256l02.isEmpty()) {
                c8256l0.putAll(c8256l02);
            }
        }
        return c8256l0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8259m0
    /* renamed from: b */
    public final Object mo3643b(Object obj) {
        ((C8256l0) obj).f16047a = false;
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8259m0
    /* renamed from: c */
    public final void mo3642c(Object obj) {
        ((C8251k0) obj).getClass();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8259m0
    /* renamed from: d */
    public final C8256l0 mo3641d() {
        C8256l0 c8256l0 = C8256l0.f16046b;
        if (c8256l0.isEmpty()) {
            return new C8256l0();
        }
        return new C8256l0(c8256l0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8259m0
    /* renamed from: e */
    public final C8256l0 mo3640e(Object obj) {
        return (C8256l0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8259m0
    /* renamed from: f */
    public final int mo3639f(int i, Object obj, Object obj2) {
        C8256l0 c8256l0 = (C8256l0) obj;
        C8251k0 c8251k0 = (C8251k0) obj2;
        if (!c8256l0.isEmpty()) {
            Iterator it = c8256l0.entrySet().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            c8251k0.getClass();
            AbstractC8253l.m3699t(i);
            throw null;
        }
        return 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8259m0
    /* renamed from: g */
    public final boolean mo3638g(Object obj) {
        return !((C8256l0) obj).f16047a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8259m0
    /* renamed from: h */
    public final C8256l0 mo3637h(Object obj) {
        return (C8256l0) obj;
    }
}
