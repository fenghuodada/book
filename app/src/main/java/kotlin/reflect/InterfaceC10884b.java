package kotlin.reflect;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.reflect.b */
/* loaded from: classes3.dex */
public interface InterfaceC10884b<R> extends InterfaceC10883a {
    R call(@NotNull Object... objArr);

    R callBy(@NotNull Map<Object, ? extends Object> map);

    @NotNull
    List<Object> getParameters();

    @NotNull
    InterfaceC10896k getReturnType();

    @NotNull
    List<Object> getTypeParameters();

    @Nullable
    EnumC10897l getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
