package com.vungle.warren.downloader;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class DownloadRequest {

    /* renamed from: a */
    public final int f19475a;

    /* renamed from: b */
    public final String f19476b;

    /* renamed from: c */
    public final String f19477c;

    /* renamed from: d */
    public final boolean f19478d;

    /* renamed from: e */
    public final AtomicReference<C9777d> f19479e;

    /* renamed from: f */
    public final String f19480f;

    /* renamed from: g */
    public final String f19481g;

    /* renamed from: h */
    public final AtomicBoolean f19482h;

    /* loaded from: classes3.dex */
    public @interface Priority {
        public static final int CRITICAL = -2147483647;
        public static final int HIGH = 1;
        public static final int HIGHEST = 0;
        public static final int LOWEST = Integer.MAX_VALUE;
    }

    public DownloadRequest(C9777d c9777d, @NonNull String str, @NonNull String str2, String str3) {
        AtomicReference<C9777d> atomicReference = new AtomicReference<>();
        this.f19479e = atomicReference;
        this.f19482h = new AtomicBoolean(false);
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Url or path is empty");
        }
        this.f19475a = 3;
        atomicReference.set(c9777d);
        this.f19476b = str;
        this.f19477c = str2;
        this.f19480f = UUID.nameUUIDFromBytes((str2 + "_" + str).getBytes()).toString();
        this.f19478d = false;
        this.f19481g = str3;
    }

    public final String toString() {
        return "DownloadRequest{networkType=" + this.f19475a + ", priority=" + this.f19479e + ", url='" + this.f19476b + "', path='" + this.f19477c + "', pauseOnConnectionLost=" + this.f19478d + ", id='" + this.f19480f + "', cookieString='" + this.f19481g + "', cancelled=" + this.f19482h + '}';
    }
}
