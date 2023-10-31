package kotlinx.coroutines;

import kotlin.C10868p;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.u */
/* loaded from: classes3.dex */
public final class C11143u {
    @JvmField
    @Nullable

    /* renamed from: a */
    public final Object f21803a;
    @JvmField
    @NotNull

    /* renamed from: b */
    public final InterfaceC10820l<Throwable, C10868p> f21804b;

    /* JADX WARN: Multi-variable type inference failed */
    public C11143u(@Nullable Object obj, @NotNull InterfaceC10820l<? super Throwable, C10868p> interfaceC10820l) {
        this.f21803a = obj;
        this.f21804b = interfaceC10820l;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11143u) {
            C11143u c11143u = (C11143u) obj;
            return C10843j.m435a(this.f21803a, c11143u.f21803a) && C10843j.m435a(this.f21804b, c11143u.f21804b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f21803a;
        return this.f21804b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f21803a + ", onCancellation=" + this.f21804b + ')';
    }
}
