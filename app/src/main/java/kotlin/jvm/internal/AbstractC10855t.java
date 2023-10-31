package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.InterfaceC10884b;
import kotlin.reflect.InterfaceC10891h;

/* renamed from: kotlin.jvm.internal.t */
/* loaded from: classes3.dex */
public abstract class AbstractC10855t extends AbstractC10834b implements InterfaceC10891h {
    private final boolean syntheticJavaProperty;

    public AbstractC10855t() {
        this.syntheticJavaProperty = false;
    }

    @SinceKotlin(version = "1.1")
    public AbstractC10855t(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    @SinceKotlin(version = "1.4")
    public AbstractC10855t(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // kotlin.jvm.internal.AbstractC10834b
    public InterfaceC10884b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC10855t) {
            AbstractC10855t abstractC10855t = (AbstractC10855t) obj;
            return getOwner().equals(abstractC10855t.getOwner()) && getName().equals(abstractC10855t.getName()) && getSignature().equals(abstractC10855t.getSignature()) && C10843j.m435a(getBoundReceiver(), abstractC10855t.getBoundReceiver());
        } else if (obj instanceof InterfaceC10891h) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    @Override // kotlin.jvm.internal.AbstractC10834b
    @SinceKotlin(version = "1.1")
    public InterfaceC10891h getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (InterfaceC10891h) super.getReflected();
    }

    public int hashCode() {
        int hashCode = getName().hashCode();
        return getSignature().hashCode() + ((hashCode + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.InterfaceC10891h
    @SinceKotlin(version = "1.1")
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.InterfaceC10891h
    @SinceKotlin(version = "1.1")
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC10884b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
