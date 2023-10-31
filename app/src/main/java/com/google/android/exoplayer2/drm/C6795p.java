package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
/* renamed from: com.google.android.exoplayer2.drm.p */
/* loaded from: classes.dex */
public final class C6795p {
    @DoNotInline
    /* renamed from: a */
    public static boolean m5983a(@Nullable Throwable th) {
        return th instanceof DeniedByServerException;
    }

    @DoNotInline
    /* renamed from: b */
    public static boolean m5982b(@Nullable Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
