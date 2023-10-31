package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.w */
/* loaded from: classes3.dex */
public final class C8185w extends AbstractC8308y<C8185w, C8186a> implements InterfaceC8295s0 {
    private static final C8185w DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC8317z0<C8185w> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private C8187x params_;
    private int version_;

    /* renamed from: com.google.crypto.tink.proto.w$a */
    /* loaded from: classes3.dex */
    public static final class C8186a extends AbstractC8308y.AbstractC8309a<C8185w, C8186a> implements InterfaceC8295s0 {
        public C8186a() {
            super(C8185w.DEFAULT_INSTANCE);
        }
    }

    static {
        C8185w c8185w = new C8185w();
        DEFAULT_INSTANCE = c8185w;
        AbstractC8308y.m3465r(C8185w.class, c8185w);
    }

    /* renamed from: t */
    public static C8185w m3954t() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: w */
    public static C8185w m3951w(AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        return (C8185w) AbstractC8308y.m3468o(DEFAULT_INSTANCE, abstractC8228i, c8277q);
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new C8185w();
            case 4:
                return new C8186a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8185w> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8185w.class) {
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
    public final int m3953u() {
        return this.keySize_;
    }

    /* renamed from: v */
    public final C8187x m3952v() {
        C8187x c8187x = this.params_;
        return c8187x == null ? C8187x.m3949t() : c8187x;
    }
}
