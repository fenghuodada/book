package kotlin.ranges;

import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1537:1\n1#2:1538\n*E\n"})
/* renamed from: kotlin.ranges.g */
/* loaded from: classes3.dex */
public class C10882g {
    /* renamed from: a */
    public static final long m413a(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    @NotNull
    /* renamed from: b */
    public static final C10876a m412b(@NotNull C10876a c10876a, int i) {
        boolean z;
        C10843j.m430f(c10876a, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Integer step = Integer.valueOf(i);
        C10843j.m430f(step, "step");
        if (z) {
            if (c10876a.f21424c <= 0) {
                i = -i;
            }
            return new C10876a(c10876a.f21422a, c10876a.f21423b, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    @NotNull
    /* renamed from: c */
    public static final C10878c m411c(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            C10878c c10878c = C10878c.f21429d;
            return C10878c.f21429d;
        }
        return new C10878c(i, i2 - 1);
    }
}
