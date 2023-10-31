package androidx.datastore.core;

import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.InterfaceC11095q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(m454c = "androidx.datastore.core.SingleProcessDataStore", m453f = "SingleProcessDataStore.kt", m452i = {1, 1}, m451l = {276, 281, 284}, m450m = "handleUpdate", m449n = {"update", "$this$handleUpdate_u24lambda_u2d0"}, m448s = {"L$0", "L$1"})
/* renamed from: androidx.datastore.core.x */
/* loaded from: classes.dex */
public final class C1127x extends AbstractC10786c {

    /* renamed from: a */
    public Object f2899a;

    /* renamed from: b */
    public C1107q f2900b;

    /* renamed from: c */
    public InterfaceC11095q f2901c;

    /* renamed from: d */
    public /* synthetic */ Object f2902d;

    /* renamed from: e */
    public final /* synthetic */ C1107q<Object> f2903e;

    /* renamed from: f */
    public int f2904f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1127x(C1107q<Object> c1107q, InterfaceC10772d<? super C1127x> interfaceC10772d) {
        super(interfaceC10772d);
        this.f2903e = c1107q;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f2902d = obj;
        this.f2904f |= Integer.MIN_VALUE;
        return C1107q.m11196b(this.f2903e, null, this);
    }
}
