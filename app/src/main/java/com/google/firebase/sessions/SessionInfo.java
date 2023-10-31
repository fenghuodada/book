package com.google.firebase.sessions;

import androidx.appcompat.widget.C0406q1;
import androidx.core.p003os.C0740h;
import kotlin.Metadata;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003JE\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0006HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006)"}, m508d2 = {"Lcom/google/firebase/sessions/SessionInfo;", "", "sessionId", "", "firstSessionId", "sessionIndex", "", "eventTimestampUs", "", "dataCollectionStatus", "Lcom/google/firebase/sessions/DataCollectionStatus;", "firebaseInstallationId", "(Ljava/lang/String;Ljava/lang/String;IJLcom/google/firebase/sessions/DataCollectionStatus;Ljava/lang/String;)V", "getDataCollectionStatus", "()Lcom/google/firebase/sessions/DataCollectionStatus;", "setDataCollectionStatus", "(Lcom/google/firebase/sessions/DataCollectionStatus;)V", "getEventTimestampUs", "()J", "setEventTimestampUs", "(J)V", "getFirebaseInstallationId", "()Ljava/lang/String;", "setFirebaseInstallationId", "(Ljava/lang/String;)V", "getFirstSessionId", "getSessionId", "getSessionIndex", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
/* loaded from: classes3.dex */
public final class SessionInfo {
    @NotNull
    private DataCollectionStatus dataCollectionStatus;
    private long eventTimestampUs;
    @NotNull
    private String firebaseInstallationId;
    @NotNull
    private final String firstSessionId;
    @NotNull
    private final String sessionId;
    private final int sessionIndex;

    public SessionInfo(@NotNull String sessionId, @NotNull String firstSessionId, int i, long j, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String firebaseInstallationId) {
        C10843j.m430f(sessionId, "sessionId");
        C10843j.m430f(firstSessionId, "firstSessionId");
        C10843j.m430f(dataCollectionStatus, "dataCollectionStatus");
        C10843j.m430f(firebaseInstallationId, "firebaseInstallationId");
        this.sessionId = sessionId;
        this.firstSessionId = firstSessionId;
        this.sessionIndex = i;
        this.eventTimestampUs = j;
        this.dataCollectionStatus = dataCollectionStatus;
        this.firebaseInstallationId = firebaseInstallationId;
    }

    public /* synthetic */ SessionInfo(String str, String str2, int i, long j, DataCollectionStatus dataCollectionStatus, String str3, int i2, C10839f c10839f) {
        this(str, str2, i, j, (i2 & 16) != 0 ? new DataCollectionStatus(null, null, 0.0d, 7, null) : dataCollectionStatus, (i2 & 32) != 0 ? "" : str3);
    }

    public static /* synthetic */ SessionInfo copy$default(SessionInfo sessionInfo, String str, String str2, int i, long j, DataCollectionStatus dataCollectionStatus, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sessionInfo.sessionId;
        }
        if ((i2 & 2) != 0) {
            str2 = sessionInfo.firstSessionId;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i = sessionInfo.sessionIndex;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = sessionInfo.eventTimestampUs;
        }
        long j2 = j;
        if ((i2 & 16) != 0) {
            dataCollectionStatus = sessionInfo.dataCollectionStatus;
        }
        DataCollectionStatus dataCollectionStatus2 = dataCollectionStatus;
        if ((i2 & 32) != 0) {
            str3 = sessionInfo.firebaseInstallationId;
        }
        return sessionInfo.copy(str, str4, i3, j2, dataCollectionStatus2, str3);
    }

    @NotNull
    public final String component1() {
        return this.sessionId;
    }

    @NotNull
    public final String component2() {
        return this.firstSessionId;
    }

    public final int component3() {
        return this.sessionIndex;
    }

    public final long component4() {
        return this.eventTimestampUs;
    }

    @NotNull
    public final DataCollectionStatus component5() {
        return this.dataCollectionStatus;
    }

    @NotNull
    public final String component6() {
        return this.firebaseInstallationId;
    }

    @NotNull
    public final SessionInfo copy(@NotNull String sessionId, @NotNull String firstSessionId, int i, long j, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String firebaseInstallationId) {
        C10843j.m430f(sessionId, "sessionId");
        C10843j.m430f(firstSessionId, "firstSessionId");
        C10843j.m430f(dataCollectionStatus, "dataCollectionStatus");
        C10843j.m430f(firebaseInstallationId, "firebaseInstallationId");
        return new SessionInfo(sessionId, firstSessionId, i, j, dataCollectionStatus, firebaseInstallationId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SessionInfo) {
            SessionInfo sessionInfo = (SessionInfo) obj;
            return C10843j.m435a(this.sessionId, sessionInfo.sessionId) && C10843j.m435a(this.firstSessionId, sessionInfo.firstSessionId) && this.sessionIndex == sessionInfo.sessionIndex && this.eventTimestampUs == sessionInfo.eventTimestampUs && C10843j.m435a(this.dataCollectionStatus, sessionInfo.dataCollectionStatus) && C10843j.m435a(this.firebaseInstallationId, sessionInfo.firebaseInstallationId);
        }
        return false;
    }

    @NotNull
    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    @NotNull
    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @NotNull
    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    public int hashCode() {
        String str = this.firstSessionId;
        long j = this.eventTimestampUs;
        int hashCode = this.dataCollectionStatus.hashCode();
        return this.firebaseInstallationId.hashCode() + ((hashCode + ((((C0406q1.m12537a(str, this.sessionId.hashCode() * 31, 31) + this.sessionIndex) * 31) + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final void setDataCollectionStatus(@NotNull DataCollectionStatus dataCollectionStatus) {
        C10843j.m430f(dataCollectionStatus, "<set-?>");
        this.dataCollectionStatus = dataCollectionStatus;
    }

    public final void setEventTimestampUs(long j) {
        this.eventTimestampUs = j;
    }

    public final void setFirebaseInstallationId(@NotNull String str) {
        C10843j.m430f(str, "<set-?>");
        this.firebaseInstallationId = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.sessionId);
        sb.append(", firstSessionId=");
        sb.append(this.firstSessionId);
        sb.append(", sessionIndex=");
        sb.append(this.sessionIndex);
        sb.append(", eventTimestampUs=");
        sb.append(this.eventTimestampUs);
        sb.append(", dataCollectionStatus=");
        sb.append(this.dataCollectionStatus);
        sb.append(", firebaseInstallationId=");
        return C0740h.m11848b(sb, this.firebaseInstallationId, ')');
    }
}
