package com.google.firebase.crashlytics.internal.model;

import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0539e;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application extends CrashlyticsReport.Session.Event.Application {
    private final Boolean background;
    private final ImmutableList<CrashlyticsReport.CustomAttribute> customAttributes;
    private final CrashlyticsReport.Session.Event.Application.Execution execution;
    private final ImmutableList<CrashlyticsReport.CustomAttribute> internalKeys;
    private final int uiOrientation;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Builder {
        private Boolean background;
        private ImmutableList<CrashlyticsReport.CustomAttribute> customAttributes;
        private CrashlyticsReport.Session.Event.Application.Execution execution;
        private ImmutableList<CrashlyticsReport.CustomAttribute> internalKeys;
        private Integer uiOrientation;

        public Builder() {
        }

        private Builder(CrashlyticsReport.Session.Event.Application application) {
            this.execution = application.getExecution();
            this.customAttributes = application.getCustomAttributes();
            this.internalKeys = application.getInternalKeys();
            this.background = application.getBackground();
            this.uiOrientation = Integer.valueOf(application.getUiOrientation());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application build() {
            String str;
            if (this.execution == null) {
                str = " execution";
            } else {
                str = "";
            }
            if (this.uiOrientation == null) {
                str = C0063d.m13053a(str, " uiOrientation");
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application(this.execution, this.customAttributes, this.internalKeys, this.background, this.uiOrientation.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setBackground(@Nullable Boolean bool) {
            this.background = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setCustomAttributes(ImmutableList<CrashlyticsReport.CustomAttribute> immutableList) {
            this.customAttributes = immutableList;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setExecution(CrashlyticsReport.Session.Event.Application.Execution execution) {
            if (execution != null) {
                this.execution = execution;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setInternalKeys(ImmutableList<CrashlyticsReport.CustomAttribute> immutableList) {
            this.internalKeys = immutableList;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public CrashlyticsReport.Session.Event.Application.Builder setUiOrientation(int i) {
            this.uiOrientation = Integer.valueOf(i);
            return this;
        }
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport.Session.Event.Application.Execution execution, @Nullable ImmutableList<CrashlyticsReport.CustomAttribute> immutableList, @Nullable ImmutableList<CrashlyticsReport.CustomAttribute> immutableList2, @Nullable Boolean bool, int i) {
        this.execution = execution;
        this.customAttributes = immutableList;
        this.internalKeys = immutableList2;
        this.background = bool;
        this.uiOrientation = i;
    }

    public boolean equals(Object obj) {
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList;
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application) {
            CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
            return this.execution.equals(application.getExecution()) && ((immutableList = this.customAttributes) != null ? immutableList.equals(application.getCustomAttributes()) : application.getCustomAttributes() == null) && ((immutableList2 = this.internalKeys) != null ? immutableList2.equals(application.getInternalKeys()) : application.getInternalKeys() == null) && ((bool = this.background) != null ? bool.equals(application.getBackground()) : application.getBackground() == null) && this.uiOrientation == application.getUiOrientation();
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public Boolean getBackground() {
        return this.background;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public ImmutableList<CrashlyticsReport.CustomAttribute> getCustomAttributes() {
        return this.customAttributes;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @NonNull
    public CrashlyticsReport.Session.Event.Application.Execution getExecution() {
        return this.execution;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public ImmutableList<CrashlyticsReport.CustomAttribute> getInternalKeys() {
        return this.internalKeys;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public int getUiOrientation() {
        return this.uiOrientation;
    }

    public int hashCode() {
        int hashCode = (this.execution.hashCode() ^ 1000003) * 1000003;
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList = this.customAttributes;
        int hashCode2 = (hashCode ^ (immutableList == null ? 0 : immutableList.hashCode())) * 1000003;
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList2 = this.internalKeys;
        int hashCode3 = (hashCode2 ^ (immutableList2 == null ? 0 : immutableList2.hashCode())) * 1000003;
        Boolean bool = this.background;
        return ((hashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.uiOrientation;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public CrashlyticsReport.Session.Event.Application.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.execution);
        sb.append(", customAttributes=");
        sb.append(this.customAttributes);
        sb.append(", internalKeys=");
        sb.append(this.internalKeys);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", uiOrientation=");
        return C0539e.m12264b(sb, this.uiOrientation, "}");
    }
}
