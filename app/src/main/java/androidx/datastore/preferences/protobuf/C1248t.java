package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1273z;
import androidx.datastore.preferences.protobuf.C1233r;
import java.io.IOException;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.t */
/* loaded from: classes.dex */
public final class C1248t extends AbstractC1239s<AbstractC1273z.C1277d> {
    @Override // androidx.datastore.preferences.protobuf.AbstractC1239s
    /* renamed from: a */
    public final void mo10797a(Map.Entry entry) {
        ((AbstractC1273z.C1277d) entry.getKey()).getClass();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1239s
    /* renamed from: b */
    public final AbstractC1273z.C1278e mo10796b(C1233r c1233r, InterfaceC1240s0 interfaceC1240s0, int i) {
        c1233r.getClass();
        return c1233r.f3071a.get(new C1233r.C1234a(interfaceC1240s0, i));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1239s
    /* renamed from: c */
    public final C1263v<AbstractC1273z.C1277d> mo10795c(Object obj) {
        return ((AbstractC1273z.AbstractC1276c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1239s
    /* renamed from: d */
    public final C1263v<AbstractC1273z.C1277d> mo10794d(Object obj) {
        AbstractC1273z.AbstractC1276c abstractC1276c = (AbstractC1273z.AbstractC1276c) obj;
        C1263v<AbstractC1273z.C1277d> c1263v = abstractC1276c.extensions;
        if (c1263v.f3097b) {
            abstractC1276c.extensions = c1263v.clone();
        }
        return abstractC1276c.extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1239s
    /* renamed from: e */
    public final boolean mo10793e(InterfaceC1240s0 interfaceC1240s0) {
        return interfaceC1240s0 instanceof AbstractC1273z.AbstractC1276c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1239s
    /* renamed from: f */
    public final void mo10792f(Object obj) {
        C1263v<AbstractC1273z.C1277d> c1263v = ((AbstractC1273z.AbstractC1276c) obj).extensions;
        if (!c1263v.f3097b) {
            c1263v.f3096a.mo11009g();
            c1263v.f3097b = true;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1239s
    /* renamed from: g */
    public final Object mo10791g(Object obj) throws IOException {
        AbstractC1273z.C1278e c1278e = (AbstractC1273z.C1278e) obj;
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1239s
    /* renamed from: h */
    public final void mo10790h(Object obj) throws IOException {
        AbstractC1273z.C1278e c1278e = (AbstractC1273z.C1278e) obj;
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1239s
    /* renamed from: i */
    public final void mo10789i(Object obj) throws IOException {
        AbstractC1273z.C1278e c1278e = (AbstractC1273z.C1278e) obj;
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1239s
    /* renamed from: j */
    public final void mo10788j(Map.Entry entry) throws IOException {
        ((AbstractC1273z.C1277d) entry.getKey()).getClass();
        throw null;
    }
}
