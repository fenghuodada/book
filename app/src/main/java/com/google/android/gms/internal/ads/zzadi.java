package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzadi {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzadi() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzadh zzadhVar) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzadhVar.zza);
            String str = zzadhVar.zzb;
            if (str == null) {
                str = "";
            }
            zzb(this.zzb, str);
            this.zzb.writeLong(zzadhVar.zzc);
            this.zzb.writeLong(zzadhVar.zzd);
            this.zzb.write(zzadhVar.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
