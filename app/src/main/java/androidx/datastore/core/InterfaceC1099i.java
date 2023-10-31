package androidx.datastore.core;

import kotlin.coroutines.InterfaceC10772d;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlinx.coroutines.flow.InterfaceC10985b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.datastore.core.i */
/* loaded from: classes.dex */
public interface InterfaceC1099i<T> {
    @Nullable
    /* renamed from: a */
    Object mo11184a(@NotNull InterfaceC10824p<? super T, ? super InterfaceC10772d<? super T>, ? extends Object> interfaceC10824p, @NotNull InterfaceC10772d<? super T> interfaceC10772d);

    @NotNull
    InterfaceC10985b<T> getData();
}
