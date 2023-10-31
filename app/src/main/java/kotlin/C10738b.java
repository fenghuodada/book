package kotlin;

import kotlin.internal.C10799b;
import kotlin.internal.HidesMembers;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.b */
/* loaded from: classes3.dex */
public final class C10738b {
    @SinceKotlin(version = "1.1")
    @HidesMembers
    /* renamed from: a */
    public static final void m502a(@NotNull Throwable th, @NotNull Throwable exception) {
        C10843j.m430f(th, "<this>");
        C10843j.m430f(exception, "exception");
        if (th != exception) {
            C10799b.f21392a.mo445a(th, exception);
        }
    }
}
