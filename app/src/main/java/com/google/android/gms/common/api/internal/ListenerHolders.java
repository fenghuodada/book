package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes.dex */
public class ListenerHolders {
    private final Set<ListenerHolder<?>> zaa = Collections.newSetFromMap(new WeakHashMap());

    @NonNull
    @KeepForSdk
    public static <L> ListenerHolder<L> createListenerHolder(@NonNull L l, @NonNull Looper looper, @NonNull String str) {
        Preconditions.checkNotNull(l, "Listener must not be null");
        Preconditions.checkNotNull(looper, "Looper must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        return new ListenerHolder<>(looper, l, str);
    }

    @NonNull
    @KeepForSdk
    public static <L> ListenerHolder<L> createListenerHolder(@NonNull L l, @NonNull Executor executor, @NonNull String str) {
        Preconditions.checkNotNull(l, "Listener must not be null");
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        return new ListenerHolder<>(executor, l, str);
    }

    @NonNull
    @KeepForSdk
    public static <L> ListenerHolder.ListenerKey<L> createListenerKey(@NonNull L l, @NonNull String str) {
        Preconditions.checkNotNull(l, "Listener must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        Preconditions.checkNotEmpty(str, "Listener type must not be empty");
        return new ListenerHolder.ListenerKey<>(l, str);
    }

    @NonNull
    public final <L> ListenerHolder<L> zaa(@NonNull L l, @NonNull Looper looper, @NonNull String str) {
        ListenerHolder<L> createListenerHolder = createListenerHolder(l, looper, "NO_TYPE");
        this.zaa.add(createListenerHolder);
        return createListenerHolder;
    }

    public final void zab() {
        for (ListenerHolder<?> listenerHolder : this.zaa) {
            listenerHolder.clear();
        }
        this.zaa.clear();
    }
}
