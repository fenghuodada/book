package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.annotation.WorkerThread;
import androidx.concurrent.futures.C0485b;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.AccountType;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzao extends zzgx {
    private long zza;
    private String zzb;
    private AccountManager zzc;
    private Boolean zzd;
    private long zze;

    public zzao(zzgd zzgdVar) {
        super(zzgdVar);
    }

    @WorkerThread
    public final long zza() {
        zzg();
        return this.zze;
    }

    public final long zzb() {
        zzv();
        return this.zza;
    }

    public final String zzc() {
        zzv();
        return this.zzb;
    }

    @WorkerThread
    public final void zzd() {
        zzg();
        this.zzd = null;
        this.zze = 0L;
    }

    @WorkerThread
    public final boolean zze() {
        zzg();
        long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
        if (currentTimeMillis - this.zze > 86400000) {
            this.zzd = null;
        }
        Boolean bool = this.zzd;
        if (bool == null) {
            if (ContextCompat.m12040a(this.zzt.zzaw(), "android.permission.GET_ACCOUNTS") != 0) {
                this.zzt.zzaA().zzm().zza("Permission error checking for dasher/unicorn accounts");
            } else {
                if (this.zzc == null) {
                    this.zzc = AccountManager.get(this.zzt.zzaw());
                }
                try {
                    Account[] result = this.zzc.getAccountsByTypeAndFeatures(AccountType.GOOGLE, new String[]{"service_HOSTED"}, null, null).getResult();
                    if (result != null && result.length > 0) {
                        this.zzd = Boolean.TRUE;
                        this.zze = currentTimeMillis;
                        return true;
                    }
                    Account[] result2 = this.zzc.getAccountsByTypeAndFeatures(AccountType.GOOGLE, new String[]{"service_uca"}, null, null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.zzd = Boolean.TRUE;
                        this.zze = currentTimeMillis;
                        return true;
                    }
                } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                    this.zzt.zzaA().zzh().zzb("Exception checking account types", e);
                }
            }
            this.zze = currentTimeMillis;
            this.zzd = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    public final boolean zzf() {
        Calendar calendar = Calendar.getInstance();
        this.zza = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.zzb = C0485b.m12391a(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }
}
