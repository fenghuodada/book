package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.C0063d;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC11097q1;
import kotlinx.coroutines.C11078l1;
import kotlinx.coroutines.C11093p0;
import kotlinx.coroutines.internal.C11064v;
import kotlinx.coroutines.scheduling.C11107c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,217:1\n1#2:218\n17#3:219\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n*L\n147#1:219\n*E\n"})
/* renamed from: kotlinx.coroutines.android.c */
/* loaded from: classes3.dex */
public final class C10942c extends AbstractC10943d {
    @Nullable
    private volatile C10942c _immediate;
    @NotNull

    /* renamed from: c */
    public final Handler f21493c;
    @Nullable

    /* renamed from: d */
    public final String f21494d;

    /* renamed from: e */
    public final boolean f21495e;
    @NotNull

    /* renamed from: f */
    public final C10942c f21496f;

    public C10942c(Handler handler) {
        this(handler, null, false);
    }

    @Override // kotlinx.coroutines.AbstractC10946b0
    /* renamed from: G */
    public final void mo100G(@NotNull InterfaceC10775f interfaceC10775f, @NotNull Runnable runnable) {
        if (!this.f21493c.post(runnable)) {
            C11078l1.m224a(interfaceC10775f, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
            C11093p0.f21709b.mo100G(interfaceC10775f, runnable);
        }
    }

    @Override // kotlinx.coroutines.AbstractC10946b0
    /* renamed from: H */
    public final boolean mo352H() {
        return (this.f21495e && C10843j.m435a(Looper.myLooper(), this.f21493c.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.AbstractC11097q1
    /* renamed from: I */
    public final AbstractC11097q1 mo169I() {
        return this.f21496f;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof C10942c) && ((C10942c) obj).f21493c == this.f21493c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f21493c);
    }

    @Override // kotlinx.coroutines.AbstractC11097q1, kotlinx.coroutines.AbstractC10946b0
    @NotNull
    public final String toString() {
        AbstractC11097q1 abstractC11097q1;
        String str;
        C11107c c11107c = C11093p0.f21708a;
        AbstractC11097q1 abstractC11097q12 = C11064v.f21674a;
        if (this == abstractC11097q12) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC11097q1 = abstractC11097q12.mo169I();
            } catch (UnsupportedOperationException unused) {
                abstractC11097q1 = null;
            }
            if (this == abstractC11097q1) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f21494d;
            if (str2 == null) {
                str2 = this.f21493c.toString();
            }
            if (this.f21495e) {
                return C0063d.m13053a(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    public C10942c(Handler handler, String str, boolean z) {
        this.f21493c = handler;
        this.f21494d = str;
        this.f21495e = z;
        this._immediate = z ? this : null;
        C10942c c10942c = this._immediate;
        if (c10942c == null) {
            c10942c = new C10942c(handler, str, true);
            this._immediate = c10942c;
        }
        this.f21496f = c10942c;
    }
}
