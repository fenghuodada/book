package androidx.datastore.core;

import java.util.LinkedHashSet;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(m454c = "androidx.datastore.core.SingleProcessDataStore", m453f = "SingleProcessDataStore.kt", m452i = {0, 0, 0}, m451l = {402, 410}, m450m = "transformAndWrite", m449n = {"this", "curDataAndHash", "curData"}, m448s = {"L$0", "L$1", "L$2"})
/* renamed from: androidx.datastore.core.z */
/* loaded from: classes.dex */
public final class C1129z extends AbstractC10786c {

    /* renamed from: a */
    public C1107q f2913a;

    /* renamed from: b */
    public Object f2914b;

    /* renamed from: c */
    public Object f2915c;

    /* renamed from: d */
    public /* synthetic */ Object f2916d;

    /* renamed from: e */
    public final /* synthetic */ C1107q<Object> f2917e;

    /* renamed from: f */
    public int f2918f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1129z(C1107q<Object> c1107q, InterfaceC10772d<? super C1129z> interfaceC10772d) {
        super(interfaceC10772d);
        this.f2917e = c1107q;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f2916d = obj;
        this.f2918f |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = C1107q.f2828k;
        return this.f2917e.m11189i(this, null, null);
    }
}
