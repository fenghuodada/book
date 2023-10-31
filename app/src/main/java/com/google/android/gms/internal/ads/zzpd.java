package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0486c;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzpd {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private boolean zzE;
    private long zzF;
    private long zzG;
    private final zzpc zza;
    private final long[] zzb;
    @Nullable
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    @Nullable
    private zzpb zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    @Nullable
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzpd(zzpc zzpcVar) {
        this.zza = zzpcVar;
        int i = zzfn.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
    }

    private final long zzl(long j) {
        return (j * this.zzg) / 1000000;
    }

    private final long zzm(long j) {
        return (j * 1000000) / this.zzg;
    }

    private final long zzn() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.zzy;
        if (j != -9223372036854775807L) {
            return Math.min(this.zzB, this.zzA + zzl(zzfn.zzm((elapsedRealtime * 1000) - j, this.zzj)));
        }
        if (elapsedRealtime - this.zzs >= 5) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                long j2 = 0;
                if (this.zzh) {
                    if (playState == 2) {
                        if (playbackHeadPosition == 0) {
                            this.zzv = this.zzt;
                        }
                        playState = 2;
                    }
                    playbackHeadPosition += this.zzv;
                }
                if (zzfn.zza <= 29) {
                    if (playbackHeadPosition != 0) {
                        j2 = playbackHeadPosition;
                    } else if (this.zzt > 0 && playState == 3) {
                        if (this.zzz == -9223372036854775807L) {
                            this.zzz = elapsedRealtime;
                        }
                    }
                    this.zzz = -9223372036854775807L;
                    playbackHeadPosition = j2;
                }
                if (this.zzt > playbackHeadPosition) {
                    this.zzu++;
                }
                this.zzt = playbackHeadPosition;
            }
            this.zzs = elapsedRealtime;
        }
        return this.zzt + (this.zzu << 32);
    }

    private final void zzo() {
        this.zzl = 0L;
        this.zzx = 0;
        this.zzw = 0;
        this.zzm = 0L;
        this.zzD = 0L;
        this.zzG = 0L;
        this.zzk = false;
    }

    public final int zza(long j) {
        return this.zze - ((int) (j - (zzn() * this.zzd)));
    }

    public final long zzb(boolean z) {
        long zzm;
        long j;
        zzow zzowVar;
        zzow zzowVar2;
        zzos zzosVar;
        Method method;
        zzpb zzpbVar;
        long zzF;
        long zzG;
        String str;
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.zzm >= 30000) {
                long zzm2 = zzm(zzn());
                if (zzm2 != 0) {
                    this.zzb[this.zzw] = zzfn.zzn(zzm2, this.zzj) - nanoTime;
                    this.zzw = (this.zzw + 1) % 10;
                    int i = this.zzx;
                    if (i < 10) {
                        this.zzx = i + 1;
                    }
                    this.zzm = nanoTime;
                    this.zzl = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = this.zzx;
                        if (i2 >= i3) {
                            break;
                        }
                        this.zzl = (this.zzb[i2] / i3) + this.zzl;
                        i2++;
                    }
                }
            }
            if (!this.zzh) {
                zzpb zzpbVar2 = this.zzf;
                zzpbVar2.getClass();
                if (zzpbVar2.zzg(nanoTime)) {
                    long zzb = zzpbVar2.zzb();
                    long zza = zzpbVar2.zza();
                    long zzm3 = zzm(zzn());
                    if (Math.abs(zzb - nanoTime) > 5000000) {
                        zzpr zzprVar = (zzpr) this.zza;
                        zzF = zzprVar.zza.zzF();
                        zzG = zzprVar.zza.zzG();
                        zzpbVar = zzpbVar2;
                        str = "Spurious audio timestamp (system clock mismatch): ";
                    } else {
                        zzpbVar = zzpbVar2;
                        if (Math.abs(zzm(zza) - zzm3) > 5000000) {
                            zzpr zzprVar2 = (zzpr) this.zza;
                            zzF = zzprVar2.zza.zzF();
                            zzG = zzprVar2.zza.zzG();
                            str = "Spurious audio timestamp (frame position mismatch): ";
                        } else {
                            zzpbVar.zzc();
                        }
                    }
                    StringBuilder m12390a = C0486c.m12390a(str, zza, ", ");
                    m12390a.append(zzb);
                    m12390a.append(", ");
                    m12390a.append(nanoTime);
                    m12390a.append(", ");
                    m12390a.append(zzm3);
                    m12390a.append(", ");
                    m12390a.append(zzF);
                    m12390a.append(", ");
                    m12390a.append(zzG);
                    zzer.zze("DefaultAudioSink", m12390a.toString());
                    zzpbVar.zzd();
                }
                if (this.zzq && (method = this.zzn) != null && nanoTime - this.zzr >= 500000) {
                    try {
                        AudioTrack audioTrack2 = this.zzc;
                        audioTrack2.getClass();
                        int i4 = zzfn.zza;
                        long intValue = ((Integer) method.invoke(audioTrack2, new Object[0])).intValue();
                        long j2 = this.zzi;
                        Long.signum(intValue);
                        long j3 = (intValue * 1000) - j2;
                        this.zzo = j3;
                        long max = Math.max(j3, 0L);
                        this.zzo = max;
                        if (max > 5000000) {
                            zzer.zze("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                            this.zzo = 0L;
                        }
                    } catch (Exception unused) {
                        this.zzn = null;
                    }
                    this.zzr = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzpb zzpbVar3 = this.zzf;
        zzpbVar3.getClass();
        boolean zzf = zzpbVar3.zzf();
        if (zzf) {
            j = zzfn.zzm(nanoTime2 - zzpbVar3.zzb(), this.zzj) + zzm(zzpbVar3.zza());
        } else {
            if (this.zzx == 0) {
                zzm = zzm(zzn());
            } else {
                zzm = zzfn.zzm(this.zzl + nanoTime2, this.zzj);
            }
            j = zzm;
            if (!z) {
                j = Math.max(0L, j - this.zzo);
            }
        }
        if (this.zzE != zzf) {
            this.zzG = this.zzD;
            this.zzF = this.zzC;
        }
        long j4 = nanoTime2 - this.zzG;
        if (j4 < 1000000) {
            long j5 = (j4 * 1000) / 1000000;
            j = (((1000 - j5) * (zzfn.zzm(j4, this.zzj) + this.zzF)) + (j * j5)) / 1000;
        }
        if (!this.zzk) {
            long j6 = this.zzC;
            if (j > j6) {
                this.zzk = true;
                int i5 = zzfn.zza;
                long currentTimeMillis = System.currentTimeMillis() - zzfn.zzq(zzfn.zzn(zzfn.zzq(j - j6), this.zzj));
                zzpw zzpwVar = ((zzpr) this.zza).zza;
                zzowVar = zzpwVar.zzp;
                if (zzowVar != null) {
                    zzowVar2 = zzpwVar.zzp;
                    zzosVar = ((zzqb) zzowVar2).zza.zzc;
                    zzosVar.zzr(currentTimeMillis);
                }
            }
        }
        this.zzD = nanoTime2;
        this.zzC = j;
        this.zzE = zzf;
        return j;
    }

    public final void zzc(long j) {
        this.zzA = zzn();
        this.zzy = SystemClock.elapsedRealtime() * 1000;
        this.zzB = j;
    }

    public final void zzd() {
        zzo();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.zzc = r3
            r2.zzd = r6
            r2.zze = r7
            com.google.android.gms.internal.ads.zzpb r0 = new com.google.android.gms.internal.ads.zzpb
            r0.<init>(r3)
            r2.zzf = r0
            int r3 = r3.getSampleRate()
            r2.zzg = r3
            r3 = 0
            if (r4 == 0) goto L25
            int r4 = com.google.android.gms.internal.ads.zzfn.zza
            r0 = 23
            if (r4 >= r0) goto L25
            r4 = 5
            r0 = 1
            if (r5 == r4) goto L26
            r4 = 6
            if (r5 != r4) goto L25
            r5 = r4
            goto L26
        L25:
            r0 = r3
        L26:
            r2.zzh = r0
            boolean r4 = com.google.android.gms.internal.ads.zzfn.zzC(r5)
            r2.zzq = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r7 = r7 / r6
            long r4 = (long) r7
            long r4 = r2.zzm(r4)
            goto L3d
        L3c:
            r4 = r0
        L3d:
            r2.zzi = r4
            r4 = 0
            r2.zzt = r4
            r2.zzu = r4
            r2.zzv = r4
            r2.zzp = r3
            r2.zzy = r0
            r2.zzz = r0
            r2.zzr = r4
            r2.zzo = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.zzj = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpd.zze(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zzf() {
        zzpb zzpbVar = this.zzf;
        zzpbVar.getClass();
        zzpbVar.zze();
    }

    public final boolean zzg(long j) {
        if (j <= zzl(zzb(false))) {
            if (this.zzh) {
                AudioTrack audioTrack = this.zzc;
                audioTrack.getClass();
                if (audioTrack.getPlayState() == 2 && zzn() == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzz != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzz >= 200;
    }

    public final boolean zzj(long j) {
        zzow zzowVar;
        long j2;
        zzow zzowVar2;
        zzos zzosVar;
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            } else if (playState == 1) {
                if (zzn() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzp;
        boolean zzg = zzg(j);
        this.zzp = zzg;
        if (z && !zzg && playState != 1) {
            zzpc zzpcVar = this.zza;
            int i = this.zze;
            long zzq = zzfn.zzq(this.zzi);
            zzpr zzprVar = (zzpr) zzpcVar;
            zzowVar = zzprVar.zza.zzp;
            if (zzowVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzpw zzpwVar = zzprVar.zza;
                j2 = zzpwVar.zzV;
                zzowVar2 = zzpwVar.zzp;
                zzosVar = ((zzqb) zzowVar2).zza.zzc;
                zzosVar.zzt(i, zzq, elapsedRealtime - j2);
            }
        }
        return true;
    }

    public final boolean zzk() {
        zzo();
        if (this.zzy == -9223372036854775807L) {
            zzpb zzpbVar = this.zzf;
            zzpbVar.getClass();
            zzpbVar.zze();
            return true;
        }
        return false;
    }
}
