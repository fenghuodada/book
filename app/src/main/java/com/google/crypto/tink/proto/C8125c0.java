package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8196a0;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8207c1;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;
import java.util.List;

/* renamed from: com.google.crypto.tink.proto.c0 */
/* loaded from: classes3.dex */
public final class C8125c0 extends AbstractC8308y<C8125c0, C8126a> implements InterfaceC8295s0 {
    private static final C8125c0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile InterfaceC8317z0<C8125c0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C8196a0.InterfaceC8199c<C8127b> key_ = C8207c1.f15968d;
    private int primaryKeyId_;

    /* renamed from: com.google.crypto.tink.proto.c0$a */
    /* loaded from: classes3.dex */
    public static final class C8126a extends AbstractC8308y.AbstractC8309a<C8125c0, C8126a> implements InterfaceC8295s0 {
        public C8126a() {
            super(C8125c0.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.crypto.tink.proto.c0$b */
    /* loaded from: classes3.dex */
    public static final class C8127b extends AbstractC8308y<C8127b, C8128a> implements InterfaceC8295s0 {
        private static final C8127b DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile InterfaceC8317z0<C8127b> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private C8189y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* renamed from: com.google.crypto.tink.proto.c0$b$a */
        /* loaded from: classes3.dex */
        public static final class C8128a extends AbstractC8308y.AbstractC8309a<C8127b, C8128a> implements InterfaceC8295s0 {
            public C8128a() {
                super(C8127b.DEFAULT_INSTANCE);
            }
        }

        static {
            C8127b c8127b = new C8127b();
            DEFAULT_INSTANCE = c8127b;
            AbstractC8308y.m3465r(C8127b.class, c8127b);
        }

        /* renamed from: C */
        public static C8128a m4117C() {
            return DEFAULT_INSTANCE.m3472k();
        }

        /* renamed from: t */
        public static void m4115t(C8127b c8127b, C8189y c8189y) {
            c8127b.getClass();
            c8127b.keyData_ = c8189y;
        }

        /* renamed from: u */
        public static void m4114u(C8127b c8127b, EnumC8153i0 enumC8153i0) {
            c8127b.getClass();
            c8127b.outputPrefixType_ = enumC8153i0.getNumber();
        }

        /* renamed from: v */
        public static void m4113v(C8127b c8127b) {
            EnumC8192z enumC8192z = EnumC8192z.ENABLED;
            c8127b.getClass();
            c8127b.status_ = enumC8192z.getNumber();
        }

        /* renamed from: w */
        public static void m4112w(C8127b c8127b, int i) {
            c8127b.keyId_ = i;
        }

        /* renamed from: A */
        public final EnumC8192z m4119A() {
            EnumC8192z enumC8192z;
            int i = this.status_;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            enumC8192z = null;
                        } else {
                            enumC8192z = EnumC8192z.DESTROYED;
                        }
                    } else {
                        enumC8192z = EnumC8192z.DISABLED;
                    }
                } else {
                    enumC8192z = EnumC8192z.ENABLED;
                }
            } else {
                enumC8192z = EnumC8192z.UNKNOWN_STATUS;
            }
            if (enumC8192z == null) {
                return EnumC8192z.UNRECOGNIZED;
            }
            return enumC8192z;
        }

        /* renamed from: B */
        public final boolean m4118B() {
            return this.keyData_ != null;
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
                    return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new C8127b();
                case 4:
                    return new C8128a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    InterfaceC8317z0<C8127b> interfaceC8317z0 = PARSER;
                    if (interfaceC8317z0 == null) {
                        synchronized (C8127b.class) {
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
        public final C8189y m4111x() {
            C8189y c8189y = this.keyData_;
            return c8189y == null ? C8189y.m3941w() : c8189y;
        }

        /* renamed from: y */
        public final int m4110y() {
            return this.keyId_;
        }

        /* renamed from: z */
        public final EnumC8153i0 m4109z() {
            EnumC8153i0 m4033a = EnumC8153i0.m4033a(this.outputPrefixType_);
            return m4033a == null ? EnumC8153i0.UNRECOGNIZED : m4033a;
        }
    }

    static {
        C8125c0 c8125c0 = new C8125c0();
        DEFAULT_INSTANCE = c8125c0;
        AbstractC8308y.m3465r(C8125c0.class, c8125c0);
    }

    /* renamed from: A */
    public static C8125c0 m4128A(byte[] bArr, C8277q c8277q) throws C8202b0 {
        return (C8125c0) AbstractC8308y.m3467p(DEFAULT_INSTANCE, bArr, c8277q);
    }

    /* renamed from: t */
    public static void m4126t(C8125c0 c8125c0, int i) {
        c8125c0.primaryKeyId_ = i;
    }

    /* renamed from: u */
    public static void m4125u(C8125c0 c8125c0, C8127b c8127b) {
        int i;
        c8125c0.getClass();
        if (!c8125c0.key_.mo3921h()) {
            C8196a0.InterfaceC8199c<C8127b> interfaceC8199c = c8125c0.key_;
            int size = interfaceC8199c.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            c8125c0.key_ = interfaceC8199c.mo3453d(i);
        }
        c8125c0.key_.add(c8127b);
    }

    /* renamed from: z */
    public static C8126a m4120z() {
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", C8127b.class});
            case 3:
                return new C8125c0();
            case 4:
                return new C8126a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8125c0> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8125c0.class) {
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
    public final C8127b m4124v(int i) {
        return this.key_.get(i);
    }

    /* renamed from: w */
    public final int m4123w() {
        return this.key_.size();
    }

    /* renamed from: x */
    public final List<C8127b> m4122x() {
        return this.key_;
    }

    /* renamed from: y */
    public final int m4121y() {
        return this.primaryKeyId_;
    }
}
