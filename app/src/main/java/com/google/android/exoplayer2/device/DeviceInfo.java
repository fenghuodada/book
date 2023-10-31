package com.google.android.exoplayer2.device;

import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes.dex */
public final class DeviceInfo {

    /* renamed from: a */
    public final int f10943a = 0;

    /* renamed from: b */
    public final int f10944b;

    /* renamed from: c */
    public final int f10945c;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface PlaybackType {
    }

    public DeviceInfo(int i, int i2) {
        this.f10944b = i;
        this.f10945c = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceInfo) {
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            return this.f10943a == deviceInfo.f10943a && this.f10944b == deviceInfo.f10944b && this.f10945c == deviceInfo.f10945c;
        }
        return false;
    }

    public final int hashCode() {
        return ((((527 + this.f10943a) * 31) + this.f10944b) * 31) + this.f10945c;
    }
}
