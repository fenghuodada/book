package p060j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.i */
/* loaded from: classes2.dex */
public final class C10347i extends AbstractC10340b implements Iterator, Enumeration, p060j$.util.Iterator {

    /* renamed from: k */
    public final /* synthetic */ int f20796k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10347i(C10351m[] c10351mArr, int i, int i2, ConcurrentHashMap concurrentHashMap, int i3) {
        super(c10351mArr, i, i2, concurrentHashMap);
        this.f20796k = i3;
    }

    @Override // p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.f20796k) {
            case 0:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            default:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.f20796k) {
            case 0:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
            default:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
        }
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Object next() {
        switch (this.f20796k) {
            case 0:
                C10351m c10351m = this.f20811b;
                if (c10351m != null) {
                    this.f20791j = c10351m;
                    m967e();
                    return c10351m.f20803b;
                }
                throw new NoSuchElementException();
            default:
                C10351m c10351m2 = this.f20811b;
                if (c10351m2 != null) {
                    Object obj = c10351m2.f20804c;
                    this.f20791j = c10351m2;
                    m967e();
                    return obj;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f20796k) {
            case 0:
                return next();
            default:
                return next();
        }
    }
}
