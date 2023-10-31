package com.google.firebase.sessions.settings;

import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10824p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(m509d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m508d2 = {"Lorg/json/JSONObject;", "it", "Lkotlin/p;", "<anonymous>"}, m507k = 3, m506mv = {1, 7, 1})
@DebugMetadata(m454c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", m453f = "RemoteSettings.kt", m452i = {0, 0, 0, 1, 1, 2}, m451l = {122, 125, 128, 130, 131, 133}, m450m = "invokeSuspend", m449n = {"sessionSamplingRate", "sessionTimeoutSeconds", "cacheDuration", "sessionSamplingRate", "cacheDuration", "cacheDuration"}, m448s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
public final class RemoteSettings$updateSettings$2$1 extends AbstractC10790f implements InterfaceC10824p<JSONObject, InterfaceC10772d<? super C10868p>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, InterfaceC10772d<? super RemoteSettings$updateSettings$2$1> interfaceC10772d) {
        super(2, interfaceC10772d);
        this.this$0 = remoteSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @NotNull
    public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.this$0, interfaceC10772d);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    @Nullable
    public final Object invoke(@NotNull JSONObject jSONObject, @Nullable InterfaceC10772d<? super C10868p> interfaceC10772d) {
        return ((RemoteSettings$updateSettings$2$1) create(jSONObject, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018b A[RETURN] */
    /* JADX WARN: Type inference failed for: r12v12, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
