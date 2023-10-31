package androidx.datastore.preferences;

import androidx.datastore.preferences.C1147e;
import androidx.datastore.preferences.protobuf.AbstractC1273z;
import androidx.datastore.preferences.protobuf.C1176f1;
import androidx.datastore.preferences.protobuf.InterfaceC1161b1;
import androidx.datastore.preferences.protobuf.InterfaceC1249t0;

/* renamed from: androidx.datastore.preferences.f */
/* loaded from: classes.dex */
public final class C1149f extends AbstractC1273z<C1149f, C1150a> implements InterfaceC1249t0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final C1149f DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC1161b1<C1149f> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    /* renamed from: androidx.datastore.preferences.f$a */
    /* loaded from: classes.dex */
    public static final class C1150a extends AbstractC1273z.AbstractC1274a<C1149f, C1150a> implements InterfaceC1249t0 {
        public C1150a() {
            super(C1149f.DEFAULT_INSTANCE);
        }
    }

    static {
        C1149f c1149f = new C1149f();
        DEFAULT_INSTANCE = c1149f;
        AbstractC1273z.m10707n(C1149f.class, c1149f);
    }

    /* renamed from: F */
    public static C1150a m11163F() {
        return (C1150a) ((AbstractC1273z.AbstractC1274a) DEFAULT_INSTANCE.mo10711j(AbstractC1273z.EnumC1279f.NEW_BUILDER));
    }

    /* renamed from: o */
    public static void m11162o(C1149f c1149f, long j) {
        c1149f.valueCase_ = 4;
        c1149f.value_ = Long.valueOf(j);
    }

    /* renamed from: p */
    public static void m11161p(C1149f c1149f, String str) {
        c1149f.getClass();
        str.getClass();
        c1149f.valueCase_ = 5;
        c1149f.value_ = str;
    }

    /* renamed from: q */
    public static void m11160q(C1149f c1149f, C1147e.C1148a c1148a) {
        c1149f.getClass();
        c1149f.value_ = c1148a.m10706h();
        c1149f.valueCase_ = 6;
    }

    /* renamed from: r */
    public static void m11159r(C1149f c1149f, double d) {
        c1149f.valueCase_ = 7;
        c1149f.value_ = Double.valueOf(d);
    }

    /* renamed from: t */
    public static void m11157t(C1149f c1149f, boolean z) {
        c1149f.valueCase_ = 1;
        c1149f.value_ = Boolean.valueOf(z);
    }

    /* renamed from: u */
    public static void m11156u(C1149f c1149f, float f) {
        c1149f.valueCase_ = 2;
        c1149f.value_ = Float.valueOf(f);
    }

    /* renamed from: v */
    public static void m11155v(C1149f c1149f, int i) {
        c1149f.valueCase_ = 3;
        c1149f.value_ = Integer.valueOf(i);
    }

    /* renamed from: x */
    public static C1149f m11153x() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: A */
    public final int m11168A() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* renamed from: B */
    public final long m11167B() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* renamed from: C */
    public final String m11166C() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* renamed from: D */
    public final C1147e m11165D() {
        return this.valueCase_ == 6 ? (C1147e) this.value_ : C1147e.m11171q();
    }

    /* renamed from: E */
    public final int m11164E() {
        switch (this.valueCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1273z
    /* renamed from: j */
    public final Object mo10711j(AbstractC1273z.EnumC1279f enumC1279f) {
        switch (enumC1279f.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1176f1(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C1147e.class});
            case 3:
                return new C1149f();
            case 4:
                return new C1150a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1161b1<C1149f> interfaceC1161b1 = PARSER;
                if (interfaceC1161b1 == null) {
                    synchronized (C1149f.class) {
                        try {
                            interfaceC1161b1 = PARSER;
                            if (interfaceC1161b1 == null) {
                                interfaceC1161b1 = new AbstractC1273z.C1275b<>(DEFAULT_INSTANCE);
                                PARSER = interfaceC1161b1;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC1161b1;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: w */
    public final boolean m11154w() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* renamed from: y */
    public final double m11152y() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: z */
    public final float m11151z() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }
}
