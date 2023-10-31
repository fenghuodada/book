package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractC1183i;
import androidx.datastore.preferences.protobuf.AbstractC1273z;
import androidx.datastore.preferences.protobuf.C1157b0;
import androidx.datastore.preferences.protobuf.C1173e1;
import androidx.datastore.preferences.protobuf.C1176f1;
import androidx.datastore.preferences.protobuf.InterfaceC1161b1;
import androidx.datastore.preferences.protobuf.InterfaceC1165c1;
import androidx.datastore.preferences.protobuf.InterfaceC1181h0;
import androidx.datastore.preferences.protobuf.InterfaceC1249t0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.datastore.preferences.e */
/* loaded from: classes.dex */
public final class C1147e extends AbstractC1273z<C1147e, C1148a> implements InterfaceC1249t0 {
    private static final C1147e DEFAULT_INSTANCE;
    private static volatile InterfaceC1161b1<C1147e> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C1157b0.InterfaceC1160c<String> strings_ = C1173e1.f2967d;

    /* renamed from: androidx.datastore.preferences.e$a */
    /* loaded from: classes.dex */
    public static final class C1148a extends AbstractC1273z.AbstractC1274a<C1147e, C1148a> implements InterfaceC1249t0 {
        public C1148a() {
            super(C1147e.DEFAULT_INSTANCE);
        }
    }

    static {
        C1147e c1147e = new C1147e();
        DEFAULT_INSTANCE = c1147e;
        AbstractC1273z.m10707n(C1147e.class, c1147e);
    }

    /* renamed from: p */
    public static void m11172p(C1147e c1147e, Iterable iterable) {
        int i;
        if (!c1147e.strings_.mo11140h()) {
            C1157b0.InterfaceC1160c<String> interfaceC1160c = c1147e.strings_;
            int size = interfaceC1160c.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            c1147e.strings_ = interfaceC1160c.mo10720d(i);
        }
        List list = c1147e.strings_;
        Charset charset = C1157b0.f2944a;
        iterable.getClass();
        if (iterable instanceof InterfaceC1181h0) {
            List<?> mo10841e = ((InterfaceC1181h0) iterable).mo10841e();
            InterfaceC1181h0 interfaceC1181h0 = (InterfaceC1181h0) list;
            int size2 = list.size();
            for (Object obj : mo10841e) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC1181h0.size() - size2) + " is null.";
                    int size3 = interfaceC1181h0.size();
                    while (true) {
                        size3--;
                        if (size3 < size2) {
                            break;
                        }
                        interfaceC1181h0.remove(size3);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof AbstractC1183i) {
                    interfaceC1181h0.mo10838q((AbstractC1183i) obj);
                } else {
                    interfaceC1181h0.add((String) obj);
                }
            }
        } else if (iterable instanceof InterfaceC1165c1) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size4 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (list.size() - size4) + " is null.";
                    int size5 = list.size();
                    while (true) {
                        size5--;
                        if (size5 < size4) {
                            break;
                        }
                        list.remove(size5);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(obj2);
            }
        }
    }

    /* renamed from: q */
    public static C1147e m11171q() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: s */
    public static C1148a m11169s() {
        return (C1148a) ((AbstractC1273z.AbstractC1274a) DEFAULT_INSTANCE.mo10711j(AbstractC1273z.EnumC1279f.NEW_BUILDER));
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
                return new C1176f1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new C1147e();
            case 4:
                return new C1148a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1161b1<C1147e> interfaceC1161b1 = PARSER;
                if (interfaceC1161b1 == null) {
                    synchronized (C1147e.class) {
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

    /* renamed from: r */
    public final C1157b0.InterfaceC1160c m11170r() {
        return this.strings_;
    }
}
