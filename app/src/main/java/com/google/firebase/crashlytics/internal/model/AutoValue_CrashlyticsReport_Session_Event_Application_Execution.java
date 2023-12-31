package com.google.firebase.crashlytics.internal.model;

import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution extends CrashlyticsReport.Session.Event.Application.Execution {
    private final CrashlyticsReport.ApplicationExitInfo appExitInfo;
    private final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> binaries;
    private final CrashlyticsReport.Session.Event.Application.Execution.Exception exception;
    private final CrashlyticsReport.Session.Event.Application.Execution.Signal signal;
    private final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> threads;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Builder {
        private CrashlyticsReport.ApplicationExitInfo appExitInfo;
        private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> binaries;
        private CrashlyticsReport.Session.Event.Application.Execution.Exception exception;
        private CrashlyticsReport.Session.Event.Application.Execution.Signal signal;
        private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> threads;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution build() {
            String str;
            if (this.signal == null) {
                str = " signal";
            } else {
                str = "";
            }
            if (this.binaries == null) {
                str = C0063d.m13053a(str, " binaries");
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution(this.threads, this.exception, this.appExitInfo, this.signal, this.binaries);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setAppExitInfo(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.appExitInfo = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setBinaries(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> immutableList) {
            if (immutableList != null) {
                this.binaries = immutableList;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setException(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.exception = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setSignal(CrashlyticsReport.Session.Event.Application.Execution.Signal signal) {
            if (signal != null) {
                this.signal = signal;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Builder setThreads(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> immutableList) {
            this.threads = immutableList;
            return this;
        }
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution(@Nullable ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> immutableList, @Nullable CrashlyticsReport.Session.Event.Application.Execution.Exception exception, @Nullable CrashlyticsReport.ApplicationExitInfo applicationExitInfo, CrashlyticsReport.Session.Event.Application.Execution.Signal signal, ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> immutableList2) {
        this.threads = immutableList;
        this.exception = exception;
        this.appExitInfo = applicationExitInfo;
        this.signal = signal;
        this.binaries = immutableList2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution) {
            CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
            ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> immutableList = this.threads;
            if (immutableList != null ? immutableList.equals(execution.getThreads()) : execution.getThreads() == null) {
                CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.exception;
                if (exception != null ? exception.equals(execution.getException()) : execution.getException() == null) {
                    CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.appExitInfo;
                    if (applicationExitInfo != null ? applicationExitInfo.equals(execution.getAppExitInfo()) : execution.getAppExitInfo() == null) {
                        if (this.signal.equals(execution.getSignal()) && this.binaries.equals(execution.getBinaries())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @Nullable
    public CrashlyticsReport.ApplicationExitInfo getAppExitInfo() {
        return this.appExitInfo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @NonNull
    public ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> getBinaries() {
        return this.binaries;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @Nullable
    public CrashlyticsReport.Session.Event.Application.Execution.Exception getException() {
        return this.exception;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @NonNull
    public CrashlyticsReport.Session.Event.Application.Execution.Signal getSignal() {
        return this.signal;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @Nullable
    public ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> getThreads() {
        return this.threads;
    }

    public int hashCode() {
        ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> immutableList = this.threads;
        int hashCode = ((immutableList == null ? 0 : immutableList.hashCode()) ^ 1000003) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.exception;
        int hashCode2 = (hashCode ^ (exception == null ? 0 : exception.hashCode())) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.appExitInfo;
        return ((((hashCode2 ^ (applicationExitInfo != null ? applicationExitInfo.hashCode() : 0)) * 1000003) ^ this.signal.hashCode()) * 1000003) ^ this.binaries.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.threads + ", exception=" + this.exception + ", appExitInfo=" + this.appExitInfo + ", signal=" + this.signal + ", binaries=" + this.binaries + "}";
    }
}
