package com.google.firebase.crashlytics.internal.model;

import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0539e;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame */
/* loaded from: classes3.dex */
final class C8486xce3d994b extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame {
    private final String file;
    private final int importance;
    private final long offset;

    /* renamed from: pc */
    private final long f16283pc;
    private final String symbol;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder */
    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {
        private String file;
        private Integer importance;
        private Long offset;

        /* renamed from: pc */
        private Long f16284pc;
        private String symbol;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame build() {
            String str;
            if (this.f16284pc == null) {
                str = " pc";
            } else {
                str = "";
            }
            if (this.symbol == null) {
                str = C0063d.m13053a(str, " symbol");
            }
            if (this.offset == null) {
                str = C0063d.m13053a(str, " offset");
            }
            if (this.importance == null) {
                str = C0063d.m13053a(str, " importance");
            }
            if (str.isEmpty()) {
                return new C8486xce3d994b(this.f16284pc.longValue(), this.symbol, this.file, this.offset.longValue(), this.importance.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setFile(String str) {
            this.file = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setImportance(int i) {
            this.importance = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setOffset(long j) {
            this.offset = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setPc(long j) {
            this.f16284pc = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setSymbol(String str) {
            if (str != null) {
                this.symbol = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    private C8486xce3d994b(long j, String str, @Nullable String str2, long j2, int i) {
        this.f16283pc = j;
        this.symbol = str;
        this.file = str2;
        this.offset = j2;
        this.importance = i;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) {
            CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
            return this.f16283pc == frame.getPc() && this.symbol.equals(frame.getSymbol()) && ((str = this.file) != null ? str.equals(frame.getFile()) : frame.getFile() == null) && this.offset == frame.getOffset() && this.importance == frame.getImportance();
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    @Nullable
    public String getFile() {
        return this.file;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public int getImportance() {
        return this.importance;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public long getOffset() {
        return this.offset;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public long getPc() {
        return this.f16283pc;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    @NonNull
    public String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        long j = this.f16283pc;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.symbol.hashCode()) * 1000003;
        String str = this.file;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.offset;
        return ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.importance;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f16283pc);
        sb.append(", symbol=");
        sb.append(this.symbol);
        sb.append(", file=");
        sb.append(this.file);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", importance=");
        return C0539e.m12264b(sb, this.importance, "}");
    }
}
