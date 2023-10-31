package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
final class zzcdy extends zzfr implements zzgu {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final SSLSocketFactory zzd;
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzgt zzh;
    private zzgc zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final Set zzs;

    public zzcdy(String str, zzgz zzgzVar, int i, int i2, int i3) {
        super(true);
        this.zzd = new zzcdx(this);
        this.zzs = new HashSet();
        zzdy.zzc(str);
        this.zzg = str;
        this.zzh = new zzgt();
        this.zze = i;
        this.zzf = i2;
        this.zzr = i3;
        if (zzgzVar != null) {
            zzf(zzgzVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzbzt.zzh("Unexpected error while disconnecting", e);
            }
            this.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws zzgq {
        try {
            if (this.zzp != this.zzn) {
                byte[] bArr2 = (byte[]) zzc.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzp;
                    long j2 = this.zzn;
                    if (j == j2) {
                        zzc.set(bArr2);
                        break;
                    }
                    int read = this.zzk.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.zzp += read;
                    zzg(read);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzo;
            if (j3 != -1) {
                long j4 = j3 - this.zzq;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.zzk.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzo == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzq += read2;
            zzg(read2);
            return read2;
        } catch (IOException e) {
            throw new zzgq(e, this.zzi, (int) AdError.SERVER_ERROR_CODE, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
        if (r2 == 0) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7 A[Catch: IOException -> 0x0283, TryCatch #1 {IOException -> 0x0283, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:93:0x0228, B:95:0x0233, B:97:0x0244, B:100:0x024d, B:101:0x025c, B:103:0x0264, B:104:0x026b, B:105:0x026c, B:106:0x0282), top: B:112:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0233 A[Catch: IOException -> 0x0283, TryCatch #1 {IOException -> 0x0283, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:93:0x0228, B:95:0x0233, B:97:0x0244, B:100:0x024d, B:101:0x025c, B:103:0x0264, B:104:0x026b, B:105:0x026c, B:106:0x0282), top: B:112:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzfx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzgc r21) throws com.google.android.gms.internal.ads.zzgq {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdy.zzb(com.google.android.gms.internal.ads.zzgc):long");
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() throws zzgq {
        try {
            if (this.zzk != null) {
                HttpURLConnection httpURLConnection = this.zzj;
                long j = this.zzo;
                if (j != -1) {
                    j -= this.zzq;
                }
                int i = zzfn.zza;
                if (i == 19 || i == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j <= 2048) {
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.zzk.close();
                } catch (IOException e) {
                    throw new zzgq(e, this.zzi, (int) AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.zzk = null;
            zzn();
            if (this.zzl) {
                this.zzl = false;
                zzh();
            }
            this.zzs.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfr, com.google.android.gms.internal.ads.zzfx
    @Nullable
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzm(int i) {
        this.zzr = i;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e) {
                    zzbzt.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }
}
