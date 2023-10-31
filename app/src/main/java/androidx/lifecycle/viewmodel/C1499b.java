package androidx.lifecycle.viewmodel;

import androidx.lifecycle.AbstractC1460f0;
import androidx.lifecycle.C1469h0;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n13579#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n*L\n105#1:116,2\n*E\n"})
/* renamed from: androidx.lifecycle.viewmodel.b */
/* loaded from: classes.dex */
public final class C1499b implements C1469h0.InterfaceC1471b {
    @NotNull

    /* renamed from: a */
    public final C1501d<?>[] f3476a;

    public C1499b(@NotNull C1501d<?>... initializers) {
        C10843j.m430f(initializers, "initializers");
        this.f3476a = initializers;
    }

    @Override // androidx.lifecycle.C1469h0.InterfaceC1471b
    public final AbstractC1460f0 create(Class modelClass) {
        C10843j.m430f(modelClass, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // androidx.lifecycle.C1469h0.InterfaceC1471b
    @NotNull
    public final <T extends AbstractC1460f0> T create(@NotNull Class<T> cls, @NotNull AbstractC1497a abstractC1497a) {
        C1501d<?>[] c1501dArr;
        T t = null;
        for (C1501d<?> c1501d : this.f3476a) {
            if (C10843j.m435a(c1501d.f3477a, cls)) {
                Object invoke = c1501d.f3478b.invoke(abstractC1497a);
                t = invoke instanceof AbstractC1460f0 ? (T) invoke : null;
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
