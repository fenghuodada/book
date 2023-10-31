package kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.ranges.c */
/* loaded from: classes3.dex */
public final class C10878c extends C10876a {
    @NotNull

    /* renamed from: d */
    public static final C10878c f21429d = new C10878c(1, 0);

    public C10878c(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // kotlin.ranges.C10876a
    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C10878c) {
            if (!isEmpty() || !((C10878c) obj).isEmpty()) {
                C10878c c10878c = (C10878c) obj;
                if (this.f21422a == c10878c.f21422a) {
                    if (this.f21423b == c10878c.f21423b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.C10876a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f21422a * 31) + this.f21423b;
    }

    @Override // kotlin.ranges.C10876a
    public final boolean isEmpty() {
        return this.f21422a > this.f21423b;
    }

    @Override // kotlin.ranges.C10876a
    @NotNull
    public final String toString() {
        return this.f21422a + ".." + this.f21423b;
    }
}
