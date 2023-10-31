package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcvv;
import com.google.android.gms.internal.ads.zzdcw;
import com.google.android.gms.internal.ads.zzdqc;
import com.google.android.gms.internal.ads.zzebc;
import com.google.android.gms.internal.ads.zzfen;

@SafeParcelable.Class(creator = "AdOverlayInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
    @SafeParcelable.Field(m4845id = 2)
    public final zzc zza;
    @SafeParcelable.Field(getter = "getAdClickListenerAsBinder", m4845id = 3, type = "android.os.IBinder")
    public final com.google.android.gms.ads.internal.client.zza zzb;
    @SafeParcelable.Field(getter = "getAdOverlayListenerAsBinder", m4845id = 4, type = "android.os.IBinder")
    public final zzo zzc;
    @SafeParcelable.Field(getter = "getAdWebViewAsBinder", m4845id = 5, type = "android.os.IBinder")
    public final zzcfb zzd;
    @SafeParcelable.Field(getter = "getAppEventGmsgListenerAsBinder", m4845id = 6, type = "android.os.IBinder")
    public final zzbhd zze;
    @NonNull
    @SafeParcelable.Field(m4845id = 7)
    public final String zzf;
    @SafeParcelable.Field(m4845id = 8)
    public final boolean zzg;
    @NonNull
    @SafeParcelable.Field(m4845id = 9)
    public final String zzh;
    @SafeParcelable.Field(getter = "getLeaveApplicationListenerAsBinder", m4845id = 10, type = "android.os.IBinder")
    public final zzz zzi;
    @SafeParcelable.Field(m4845id = 11)
    public final int zzj;
    @SafeParcelable.Field(m4845id = 12)
    public final int zzk;
    @NonNull
    @SafeParcelable.Field(m4845id = 13)
    public final String zzl;
    @SafeParcelable.Field(m4845id = 14)
    public final zzbzz zzm;
    @NonNull
    @SafeParcelable.Field(m4845id = 16)
    public final String zzn;
    @SafeParcelable.Field(m4845id = 17)
    public final com.google.android.gms.ads.internal.zzj zzo;
    @SafeParcelable.Field(getter = "getAdMetadataGmsgListenerAsBinder", m4845id = 18, type = "android.os.IBinder")
    public final zzbhb zzp;
    @NonNull
    @SafeParcelable.Field(m4845id = 19)
    public final String zzq;
    @SafeParcelable.Field(getter = "getOfflineDatabaseManagerAsBinder", m4845id = 20, type = "android.os.IBinder")
    public final zzebc zzr;
    @SafeParcelable.Field(getter = "getCsiReporterAsBinder", m4845id = 21, type = "android.os.IBinder")
    public final zzdqc zzs;
    @SafeParcelable.Field(getter = "getLoggerAsBinder", m4845id = 22, type = "android.os.IBinder")
    public final zzfen zzt;
    @SafeParcelable.Field(getter = "getWorkManagerUtilAsBinder", m4845id = 23, type = "android.os.IBinder")
    public final zzbr zzu;
    @NonNull
    @SafeParcelable.Field(m4845id = 24)
    public final String zzv;
    @NonNull
    @SafeParcelable.Field(m4845id = 25)
    public final String zzw;
    @SafeParcelable.Field(getter = "getAdFailedToShowEventEmitterAsBinder", m4845id = 26, type = "android.os.IBinder")
    public final zzcvv zzx;
    @SafeParcelable.Field(getter = "getPhysicalClickListenerAsBinder", m4845id = 27, type = "android.os.IBinder")
    public final zzdcw zzy;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzz zzzVar, zzcfb zzcfbVar, int i, zzbzz zzbzzVar, String str, com.google.android.gms.ads.internal.zzj zzjVar, String str2, String str3, String str4, zzcvv zzcvvVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzoVar;
        this.zzd = zzcfbVar;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzba.zzc().zzb(zzbbk.zzaF)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = zzbzzVar;
        this.zzn = str;
        this.zzo = zzjVar;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = str4;
        this.zzx = zzcvvVar;
        this.zzy = null;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzz zzzVar, zzcfb zzcfbVar, boolean z, int i, zzbzz zzbzzVar, zzdcw zzdcwVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = zzcfbVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzzVar;
        this.zzj = i;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = zzbzzVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdcwVar;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzbhb zzbhbVar, zzbhd zzbhdVar, zzz zzzVar, zzcfb zzcfbVar, boolean z, int i, String str, zzbzz zzbzzVar, zzdcw zzdcwVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = zzcfbVar;
        this.zzp = zzbhbVar;
        this.zze = zzbhdVar;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzzVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = zzbzzVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdcwVar;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzbhb zzbhbVar, zzbhd zzbhdVar, zzz zzzVar, zzcfb zzcfbVar, boolean z, int i, String str, String str2, zzbzz zzbzzVar, zzdcw zzdcwVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = zzcfbVar;
        this.zzp = zzbhbVar;
        this.zze = zzbhdVar;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = zzzVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = zzbzzVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdcwVar;
    }

    @SafeParcelable.Constructor
    public AdOverlayInfoParcel(@SafeParcelable.Param(m4844id = 2) zzc zzcVar, @SafeParcelable.Param(m4844id = 3) IBinder iBinder, @SafeParcelable.Param(m4844id = 4) IBinder iBinder2, @SafeParcelable.Param(m4844id = 5) IBinder iBinder3, @SafeParcelable.Param(m4844id = 6) IBinder iBinder4, @SafeParcelable.Param(m4844id = 7) String str, @SafeParcelable.Param(m4844id = 8) boolean z, @SafeParcelable.Param(m4844id = 9) String str2, @SafeParcelable.Param(m4844id = 10) IBinder iBinder5, @SafeParcelable.Param(m4844id = 11) int i, @SafeParcelable.Param(m4844id = 12) int i2, @SafeParcelable.Param(m4844id = 13) String str3, @SafeParcelable.Param(m4844id = 14) zzbzz zzbzzVar, @SafeParcelable.Param(m4844id = 16) String str4, @SafeParcelable.Param(m4844id = 17) com.google.android.gms.ads.internal.zzj zzjVar, @SafeParcelable.Param(m4844id = 18) IBinder iBinder6, @SafeParcelable.Param(m4844id = 19) String str5, @SafeParcelable.Param(m4844id = 20) IBinder iBinder7, @SafeParcelable.Param(m4844id = 21) IBinder iBinder8, @SafeParcelable.Param(m4844id = 22) IBinder iBinder9, @SafeParcelable.Param(m4844id = 23) IBinder iBinder10, @SafeParcelable.Param(m4844id = 24) String str6, @SafeParcelable.Param(m4844id = 25) String str7, @SafeParcelable.Param(m4844id = 26) IBinder iBinder11, @SafeParcelable.Param(m4844id = 27) IBinder iBinder12) {
        this.zza = zzcVar;
        this.zzb = (com.google.android.gms.ads.internal.client.zza) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzc = (zzo) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzd = (zzcfb) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzp = (zzbhb) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zze = (zzbhd) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzi = (zzz) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.zzj = i;
        this.zzk = i2;
        this.zzl = str3;
        this.zzm = zzbzzVar;
        this.zzn = str4;
        this.zzo = zzjVar;
        this.zzq = str5;
        this.zzv = str6;
        this.zzr = (zzebc) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder7));
        this.zzs = (zzdqc) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder8));
        this.zzt = (zzfen) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder9));
        this.zzu = (zzbr) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder10));
        this.zzw = str7;
        this.zzx = (zzcvv) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder11));
        this.zzy = (zzdcw) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder12));
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzz zzzVar, zzbzz zzbzzVar, zzcfb zzcfbVar, zzdcw zzdcwVar) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = zzcfbVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzzVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = zzbzzVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdcwVar;
    }

    public AdOverlayInfoParcel(zzo zzoVar, zzcfb zzcfbVar, int i, zzbzz zzbzzVar) {
        this.zzc = zzoVar;
        this.zzd = zzcfbVar;
        this.zzj = 1;
        this.zzm = zzbzzVar;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
    }

    public AdOverlayInfoParcel(zzcfb zzcfbVar, zzbzz zzbzzVar, zzbr zzbrVar, zzebc zzebcVar, zzdqc zzdqcVar, zzfen zzfenVar, String str, String str2, int i) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcfbVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = zzbzzVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzv = str2;
        this.zzr = zzebcVar;
        this.zzs = zzdqcVar;
        this.zzt = zzfenVar;
        this.zzu = zzbrVar;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
    }

    @Nullable
    public static AdOverlayInfoParcel zza(@NonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, ObjectWrapper.wrap(this.zzb).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.zzc).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, ObjectWrapper.wrap(this.zzd).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, ObjectWrapper.wrap(this.zze).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeIBinder(parcel, 10, ObjectWrapper.wrap(this.zzi).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i, false);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzp).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeIBinder(parcel, 20, ObjectWrapper.wrap(this.zzr).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 21, ObjectWrapper.wrap(this.zzs).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 22, ObjectWrapper.wrap(this.zzt).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 23, ObjectWrapper.wrap(this.zzu).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 24, this.zzv, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzw, false);
        SafeParcelWriter.writeIBinder(parcel, 26, ObjectWrapper.wrap(this.zzx).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 27, ObjectWrapper.wrap(this.zzy).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
