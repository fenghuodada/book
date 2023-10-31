package com.google.firebase.sessions;

import androidx.appcompat.widget.C0406q1;
import androidx.core.p003os.C0740h;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m508d2 = {"Lcom/google/firebase/sessions/AndroidApplicationInfo;", "", "packageName", "", "versionName", "appBuildVersion", "deviceManufacturer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppBuildVersion", "()Ljava/lang/String;", "getDeviceManufacturer", "getPackageName", "getVersionName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
/* loaded from: classes3.dex */
public final class AndroidApplicationInfo {
    @NotNull
    private final String appBuildVersion;
    @NotNull
    private final String deviceManufacturer;
    @NotNull
    private final String packageName;
    @NotNull
    private final String versionName;

    public AndroidApplicationInfo(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer) {
        C10843j.m430f(packageName, "packageName");
        C10843j.m430f(versionName, "versionName");
        C10843j.m430f(appBuildVersion, "appBuildVersion");
        C10843j.m430f(deviceManufacturer, "deviceManufacturer");
        this.packageName = packageName;
        this.versionName = versionName;
        this.appBuildVersion = appBuildVersion;
        this.deviceManufacturer = deviceManufacturer;
    }

    public static /* synthetic */ AndroidApplicationInfo copy$default(AndroidApplicationInfo androidApplicationInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = androidApplicationInfo.packageName;
        }
        if ((i & 2) != 0) {
            str2 = androidApplicationInfo.versionName;
        }
        if ((i & 4) != 0) {
            str3 = androidApplicationInfo.appBuildVersion;
        }
        if ((i & 8) != 0) {
            str4 = androidApplicationInfo.deviceManufacturer;
        }
        return androidApplicationInfo.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.packageName;
    }

    @NotNull
    public final String component2() {
        return this.versionName;
    }

    @NotNull
    public final String component3() {
        return this.appBuildVersion;
    }

    @NotNull
    public final String component4() {
        return this.deviceManufacturer;
    }

    @NotNull
    public final AndroidApplicationInfo copy(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer) {
        C10843j.m430f(packageName, "packageName");
        C10843j.m430f(versionName, "versionName");
        C10843j.m430f(appBuildVersion, "appBuildVersion");
        C10843j.m430f(deviceManufacturer, "deviceManufacturer");
        return new AndroidApplicationInfo(packageName, versionName, appBuildVersion, deviceManufacturer);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidApplicationInfo) {
            AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
            return C10843j.m435a(this.packageName, androidApplicationInfo.packageName) && C10843j.m435a(this.versionName, androidApplicationInfo.versionName) && C10843j.m435a(this.appBuildVersion, androidApplicationInfo.appBuildVersion) && C10843j.m435a(this.deviceManufacturer, androidApplicationInfo.deviceManufacturer);
        }
        return false;
    }

    @NotNull
    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    @NotNull
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return this.deviceManufacturer.hashCode() + C0406q1.m12537a(this.appBuildVersion, C0406q1.m12537a(this.versionName, this.packageName.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidApplicationInfo(packageName=");
        sb.append(this.packageName);
        sb.append(", versionName=");
        sb.append(this.versionName);
        sb.append(", appBuildVersion=");
        sb.append(this.appBuildVersion);
        sb.append(", deviceManufacturer=");
        return C0740h.m11848b(sb, this.deviceManufacturer, ')');
    }
}
