package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C8196a0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.f0 */
/* loaded from: classes3.dex */
public final class C8218f0 extends AbstractC8205c<String> implements InterfaceC8221g0, RandomAccess {

    /* renamed from: b */
    public final ArrayList f15987b;

    static {
        new C8218f0(10).f15955a = false;
    }

    public C8218f0(int i) {
        this(new ArrayList(i));
    }

    public C8218f0(ArrayList<Object> arrayList) {
        this.f15987b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m3923a();
        this.f15987b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        m3923a();
        if (collection instanceof InterfaceC8221g0) {
            collection = ((InterfaceC8221g0) collection).mo3618e();
        }
        boolean addAll = this.f15987b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3923a();
        this.f15987b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8199c
    /* renamed from: d */
    public final C8196a0.InterfaceC8199c mo3453d(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f15987b);
            return new C8218f0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8221g0
    /* renamed from: e */
    public final List<?> mo3618e() {
        return Collections.unmodifiableList(this.f15987b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8221g0
    /* renamed from: f */
    public final InterfaceC8221g0 mo3617f() {
        if (this.f15955a) {
            return new C8266o1(this);
        }
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8221g0
    /* renamed from: g */
    public final Object mo3616g(int i) {
        return this.f15987b.get(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r1.mo3816m() != false) goto L15;
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
            java.util.ArrayList r0 = r6.f15987b
            java.lang.Object r1 = r0.get(r7)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto Ld
            java.lang.String r1 = (java.lang.String) r1
            goto L48
        Ld:
            boolean r2 = r1 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC8228i
            if (r2 == 0) goto L2c
            com.google.crypto.tink.shaded.protobuf.i r1 = (com.google.crypto.tink.shaded.protobuf.AbstractC8228i) r1
            r1.getClass()
            java.nio.charset.Charset r2 = com.google.crypto.tink.shaded.protobuf.C8196a0.f15949a
            int r3 = r1.size()
            if (r3 != 0) goto L21
            java.lang.String r2 = ""
            goto L25
        L21:
            java.lang.String r2 = r1.mo3812s(r2)
        L25:
            boolean r1 = r1.mo3816m()
            if (r1 == 0) goto L47
            goto L44
        L2c:
            byte[] r1 = (byte[]) r1
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.C8196a0.f15949a
            r2.<init>(r1, r3)
            com.google.crypto.tink.shaded.protobuf.q1$b r3 = com.google.crypto.tink.shaded.protobuf.C8280q1.f16077a
            int r3 = r1.length
            com.google.crypto.tink.shaded.protobuf.q1$b r4 = com.google.crypto.tink.shaded.protobuf.C8280q1.f16077a
            r5 = 0
            int r1 = r4.mo3559c(r5, r3, r1)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8218f0.get(int):java.lang.Object");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m3923a();
        Object remove = this.f15987b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof AbstractC8228i) {
            AbstractC8228i abstractC8228i = (AbstractC8228i) remove;
            abstractC8228i.getClass();
            Charset charset = C8196a0.f15949a;
            if (abstractC8228i.size() == 0) {
                return "";
            }
            return abstractC8228i.mo3812s(charset);
        }
        return new String((byte[]) remove, C8196a0.f15949a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m3923a();
        Object obj2 = this.f15987b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC8228i) {
            AbstractC8228i abstractC8228i = (AbstractC8228i) obj2;
            abstractC8228i.getClass();
            Charset charset = C8196a0.f15949a;
            if (abstractC8228i.size() == 0) {
                return "";
            }
            return abstractC8228i.mo3812s(charset);
        }
        return new String((byte[]) obj2, C8196a0.f15949a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15987b.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8221g0
    /* renamed from: x */
    public final void mo3615x(AbstractC8228i abstractC8228i) {
        m3923a();
        this.f15987b.add(abstractC8228i);
        ((AbstractList) this).modCount++;
    }
}
