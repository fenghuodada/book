package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
/* renamed from: kotlin.jvm.internal.o */
/* loaded from: classes3.dex */
public final class C10850o implements InterfaceC10836c {
    @NotNull

    /* renamed from: a */
    public final Class<?> f21406a;

    public C10850o(@NotNull Class jClass) {
        C10843j.m430f(jClass, "jClass");
        this.f21406a = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC10836c
    @NotNull
    /* renamed from: a */
    public final Class<?> mo423a() {
        return this.f21406a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C10850o) {
            if (C10843j.m435a(this.f21406a, ((C10850o) obj).f21406a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21406a.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.f21406a.toString() + " (Kotlin reflection is not available)";
    }
}
