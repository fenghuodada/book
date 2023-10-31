package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractC1197k;
import androidx.datastore.preferences.protobuf.AbstractC1273z;
import androidx.datastore.preferences.protobuf.C1163c0;
import androidx.datastore.preferences.protobuf.C1176f1;
import androidx.datastore.preferences.protobuf.C1211l0;
import androidx.datastore.preferences.protobuf.C1219m0;
import androidx.datastore.preferences.protobuf.C1223n1;
import androidx.datastore.preferences.protobuf.C1233r;
import androidx.datastore.preferences.protobuf.EnumC1258u1;
import androidx.datastore.preferences.protobuf.InterfaceC1161b1;
import androidx.datastore.preferences.protobuf.InterfaceC1249t0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.d */
/* loaded from: classes.dex */
public final class C1144d extends AbstractC1273z<C1144d, C1145a> implements InterfaceC1249t0 {
    private static final C1144d DEFAULT_INSTANCE;
    private static volatile InterfaceC1161b1<C1144d> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C1219m0<String, C1149f> preferences_ = C1219m0.f3055b;

    /* renamed from: androidx.datastore.preferences.d$a */
    /* loaded from: classes.dex */
    public static final class C1145a extends AbstractC1273z.AbstractC1274a<C1144d, C1145a> implements InterfaceC1249t0 {
        public C1145a() {
            super(C1144d.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: androidx.datastore.preferences.d$b */
    /* loaded from: classes.dex */
    public static final class C1146b {

        /* renamed from: a */
        public static final C1211l0<String, C1149f> f2941a = new C1211l0<>(EnumC1258u1.f3089c, EnumC1258u1.f3091e, C1149f.m11153x());
    }

    static {
        C1144d c1144d = new C1144d();
        DEFAULT_INSTANCE = c1144d;
        AbstractC1273z.m10707n(C1144d.class, c1144d);
    }

    /* renamed from: p */
    public static C1219m0 m11177p(C1144d c1144d) {
        C1219m0<String, C1149f> c1219m0 = c1144d.preferences_;
        if (!c1219m0.f3056a) {
            c1144d.preferences_ = c1219m0.m10897c();
        }
        return c1144d.preferences_;
    }

    /* renamed from: r */
    public static C1145a m11175r() {
        return (C1145a) ((AbstractC1273z.AbstractC1274a) DEFAULT_INSTANCE.mo10711j(AbstractC1273z.EnumC1279f.NEW_BUILDER));
    }

    /* renamed from: s */
    public static C1144d m11174s(FileInputStream fileInputStream) throws IOException {
        AbstractC1273z m10708m = AbstractC1273z.m10708m(DEFAULT_INSTANCE, new AbstractC1197k.C1199b(fileInputStream), C1233r.m10842a());
        if (m10708m.isInitialized()) {
            return (C1144d) m10708m;
        }
        throw new C1163c0(new C1223n1().getMessage());
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
                return new C1176f1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C1146b.f2941a});
            case 3:
                return new C1144d();
            case 4:
                return new C1145a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1161b1<C1144d> interfaceC1161b1 = PARSER;
                if (interfaceC1161b1 == null) {
                    synchronized (C1144d.class) {
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

    /* renamed from: q */
    public final Map<String, C1149f> m11176q() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
