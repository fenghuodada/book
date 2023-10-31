package p060j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.e */
/* loaded from: classes2.dex */
final class C10343e extends AbstractC10340b implements Iterator, p060j$.util.Iterator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10343e(C10351m[] c10351mArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(c10351mArr, i, i2, concurrentHashMap);
    }

    @Override // p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Object next() {
        C10351m c10351m = this.f20811b;
        if (c10351m != null) {
            Object obj = c10351m.f20803b;
            Object obj2 = c10351m.f20804c;
            this.f20791j = c10351m;
            m967e();
            return new C10350l(obj, obj2, this.f20790i);
        }
        throw new NoSuchElementException();
    }
}
