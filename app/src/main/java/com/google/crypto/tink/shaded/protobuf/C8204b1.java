package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.shaded.protobuf.b1 */
/* loaded from: classes3.dex */
public final class C8204b1 {

    /* renamed from: c */
    public static final C8204b1 f15952c = new C8204b1();

    /* renamed from: b */
    public final ConcurrentHashMap f15954b = new ConcurrentHashMap();

    /* renamed from: a */
    public final C8246j0 f15953a = new C8246j0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.google.crypto.tink.shaded.protobuf.v0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.google.crypto.tink.shaded.protobuf.v0] */
    /* renamed from: a */
    public final <T> InterfaceC8219f1<T> m3924a(Class<T> cls) {
        InterfaceC8305w0 interfaceC8305w0;
        AbstractC8224h0 abstractC8224h0;
        AbstractC8257l1<?, ?> abstractC8257l1;
        AbstractC8286r<?> abstractC8286r;
        InterfaceC8259m0 interfaceC8259m0;
        C8301u0 m3499w;
        C8301u0 c8301u0;
        Class<?> cls2;
        Charset charset = C8196a0.f15949a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f15954b;
            InterfaceC8219f1<T> interfaceC8219f1 = (InterfaceC8219f1) concurrentHashMap.get(cls);
            if (interfaceC8219f1 == null) {
                C8246j0 c8246j0 = this.f15953a;
                c8246j0.getClass();
                Class<?> cls3 = C8222g1.f15988a;
                if (!AbstractC8308y.class.isAssignableFrom(cls) && (cls2 = C8222g1.f15988a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
                InterfaceC8270p0 mo3481a = c8246j0.f16034a.mo3481a(cls);
                if (mo3481a.mo3614a()) {
                    if (AbstractC8308y.class.isAssignableFrom(cls)) {
                        c8301u0 = new C8303v0(C8222g1.f15991d, C8297t.f16092a, mo3481a.mo3613b());
                    } else {
                        AbstractC8257l1<?, ?> abstractC8257l12 = C8222g1.f15989b;
                        AbstractC8286r<?> abstractC8286r2 = C8297t.f16093b;
                        if (abstractC8286r2 != null) {
                            c8301u0 = new C8303v0(abstractC8257l12, abstractC8286r2, mo3481a.mo3613b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    m3499w = c8301u0;
                } else {
                    boolean z = false;
                    if (AbstractC8308y.class.isAssignableFrom(cls)) {
                        if (mo3481a.mo3612c() == 1) {
                            z = true;
                        }
                        if (z) {
                            interfaceC8305w0 = C8315y0.f16140b;
                            abstractC8224h0 = AbstractC8224h0.f15996b;
                            abstractC8257l1 = C8222g1.f15991d;
                            abstractC8286r = C8297t.f16092a;
                        } else {
                            interfaceC8305w0 = C8315y0.f16140b;
                            abstractC8224h0 = AbstractC8224h0.f15996b;
                            abstractC8257l1 = C8222g1.f15991d;
                            abstractC8286r = null;
                        }
                        interfaceC8259m0 = C8265o0.f16058b;
                    } else {
                        if (mo3481a.mo3612c() == 1) {
                            z = true;
                        }
                        if (z) {
                            interfaceC8305w0 = C8315y0.f16139a;
                            abstractC8224h0 = AbstractC8224h0.f15995a;
                            AbstractC8257l1<?, ?> abstractC8257l13 = C8222g1.f15989b;
                            AbstractC8286r<?> abstractC8286r3 = C8297t.f16093b;
                            if (abstractC8286r3 != null) {
                                abstractC8257l1 = abstractC8257l13;
                                abstractC8286r = abstractC8286r3;
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            interfaceC8305w0 = C8315y0.f16139a;
                            abstractC8224h0 = AbstractC8224h0.f15995a;
                            abstractC8257l1 = C8222g1.f15990c;
                            abstractC8286r = null;
                        }
                        interfaceC8259m0 = C8265o0.f16057a;
                    }
                    InterfaceC8305w0 interfaceC8305w02 = interfaceC8305w0;
                    AbstractC8224h0 abstractC8224h02 = abstractC8224h0;
                    AbstractC8257l1<?, ?> abstractC8257l14 = abstractC8257l1;
                    AbstractC8286r<?> abstractC8286r4 = abstractC8286r;
                    InterfaceC8259m0 interfaceC8259m02 = interfaceC8259m0;
                    int[] iArr = C8301u0.f16098r;
                    if (mo3481a instanceof C8212d1) {
                        m3499w = C8301u0.m3499w((C8212d1) mo3481a, interfaceC8305w02, abstractC8224h02, abstractC8257l14, abstractC8286r4, interfaceC8259m02);
                    } else {
                        C8249j1 c8249j1 = (C8249j1) mo3481a;
                        throw null;
                    }
                }
                InterfaceC8219f1<T> interfaceC8219f12 = (InterfaceC8219f1) concurrentHashMap.putIfAbsent(cls, m3499w);
                if (interfaceC8219f12 != null) {
                    return interfaceC8219f12;
                }
                return m3499w;
            }
            return interfaceC8219f1;
        }
        throw new NullPointerException("messageType");
    }
}
