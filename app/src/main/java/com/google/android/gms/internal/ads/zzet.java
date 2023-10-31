package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import androidx.appcompat.view.menu.C0235r;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class zzet {
    public static void zza(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void zzb(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(C0235r.m12816a("csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
