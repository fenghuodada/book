package kotlin;

import java.io.Serializable;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@JvmInline
/* renamed from: kotlin.k */
/* loaded from: classes3.dex */
public final class C10862k<T> implements Serializable {

    /* renamed from: kotlin.k$a */
    /* loaded from: classes3.dex */
    public static final class C10863a implements Serializable {
        @JvmField
        @NotNull

        /* renamed from: a */
        public final Throwable f21413a;

        public C10863a(@NotNull Throwable exception) {
            C10843j.m430f(exception, "exception");
            this.f21413a = exception;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof C10863a) {
                if (C10843j.m435a(this.f21413a, ((C10863a) obj).f21413a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f21413a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Failure(" + this.f21413a + ')';
        }
    }

    @Nullable
    /* renamed from: a */
    public static final Throwable m420a(Object obj) {
        if (obj instanceof C10863a) {
            return ((C10863a) obj).f21413a;
        }
        return null;
    }
}
