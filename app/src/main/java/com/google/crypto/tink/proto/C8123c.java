package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.c */
/* loaded from: classes3.dex */
public final class C8123c extends AbstractC8308y<C8123c, C8124a> implements InterfaceC8295s0 {
    private static final C8123c DEFAULT_INSTANCE;
    private static volatile InterfaceC8317z0<C8123c> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    /* renamed from: com.google.crypto.tink.proto.c$a */
    /* loaded from: classes3.dex */
    public static final class C8124a extends AbstractC8308y.AbstractC8309a<C8123c, C8124a> implements InterfaceC8295s0 {
        public C8124a() {
            super(C8123c.DEFAULT_INSTANCE);
        }
    }

    static {
        C8123c c8123c = new C8123c();
        DEFAULT_INSTANCE = c8123c;
        AbstractC8308y.m3465r(C8123c.class, c8123c);
    }

    /* renamed from: t */
    public static C8123c m4130t() {
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new C8123c();
            case 4:
                return new C8124a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8123c> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8123c.class) {
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
    public final int m4129u() {
        return this.tagSize_;
    }
}
