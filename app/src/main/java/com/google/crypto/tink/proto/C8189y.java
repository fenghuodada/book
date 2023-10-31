package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8196a0;
import com.google.crypto.tink.shaded.protobuf.C8212d1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8317z0;

/* renamed from: com.google.crypto.tink.proto.y */
/* loaded from: classes3.dex */
public final class C8189y extends AbstractC8308y<C8189y, C8190a> implements InterfaceC8295s0 {
    private static final C8189y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC8317z0<C8189y> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private AbstractC8228i value_ = AbstractC8228i.f15998b;

    /* renamed from: com.google.crypto.tink.proto.y$a */
    /* loaded from: classes3.dex */
    public static final class C8190a extends AbstractC8308y.AbstractC8309a<C8189y, C8190a> implements InterfaceC8295s0 {
        public C8190a() {
            super(C8189y.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.crypto.tink.proto.y$b */
    /* loaded from: classes3.dex */
    public enum EnumC8191b implements C8196a0.InterfaceC8197a {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: a */
        public final int f15940a;

        EnumC8191b(int i) {
            this.f15940a = i;
        }

        /* renamed from: a */
        public static EnumC8191b m3937a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return REMOTE;
                        }
                        return ASYMMETRIC_PUBLIC;
                    }
                    return ASYMMETRIC_PRIVATE;
                }
                return SYMMETRIC;
            }
            return UNKNOWN_KEYMATERIAL;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8197a
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f15940a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C8189y c8189y = new C8189y();
        DEFAULT_INSTANCE = c8189y;
        AbstractC8308y.m3465r(C8189y.class, c8189y);
    }

    /* renamed from: A */
    public static C8190a m3946A() {
        return DEFAULT_INSTANCE.m3472k();
    }

    /* renamed from: t */
    public static void m3944t(C8189y c8189y, String str) {
        c8189y.getClass();
        str.getClass();
        c8189y.typeUrl_ = str;
    }

    /* renamed from: u */
    public static void m3943u(C8189y c8189y, AbstractC8228i abstractC8228i) {
        c8189y.getClass();
        abstractC8228i.getClass();
        c8189y.value_ = abstractC8228i;
    }

    /* renamed from: v */
    public static void m3942v(C8189y c8189y, EnumC8191b enumC8191b) {
        c8189y.getClass();
        c8189y.keyMaterialType_ = enumC8191b.getNumber();
    }

    /* renamed from: w */
    public static C8189y m3941w() {
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
                return new C8212d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new C8189y();
            case 4:
                return new C8190a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC8317z0<C8189y> interfaceC8317z0 = PARSER;
                if (interfaceC8317z0 == null) {
                    synchronized (C8189y.class) {
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
    public final EnumC8191b m3940x() {
        EnumC8191b m3937a = EnumC8191b.m3937a(this.keyMaterialType_);
        return m3937a == null ? EnumC8191b.UNRECOGNIZED : m3937a;
    }

    /* renamed from: y */
    public final String m3939y() {
        return this.typeUrl_;
    }

    /* renamed from: z */
    public final AbstractC8228i m3938z() {
        return this.value_;
    }
}
