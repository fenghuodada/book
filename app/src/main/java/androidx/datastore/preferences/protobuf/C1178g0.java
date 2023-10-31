package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1157b0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.g0 */
/* loaded from: classes.dex */
public final class C1178g0 extends AbstractC1162c<String> implements InterfaceC1181h0, RandomAccess {

    /* renamed from: b */
    public final ArrayList f2978b;

    static {
        new C1178g0(10).f2946a = false;
    }

    public C1178g0(int i) {
        this(new ArrayList(i));
    }

    public C1178g0(ArrayList<Object> arrayList) {
        this.f2978b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m11142a();
        this.f2978b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        m11142a();
        if (collection instanceof InterfaceC1181h0) {
            collection = ((InterfaceC1181h0) collection).mo10841e();
        }
        boolean addAll = this.f2978b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m11142a();
        this.f2978b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.C1157b0.InterfaceC1160c
    /* renamed from: d */
    public final C1157b0.InterfaceC1160c mo10720d(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f2978b);
            return new C1178g0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1181h0
    /* renamed from: e */
    public final List<?> mo10841e() {
        return Collections.unmodifiableList(this.f2978b);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1181h0
    /* renamed from: f */
    public final InterfaceC1181h0 mo10840f() {
        if (this.f2946a) {
            return new C1236r1(this);
        }
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1181h0
    /* renamed from: g */
    public final Object mo10839g(int i) {
        return this.f2978b.get(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r1.mo11117k() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r5 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        r0.set(r7, r2);
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(int r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = r6.f2978b
            java.lang.Object r1 = r0.get(r7)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto Ld
            java.lang.String r1 = (java.lang.String) r1
            goto L48
        Ld:
            boolean r2 = r1 instanceof androidx.datastore.preferences.protobuf.AbstractC1183i
            if (r2 == 0) goto L2c
            androidx.datastore.preferences.protobuf.i r1 = (androidx.datastore.preferences.protobuf.AbstractC1183i) r1
            r1.getClass()
            java.nio.charset.Charset r2 = androidx.datastore.preferences.protobuf.C1157b0.f2944a
            int r3 = r1.size()
            if (r3 != 0) goto L21
            java.lang.String r2 = ""
            goto L25
        L21:
            java.lang.String r2 = r1.mo11115n(r2)
        L25:
            boolean r1 = r1.mo11117k()
            if (r1 == 0) goto L47
            goto L44
        L2c:
            byte[] r1 = (byte[]) r1
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = androidx.datastore.preferences.protobuf.C1157b0.f2944a
            r2.<init>(r1, r3)
            androidx.datastore.preferences.protobuf.t1$b r3 = androidx.datastore.preferences.protobuf.C1250t1.f3086a
            int r3 = r1.length
            androidx.datastore.preferences.protobuf.t1$b r4 = androidx.datastore.preferences.protobuf.C1250t1.f3086a
            r5 = 0
            int r1 = r4.mo10779c(r5, r3, r1)
            if (r1 != 0) goto L42
            r5 = 1
        L42:
            if (r5 == 0) goto L47
        L44:
            r0.set(r7, r2)
        L47:
            r1 = r2
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1178g0.get(int):java.lang.Object");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1181h0
    /* renamed from: q */
    public final void mo10838q(AbstractC1183i abstractC1183i) {
        m11142a();
        this.f2978b.add(abstractC1183i);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m11142a();
        Object remove = this.f2978b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof AbstractC1183i) {
            AbstractC1183i abstractC1183i = (AbstractC1183i) remove;
            abstractC1183i.getClass();
            Charset charset = C1157b0.f2944a;
            if (abstractC1183i.size() == 0) {
                return "";
            }
            return abstractC1183i.mo11115n(charset);
        }
        return new String((byte[]) remove, C1157b0.f2944a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m11142a();
        Object obj2 = this.f2978b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC1183i) {
            AbstractC1183i abstractC1183i = (AbstractC1183i) obj2;
            abstractC1183i.getClass();
            Charset charset = C1157b0.f2944a;
            if (abstractC1183i.size() == 0) {
                return "";
            }
            return abstractC1183i.mo11115n(charset);
        }
        return new String((byte[]) obj2, C1157b0.f2944a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2978b.size();
    }
}
