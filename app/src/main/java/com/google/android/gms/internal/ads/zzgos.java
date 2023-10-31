package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgos;
import com.google.android.gms.internal.ads.zzgow;
import java.io.IOException;

/* loaded from: classes.dex */
public class zzgos<MessageType extends zzgow<MessageType, BuilderType>, BuilderType extends zzgos<MessageType, BuilderType>> extends zzgmw<MessageType, BuilderType> {
    protected zzgow zza;
    private final zzgow zzb;

    public zzgos(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaY()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzaD();
    }

    private static void zza(Object obj, Object obj2) {
        zzgqo.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgmw
    /* renamed from: zzai */
    public final zzgos zzah() {
        zzgos zzgosVar = (zzgos) this.zzb.zzb(5, null, null);
        zzgosVar.zza = zzan();
        return zzgosVar;
    }

    public final zzgos zzaj(zzgow zzgowVar) {
        if (!this.zzb.equals(zzgowVar)) {
            if (!this.zza.zzaY()) {
                zzaq();
            }
            zza(this.zza, zzgowVar);
        }
        return this;
    }

    public final zzgos zzak(byte[] bArr, int i, int i2, zzgoi zzgoiVar) throws zzgpi {
        if (!this.zza.zzaY()) {
            zzaq();
        }
        try {
            zzgqo.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i2, new zzgna(zzgoiVar));
            return this;
        } catch (zzgpi e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgpi.zzj();
        }
    }

    public final MessageType zzal() {
        MessageType zzan = zzan();
        if (zzan.zzaX()) {
            return zzan;
        }
        throw new zzgrp(zzan);
    }

    @Override // com.google.android.gms.internal.ads.zzgqf
    /* renamed from: zzam */
    public MessageType zzan() {
        if (this.zza.zzaY()) {
            this.zza.zzaS();
            return (MessageType) this.zza;
        }
        return (MessageType) this.zza;
    }

    public final void zzap() {
        if (this.zza.zzaY()) {
            return;
        }
        zzaq();
    }

    public void zzaq() {
        zzgow zzaD = this.zzb.zzaD();
        zza(zzaD, this.zza);
        this.zza = zzaD;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* synthetic */ zzgqg zzbf() {
        throw null;
    }
}
