package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.o */
/* loaded from: classes3.dex */
public final class C8170o extends AbstractC8308y<C8170o, C8171a> implements InterfaceC8295s0 {
    private static final C8170o DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile InterfaceC8317z0<C8170o> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int keySize_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.o$a */
    /* loaded from: classes3.dex */
    public static final class C8171a extends AbstractC8308y.AbstractC8309a<C8170o, C8171a> implements InterfaceC8295s0 {
        public C8171a() {
            super(C8170o.DEFAULT_INSTANCE);
        }
    }

    static {
        C8170o c8170o = new C8170o();
        DEFAULT_INSTANCE = c8170o;
        AbstractC8308y.m3465r(C8170o.class, c8170o);
    }

    /* renamed from: u */
    public static C8170o m3994u(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8170o) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
            case 3:
                return new C8170o();
            case 4:
                return new C8171a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8170o> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8170o.class) {
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

    /* renamed from: t */
    public final int m3995t() {
        return this.keySize_;
    }
}
