package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.result.C0063d;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0485b;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzali implements Comparable {
    private final zzalt zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    @Nullable
    @GuardedBy("mLock")
    private final zzalm zzf;
    private Integer zzg;
    private zzall zzh;
    @GuardedBy("mLock")
    private boolean zzi;
    @Nullable
    private zzakr zzj;
    @GuardedBy("mLock")
    private zzalh zzk;
    private final zzakw zzl;

    public zzali(int i, String str, @Nullable zzalm zzalmVar) {
        Uri parse;
        String host;
        this.zza = zzalt.zza ? new zzalt() : null;
        this.zze = new Object();
        int i2 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzalmVar;
        this.zzl = new zzakw();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.zzd = i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzali) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        String str = this.zzc;
        Integer num = this.zzg;
        StringBuilder m13052b = C0063d.m13052b("[ ] ", str, " ");
        m13052b.append("0x".concat(valueOf));
        m13052b.append(" NORMAL ");
        m13052b.append(num);
        return m13052b.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    @Nullable
    public final zzakr zzd() {
        return this.zzj;
    }

    public final zzali zze(zzakr zzakrVar) {
        this.zzj = zzakrVar;
        return this;
    }

    public final zzali zzf(zzall zzallVar) {
        this.zzh = zzallVar;
        return this;
    }

    public final zzali zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public abstract zzalo zzh(zzale zzaleVar);

    public final String zzj() {
        String str = this.zzc;
        if (this.zzb != 0) {
            return C0485b.m12391a(Integer.toString(1), "-", str);
        }
        return str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzakq {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzalt.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzalr zzalrVar) {
        zzalm zzalmVar;
        synchronized (this.zze) {
            zzalmVar = this.zzf;
        }
        if (zzalmVar != null) {
            zzalmVar.zza(zzalrVar);
        }
    }

    public abstract void zzo(Object obj);

    public final void zzp(String str) {
        zzall zzallVar = this.zzh;
        if (zzallVar != null) {
            zzallVar.zzb(this);
        }
        if (zzalt.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzalg(this, str, id));
                return;
            }
            this.zza.zza(str, id);
            this.zza.zzb(toString());
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final void zzr() {
        zzalh zzalhVar;
        synchronized (this.zze) {
            zzalhVar = this.zzk;
        }
        if (zzalhVar != null) {
            zzalhVar.zza(this);
        }
    }

    public final void zzs(zzalo zzaloVar) {
        zzalh zzalhVar;
        synchronized (this.zze) {
            zzalhVar = this.zzk;
        }
        if (zzalhVar != null) {
            zzalhVar.zzb(this, zzaloVar);
        }
    }

    public final void zzt(int i) {
        zzall zzallVar = this.zzh;
        if (zzallVar != null) {
            zzallVar.zzc(this, i);
        }
    }

    public final void zzu(zzalh zzalhVar) {
        synchronized (this.zze) {
            this.zzk = zzalhVar;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzakq {
        return null;
    }

    public final zzakw zzy() {
        return this.zzl;
    }
}
