package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.h */
/* loaded from: classes3.dex */
public final class C8147h extends AbstractC8308y<C8147h, C8148a> implements InterfaceC8295s0 {
    private static final C8147h DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile InterfaceC8317z0<C8147h> PARSER;
    private int ivSize_;

    /* renamed from: com.google.crypto.tink.proto.h$a */
    /* loaded from: classes3.dex */
    public static final class C8148a extends AbstractC8308y.AbstractC8309a<C8147h, C8148a> implements InterfaceC8295s0 {
        public C8148a() {
            super(C8147h.DEFAULT_INSTANCE);
        }
    }

    static {
        C8147h c8147h = new C8147h();
        DEFAULT_INSTANCE = c8147h;
        AbstractC8308y.m3465r(C8147h.class, c8147h);
    }

    /* renamed from: t */
    public static C8147h m4049t() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8308y
    /* renamed from: l */
    public final Object mo3471l(AbstractC8308y.EnumC8314f enumC8314f) {
        switch (enumC8314f.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 3:
                return new C8147h();
            case 4:
                return new C8148a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8147h> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8147h.class) {
                        try {
                            interfaceC8317z0 = PARSER;
                            if (interfaceC8317z0 == null) {
                                interfaceC8317z0 = new AbstractC8308y.C8310b<>(DEFAULT_INSTANCE);
                                PARSER = interfaceC8317z0;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC8317z0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: u */
    public final int m4048u() {
        return this.ivSize_;
    }
}
