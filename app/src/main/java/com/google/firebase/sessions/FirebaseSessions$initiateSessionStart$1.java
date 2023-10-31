package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m507k = 3, m506mv = {1, 7, 1}, m504xi = 48)
@DebugMetadata(m454c = "com.google.firebase.sessions.FirebaseSessions", m453f = "FirebaseSessions.kt", m452i = {0, 0, 1, 1}, m451l = {106, 129, 141}, m450m = "initiateSessionStart", m449n = {"this", "sessionDetails", "this", "sessionDetails"}, m448s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
public final class FirebaseSessions$initiateSessionStart$1 extends AbstractC10786c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirebaseSessions this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseSessions$initiateSessionStart$1(FirebaseSessions firebaseSessions, InterfaceC10772d<? super FirebaseSessions$initiateSessionStart$1> interfaceC10772d) {
        super(interfaceC10772d);
        this.this$0 = firebaseSessions;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object initiateSessionStart;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        initiateSessionStart = this.this$0.initiateSessionStart(null, this);
        return initiateSessionStart;
    }
}
