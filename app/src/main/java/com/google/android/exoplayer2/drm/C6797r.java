package com.google.android.exoplayer2.drm;

import android.media.MediaDrmResetException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* renamed from: com.google.android.exoplayer2.drm.r */
/* loaded from: classes.dex */
public final class C6797r {
    @DoNotInline
    /* renamed from: a */
    public static boolean m5979a(@Nullable Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}
