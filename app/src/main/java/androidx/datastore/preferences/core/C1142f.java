package androidx.datastore.preferences.core;

import androidx.constraintlayout.core.C0511i;
import androidx.datastore.core.C1085a;
import androidx.datastore.core.C1107q;
import androidx.datastore.core.InterfaceC1103m;
import androidx.datastore.preferences.C1144d;
import androidx.datastore.preferences.C1147e;
import androidx.datastore.preferences.C1149f;
import androidx.datastore.preferences.C1151g;
import androidx.datastore.preferences.core.AbstractC1138d;
import androidx.datastore.preferences.protobuf.AbstractC1214m;
import androidx.datastore.preferences.protobuf.C1157b0;
import androidx.datastore.preferences.protobuf.C1163c0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.C10796i;
import kotlin.C10868p;
import kotlin.collections.C10757m;
import kotlin.collections.C10765u;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.datastore.preferences.core.f */
/* loaded from: classes.dex */
public final class C1142f implements InterfaceC1103m<AbstractC1138d> {
    @NotNull

    /* renamed from: a */
    public static final C1142f f2939a = new C1142f();

    /* renamed from: androidx.datastore.preferences.core.f$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C1143a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2940a;

        static {
            int[] iArr = new int[C1151g._values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[6] = 3;
            iArr[2] = 4;
            iArr[3] = 5;
            iArr[4] = 6;
            iArr[5] = 7;
            iArr[7] = 8;
            f2940a = iArr;
        }
    }

    @Override // androidx.datastore.core.InterfaceC1103m
    /* renamed from: a */
    public final C1133a mo11181a() {
        return new C1133a(true, 1);
    }

    @Override // androidx.datastore.core.InterfaceC1103m
    @Nullable
    /* renamed from: b */
    public final C1133a mo11180b(@NotNull FileInputStream fileInputStream) throws IOException, C1085a {
        int i;
        AbstractC1138d.C1139a<?> c1139a;
        Object valueOf;
        try {
            C1144d m11174s = C1144d.m11174s(fileInputStream);
            C1133a c1133a = new C1133a(false, 1);
            AbstractC1138d.C1140b[] pairs = (AbstractC1138d.C1140b[]) Arrays.copyOf(new AbstractC1138d.C1140b[0], 0);
            C10843j.m430f(pairs, "pairs");
            c1133a.m11186c();
            if (pairs.length <= 0) {
                Map<String, C1149f> m11176q = m11174s.m11176q();
                C10843j.m431e(m11176q, "preferencesProto.preferencesMap");
                for (Map.Entry<String, C1149f> entry : m11176q.entrySet()) {
                    String name = entry.getKey();
                    C1149f value = entry.getValue();
                    C10843j.m431e(name, "name");
                    C10843j.m431e(value, "value");
                    int m11164E = value.m11164E();
                    if (m11164E == 0) {
                        i = -1;
                    } else {
                        i = C1143a.f2940a[C0511i.m12337b(m11164E)];
                    }
                    switch (i) {
                        case -1:
                            throw new C1085a("Value case is null.");
                        case 0:
                        default:
                            throw new C10796i();
                        case 1:
                            c1139a = new AbstractC1138d.C1139a<>(name);
                            valueOf = Boolean.valueOf(value.m11154w());
                            break;
                        case 2:
                            c1139a = new AbstractC1138d.C1139a<>(name);
                            valueOf = Float.valueOf(value.m11151z());
                            break;
                        case 3:
                            c1139a = new AbstractC1138d.C1139a<>(name);
                            valueOf = Double.valueOf(value.m11152y());
                            break;
                        case 4:
                            c1139a = new AbstractC1138d.C1139a<>(name);
                            valueOf = Integer.valueOf(value.m11168A());
                            break;
                        case 5:
                            c1139a = new AbstractC1138d.C1139a<>(name);
                            valueOf = Long.valueOf(value.m11167B());
                            break;
                        case 6:
                            c1139a = new AbstractC1138d.C1139a<>(name);
                            valueOf = value.m11166C();
                            C10843j.m431e(valueOf, "value.string");
                            break;
                        case 7:
                            c1139a = new AbstractC1138d.C1139a<>(name);
                            C1157b0.InterfaceC1160c m11170r = value.m11165D().m11170r();
                            C10843j.m431e(m11170r, "value.stringSet.stringsList");
                            valueOf = C10757m.m469t(m11170r);
                            break;
                        case 8:
                            throw new C1085a("Value not set.");
                    }
                    c1133a.m11185d(c1139a, valueOf);
                }
                return new C1133a((Map<AbstractC1138d.C1139a<?>, Object>) C10765u.m462g(c1133a.mo11183a()), true);
            }
            pairs[0].getClass();
            c1133a.m11185d(null, null);
            throw null;
        } catch (C1163c0 e) {
            throw new C1085a(e);
        }
    }

