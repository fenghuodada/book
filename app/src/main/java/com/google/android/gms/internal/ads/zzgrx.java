package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzgrx extends zzgrz {
    public zzgrx(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public final byte zza(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public final double zzb(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public final float zzc(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public final void zzd(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.gms.internal.ads.zzgsa.zzl(java.lang.Object, long, boolean):void
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
        Caused by: java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList.removeIf(Unknown Source)
        */
    @Override // com.google.android.gms.internal.ads.zzgrz
    public final void zze(java.lang.Object r2, long r3, boolean r5) {
        /*
            r1 = this;
            boolean r0 = com.google.android.gms.internal.ads.zzgsa.zzb
            if (r0 == 0) goto L8
            com.google.android.gms.internal.ads.zzgsa.zzk(r2, r3, r5)
            return
        L8:
            com.google.android.gms.internal.ads.zzgsa.zzl(r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgrx.zze(java.lang.Object, long, boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public final void zzf(Object obj, long j, byte b) {
        if (zzgsa.zzb) {
            zzgsa.zzG(obj, j, b);
        } else {
            zzgsa.zzH(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public final void zzg(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public final void zzh(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public final boolean zzi(Object obj, long j) {
        return zzgsa.zzb ? zzgsa.zzw(obj, j) : zzgsa.zzx(obj, j);
    }
}
