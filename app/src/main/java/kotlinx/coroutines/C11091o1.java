package kotlinx.coroutines;

import kotlin.jvm.JvmField;
import kotlinx.coroutines.internal.C11034f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.o1 */
/* loaded from: classes3.dex */
public final class C11091o1 {
    @NotNull

    /* renamed from: a */
    public static final C11034f0 f21701a = new C11034f0("COMPLETING_ALREADY");
    @JvmField
    @NotNull

    /* renamed from: b */
    public static final C11034f0 f21702b = new C11034f0("COMPLETING_WAITING_CHILDREN");
    @NotNull

    /* renamed from: c */
    public static final C11034f0 f21703c = new C11034f0("COMPLETING_RETRY");
    @NotNull

    /* renamed from: d */
    public static final C11034f0 f21704d = new C11034f0("TOO_LATE_TO_CANCEL");
    @NotNull

    /* renamed from: e */
    public static final C11034f0 f21705e = new C11034f0("SEALED");
    @NotNull

    /* renamed from: f */
    public static final C11102s0 f21706f = new C11102s0(false);
    @NotNull

    /* renamed from: g */
    public static final C11102s0 f21707g = new C11102s0(true);

    @Nullable
    /* renamed from: a */
    public static final Object m172a(@Nullable Object obj) {
        InterfaceC10954c1 interfaceC10954c1;
        C10973d1 c10973d1 = obj instanceof C10973d1 ? (C10973d1) obj : null;
        return (c10973d1 == null || (interfaceC10954c1 = c10973d1.f21547a) == null) ? obj : interfaceC10954c1;
    }
}
