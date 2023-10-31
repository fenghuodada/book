package com.google.android.gms.internal.ads;

import android.net.Network;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes.dex */
public final class zzflq extends zzfle {
    private zzfpp<Integer> zza;
    private zzfpp<Integer> zzb;
    @Nullable
    private zzflp zzc;
    @Nullable
    private HttpURLConnection zzd;

    public zzflq() {
        this(new zzfpp() { // from class: com.google.android.gms.internal.ads.zzfln
            @Override // com.google.android.gms.internal.ads.zzfpp
            public final Object zza() {
                return zzflq.zzf();
            }
        }, new zzfpp() { // from class: com.google.android.gms.internal.ads.zzflo
            @Override // com.google.android.gms.internal.ads.zzfpp
            public final Object zza() {
                return zzflq.zzg();
            }
        }, null);
    }

    public zzflq(zzfpp<Integer> zzfppVar, zzfpp<Integer> zzfppVar2, @Nullable zzflp zzflpVar) {
        this.zza = zzfppVar;
        this.zzb = zzfppVar2;
        this.zzc = zzflpVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(@Nullable HttpURLConnection httpURLConnection) {
        zzflf.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzflf.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzflp zzflpVar = this.zzc;
        zzflpVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzflpVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzflp zzflpVar, final int i, final int i2) throws IOException {
        this.zza = new zzfpp() { // from class: com.google.android.gms.internal.ads.zzflg
            @Override // com.google.android.gms.internal.ads.zzfpp
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzfpp() { // from class: com.google.android.gms.internal.ads.zzflh
            @Override // com.google.android.gms.internal.ads.zzfpp
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = zzflpVar;
        return zzm();
    }

    @RequiresApi(21)
    public HttpURLConnection zzo(@NonNull final Network network, @NonNull final URL url, final int i, final int i2) throws IOException {
        this.zza = new zzfpp() { // from class: com.google.android.gms.internal.ads.zzfli
            @Override // com.google.android.gms.internal.ads.zzfpp
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzfpp() { // from class: com.google.android.gms.internal.ads.zzflj
            @Override // com.google.android.gms.internal.ads.zzfpp
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = new zzflp() { // from class: com.google.android.gms.internal.ads.zzflk
            @Override // com.google.android.gms.internal.ads.zzflp
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = network.openConnection(url);
                return openConnection;
            }
        };
        return zzm();
    }

    public URLConnection zzr(@NonNull final URL url, final int i) throws IOException {
        this.zza = new zzfpp() { // from class: com.google.android.gms.internal.ads.zzfll
            @Override // com.google.android.gms.internal.ads.zzfpp
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzc = new zzflp() { // from class: com.google.android.gms.internal.ads.zzflm
            @Override // com.google.android.gms.internal.ads.zzflp
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = url.openConnection();
                return openConnection;
            }
        };
        return zzm();
    }
}
