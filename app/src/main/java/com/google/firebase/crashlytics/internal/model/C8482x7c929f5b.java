package com.google.firebase.crashlytics.internal.model;

import android.support.p000v4.media.session.C0017a;
import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal */
/* loaded from: classes3.dex */
final class C8482x7c929f5b extends CrashlyticsReport.Session.Event.Application.Execution.Signal {
    private final long address;
    private final String code;
    private final String name;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal$Builder */
    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {
        private Long address;
        private String code;
        private String name;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal build() {
            String str;
            if (this.name == null) {
                str = " name";
            } else {
                str = "";
            }
            if (this.code == null) {
                str = C0063d.m13053a(str, " code");
            }
            if (this.address == null) {
                str = C0063d.m13053a(str, " address");
            }
            if (str.isEmpty()) {
                return new C8482x7c929f5b(this.name, this.code, this.address.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setAddress(long j) {
            this.address = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setCode(String str) {
            if (str != null) {
                this.code = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setName(String str) {
            if (str != null) {
                this.name = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    private C8482x7c929f5b(String str, String str2, long j) {
        this.name = str;
        this.code = str2;
        this.address = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Signal) {
            CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
            return this.name.equals(signal.getName()) && this.code.equals(signal.getCode()) && this.address == signal.getAddress();
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    @NonNull
    public long getAddress() {
        return this.address;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    @NonNull
    public String getCode() {
        return this.code;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    @NonNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        long j = this.address;
        return ((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.code.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.name);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", address=");
        return C0017a.m13071a(sb, this.address, "}");
    }
}
