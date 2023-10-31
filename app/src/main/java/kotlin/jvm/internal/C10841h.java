package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.InterfaceC10884b;
import kotlin.reflect.InterfaceC10887e;

/* renamed from: kotlin.jvm.internal.h */
/* loaded from: classes3.dex */
public class C10841h extends AbstractC10834b implements InterfaceC10840g, InterfaceC10887e {
    private final int arity;
    @SinceKotlin(version = "1.4")
    private final int flags;

    public C10841h(int i) {
        this(i, AbstractC10834b.NO_RECEIVER, null, null, null, 0);
    }

    @SinceKotlin(version = "1.1")
    public C10841h(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @SinceKotlin(version = "1.4")
    public C10841h(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    @Override // kotlin.jvm.internal.AbstractC10834b
    @SinceKotlin(version = "1.1")
    public InterfaceC10884b computeReflected() {
        C10860y.f21411a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10841h) {
            C10841h c10841h = (C10841h) obj;
            return getName().equals(c10841h.getName()) && getSignature().equals(c10841h.getSignature()) && this.flags == c10841h.flags && this.arity == c10841h.arity && C10843j.m435a(getBoundReceiver(), c10841h.getBoundReceiver()) && C10843j.m435a(getOwner(), c10841h.getOwner());
        } else if (obj instanceof InterfaceC10887e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    @Override // kotlin.jvm.internal.InterfaceC10840g
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.jvm.internal.AbstractC10834b
    @SinceKotlin(version = "1.1")
    public InterfaceC10887e getReflected() {
        return (InterfaceC10887e) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.InterfaceC10887e
    @SinceKotlin(version = "1.1")
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.InterfaceC10887e
    @SinceKotlin(version = "1.1")
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.InterfaceC10887e
    @SinceKotlin(version = "1.1")
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.InterfaceC10887e
    @SinceKotlin(version = "1.1")
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC10834b, kotlin.reflect.InterfaceC10884b
    @SinceKotlin(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC10884b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
