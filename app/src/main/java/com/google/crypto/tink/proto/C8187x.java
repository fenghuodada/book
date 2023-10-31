package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.x */
/* loaded from: classes3.dex */
public final class C8187x extends AbstractC8308y<C8187x, C8188a> implements InterfaceC8295s0 {
    private static final C8187x DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile InterfaceC8317z0<C8187x> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    /* renamed from: com.google.crypto.tink.proto.x$a */
    /* loaded from: classes3.dex */
    public static final class C8188a extends AbstractC8308y.AbstractC8309a<C8187x, C8188a> implements InterfaceC8295s0 {
        public C8188a() {
            super(C8187x.DEFAULT_INSTANCE);
        }
    }

    static {
        C8187x c8187x = new C8187x();
        DEFAULT_INSTANCE = c8187x;
        AbstractC8308y.m3465r(C8187x.class, c8187x);
    }

    /* renamed from: t */
    public static C8187x m3949t() {
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new C8187x();
            case 4:
                return new C8188a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8187x> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8187x.class) {
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
    public final EnumC8182u m3948u() {
        EnumC8182u m3966a = EnumC8182u.m3966a(this.hash_);
        return m3966a == null ? EnumC8182u.UNRECOGNIZED : m3966a;
    }

    /* renamed from: v */
    public final int m3947v() {
        return this.tagSize_;
    }
}
