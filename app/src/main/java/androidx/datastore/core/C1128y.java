package androidx.datastore.core;

import androidx.datastore.core.C1107q;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C10859x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(m454c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", m453f = "SingleProcessDataStore.kt", m452i = {0, 0, 1, 2, 2}, m451l = {503, 337, 339}, m450m = "updateData", m449n = {"transform", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "newData"}, m448s = {"L$0", "L$1", "L$0", "L$0", "L$2"})
/* renamed from: androidx.datastore.core.y */
/* loaded from: classes.dex */
public final class C1128y extends AbstractC10786c {

    /* renamed from: a */
    public Object f2905a;

    /* renamed from: b */
    public Object f2906b;

    /* renamed from: c */
    public Object f2907c;

    /* renamed from: d */
    public C10859x f2908d;

    /* renamed from: e */
    public C1107q f2909e;

    /* renamed from: f */
    public /* synthetic */ Object f2910f;

    /* renamed from: g */
    public final /* synthetic */ C1107q.C1113d f2911g;

    /* renamed from: h */
    public int f2912h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1128y(C1107q.C1113d c1113d, InterfaceC10772d<? super C1128y> interfaceC10772d) {
        super(interfaceC10772d);
        this.f2911g = c1113d;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f2910f = obj;
        this.f2912h |= Integer.MIN_VALUE;
        return this.f2911g.mo11187a(null, this);
    }
}
