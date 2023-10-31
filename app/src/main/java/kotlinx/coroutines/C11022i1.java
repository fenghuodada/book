package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/JobCancellationException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,76:1\n26#2:77\n*S KotlinDebug\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/JobCancellationException\n*L\n44#1:77\n*E\n"})
/* renamed from: kotlinx.coroutines.i1 */
/* loaded from: classes3.dex */
public final class C11022i1 extends CancellationException {
    @JvmField
    @NotNull

    /* renamed from: a */
    public final transient InterfaceC11017h1 f21615a;

    public C11022i1(@NotNull String str, @Nullable Throwable th, @NotNull InterfaceC11017h1 interfaceC11017h1) {
        super(str);
        this.f21615a = interfaceC11017h1;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != this) {
            if (obj instanceof C11022i1) {
                C11022i1 c11022i1 = (C11022i1) obj;
                if (!C10843j.m435a(c11022i1.getMessage(), getMessage()) || !C10843j.m435a(c11022i1.f21615a, this.f21615a) || !C10843j.m435a(c11022i1.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        C10843j.m433c(message);
        int hashCode = (this.f21615a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String toString() {
        return super.toString() + "; job=" + this.f21615a;
    }
}
