package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m508d2 = {"Lcom/google/firebase/sessions/DataCollectionStatus;", "", "performance", "Lcom/google/firebase/sessions/DataCollectionState;", "crashlytics", "sessionSamplingRate", "", "(Lcom/google/firebase/sessions/DataCollectionState;Lcom/google/firebase/sessions/DataCollectionState;D)V", "getCrashlytics", "()Lcom/google/firebase/sessions/DataCollectionState;", "getPerformance", "getSessionSamplingRate", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
/* loaded from: classes3.dex */
public final class DataCollectionStatus {
    @NotNull
    private final DataCollectionState crashlytics;
    @NotNull
    private final DataCollectionState performance;
    private final double sessionSamplingRate;

    public DataCollectionStatus() {
        this(null, null, 0.0d, 7, null);
    }

    public DataCollectionStatus(@NotNull DataCollectionState performance, @NotNull DataCollectionState crashlytics, double d) {
        C10843j.m430f(performance, "performance");
        C10843j.m430f(crashlytics, "crashlytics");
        this.performance = performance;
        this.crashlytics = crashlytics;
        this.sessionSamplingRate = d;
    }

    public /* synthetic */ DataCollectionStatus(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d, int i, C10839f c10839f) {
        this((i & 1) != 0 ? DataCollectionState.COLLECTION_ENABLED : dataCollectionState, (i & 2) != 0 ? DataCollectionState.COLLECTION_ENABLED : dataCollectionState2, (i & 4) != 0 ? 1.0d : d);
    }

    public static /* synthetic */ DataCollectionStatus copy$default(DataCollectionStatus dataCollectionStatus, DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            dataCollectionState = dataCollectionStatus.performance;
        }
        if ((i & 2) != 0) {
            dataCollectionState2 = dataCollectionStatus.crashlytics;
        }
        if ((i & 4) != 0) {
            d = dataCollectionStatus.sessionSamplingRate;
        }
        return dataCollectionStatus.copy(dataCollectionState, dataCollectionState2, d);
    }

    @NotNull
    public final DataCollectionState component1() {
        return this.performance;
    }

    @NotNull
    public final DataCollectionState component2() {
        return this.crashlytics;
    }

    public final double component3() {
        return this.sessionSamplingRate;
    }

    @NotNull
    public final DataCollectionStatus copy(@NotNull DataCollectionState performance, @NotNull DataCollectionState crashlytics, double d) {
        C10843j.m430f(performance, "performance");
        C10843j.m430f(crashlytics, "crashlytics");
        return new DataCollectionStatus(performance, crashlytics, d);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataCollectionStatus) {
            DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) obj;
            return this.performance == dataCollectionStatus.performance && this.crashlytics == dataCollectionStatus.crashlytics && C10843j.m435a(Double.valueOf(this.sessionSamplingRate), Double.valueOf(dataCollectionStatus.sessionSamplingRate));
        }
        return false;
    }

    @NotNull
    public final DataCollectionState getCrashlytics() {
        return this.crashlytics;
    }

    @NotNull
    public final DataCollectionState getPerformance() {
        return this.performance;
    }

    public final double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public int hashCode() {
        int hashCode = this.crashlytics.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.sessionSamplingRate);
        return ((hashCode + (this.performance.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    @NotNull
    public String toString() {
        return "DataCollectionStatus(performance=" + this.performance + ", crashlytics=" + this.crashlytics + ", sessionSamplingRate=" + this.sessionSamplingRate + ')';
    }
}
