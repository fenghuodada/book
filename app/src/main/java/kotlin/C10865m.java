package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.m */
/* loaded from: classes3.dex */
public final class C10865m<T> implements InterfaceC10794g<T>, Serializable {
    @Nullable

    /* renamed from: a */
    public InterfaceC10809a<? extends T> f21414a;
    @Nullable

    /* renamed from: b */
    public volatile Object f21415b;
    @NotNull

    /* renamed from: c */
    public final Object f21416c;

    public C10865m(InterfaceC10809a initializer) {
        C10843j.m430f(initializer, "initializer");
        this.f21414a = initializer;
        this.f21415b = C10866n.f21417a;
        this.f21416c = this;
    }

    @Override // kotlin.InterfaceC10794g
    public final T getValue() {
        T t;
        T t2 = (T) this.f21415b;
        C10866n c10866n = C10866n.f21417a;
        if (t2 != c10866n) {
            return t2;
        }
        synchronized (this.f21416c) {
            t = (T) this.f21415b;
            if (t == c10866n) {
                InterfaceC10809a<? extends T> interfaceC10809a = this.f21414a;
                C10843j.m433c(interfaceC10809a);
                t = interfaceC10809a.invoke();
                this.f21415b = t;
                this.f21414a = null;
            }
        }
        return t;
    }

    @NotNull
    public final String toString() {
        boolean z;
        if (this.f21415b != C10866n.f21417a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
