package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.t */
/* loaded from: classes3.dex */
public class C11137t {
    @NotNull

    /* renamed from: b */
    public static final AtomicIntegerFieldUpdater f21795b = AtomicIntegerFieldUpdater.newUpdater(C11137t.class, "_handled");
    @Volatile
    private volatile int _handled;
    @JvmField
    @NotNull

    /* renamed from: a */
    public final Throwable f21796a;

    public C11137t(boolean z, @NotNull Throwable th) {
        this.f21796a = th;
        this._handled = z ? 1 : 0;
    }

    @NotNull
    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f21796a + ']';
    }
}