    @Override // androidx.datastore.core.InterfaceC1103m
    /* renamed from: c */
    public final C10868p mo11179c(Object obj, C1107q.C1111b c1111b) {
        C1149f.C1150a m11163F;
        Map<AbstractC1138d.C1139a<?>, Object> mo11183a = ((AbstractC1138d) obj).mo11183a();
        C1144d.C1145a m11175r = C1144d.m11175r();
        for (Map.Entry<AbstractC1138d.C1139a<?>, Object> entry : mo11183a.entrySet()) {
            Object value = entry.getValue();
            String str = entry.getKey().f2935a;
            if (value instanceof Boolean) {
                m11163F = C1149f.m11163F();
                boolean booleanValue = ((Boolean) value).booleanValue();
                m11163F.m10704j();
                C1149f.m11157t((C1149f) m11163F.f3142b, booleanValue);
            } else if (value instanceof Float) {
                m11163F = C1149f.m11163F();
                float floatValue = ((Number) value).floatValue();
                m11163F.m10704j();
                C1149f.m11156u((C1149f) m11163F.f3142b, floatValue);
            } else if (value instanceof Double) {
                m11163F = C1149f.m11163F();
                double doubleValue = ((Number) value).doubleValue();
                m11163F.m10704j();
                C1149f.m11159r((C1149f) m11163F.f3142b, doubleValue);
            } else if (value instanceof Integer) {
                m11163F = C1149f.m11163F();
                int intValue = ((Number) value).intValue();
                m11163F.m10704j();
                C1149f.m11155v((C1149f) m11163F.f3142b, intValue);
            } else if (value instanceof Long) {
                m11163F = C1149f.m11163F();
                long longValue = ((Number) value).longValue();
                m11163F.m10704j();
                C1149f.m11162o((C1149f) m11163F.f3142b, longValue);
            } else if (value instanceof String) {
                m11163F = C1149f.m11163F();
                m11163F.m10704j();
                C1149f.m11161p((C1149f) m11163F.f3142b, (String) value);
            } else if (value instanceof Set) {
                m11163F = C1149f.m11163F();
                C1147e.C1148a m11169s = C1147e.m11169s();
                m11169s.m10704j();
                C1147e.m11172p((C1147e) m11169s.f3142b, (Set) value);
                m11163F.m10704j();
                C1149f.m11160q((C1149f) m11163F.f3142b, m11169s);
            } else {
                throw new IllegalStateException(C10843j.m425k(value.getClass().getName(), "PreferencesSerializer does not support type: "));
            }
            m11175r.getClass();
            str.getClass();
            m11175r.m10704j();
            C1144d.m11177p((C1144d) m11175r.f3142b).put(str, m11163F.m10706h());
        }
        C1144d m10706h = m11175r.m10706h();
        int mo10715c = m10706h.mo10715c();
        Logger logger = AbstractC1214m.f3045b;
        if (mo10715c > 4096) {
            mo10715c = 4096;
        }
        AbstractC1214m.C1218d c1218d = new AbstractC1214m.C1218d(c1111b, mo10715c);
        m10706h.mo10713f(c1218d);
        if (c1218d.f3050f > 0) {
            c1218d.m10903a0();
        }
        return C10868p.f21418a;
    }
}
