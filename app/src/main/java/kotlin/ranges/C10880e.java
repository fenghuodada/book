package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.AbstractC10763s;

/* renamed from: kotlin.ranges.e */
/* loaded from: classes3.dex */
public final class C10880e extends AbstractC10763s {

    /* renamed from: a */
    public final long f21433a;

    /* renamed from: b */
    public final long f21434b;

    /* renamed from: c */
    public boolean f21435c;

    /* renamed from: d */
    public long f21436d;

    public C10880e(long j, long j2, long j3) {
        this.f21433a = j3;
        this.f21434b = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.f21435c = z;
        this.f21436d = z ? j : j2;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        return this.f21435c;
    }

    @Override // kotlin.collections.AbstractC10763s
    public final long nextLong() {
        long j = this.f21436d;
        if (j != this.f21434b) {
            this.f21436d = this.f21433a + j;
        } else if (!this.f21435c) {
            throw new NoSuchElementException();
        } else {
            this.f21435c = false;
        }
        return j;
    }
}
