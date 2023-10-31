package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C10868p;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CompletedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,662:1\n1#2:663\n*E\n"})
/* renamed from: kotlinx.coroutines.s */
/* loaded from: classes3.dex */
public final class C11101s {
    @JvmField
    @Nullable

    /* renamed from: a */
    public final Object f21712a;
    @JvmField
    @Nullable

    /* renamed from: b */
    public final AbstractC10980f f21713b;
    @JvmField
    @Nullable

    /* renamed from: c */
    public final InterfaceC10820l<Throwable, C10868p> f21714c;
    @JvmField
    @Nullable

    /* renamed from: d */
    public final Object f21715d;
    @JvmField
    @Nullable

    /* renamed from: e */
    public final Throwable f21716e;

    /* JADX WARN: Multi-variable type inference failed */
    public C11101s(@Nullable Object obj, @Nullable AbstractC10980f abstractC10980f, @Nullable InterfaceC10820l<? super Throwable, C10868p> interfaceC10820l, @Nullable Object obj2, @Nullable Throwable th) {
        this.f21712a = obj;
        this.f21713b = abstractC10980f;
        this.f21714c = interfaceC10820l;
        this.f21715d = obj2;
        this.f21716e = th;
    }

    public /* synthetic */ C11101s(Object obj, AbstractC10980f abstractC10980f, InterfaceC10820l interfaceC10820l, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : abstractC10980f, (i & 4) != 0 ? null : interfaceC10820l, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    /* renamed from: a */
    public static C11101s m166a(C11101s c11101s, AbstractC10980f abstractC10980f, CancellationException cancellationException, int i) {
        Object obj;
        InterfaceC10820l<Throwable, C10868p> interfaceC10820l;
        Object obj2 = null;
        if ((i & 1) != 0) {
            obj = c11101s.f21712a;
        } else {
            obj = null;
        }
        if ((i & 2) != 0) {
            abstractC10980f = c11101s.f21713b;
        }
        AbstractC10980f abstractC10980f2 = abstractC10980f;
        if ((i & 4) != 0) {
            interfaceC10820l = c11101s.f21714c;
        } else {
            interfaceC10820l = null;
        }
        if ((i & 8) != 0) {
            obj2 = c11101s.f21715d;
        }
        Object obj3 = obj2;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c11101s.f21716e;
        }
        c11101s.getClass();
        return new C11101s(obj, abstractC10980f2, interfaceC10820l, obj3, cancellationException2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11101s) {
            C11101s c11101s = (C11101s) obj;
            return C10843j.m435a(this.f21712a, c11101s.f21712a) && C10843j.m435a(this.f21713b, c11101s.f21713b) && C10843j.m435a(this.f21714c, c11101s.f21714c) && C10843j.m435a(this.f21715d, c11101s.f21715d) && C10843j.m435a(this.f21716e, c11101s.f21716e);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f21712a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC10980f abstractC10980f = this.f21713b;
        int hashCode2 = (hashCode + (abstractC10980f == null ? 0 : abstractC10980f.hashCode())) * 31;
        InterfaceC10820l<Throwable, C10868p> interfaceC10820l = this.f21714c;
        int hashCode3 = (hashCode2 + (interfaceC10820l == null ? 0 : interfaceC10820l.hashCode())) * 31;
        Object obj2 = this.f21715d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f21716e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CompletedContinuation(result=" + this.f21712a + ", cancelHandler=" + this.f21713b + ", onCancellation=" + this.f21714c + ", idempotentResume=" + this.f21715d + ", cancelCause=" + this.f21716e + ')';
    }
}
