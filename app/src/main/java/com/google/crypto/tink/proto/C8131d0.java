package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8196a0;
import com.google.crypto.tink.shaded.protobuf.C8207c1;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.d0 */
/* loaded from: classes3.dex */
public final class C8131d0 extends AbstractC8308y<C8131d0, C8132a> implements InterfaceC8295s0 {
    private static final C8131d0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile InterfaceC8317z0<C8131d0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C8196a0.InterfaceC8199c<C8133b> keyInfo_ = C8207c1.f15968d;
    private int primaryKeyId_;

    /* renamed from: com.google.crypto.tink.proto.d0$a */
    /* loaded from: classes3.dex */
    public static final class C8132a extends AbstractC8308y.AbstractC8309a<C8131d0, C8132a> implements InterfaceC8295s0 {
        public C8132a() {
            super(C8131d0.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.crypto.tink.proto.d0$b */
    /* loaded from: classes3.dex */
    public static final class C8133b extends AbstractC8308y<C8133b, C8134a> implements InterfaceC8295s0 {
        private static final C8133b DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile InterfaceC8317z0<C8133b> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* renamed from: com.google.crypto.tink.proto.d0$b$a */
        /* loaded from: classes3.dex */
        public static final class C8134a extends AbstractC8308y.AbstractC8309a<C8133b, C8134a> implements InterfaceC8295s0 {
            public C8134a() {
                super(C8133b.DEFAULT_INSTANCE);
            }
        }

        static {
            C8133b c8133b = new C8133b();
            DEFAULT_INSTANCE = c8133b;
            AbstractC8308y.m3465r(C8133b.class, c8133b);
        }

        /* renamed from: t */
        public static void m4093t(C8133b c8133b, String str) {
            c8133b.getClass();
            str.getClass();
            c8133b.typeUrl_ = str;
        }

        /* renamed from: u */
        public static void m4092u(C8133b c8133b, EnumC8153i0 enumC8153i0) {
            c8133b.getClass();
            c8133b.outputPrefixType_ = enumC8153i0.getNumber();
        }

        /* renamed from: v */
        public static void m4091v(C8133b c8133b, EnumC8192z enumC8192z) {
            c8133b.getClass();
            c8133b.status_ = enumC8192z.getNumber();
        }

        /* renamed from: w */
        public static void m4090w(C8133b c8133b, int i) {
            c8133b.keyId_ = i;
        }

        /* renamed from: y */
        public static C8134a m4088y() {
            return DEFAULT_INSTANCE.m3472k();
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
                    return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new C8133b();
                case 4:
                    return new C8134a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    InterfaceC8317z0<C8133b> interfaceC8317z0 = PARSER;
                    if (interfaceC8317z0 == null) {
                        synchronized (C8133b.class) {
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

        /* renamed from: x */
        public final int m4089x() {
            return this.keyId_;
        }
    }

    static {
        C8131d0 c8131d0 = new C8131d0();
        DEFAULT_INSTANCE = c8131d0;
        AbstractC8308y.m3465r(C8131d0.class, c8131d0);
    }

    /* renamed from: t */
    public static void m4098t(C8131d0 c8131d0, int i) {
        c8131d0.primaryKeyId_ = i;
    }

    /* renamed from: u */
    public static void m4097u(C8131d0 c8131d0, C8133b c8133b) {
        int i;
        c8131d0.getClass();
        if (!c8131d0.keyInfo_.mo3921h()) {
            C8196a0.InterfaceC8199c<C8133b> interfaceC8199c = c8131d0.keyInfo_;
            int size = interfaceC8199c.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            c8131d0.keyInfo_ = interfaceC8199c.mo3453d(i);
        }
        c8131d0.keyInfo_.add(c8133b);
    }

    /* renamed from: w */
    public static C8132a m4095w() {
        return DEFAULT_INSTANCE.m3472k();
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", C8133b.class});
            case 3:
                return new C8131d0();
            case 4:
                return new C8132a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8131d0> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8131d0.class) {
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

    /* renamed from: v */
    public final C8133b m4096v() {
        return this.keyInfo_.get(0);
    }
}
