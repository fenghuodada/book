package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1157b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC1190i0 {

    /* renamed from: a */
    public static final C1191a f2986a = new C1191a();

    /* renamed from: b */
    public static final C1192b f2987b = new C1192b();

    /* renamed from: androidx.datastore.preferences.protobuf.i0$a */
    /* loaded from: classes.dex */
    public static final class C1191a extends AbstractC1190i0 {

        /* renamed from: c */
        public static final Class<?> f2988c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public static List m11111d(Object obj, int i, long j) {
            C1157b0.InterfaceC1160c mo10720d;
            C1178g0 c1178g0;
            List list = (List) C1242s1.m10823n(j, obj);
            if (list.isEmpty()) {
                if (list instanceof InterfaceC1181h0) {
                    list = new C1178g0(i);
                } else if ((list instanceof InterfaceC1165c1) && (list instanceof C1157b0.InterfaceC1160c)) {
                    mo10720d = ((C1157b0.InterfaceC1160c) list).mo10720d(i);
                    list = mo10720d;
                } else {
                    list = new ArrayList(i);
                }
                C1242s1.m10816u(obj, j, list);
            } else {
                if (f2988c.isAssignableFrom(list.getClass())) {
                    ArrayList arrayList = new ArrayList(list.size() + i);
                    arrayList.addAll(list);
                    c1178g0 = arrayList;
                } else if (list instanceof C1236r1) {
                    C1178g0 c1178g02 = new C1178g0(list.size() + i);
                    c1178g02.addAll((C1236r1) list);
                    c1178g0 = c1178g02;
                } else if ((list instanceof InterfaceC1165c1) && (list instanceof C1157b0.InterfaceC1160c)) {
                    C1157b0.InterfaceC1160c interfaceC1160c = (C1157b0.InterfaceC1160c) list;
                    if (!interfaceC1160c.mo11140h()) {
                        mo10720d = interfaceC1160c.mo10720d(list.size() + i);
                        list = mo10720d;
                        C1242s1.m10816u(obj, j, list);
                    }
                }
                list = c1178g0;
                C1242s1.m10816u(obj, j, list);
            }
            return list;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1190i0
        /* renamed from: a */
        public final void mo11110a(long j, Object obj) {
            Object unmodifiableList;
            List list = (List) C1242s1.m10823n(j, obj);
            if (list instanceof InterfaceC1181h0) {
                unmodifiableList = ((InterfaceC1181h0) list).mo10840f();
            } else {
                if (f2988c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof InterfaceC1165c1) && (list instanceof C1157b0.InterfaceC1160c)) {
                    C1157b0.InterfaceC1160c interfaceC1160c = (C1157b0.InterfaceC1160c) list;
                    if (interfaceC1160c.mo11140h()) {
                        interfaceC1160c.mo11141c();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            C1242s1.m10816u(obj, j, unmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1190i0
        /* renamed from: b */
        public final void mo11109b(Object obj, long j, Object obj2) {
            List list = (List) C1242s1.m10823n(j, obj2);
            List m11111d = m11111d(obj, list.size(), j);
            int size = m11111d.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                m11111d.addAll(list);
            }
            if (size > 0) {
                list = m11111d;
            }
            C1242s1.m10816u(obj, j, list);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1190i0
        /* renamed from: c */
        public final List mo11108c(long j, Object obj) {
            return m11111d(obj, 10, j);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i0$b */
    /* loaded from: classes.dex */
    public static final class C1192b extends AbstractC1190i0 {
        @Override // androidx.datastore.preferences.protobuf.AbstractC1190i0
        /* renamed from: a */
        public final void mo11110a(long j, Object obj) {
            ((C1157b0.InterfaceC1160c) C1242s1.m10823n(j, obj)).mo11141c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1190i0
        /* renamed from: b */
        public final void mo11109b(Object obj, long j, Object obj2) {
            C1157b0.InterfaceC1160c interfaceC1160c = (C1157b0.InterfaceC1160c) C1242s1.m10823n(j, obj);
            C1157b0.InterfaceC1160c interfaceC1160c2 = (C1157b0.InterfaceC1160c) C1242s1.m10823n(j, obj2);
            int size = interfaceC1160c.size();
            int size2 = interfaceC1160c2.size();
            if (size > 0 && size2 > 0) {
                if (!interfaceC1160c.mo11140h()) {
                    interfaceC1160c = interfaceC1160c.mo10720d(size2 + size);
                }
                interfaceC1160c.addAll(interfaceC1160c2);
            }
            if (size > 0) {
                interfaceC1160c2 = interfaceC1160c;
            }
            C1242s1.m10816u(obj, j, interfaceC1160c2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1190i0
        /* renamed from: c */
        public final List mo11108c(long j, Object obj) {
            int i;
            C1157b0.InterfaceC1160c interfaceC1160c = (C1157b0.InterfaceC1160c) C1242s1.m10823n(j, obj);
            if (!interfaceC1160c.mo11140h()) {
                int size = interfaceC1160c.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size * 2;
                }
                C1157b0.InterfaceC1160c mo10720d = interfaceC1160c.mo10720d(i);
                C1242s1.m10816u(obj, j, mo10720d);
                return mo10720d;
            }
            return interfaceC1160c;
        }
    }

    /* renamed from: a */
    public abstract void mo11110a(long j, Object obj);

    /* renamed from: b */
    public abstract void mo11109b(Object obj, long j, Object obj2);

    /* renamed from: c */
    public abstract List mo11108c(long j, Object obj);
}
