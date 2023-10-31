package kotlinx.coroutines;

import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlinx.coroutines.internal.C11034f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.h */
/* loaded from: classes3.dex */
public interface InterfaceC11015h<T> extends InterfaceC10772d<T> {
    @InternalCoroutinesApi
    @Nullable
    /* renamed from: g */
    C11034f0 mo136g(Object obj, @Nullable InterfaceC10820l interfaceC10820l);

    @ExperimentalCoroutinesApi
    /* renamed from: n */
    void mo135n(T t, @Nullable InterfaceC10820l<? super Throwable, C10868p> interfaceC10820l);

    /* renamed from: p */
    boolean mo134p(@Nullable Throwable th);

    @InternalCoroutinesApi
    /* renamed from: r */
    void mo133r(@NotNull Object obj);
}
