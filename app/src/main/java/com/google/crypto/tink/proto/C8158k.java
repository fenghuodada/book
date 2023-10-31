package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.k */
/* loaded from: classes3.dex */
public final class C8158k extends AbstractC8308y<C8158k, C8159a> implements InterfaceC8295s0 {
    private static final C8158k DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile InterfaceC8317z0<C8158k> PARSER;
    private int ivSize_;

    /* renamed from: com.google.crypto.tink.proto.k$a */
    /* loaded from: classes3.dex */
    public static final class C8159a extends AbstractC8308y.AbstractC8309a<C8158k, C8159a> implements InterfaceC8295s0 {
        public C8159a() {
            super(C8158k.DEFAULT_INSTANCE);
        }
    }

    static {
        C8158k c8158k = new C8158k();
        DEFAULT_INSTANCE = c8158k;
        AbstractC8308y.m3465r(C8158k.class, c8158k);
    }

    /* renamed from: t */
    public static C8158k m4026t() {
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
                return new C8158k();
            case 4:
                return new C8159a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8158k> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8158k.class) {
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
    public final int m4025u() {
        return this.ivSize_;
    }
}
