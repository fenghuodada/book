package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfjm {
    private final Context zza;
    private final Executor zzb;
    private final zzfit zzc;
    private final zzfiv zzd;
    private final zzfjl zze;
    private final zzfjl zzf;
    private Task zzg;
    private Task zzh;

    @VisibleForTesting
    public zzfjm(Context context, Executor executor, zzfit zzfitVar, zzfiv zzfivVar, zzfjj zzfjjVar, zzfjk zzfjkVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfitVar;
        this.zzd = zzfivVar;
        this.zze = zzfjjVar;
        this.zzf = zzfjkVar;
    }

    public static zzfjm zze(@NonNull Context context, @NonNull Executor executor, @NonNull zzfit zzfitVar, @NonNull zzfiv zzfivVar) {
        final zzfjm zzfjmVar = new zzfjm(context, executor, zzfitVar, zzfivVar, new zzfjj(), new zzfjk());
        zzfjmVar.zzg = zzfjmVar.zzd.zzd() ? zzfjmVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfjm.this.zzc();
            }
        }) : Tasks.forResult(zzfjmVar.zze.zza());
        zzfjmVar.zzh = zzfjmVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfjm.this.zzd();
            }
        });
        return zzfjmVar;
    }

    private static zzaol zzg(@NonNull Task task, @NonNull zzaol zzaolVar) {
        return !task.isSuccessful() ? zzaolVar : (zzaol) task.getResult();
    }

    private final Task zzh(@NonNull Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfji
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzfjm.this.zzf(exc);
            }
        });
    }

    public final zzaol zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzaol zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    public final /* synthetic */ zzaol zzc() throws Exception {
        Context context = this.zza;
        zzano zza = zzaol.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zza.zzs(id);
            zza.zzr(advertisingIdInfo.isLimitAdTrackingEnabled());
            zza.zzab(6);
        }
        return (zzaol) zza.zzal();
    }

    public final /* synthetic */ zzaol zzd() throws Exception {
        Context context = this.zza;
        return zzfjb.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
