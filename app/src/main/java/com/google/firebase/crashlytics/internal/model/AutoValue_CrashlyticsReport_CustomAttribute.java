package com.google.firebase.crashlytics.internal.model;

import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.C0484a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_CustomAttribute extends CrashlyticsReport.CustomAttribute {
    private final String key;
    private final String value;

    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.CustomAttribute.Builder {
        private String key;
        private String value;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute build() {
            String str;
            if (this.key == null) {
                str = " key";
            } else {
                str = "";
            }
            if (this.value == null) {
                str = C0063d.m13053a(str, " value");
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_CustomAttribute(this.key, this.value);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute.Builder setKey(String str) {
            if (str != null) {
                this.key = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute.Builder setValue(String str) {
            if (str != null) {
                this.value = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    private AutoValue_CrashlyticsReport_CustomAttribute(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.CustomAttribute) {
            CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
            return this.key.equals(customAttribute.getKey()) && this.value.equals(customAttribute.getValue());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    @NonNull
    public String getKey() {
        return this.key;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    @NonNull
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return ((this.key.hashCode() ^ 1000003) * 1000003) ^ this.value.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.key);
        sb.append(", value=");
        return C0484a.m12392a(sb, this.value, "}");
    }
}
