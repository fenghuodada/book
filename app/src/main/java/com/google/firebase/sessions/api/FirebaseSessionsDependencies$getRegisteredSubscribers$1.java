package com.google.firebase.sessions.api;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m507k = 3, m506mv = {1, 7, 1}, m504xi = 48)
@DebugMetadata(m454c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", m453f = "FirebaseSessionsDependencies.kt", m452i = {0, 0, 0}, m451l = {107}, m450m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions", m449n = {"destination$iv$iv", "subscriberName", "$this$withLock_u24default$iv"}, m448s = {"L$0", "L$2", "L$3"})
/* loaded from: classes3.dex */
public final class FirebaseSessionsDependencies$getRegisteredSubscribers$1 extends AbstractC10786c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirebaseSessionsDependencies this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseSessionsDependencies$getRegisteredSubscribers$1(FirebaseSessionsDependencies firebaseSessionsDependencies, InterfaceC10772d<? super FirebaseSessionsDependencies$getRegisteredSubscribers$1> interfaceC10772d) {
        super(interfaceC10772d);
        this.this$0 = firebaseSessionsDependencies;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
    }
}
