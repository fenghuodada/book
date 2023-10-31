package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(32)
/* loaded from: classes.dex */
public final class zzg {
    @DoNotInline
    public static void zza(AudioAttributes.Builder builder, int i) {
        builder.setSpatializationBehavior(i);
    }
}
