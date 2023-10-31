package com.google.firebase.crashlytics.internal.model;

import androidx.concurrent.futures.C0484a;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AutoValue_StaticSessionData_DeviceData extends StaticSessionData.DeviceData {
    private final int arch;
    private final int availableProcessors;
    private final long diskSpace;
    private final boolean isEmulator;
    private final String manufacturer;
    private final String model;
    private final String modelClass;
    private final int state;
    private final long totalRam;

    public AutoValue_StaticSessionData_DeviceData(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.arch = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.model = str;
        this.availableProcessors = i2;
        this.totalRam = j;
        this.diskSpace = j2;
        this.isEmulator = z;
        this.state = i3;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.manufacturer = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.modelClass = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int arch() {
        return this.arch;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int availableProcessors() {
        return this.availableProcessors;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long diskSpace() {
        return this.diskSpace;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData.DeviceData) {
            StaticSessionData.DeviceData deviceData = (StaticSessionData.DeviceData) obj;
            return this.arch == deviceData.arch() && this.model.equals(deviceData.model()) && this.availableProcessors == deviceData.availableProcessors() && this.totalRam == deviceData.totalRam() && this.diskSpace == deviceData.diskSpace() && this.isEmulator == deviceData.isEmulator() && this.state == deviceData.state() && this.manufacturer.equals(deviceData.manufacturer()) && this.modelClass.equals(deviceData.modelClass());
        }
        return false;
    }

    public int hashCode() {
        long j = this.totalRam;
        long j2 = this.diskSpace;
        return ((((((((((((((((this.arch ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.availableProcessors) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.isEmulator ? 1231 : 1237)) * 1000003) ^ this.state) * 1000003) ^ this.manufacturer.hashCode()) * 1000003) ^ this.modelClass.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public boolean isEmulator() {
        return this.isEmulator;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String manufacturer() {
        return this.manufacturer;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String model() {
        return this.model;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String modelClass() {
        return this.modelClass;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int state() {
        return this.state;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.arch);
        sb.append(", model=");
        sb.append(this.model);
        sb.append(", availableProcessors=");
        sb.append(this.availableProcessors);
        sb.append(", totalRam=");
        sb.append(this.totalRam);
        sb.append(", diskSpace=");
        sb.append(this.diskSpace);
        sb.append(", isEmulator=");
        sb.append(this.isEmulator);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", manufacturer=");
        sb.append(this.manufacturer);
        sb.append(", modelClass=");
        return C0484a.m12392a(sb, this.modelClass, "}");
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long totalRam() {
        return this.totalRam;
    }
}
