package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class zzaai {
    private final zzaah zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzaai(zzaah zzaahVar) {
        this.zza = zzaahVar;
    }

    @Nullable
    public final zzaao zza(Object... objArr) {
        Constructor zza;
        synchronized (this.zzb) {
            if (!this.zzb.get()) {
                try {
                    zza = this.zza.zza();
                } catch (ClassNotFoundException unused) {
                    this.zzb.set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            zza = null;
        }
        if (zza == null) {
            return null;
        }
        try {
            return (zzaao) zza.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
