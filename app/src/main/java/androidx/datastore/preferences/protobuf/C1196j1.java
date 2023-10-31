package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1263v;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.j1 */
/* loaded from: classes.dex */
public final class C1196j1 extends C1203k1<Object, Object> {
    public C1196j1(int i) {
        super(i);
    }

    @Override // androidx.datastore.preferences.protobuf.C1203k1
    /* renamed from: g */
    public final void mo11009g() {
        if (!this.f3021d) {
            for (int i = 0; i < m11012d(); i++) {
                ((C1263v.InterfaceC1264a) m11013c(i).getKey()).mo10698B();
            }
            for (Map.Entry<Object, Object> entry : m11011e()) {
                ((C1263v.InterfaceC1264a) entry.getKey()).mo10698B();
            }
        }
        super.mo11009g();
    }

    @Override // androidx.datastore.preferences.protobuf.C1203k1, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((C1263v.InterfaceC1264a) obj, obj2);
    }
}
