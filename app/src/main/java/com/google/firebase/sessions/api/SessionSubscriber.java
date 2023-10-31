package com.google.firebase.sessions.api;

import androidx.core.p003os.C0740h;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\r\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\u0007\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m508d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber;", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;", "sessionDetails", "Lkotlin/p;", "onSessionChanged", "", "isDataCollectionEnabled", "()Z", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "getSessionSubscriberName", "()Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "sessionSubscriberName", "Name", "SessionDetails", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public interface SessionSubscriber {

    @Metadata(m509d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m508d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "", "(Ljava/lang/String;I)V", "CRASHLYTICS", "PERFORMANCE", "MATT_SAYS_HI", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
    /* loaded from: classes3.dex */
    public enum Name {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    @Metadata(m509d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m508d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;", "", "sessionId", "", "(Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
    /* loaded from: classes3.dex */
    public static final class SessionDetails {
        @NotNull
        private final String sessionId;

        public SessionDetails(@NotNull String sessionId) {
            C10843j.m430f(sessionId, "sessionId");
            this.sessionId = sessionId;
        }

        public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionDetails.sessionId;
            }
            return sessionDetails.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.sessionId;
        }

        @NotNull
        public final SessionDetails copy(@NotNull String sessionId) {
            C10843j.m430f(sessionId, "sessionId");
            return new SessionDetails(sessionId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionDetails) && C10843j.m435a(this.sessionId, ((SessionDetails) obj).sessionId);
        }

        @NotNull
        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        @NotNull
        public String toString() {
            return C0740h.m11848b(new StringBuilder("SessionDetails(sessionId="), this.sessionId, ')');
        }
    }

    @NotNull
    Name getSessionSubscriberName();

    boolean isDataCollectionEnabled();

    void onSessionChanged(@NotNull SessionDetails sessionDetails);
}
