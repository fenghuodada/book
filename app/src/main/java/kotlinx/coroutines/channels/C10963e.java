package kotlinx.coroutines.channels;

import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmInline
/* renamed from: kotlinx.coroutines.channels.e */
/* loaded from: classes3.dex */
public final class C10963e<T> {
    @NotNull

    /* renamed from: b */
    public static final C10965b f21540b = new C10965b();
    @Nullable

    /* renamed from: a */
    public final Object f21541a;

    /* renamed from: kotlinx.coroutines.channels.e$a */
    /* loaded from: classes3.dex */
    public static final class C10964a extends C10965b {
        @JvmField
        @Nullable

        /* renamed from: a */
        public final Throwable f21542a;

        public C10964a(@Nullable Throwable th) {
            this.f21542a = th;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof C10964a) {
                if (C10843j.m435a(this.f21542a, ((C10964a) obj).f21542a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.f21542a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.C10963e.C10965b
        @NotNull
        public final String toString() {
            return "Closed(" + this.f21542a + ')';
        }
    }

    /* renamed from: kotlinx.coroutines.channels.e$b */
    /* loaded from: classes3.dex */
    public static class C10965b {
        @NotNull
        public String toString() {
            return "Failed";
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10963e)) {
            return false;
        }
        if (!C10843j.m435a(this.f21541a, ((C10963e) obj).f21541a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f21541a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public final String toString() {
        Object obj = this.f21541a;
        if (obj instanceof C10964a) {
            return ((C10964a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
