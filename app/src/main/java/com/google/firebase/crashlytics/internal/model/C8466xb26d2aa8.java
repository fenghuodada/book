package com.google.firebase.crashlytics.internal.model;

import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.C0484a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch */
/* loaded from: classes3.dex */
final class C8466xb26d2aa8 extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch {
    private final String arch;
    private final String buildId;
    private final String libraryName;

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch$Builder */
    /* loaded from: classes3.dex */
    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder {
        private String arch;
        private String buildId;
        private String libraryName;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch build() {
            String str;
            if (this.arch == null) {
                str = " arch";
            } else {
                str = "";
            }
            if (this.libraryName == null) {
                str = C0063d.m13053a(str, " libraryName");
            }
            if (this.buildId == null) {
                str = C0063d.m13053a(str, " buildId");
            }
            if (str.isEmpty()) {
                return new C8466xb26d2aa8(this.arch, this.libraryName, this.buildId);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setArch(String str) {
            if (str != null) {
                this.arch = str;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setBuildId(String str) {
            if (str != null) {
                this.buildId = str;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setLibraryName(String str) {
            if (str != null) {
                this.libraryName = str;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }

    private C8466xb26d2aa8(String str, String str2, String str3) {
        this.arch = str;
        this.libraryName = str2;
        this.buildId = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) {
            CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
            return this.arch.equals(buildIdMappingForArch.getArch()) && this.libraryName.equals(buildIdMappingForArch.getLibraryName()) && this.buildId.equals(buildIdMappingForArch.getBuildId());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @NonNull
    public String getArch() {
        return this.arch;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @NonNull
    public String getBuildId() {
        return this.buildId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @NonNull
    public String getLibraryName() {
        return this.libraryName;
    }

    public int hashCode() {
        return ((((this.arch.hashCode() ^ 1000003) * 1000003) ^ this.libraryName.hashCode()) * 1000003) ^ this.buildId.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.arch);
        sb.append(", libraryName=");
        sb.append(this.libraryName);
        sb.append(", buildId=");
        return C0484a.m12392a(sb, this.buildId, "}");
    }
}
