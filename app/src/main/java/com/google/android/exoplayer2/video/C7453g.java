package com.google.android.exoplayer2.video;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.mediacodec.C7023m;
import com.google.android.exoplayer2.mediacodec.C7024n;

/* renamed from: com.google.android.exoplayer2.video.g */
/* loaded from: classes.dex */
public final class C7453g extends C7023m {
    public C7453g(IllegalStateException illegalStateException, @Nullable C7024n c7024n, @Nullable Surface surface) {
        super(illegalStateException, c7024n);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
