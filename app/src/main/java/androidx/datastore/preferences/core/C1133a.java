package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.AbstractC1138d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C10757m;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.datastore.preferences.core.a */
/* loaded from: classes.dex */
public final class C1133a extends AbstractC1138d {
    @NotNull

    /* renamed from: a */
    public final Map<AbstractC1138d.C1139a<?>, Object> f2927a;
    @NotNull

    /* renamed from: b */
    public final AtomicBoolean f2928b;

    /* renamed from: androidx.datastore.preferences.core.a$a */
    /* loaded from: classes.dex */
    public static final class C1134a extends AbstractC10844k implements InterfaceC10820l<Map.Entry<AbstractC1138d.C1139a<?>, Object>, CharSequence> {

        /* renamed from: a */
        public static final C1134a f2929a = new C1134a();

        public C1134a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.InterfaceC10820l
        public final CharSequence invoke(Map.Entry<AbstractC1138d.C1139a<?>, Object> entry) {
            Map.Entry<AbstractC1138d.C1139a<?>, Object> entry2 = entry;
            C10843j.m430f(entry2, "entry");
            return "  " + entry2.getKey().f2935a + " = " + entry2.getValue();
        }
    }

    public C1133a() {
        this(false, 3);
    }

    public C1133a(@NotNull Map<AbstractC1138d.C1139a<?>, Object> preferencesMap, boolean z) {
        C10843j.m430f(preferencesMap, "preferencesMap");
        this.f2927a = preferencesMap;
        this.f2928b = new AtomicBoolean(z);
    }

    public /* synthetic */ C1133a(boolean z, int i) {
        this((i & 1) != 0 ? new LinkedHashMap() : null, (i & 2) != 0 ? true : z);
    }

    @Override // androidx.datastore.preferences.core.AbstractC1138d
    @NotNull
    /* renamed from: a */
    public final Map<AbstractC1138d.C1139a<?>, Object> mo11183a() {
        Map<AbstractC1138d.C1139a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.f2927a);
        C10843j.m431e(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // androidx.datastore.preferences.core.AbstractC1138d
    @Nullable
    /* renamed from: b */
    public final <T> T mo11182b(@NotNull AbstractC1138d.C1139a<T> key) {
        C10843j.m430f(key, "key");
        return (T) this.f2927a.get(key);
    }

    /* renamed from: c */
    public final void m11186c() {
        if (!(!this.f2928b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    /* renamed from: d */
    public final void m11185d(@NotNull AbstractC1138d.C1139a<?> key, @Nullable Object obj) {
        C10843j.m430f(key, "key");
        m11186c();
        Map<AbstractC1138d.C1139a<?>, Object> map = this.f2927a;
        if (obj == null) {
            m11186c();
            map.remove(key);
            return;
        }
        if (obj instanceof Set) {
            obj = Collections.unmodifiableSet(C10757m.m469t((Iterable) obj));
            C10843j.m431e(obj, "unmodifiableSet(value.toSet())");
        }
        map.put(key, obj);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C1133a) {
            return C10843j.m435a(this.f2927a, ((C1133a) obj).f2927a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2927a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C10757m.m475n(this.f2927a.entrySet(), ",\n", "{\n", "\n}", C1134a.f2929a, 24);
    }
}
