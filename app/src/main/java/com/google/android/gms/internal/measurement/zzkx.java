package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzlb;
import java.io.IOException;

/* loaded from: classes3.dex */
public class zzkx<MessageType extends zzlb<MessageType, BuilderType>, BuilderType extends zzkx<MessageType, BuilderType>> extends zzjj<MessageType, BuilderType> {
    protected zzlb zza;
    private final zzlb zzb;

    public zzkx(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzbR()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzbD();
    }

    private static void zza(Object obj, Object obj2) {
        zzmq.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    /* renamed from: zzaA */
    public final zzkx zzav() {
        zzkx zzkxVar = (zzkx) this.zzb.zzl(5, null, null);
        zzkxVar.zza = zzaF();
        return zzkxVar;
    }

    public final zzkx zzaB(zzlb zzlbVar) {
        if (!this.zzb.equals(zzlbVar)) {
            if (!this.zza.zzbR()) {
                zzaI();
            }
            zza(this.zza, zzlbVar);
        }
        return this;
    }

    public final zzkx zzaC(byte[] bArr, int i, int i2, zzkn zzknVar) throws zzll {
        if (!this.zza.zzbR()) {
            zzaI();
        }
        try {
            zzmq.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i2, new zzjn(zzknVar));
            return this;
        } catch (zzll e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzll.zzf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r3 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final MessageType zzaD() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.zzlb r0 = r5.zzaF()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.zzl(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            com.google.android.gms.internal.measurement.zzmq r3 = com.google.android.gms.internal.measurement.zzmq.zza()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.zzmt r3 = r3.zzb(r4)
            boolean r3 = r3.zzk(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.zzl(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.google.android.gms.internal.measurement.zznj r1 = new com.google.android.gms.internal.measurement.zznj
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkx.zzaD():com.google.android.gms.internal.measurement.zzlb");
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    /* renamed from: zzaE */
    public MessageType zzaF() {
        if (this.zza.zzbR()) {
            this.zza.zzbM();
            return (MessageType) this.zza;
        }
        return (MessageType) this.zza;
    }

    public final void zzaH() {
        if (this.zza.zzbR()) {
            return;
        }
        zzaI();
    }

    public void zzaI() {
        zzlb zzbD = this.zzb.zzbD();
        zza(zzbD, this.zza);
        this.zza = zzbD;
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final /* bridge */ /* synthetic */ zzjj zzaw(byte[] bArr, int i, int i2) throws zzll {
        zzaC(bArr, 0, i2, zzkn.zza);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final /* bridge */ /* synthetic */ zzjj zzax(byte[] bArr, int i, int i2, zzkn zzknVar) throws zzll {
        zzaC(bArr, 0, i2, zzknVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* bridge */ /* synthetic */ zzmi zzbV() {
        throw null;
    }
}
