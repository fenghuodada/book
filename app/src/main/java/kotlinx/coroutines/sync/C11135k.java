package kotlinx.coroutines.sync;

import kotlinx.coroutines.internal.C11034f0;
import kotlinx.coroutines.internal.C11036g0;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.sync.k */
/* loaded from: classes3.dex */
public final class C11135k {

    /* renamed from: a */
    public static final int f21788a = C11036g0.m263b("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12);
    @NotNull

    /* renamed from: b */
    public static final C11034f0 f21789b = new C11034f0("PERMIT");
    @NotNull

    /* renamed from: c */
    public static final C11034f0 f21790c = new C11034f0("TAKEN");
    @NotNull

    /* renamed from: d */
    public static final C11034f0 f21791d = new C11034f0("BROKEN");
    @NotNull

    /* renamed from: e */
    public static final C11034f0 f21792e = new C11034f0("CANCELLED");

    /* renamed from: f */
    public static final int f21793f = C11036g0.m263b("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12);
}
