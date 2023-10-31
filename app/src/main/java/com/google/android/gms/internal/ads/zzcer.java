package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class zzcer extends zzfr implements zzgu {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzgt zzf;
    private zzgc zzg;
    private HttpURLConnection zzh;
    private final Queue zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private final long zzr;
    private final long zzs;

    public zzcer(String str, zzgz zzgzVar, int i, int i2, long j, long j2) {
        super(true);
        zzdy.zzc(str);
        this.zze = str;
        this.zzf = new zzgt();
        this.zzc = i;
        this.zzd = i2;
        this.zzi = new ArrayDeque();
        this.zzr = j;
        this.zzs = j2;
        if (zzgzVar != null) {
            zzf(zzgzVar);
        }
    }

    private final void zzl() {
        while (!this.zzi.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzi.remove()).disconnect();
            } catch (Exception e) {
                zzbzt.zzh("Unexpected error while disconnecting", e);
            }
        }
        this.zzh = null;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws zzgq {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzm;
            long j2 = this.zzn;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.zzo + j2;
            long j4 = i2;
            long j5 = this.zzs;
            long j6 = this.zzq;
            long j7 = j6 + 1;
            if (j3 + j4 + j5 > j7) {
                long j8 = this.zzp;
                if (j6 < j8) {
                    long min = Math.min(j8, Math.max(((this.zzr + j7) - j5) - 1, (-1) + j7 + j4));
                    zzk(j7, min, 2);
                    this.zzq = min;
                    j6 = min;
                }
            }
            int read = this.zzj.read(bArr, i, (int) Math.min(j4, ((j6 + 1) - this.zzo) - this.zzn));
            if (read != -1) {
                this.zzn += read;
                zzg(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new zzgq(e, this.zzg, (int) AdError.SERVER_ERROR_CODE, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws zzgq {
        long j;
        this.zzg = zzgcVar;
        this.zzn = 0L;
        long j2 = zzgcVar.zzf;
        long j3 = zzgcVar.zzg;
        long min = j3 == -1 ? this.zzr : Math.min(this.zzr, j3);
        this.zzo = j2;
        HttpURLConnection zzk = zzk(j2, (min + j2) - 1, 1);
        this.zzh = zzk;
        String headerField = zzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zzb.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j4 = zzgcVar.zzg;
                    if (j4 != -1) {
                        this.zzm = j4;
                        j = Math.max(parseLong, (this.zzo + j4) - 1);
                    } else {
                        this.zzm = parseLong2 - this.zzo;
                        j = parseLong2 - 1;
                    }
                    this.zzp = j;
                    this.zzq = parseLong;
                    this.zzk = true;
                    zzj(zzgcVar);
                    return this.zzm;
                } catch (NumberFormatException unused) {
                    zzbzt.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcep(headerField, zzgcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() throws zzgq {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzgq(e, this.zzg, (int) AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzl();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfr, com.google.android.gms.internal.ads.zzfx
    @Nullable
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @VisibleForTesting
    public final HttpURLConnection zzk(long j, long j2, int i) throws zzgq {
        String uri = this.zzg.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzc);
            httpURLConnection.setReadTimeout(this.zzd);
            for (Map.Entry entry : this.zzf.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.zze);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzi.add(httpURLConnection);
            String uri2 = this.zzg.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzl = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzceq(this.zzl, headerFields, this.zzg, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzj != null) {
                        inputStream = new SequenceInputStream(this.zzj, inputStream);
                    }
                    this.zzj = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    zzl();
                    throw new zzgq(e, this.zzg, (int) AdError.SERVER_ERROR_CODE, i);
                }
            } catch (IOException e2) {
                zzl();
                String valueOf = String.valueOf(uri2);
                throw new zzgq("Unable to connect to ".concat(valueOf), e2, this.zzg, AdError.SERVER_ERROR_CODE, i);
            }
        } catch (IOException e3) {
            String valueOf2 = String.valueOf(uri);
            throw new zzgq("Unable to connect to ".concat(valueOf2), e3, this.zzg, AdError.SERVER_ERROR_CODE, i);
        }
    }
}
