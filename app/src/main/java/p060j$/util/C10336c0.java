package p060j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import okhttp3.internal.http2.Http2;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.c0 */
/* loaded from: classes2.dex */
public class C10336c0 implements InterfaceC10321P {

    /* renamed from: a */
    private final Collection f20753a;

    /* renamed from: b */
    private Iterator f20754b = null;

    /* renamed from: c */
    private final int f20755c;

    /* renamed from: d */
    private long f20756d;

    /* renamed from: e */
    private int f20757e;

    public C10336c0(Collection collection, int i) {
        this.f20753a = collection;
        this.f20755c = (i & 4096) == 0 ? i | 64 | Http2.INITIAL_MAX_FRAME_SIZE : i;
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final boolean mo534a(Consumer consumer) {
        consumer.getClass();
        if (this.f20754b == null) {
            Collection collection = this.f20753a;
            this.f20754b = collection.iterator();
            this.f20756d = collection.size();
        }
        if (this.f20754b.hasNext()) {
            consumer.accept(this.f20754b.next());
            return true;
        }
        return false;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final int characteristics() {
        return this.f20755c;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final long estimateSize() {
        if (this.f20754b == null) {
            Collection collection = this.f20753a;
            this.f20754b = collection.iterator();
            long size = collection.size();
            this.f20756d = size;
            return size;
        }
        return this.f20756d;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f20754b;
        if (it == null) {
            Collection collection = this.f20753a;
            Iterator it2 = collection.iterator();
            this.f20754b = it2;
            this.f20756d = collection.size();
            it = it2;
        }
        if (it instanceof Iterator) {
            ((Iterator) it).forEachRemaining(consumer);
        } else {
            Iterator.CC.$default$forEachRemaining(it, consumer);
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public Comparator getComparator() {
        if (AbstractC10331a.m1012j(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC10331a.m1013i(this);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC10331a.m1012j(this, i);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final InterfaceC10321P trySplit() {
        long j;
        java.util.Iterator it = this.f20754b;
        if (it == null) {
            Collection collection = this.f20753a;
            java.util.Iterator it2 = collection.iterator();
            this.f20754b = it2;
            j = collection.size();
            this.f20756d = j;
            it = it2;
        } else {
            j = this.f20756d;
        }
        if (j <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.f20757e + 1024;
        if (i > j) {
            i = (int) j;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = it.next();
            i2++;
            if (i2 >= i) {
                break;
            }
        } while (it.hasNext());
        this.f20757e = i2;
        long j2 = this.f20756d;
        if (j2 != Long.MAX_VALUE) {
            this.f20756d = j2 - i2;
        }
        return new C10326V(objArr, 0, i2, this.f20755c);
    }
}
