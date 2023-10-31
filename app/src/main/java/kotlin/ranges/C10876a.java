package kotlin.ranges;

import java.util.Iterator;
import kotlin.jvm.internal.markers.InterfaceC10847a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.ranges.a */
/* loaded from: classes3.dex */
public class C10876a implements Iterable<Integer>, InterfaceC10847a {

    /* renamed from: a */
    public final int f21422a;

    /* renamed from: b */
    public final int f21423b;

    /* renamed from: c */
    public final int f21424c;

    public C10876a(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.f21422a = i;
                if (i3 > 0) {
                    if (i < i2) {
                        int i4 = i2 % i3;
                        int i5 = i % i3;
                        int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                        i2 -= i6 < 0 ? i6 + i3 : i6;
                    }
                } else if (i3 < 0) {
                    if (i > i2) {
                        int i7 = -i3;
                        int i8 = i % i7;
                        int i9 = i2 % i7;
                        int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                        i2 += i10 < 0 ? i10 + i7 : i10;
                    }
                } else {
                    throw new IllegalArgumentException("Step is zero.");
                }
                this.f21423b = i2;
                this.f21424c = i3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C10876a) {
            if (!isEmpty() || !((C10876a) obj).isEmpty()) {
                C10876a c10876a = (C10876a) obj;
                if (this.f21422a != c10876a.f21422a || this.f21423b != c10876a.f21423b || this.f21424c != c10876a.f21424c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f21422a * 31) + this.f21423b) * 31) + this.f21424c;
    }

    public boolean isEmpty() {
        int i = this.f21424c;
        int i2 = this.f21423b;
        int i3 = this.f21422a;
        if (i > 0) {
            if (i3 > i2) {
                return true;
            }
        } else if (i3 < i2) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new C10877b(this.f21422a, this.f21423b, this.f21424c);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i = this.f21423b;
        int i2 = this.f21422a;
        int i3 = this.f21424c;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
