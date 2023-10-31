package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.jvm.internal.k */
/* loaded from: classes3.dex */
public abstract class AbstractC10844k<R> implements InterfaceC10840g<R>, Serializable {
    private final int arity;

    public AbstractC10844k(int i) {
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.InterfaceC10840g
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        C10860y.f21411a.getClass();
        String m421a = C10861z.m421a(this);
        C10843j.m431e(m421a, "renderLambdaToString(this)");
        return m421a;
    }
}
