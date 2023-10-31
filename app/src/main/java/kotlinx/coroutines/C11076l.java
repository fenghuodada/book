package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.Volatile;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.l */
/* loaded from: classes3.dex */
public final class C11076l extends C11137t {
    @NotNull

    /* renamed from: c */
    public static final AtomicIntegerFieldUpdater f21682c = AtomicIntegerFieldUpdater.newUpdater(C11076l.class, "_resumed");
    @Volatile
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C11076l(@org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10772d<?> r3, @org.jetbrains.annotations.Nullable java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L1a
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Continuation "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1a:
            r2.<init>(r5, r4)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C11076l.<init>(kotlin.coroutines.d, java.lang.Throwable, boolean):void");
    }
}
