package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import androidx.datastore.preferences.protobuf.C1169e;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdjm {
    private final com.google.android.gms.ads.internal.util.zzbo zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdjm(com.google.android.gms.ads.internal.util.zzbo zzboVar, Clock clock, Executor executor) {
        this.zza = zzboVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long elapsedRealtime = this.zzb.elapsedRealtime();
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = this.zzb.elapsedRealtime();
        if (decodeByteArray != null) {
            long j = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            StringBuilder m11130b = C1169e.m11130b("Decoded image w: ", width, " h:", height, " bytes: ");
            m11130b.append(allocationByteCount);
            m11130b.append(" time: ");
            m11130b.append(j);
            m11130b.append(" on ui thread: ");
            m11130b.append(z);
            com.google.android.gms.ads.internal.util.zze.zza(m11130b.toString());
        }
        return decodeByteArray;
    }

    public final /* synthetic */ Bitmap zza(double d, boolean z, zzale zzaleVar) {
        byte[] bArr = zzaleVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfR)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfS)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final zzfwb zzb(String str, final double d, final boolean z) {
        return zzfvr.zzl(this.zza.zza(str), new zzfon() { // from class: com.google.android.gms.internal.ads.zzdjl
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                return zzdjm.this.zza(d, z, (zzale) obj);
            }
        }, this.zzc);
    }
}
