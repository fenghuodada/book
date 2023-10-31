package kotlin.text;

import kotlin.jvm.internal.C10843j;
import kotlin.ranges.C10878c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.text.d */
/* loaded from: classes3.dex */
public final class C10913d {
    @NotNull

    /* renamed from: a */
    public final String f21463a;
    @NotNull

    /* renamed from: b */
    public final C10878c f21464b;

    public C10913d(@NotNull String str, @NotNull C10878c c10878c) {
        this.f21463a = str;
        this.f21464b = c10878c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10913d) {
            C10913d c10913d = (C10913d) obj;
            return C10843j.m435a(this.f21463a, c10913d.f21463a) && C10843j.m435a(this.f21464b, c10913d.f21464b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21464b.hashCode() + (this.f21463a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "MatchGroup(value=" + this.f21463a + ", range=" + this.f21464b + ')';
    }
}
