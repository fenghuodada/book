package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.j */
/* loaded from: classes3.dex */
public final class C10806j<A, B> implements Serializable {

    /* renamed from: a */
    public final A f21397a;

    /* renamed from: b */
    public final B f21398b;

    public C10806j(A a, B b) {
        this.f21397a = a;
        this.f21398b = b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10806j) {
            C10806j c10806j = (C10806j) obj;
            return C10843j.m435a(this.f21397a, c10806j.f21397a) && C10843j.m435a(this.f21398b, c10806j.f21398b);
        }
        return false;
    }

    public final int hashCode() {
        A a = this.f21397a;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f21398b;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "(" + this.f21397a + ", " + this.f21398b + ')';
    }
}
