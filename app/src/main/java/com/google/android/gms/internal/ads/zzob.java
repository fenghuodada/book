package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.HashMap;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@RequiresApi(31)
/* loaded from: classes.dex */
public final class zzob implements zzlv, zzoc {
    private final Context zza;
    private final zzod zzb;
    private final PlaybackSession zzc;
    @Nullable
    private String zzi;
    @Nullable
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    @Nullable
    private zzcg zzn;
    @Nullable
    private zzoa zzo;
    @Nullable
    private zzoa zzp;
    @Nullable
    private zzoa zzq;
    @Nullable
    private zzam zzr;
    @Nullable
    private zzam zzs;
    @Nullable
    private zzam zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzcw zze = new zzcw();
    private final zzcu zzf = new zzcu();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzob(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zznz zznzVar = new zznz(zznz.zza);
        this.zzb = zznzVar;
        zznzVar.zzg(this);
    }

    @Nullable
    public static zzob zzb(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        createPlaybackSession = mediaMetricsManager.createPlaybackSession();
        return new zzob(context, createPlaybackSession);
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int i) {
        switch (zzfn.zzh(i)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzj.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.zzc;
            build = this.zzj.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, @Nullable zzam zzamVar, int i) {
        if (zzfn.zzB(this.zzs, zzamVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzamVar;
        zzx(0, j, zzamVar, i2);
    }

    private final void zzu(long j, @Nullable zzam zzamVar, int i) {
        if (zzfn.zzB(this.zzt, zzamVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzamVar;
        zzx(2, j, zzamVar, i2);
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzv(zzcx zzcxVar, @Nullable zztl zztlVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zztlVar == null || (zza = zzcxVar.zza(zztlVar.zza)) == -1) {
            return;
        }
        int i = 0;
        zzcxVar.zzd(zza, this.zzf, false);
        zzcxVar.zze(this.zzf.zzd, this.zze, 0L);
        zzbi zzbiVar = this.zze.zzd.zzd;
        if (zzbiVar != null) {
            int zzl = zzfn.zzl(zzbiVar.zza);
            i = zzl != 0 ? zzl != 1 ? zzl != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        zzcw zzcwVar = this.zze;
        if (zzcwVar.zzn != -9223372036854775807L && !zzcwVar.zzl && !zzcwVar.zzi && !zzcwVar.zzb()) {
            builder.setMediaDurationMillis(zzfn.zzq(this.zze.zzn));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j, @Nullable zzam zzamVar, int i) {
        if (zzfn.zzB(this.zzr, zzamVar)) {
            return;
        }
        int i2 = this.zzr == null ? 1 : 0;
        this.zzr = zzamVar;
        zzx(1, j, zzamVar, i2);
    }

    private final void zzx(int i, long j, @Nullable zzam zzamVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzamVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzamVar.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzamVar.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzamVar.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzamVar.zzi;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzamVar.zzr;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzamVar.zzs;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzamVar.zzz;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzamVar.zzA;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzamVar.zzd;
            if (str4 != null) {
                int i8 = zzfn.zza;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = zzamVar.zzt;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzy(@Nullable zzoa zzoaVar) {
        return zzoaVar != null && zzoaVar.zzc.equals(this.zzb.zzd());
    }

    public final LogSessionId zza() {
        LogSessionId sessionId;
        sessionId = this.zzc.getSessionId();
        return sessionId;
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzc(zzlt zzltVar, String str) {
        zztl zztlVar = zzltVar.zzd;
        if (zztlVar == null || !zztlVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.1");
            zzv(zzltVar.zzb, zzltVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoc
    public final void zzd(zzlt zzltVar, String str, boolean z) {
        zztl zztlVar = zzltVar.zzd;
        if ((zztlVar == null || !zztlVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zze(zzlt zzltVar, zzam zzamVar, zzht zzhtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzf(zzlt zzltVar, int i, long j, long j2) {
        zztl zztlVar = zzltVar.zzd;
        if (zztlVar != null) {
            String zze = this.zzb.zze(zzltVar.zzb, zztlVar);
            Long l = (Long) this.zzh.get(zze);
            Long l2 = (Long) this.zzg.get(zze);
            this.zzh.put(zze, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.zzg.put(zze, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzg(zzlt zzltVar, zzth zzthVar) {
        zztl zztlVar = zzltVar.zzd;
        if (zztlVar == null) {
            return;
        }
        zzam zzamVar = zzthVar.zzb;
        zzamVar.getClass();
        zzoa zzoaVar = new zzoa(zzamVar, 0, this.zzb.zze(zzltVar.zzb, zztlVar));
        int i = zzthVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzp = zzoaVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzq = zzoaVar;
                return;
            }
        }
        this.zzo = zzoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzh(zzlt zzltVar, int i, long j) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x01e9, code lost:
        if (r8 != 1) goto L150;
     */
    @Override // com.google.android.gms.internal.ads.zzlv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.gms.internal.ads.zzcq r19, com.google.android.gms.internal.ads.zzlu r20) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzob.zzi(com.google.android.gms.internal.ads.zzcq, com.google.android.gms.internal.ads.zzlu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzj(zzlt zzltVar, zztc zztcVar, zzth zzthVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzk(zzlt zzltVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzl(zzlt zzltVar, zzcg zzcgVar) {
        this.zzn = zzcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzm(zzlt zzltVar, zzcp zzcpVar, zzcp zzcpVar2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzn(zzlt zzltVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzo(zzlt zzltVar, zzhs zzhsVar) {
        this.zzw += zzhsVar.zzg;
        this.zzx += zzhsVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzp(zzlt zzltVar, zzam zzamVar, zzht zzhtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzq(zzlt zzltVar, zzdn zzdnVar) {
        zzoa zzoaVar = this.zzo;
        if (zzoaVar != null) {
            zzam zzamVar = zzoaVar.zza;
            if (zzamVar.zzs == -1) {
                zzak zzb = zzamVar.zzb();
                zzb.zzX(zzdnVar.zzc);
                zzb.zzF(zzdnVar.zzd);
                this.zzo = new zzoa(zzb.zzY(), 0, zzoaVar.zzc);
            }
        }
    }
}
