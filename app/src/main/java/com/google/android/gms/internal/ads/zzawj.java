package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "CacheOfferingCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzawj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzawj> CREATOR = new zzawk();
    @Nullable
    @SafeParcelable.Field(m4845id = 2)
    public final String zza;
    @SafeParcelable.Field(m4845id = 3)
    public final long zzb;
    @SafeParcelable.Field(m4845id = 4)
    public final String zzc;
    @SafeParcelable.Field(m4845id = 5)
    public final String zzd;
    @SafeParcelable.Field(m4845id = 6)
    public final String zze;
    @SafeParcelable.Field(m4845id = 7)
    public final Bundle zzf;
    @SafeParcelable.Field(m4845id = 8)
    public final boolean zzg;
    @SafeParcelable.Field(m4845id = 9)
    public long zzh;
    @SafeParcelable.Field(m4845id = 10)
    public String zzi;
    @SafeParcelable.Field(m4845id = 11)
    public int zzj;

    @SafeParcelable.Constructor
    public zzawj(@Nullable @SafeParcelable.Param(m4844id = 2) String str, @SafeParcelable.Param(m4844id = 3) long j, @SafeParcelable.Param(m4844id = 4) String str2, @SafeParcelable.Param(m4844id = 5) String str3, @SafeParcelable.Param(m4844id = 6) String str4, @SafeParcelable.Param(m4844id = 7) Bundle bundle, @SafeParcelable.Param(m4844id = 8) boolean z, @SafeParcelable.Param(m4844id = 9) long j2, @SafeParcelable.Param(m4844id = 10) String str5, @SafeParcelable.Param(m4844id = 11) int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = str2 == null ? "" : str2;
        this.zzd = str3 == null ? "" : str3;
        this.zze = str4 == null ? "" : str4;
        this.zzf = bundle == null ? new Bundle() : bundle;
        this.zzg = z;
        this.zzh = j2;
        this.zzi = str5;
        this.zzj = i;
    }

    @Nullable
    public static zzawj zza(Uri uri) {
        try {
            if ("gcache".equals(uri.getScheme())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 2) {
                    int size = pathSegments.size();
                    zzbzt.zzj("Expected 2 path parts for namespace and id, found :" + size);
                    return null;
                }
                String str = pathSegments.get(0);
                String str2 = pathSegments.get(1);
                String host = uri.getHost();
                String queryParameter = uri.getQueryParameter(ImagesContract.URL);
                boolean equals = "1".equals(uri.getQueryParameter("read_only"));
                String queryParameter2 = uri.getQueryParameter("expiration");
                long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
                Bundle bundle = new Bundle();
                for (String str3 : uri.getQueryParameterNames()) {
                    if (str3.startsWith("tag.")) {
                        bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                    }
                }
                return new zzawj(queryParameter, parseLong, host, str, str2, bundle, equals, 0L, "", 0);
            }
            return null;
        } catch (NullPointerException | NumberFormatException e) {
            zzbzt.zzk("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeString(parcel, 10, this.zzi, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
