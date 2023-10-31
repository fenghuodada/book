package kotlin.collections;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.markers.InterfaceC10847a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.collections.p */
/* loaded from: classes3.dex */
public final class C10760p implements Map, Serializable, InterfaceC10847a {
    @NotNull

    /* renamed from: a */
    public static final C10760p f21364a = new C10760p();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(@Nullable Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        Void value = (Void) obj;
        C10843j.m430f(value, "value");
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return C10761q.f21365a;
    }

    @Override // java.util.Map
    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return C10761q.f21365a;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    @NotNull
    public final String toString() {
        return JsonUtils.EMPTY_JSON;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return C10759o.f21363a;
    }
}
