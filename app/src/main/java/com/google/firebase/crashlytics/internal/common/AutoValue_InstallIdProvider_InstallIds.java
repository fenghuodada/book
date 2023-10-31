package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0484a;
import com.google.firebase.crashlytics.internal.common.InstallIdProvider;

/* loaded from: classes3.dex */
final class AutoValue_InstallIdProvider_InstallIds extends InstallIdProvider.InstallIds {
    private final String crashlyticsInstallId;
    private final String firebaseInstallationId;

    public AutoValue_InstallIdProvider_InstallIds(String str, @Nullable String str2) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.crashlyticsInstallId = str;
        this.firebaseInstallationId = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallIdProvider.InstallIds) {
            InstallIdProvider.InstallIds installIds = (InstallIdProvider.InstallIds) obj;
            if (this.crashlyticsInstallId.equals(installIds.getCrashlyticsInstallId())) {
                String str = this.firebaseInstallationId;
                String firebaseInstallationId = installIds.getFirebaseInstallationId();
                if (str == null) {
                    if (firebaseInstallationId == null) {
                        return true;
                    }
                } else if (str.equals(firebaseInstallationId)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    @NonNull
    public String getCrashlyticsInstallId() {
        return this.crashlyticsInstallId;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    @Nullable
    public String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    public int hashCode() {
        int hashCode = (this.crashlyticsInstallId.hashCode() ^ 1000003) * 1000003;
        String str = this.firebaseInstallationId;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.crashlyticsInstallId);
        sb.append(", firebaseInstallationId=");
        return C0484a.m12392a(sb, this.firebaseInstallationId, "}");
    }
}
