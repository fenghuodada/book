package com.google.firebase.sessions;

import com.google.firebase.installations.FirebaseInstallationsApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m508d2 = {"Lcom/google/firebase/sessions/SessionCoordinator;", "", "Lcom/google/firebase/sessions/SessionEvent;", "sessionEvent", "Lkotlin/p;", "attemptLoggingSessionEvent", "(Lcom/google/firebase/sessions/SessionEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "eventGDTLogger", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "<init>", "(Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/EventGDTLoggerInterface;)V", "Companion", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class SessionCoordinator {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String TAG = "SessionCoordinator";
    @NotNull
    private final EventGDTLoggerInterface eventGDTLogger;
    @NotNull
    private final FirebaseInstallationsApi firebaseInstallations;

    @Metadata(m509d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m508d2 = {"Lcom/google/firebase/sessions/SessionCoordinator$Companion;", "", "()V", "TAG", "", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }
    }

    public SessionCoordinator(@NotNull FirebaseInstallationsApi firebaseInstallations, @NotNull EventGDTLoggerInterface eventGDTLogger) {
        C10843j.m430f(firebaseInstallations, "firebaseInstallations");
        C10843j.m430f(eventGDTLogger, "eventGDTLogger");
        this.firebaseInstallations = firebaseInstallations;
        this.eventGDTLogger = eventGDTLogger;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|(1:(4:9|10|11|12)(2:31|32))(4:33|34|35|(1:37)(1:38))|13|14|15|16|17|18|19))|42|6|(0)(0)|13|14|15|16|17|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
        r1 = r2;
        r2 = r3;
        r3 = r9;
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
        android.util.Log.e(com.google.firebase.sessions.SessionCoordinator.TAG, "Error logging Session Start event to DataTransport: ", r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object attemptLoggingSessionEvent(@org.jetbrains.annotations.NotNull com.google.firebase.sessions.SessionEvent r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10772d<? super kotlin.C10868p> r10) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionCoordinator.attemptLoggingSessionEvent(com.google.firebase.sessions.SessionEvent, kotlin.coroutines.d):java.lang.Object");
    }
}
