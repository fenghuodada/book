package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m507k = 3, m506mv = {1, 7, 1}, m504xi = 48)
@DebugMetadata(m454c = "com.google.firebase.sessions.SessionCoordinator", m453f = "SessionCoordinator.kt", m452i = {0, 0}, m451l = {36}, m450m = "attemptLoggingSessionEvent", m449n = {"this", "sessionEvent"}, m448s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class SessionCoordinator$attemptLoggingSessionEvent$1 extends AbstractC10786c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionCoordinator$attemptLoggingSessionEvent$1(SessionCoordinator sessionCoordinator, InterfaceC10772d<? super SessionCoordinator$attemptLoggingSessionEvent$1> interfaceC10772d) {
        super(interfaceC10772d);
        this.this$0 = sessionCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.attemptLoggingSessionEvent(null, this);
    }
}
