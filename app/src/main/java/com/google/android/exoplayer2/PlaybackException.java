package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class PlaybackException extends Exception {

    /* renamed from: a */
    public final int f10538a;

    /* renamed from: b */
    public final long f10539b;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ErrorCode {
    }

    public PlaybackException(@Nullable String str, @Nullable Throwable th, int i, long j) {
        super(str, th);
        this.f10538a = i;
        this.f10539b = j;
    }
}
