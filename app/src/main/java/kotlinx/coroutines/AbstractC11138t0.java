package kotlinx.coroutines;

import kotlin.collections.C10749e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
/* renamed from: kotlinx.coroutines.t0 */
/* loaded from: classes3.dex */
public abstract class AbstractC11138t0 extends AbstractC10946b0 {

    /* renamed from: f */
    public static final /* synthetic */ int f21797f = 0;

    /* renamed from: c */
    public long f21798c;

    /* renamed from: d */
    public boolean f21799d;
    @Nullable

    /* renamed from: e */
    public C10749e<AbstractC11080m0<?>> f21800e;

    /* renamed from: I */
    public final void m127I(boolean z) {
        long j = this.f21798c - (z ? 4294967296L : 1L);
        this.f21798c = j;
        if (j <= 0 && this.f21799d) {
            shutdown();
        }
    }

    /* renamed from: J */
    public final void m126J(boolean z) {
        this.f21798c = (z ? 4294967296L : 1L) + this.f21798c;
        if (z) {
            return;
        }
        this.f21799d = true;
    }

    /* renamed from: K */
    public long mo123K() {
        return !m125L() ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: L */
    public final boolean m125L() {
        AbstractC11080m0<?> removeFirst;
        C10749e<AbstractC11080m0<?>> c10749e = this.f21800e;
        if (c10749e == null) {
            return false;
        }
        if (c10749e.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = c10749e.removeFirst();
        }
        AbstractC11080m0<?> abstractC11080m0 = removeFirst;
        if (abstractC11080m0 == null) {
            return false;
        }
        abstractC11080m0.run();
        return true;
    }

    public void shutdown() {
    }
}
