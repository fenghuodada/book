package com.google.firebase.sessions.settings;

import android.util.Log;
import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10824p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m508d2 = {"", "msg", "Lkotlin/p;", "<anonymous>"}, m507k = 3, m506mv = {1, 7, 1})
@DebugMetadata(m454c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", m453f = "RemoteSettings.kt", m452i = {}, m451l = {}, m450m = "invokeSuspend", m449n = {}, m448s = {})
/* loaded from: classes3.dex */
public final class RemoteSettings$updateSettings$2$2 extends AbstractC10790f implements InterfaceC10824p<String, InterfaceC10772d<? super C10868p>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public RemoteSettings$updateSettings$2$2(InterfaceC10772d<? super RemoteSettings$updateSettings$2$2> interfaceC10772d) {
        super(2, interfaceC10772d);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @NotNull
    public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(interfaceC10772d);
        remoteSettings$updateSettings$2$2.L$0 = obj;
        return remoteSettings$updateSettings$2$2;
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    @Nullable
    public final Object invoke(@NotNull String str, @Nullable InterfaceC10772d<? super C10868p> interfaceC10772d) {
        return ((RemoteSettings$updateSettings$2$2) create(str, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        if (this.label == 0) {
            C10864l.m418b(obj);
            Log.e(RemoteSettings.TAG, "Error failing to fetch the remote configs: " + ((String) this.L$0));
            return C10868p.f21418a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
