package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.AbstractC10762r;

/* renamed from: kotlin.ranges.b */
/* loaded from: classes3.dex */
public final class C10877b extends AbstractC10762r {

    /* renamed from: a */
    public final int f21425a;

    /* renamed from: b */
    public final int f21426b;

    /* renamed from: c */
    public boolean f21427c;

    /* renamed from: d */
    public int f21428d;

    public C10877b(int i, int i2, int i3) {
        this.f21425a = i3;
        this.f21426b = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f21427c = z;
        this.f21428d = z ? i : i2;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        return this.f21427c;
    }

    @Override // kotlin.collections.AbstractC10762r
    public final int nextInt() {
        int i = this.f21428d;
        if (i != this.f21426b) {
            this.f21428d = this.f21425a + i;
        } else if (!this.f21427c) {
            throw new NoSuchElementException();
        } else {
            this.f21427c = false;
        }
        return i;
    }
}
