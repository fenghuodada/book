package kotlin.coroutines.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.C10860y;
import kotlin.jvm.internal.C10861z;
import kotlin.jvm.internal.InterfaceC10840g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
/* renamed from: kotlin.coroutines.jvm.internal.f */
/* loaded from: classes3.dex */
public abstract class AbstractC10790f extends AbstractC10786c implements InterfaceC10840g<Object> {
    private final int arity;

    public AbstractC10790f(int i) {
        this(i, null);
    }

    public AbstractC10790f(int i, @Nullable InterfaceC10772d<Object> interfaceC10772d) {
        super(interfaceC10772d);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.InterfaceC10840g
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @NotNull
    public String toString() {
        if (getCompletion() == null) {
            C10860y.f21411a.getClass();
            String m421a = C10861z.m421a(this);
            C10843j.m431e(m421a, "renderLambdaToString(this)");
            return m421a;
        }
        return super.toString();
    }
}
