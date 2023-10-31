package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzgpi extends IOException {
    private zzgqg zza;
    private boolean zzb;

    public zzgpi(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    public zzgpi(String str) {
        super(str);
        this.zza = null;
    }

    public static zzgph zza() {
        return new zzgph("Protocol message tag had invalid wire type.");
    }

    public static zzgpi zzb() {
        return new zzgpi("Protocol message end-group tag did not match expected tag.");
    }

    public static zzgpi zzc() {
        return new zzgpi("Protocol message contained an invalid tag (zero).");
    }

    public static zzgpi zzd() {
        return new zzgpi("Protocol message had invalid UTF-8.");
    }

    public static zzgpi zze() {
        return new zzgpi("CodedInputStream encountered a malformed varint.");
    }

    public static zzgpi zzf() {
        return new zzgpi("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzgpi zzg() {
        return new zzgpi("Failed to parse the message.");
    }

    public static zzgpi zzi() {
        return new zzgpi("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zzgpi zzj() {
        return new zzgpi("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzgpi zzh(zzgqg zzgqgVar) {
        this.zza = zzgqgVar;
        return this;
    }

    public final void zzk() {
        this.zzb = true;
    }

    public final boolean zzl() {
        return this.zzb;
    }
}
