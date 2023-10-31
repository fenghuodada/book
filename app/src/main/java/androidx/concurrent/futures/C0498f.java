package androidx.concurrent.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.InterfaceFutureC8037a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.concurrent.futures.f */
/* loaded from: classes.dex */
public final class C0498f<V> extends AbstractC0487d<V> {
    @Override // androidx.concurrent.futures.AbstractC0487d
    public final boolean set(@Nullable V v) {
        return super.set(v);
    }

    @Override // androidx.concurrent.futures.AbstractC0487d
    public final boolean setException(Throwable th) {
        return super.setException(th);
    }

    @Override // androidx.concurrent.futures.AbstractC0487d
    public final boolean setFuture(InterfaceFutureC8037a<? extends V> interfaceFutureC8037a) {
        return super.setFuture(interfaceFutureC8037a);
    }
}
