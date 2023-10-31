package androidx.datastore.preferences.core;

import java.util.Map;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.datastore.preferences.core.d */
/* loaded from: classes.dex */
public abstract class AbstractC1138d {

    /* renamed from: androidx.datastore.preferences.core.d$a */
    /* loaded from: classes.dex */
    public static final class C1139a<T> {
        @NotNull

        /* renamed from: a */
        public final String f2935a;

        public C1139a(@NotNull String str) {
            this.f2935a = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof C1139a) {
                return C10843j.m435a(this.f2935a, ((C1139a) obj).f2935a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f2935a.hashCode();
        }

        @NotNull
        public final String toString() {
            return this.f2935a;
        }
    }

    /* renamed from: androidx.datastore.preferences.core.d$b */
    /* loaded from: classes.dex */
    public static final class C1140b<T> {
    }

    @NotNull
    /* renamed from: a */
    public abstract Map<C1139a<?>, Object> mo11183a();

    @Nullable
    /* renamed from: b */
    public abstract <T> T mo11182b(@NotNull C1139a<T> c1139a);
}
