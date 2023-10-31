package com.google.firebase.sessions;

import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m508d2 = {"Lcom/google/firebase/sessions/SessionInitiateListener;", "", "Lcom/google/firebase/sessions/SessionDetails;", "sessionDetails", "Lkotlin/p;", "onInitiateSession", "(Lcom/google/firebase/sessions/SessionDetails;Lkotlin/coroutines/d;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public interface SessionInitiateListener {
    @Nullable
    Object onInitiateSession(@NotNull SessionDetails sessionDetails, @NotNull InterfaceC10772d<? super C10868p> interfaceC10772d);
}
