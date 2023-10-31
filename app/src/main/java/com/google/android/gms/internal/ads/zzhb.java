package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class zzhb extends zzfr {
    private final byte[] zza;
    private final DatagramPacket zzb;
    @Nullable
    private Uri zzc;
    @Nullable
    private DatagramSocket zzd;
    @Nullable
    private MulticastSocket zze;
    @Nullable
    private InetAddress zzf;
    private boolean zzg;
    private int zzh;

    public zzhb() {
        this(AdError.SERVER_ERROR_CODE);
    }

    public zzhb(int i) {
        super(true);
        byte[] bArr = new byte[AdError.SERVER_ERROR_CODE];
        this.zza = bArr;
        this.zzb = new DatagramPacket(bArr, 0, (int) AdError.SERVER_ERROR_CODE);
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws zzha {
        if (i2 == 0) {
            return 0;
        }
        if (this.zzh == 0) {
            try {
                DatagramSocket datagramSocket = this.zzd;
                datagramSocket.getClass();
                datagramSocket.receive(this.zzb);
                int length = this.zzb.getLength();
                this.zzh = length;
                zzg(length);
            } catch (SocketTimeoutException e) {
                throw new zzha(e, AdError.CACHE_ERROR_CODE);
            } catch (IOException e2) {
                throw new zzha(e2, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.zzb.getLength();
        int i3 = this.zzh;
        int min = Math.min(i3, i2);
        System.arraycopy(this.zza, length2 - i3, bArr, i, min);
        this.zzh -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws zzha {
        Uri uri = zzgcVar.zza;
        this.zzc = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.zzc.getPort();
        zzi(zzgcVar);
        try {
            this.zzf = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.zzf, port);
            if (this.zzf.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.zze = multicastSocket;
                multicastSocket.joinGroup(this.zzf);
                this.zzd = this.zze;
            } else {
                this.zzd = new DatagramSocket(inetSocketAddress);
            }
            this.zzd.setSoTimeout(8000);
            this.zzg = true;
            zzj(zzgcVar);
            return -1L;
        } catch (IOException e) {
            throw new zzha(e, AdError.INTERNAL_ERROR_CODE);
        } catch (SecurityException e2) {
            throw new zzha(e2, AdError.INTERNAL_ERROR_2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    @Nullable
    public final Uri zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() {
        this.zzc = null;
        MulticastSocket multicastSocket = this.zze;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.zzf;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.zze = null;
        }
        DatagramSocket datagramSocket = this.zzd;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.zzd = null;
        }
        this.zzf = null;
        this.zzh = 0;
        if (this.zzg) {
            this.zzg = false;
            zzh();
        }
    }
}
