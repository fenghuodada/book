package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m507k = 3, m506mv = {1, 7, 1}, m504xi = 48)
@DebugMetadata(m454c = "com.google.firebase.sessions.settings.SessionsSettings", m453f = "SessionsSettings.kt", m452i = {0}, m451l = {116, 117}, m450m = "updateSettings", m449n = {"this"}, m448s = {"L$0"})
/* loaded from: classes3.dex */
public final class SessionsSettings$updateSettings$1 extends AbstractC10786c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionsSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionsSettings$updateSettings$1(SessionsSettings sessionsSettings, InterfaceC10772d<? super SessionsSettings$updateSettings$1> interfaceC10772d) {
        super(interfaceC10772d);
        this.this$0 = sessionsSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateSettings(this);
    }
}
