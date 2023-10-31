package com.google.android.exoplayer2.drm;

import android.media.MediaDrm;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C6622C;
import com.google.android.exoplayer2.util.C7408g0;

@RequiresApi(21)
/* renamed from: com.google.android.exoplayer2.drm.q */
/* loaded from: classes.dex */
public final class C6796q {
    @DoNotInline
    /* renamed from: a */
    public static boolean m5981a(@Nullable Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    @DoNotInline
    /* renamed from: b */
    public static int m5980b(Throwable th) {
        String[] split;
        int length;
        boolean z;
        String diagnosticInfo = ((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo();
        int i = C7408g0.f13905a;
        int i2 = 0;
        if (diagnosticInfo != null && (length = (split = diagnosticInfo.split("_", -1)).length) >= 2) {
            String str = split[length - 1];
            if (length >= 3 && "neg".equals(split[length - 2])) {
                z = true;
            } else {
                z = false;
            }
            try {
                str.getClass();
                i2 = Integer.parseInt(str);
                if (z) {
                    i2 = -i2;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return C6622C.m6218a(i2);
    }
}
