package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1211l0;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o0 */
/* loaded from: classes.dex */
public final class C1225o0 implements InterfaceC1222n0 {
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1222n0
    /* renamed from: a */
    public final C1219m0 mo10875a(Object obj, Object obj2) {
        C1219m0 c1219m0 = (C1219m0) obj;
        C1219m0 c1219m02 = (C1219m0) obj2;
        if (!c1219m02.isEmpty()) {
            if (!c1219m0.f3056a) {
                c1219m0 = c1219m0.m10897c();
            }
            c1219m0.m10898b();
            if (!c1219m02.isEmpty()) {
                c1219m0.putAll(c1219m02);
            }
        }
        return c1219m0;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1222n0
    /* renamed from: b */
    public final Object mo10874b(Object obj) {
        ((C1219m0) obj).f3056a = false;
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1222n0
    /* renamed from: c */
    public final C1211l0.C1212a<?, ?> mo10873c(Object obj) {
        return ((C1211l0) obj).f3038a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1222n0
    /* renamed from: d */
    public final C1219m0 mo10872d() {
        return C1219m0.f3055b.m10897c();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1222n0
    /* renamed from: e */
    public final C1219m0 mo10871e(Object obj) {
        return (C1219m0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1222n0
    /* renamed from: f */
    public final int mo10870f(int i, Object obj, Object obj2) {
        C1219m0 c1219m0 = (C1219m0) obj;
        C1211l0 c1211l0 = (C1211l0) obj2;
        int i2 = 0;
        if (!c1219m0.isEmpty()) {
            for (Map.Entry entry : c1219m0.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                c1211l0.getClass();
                int m10937t = AbstractC1214m.m10937t(i);
                int m10957a = C1211l0.m10957a(c1211l0.f3038a, key, value);
                i2 += AbstractC1214m.m10935v(m10957a) + m10957a + m10937t;
            }
        }
        return i2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1222n0
    /* renamed from: g */
    public final boolean mo10869g(Object obj) {
        return !((C1219m0) obj).f3056a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1222n0
    /* renamed from: h */
    public final C1219m0 mo10868h(Object obj) {
        return (C1219m0) obj;
    }
}
