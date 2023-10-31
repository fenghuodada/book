package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzbqs extends zzbqy {
    static final Set zza = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzcfb zzk;
    private final Activity zzl;
    private zzcgq zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbqz zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbqs(zzcfb zzcfbVar, zzbqz zzbqzVar) {
        super(zzcfbVar, "resize");
        this.zzb = "top-right";
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzcfbVar;
        this.zzl = zzcfbVar.zzi();
        this.zzp = zzbqzVar;
    }

    public final void zza(boolean z) {
        synchronized (this.zzj) {
            PopupWindow popupWindow = this.zzq;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.zzr.removeView((View) this.zzk);
                ViewGroup viewGroup = this.zzs;
                if (viewGroup != null) {
                    viewGroup.removeView(this.zzn);
                    this.zzs.addView((View) this.zzk);
                    this.zzk.zzag(this.zzm);
                }
                if (z) {
                    zzk("default");
                    zzbqz zzbqzVar = this.zzp;
                    if (zzbqzVar != null) {
                        zzbqzVar.zzb();
                    }
                }
                this.zzq = null;
                this.zzr = null;
                this.zzs = null;
                this.zzo = null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0265, code lost:
        zzg("Resize location out of screen or close button is not visible.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x026b, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028c A[Catch: all -> 0x047e, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:9:0x0014, B:11:0x001c, B:12:0x0021, B:14:0x0023, B:16:0x002f, B:17:0x0034, B:19:0x0036, B:21:0x003e, B:23:0x004c, B:24:0x005d, B:26:0x006b, B:27:0x007c, B:29:0x008a, B:30:0x009b, B:32:0x00a9, B:33:0x00ba, B:35:0x00c8, B:36:0x00d6, B:38:0x00e4, B:39:0x00e6, B:41:0x00ea, B:43:0x00ee, B:45:0x00f6, B:48:0x00fe, B:52:0x0126, B:59:0x0134, B:128:0x0265, B:129:0x026a, B:131:0x026c, B:133:0x028c, B:135:0x0290, B:137:0x029d, B:139:0x02da, B:171:0x0395, B:172:0x0398, B:180:0x03b9, B:181:0x03d1, B:182:0x03f2, B:184:0x03fa, B:185:0x0401, B:186:0x0428, B:189:0x042b, B:191:0x044b, B:192:0x0460, B:173:0x039c, B:174:0x03a0, B:175:0x03a3, B:176:0x03a7, B:177:0x03ab, B:178:0x03b1, B:179:0x03b5, B:138:0x02d7, B:194:0x0462, B:195:0x0467, B:60:0x0139, B:62:0x013d, B:90:0x0190, B:98:0x01e3, B:100:0x01ee, B:102:0x01f1, B:104:0x01f4, B:106:0x01f9, B:109:0x01ff, B:91:0x019b, B:93:0x01b2, B:95:0x01bd, B:92:0x01a6, B:94:0x01b5, B:96:0x01c2, B:97:0x01d7, B:99:0x01e6, B:110:0x0213, B:118:0x0241, B:124:0x0251, B:121:0x0247, B:123:0x024f, B:114:0x0237, B:116:0x023d, B:197:0x0469, B:198:0x046e, B:200:0x0470, B:201:0x0475, B:203:0x0477, B:204:0x047c), top: B:211:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03fa A[Catch: all -> 0x047e, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:9:0x0014, B:11:0x001c, B:12:0x0021, B:14:0x0023, B:16:0x002f, B:17:0x0034, B:19:0x0036, B:21:0x003e, B:23:0x004c, B:24:0x005d, B:26:0x006b, B:27:0x007c, B:29:0x008a, B:30:0x009b, B:32:0x00a9, B:33:0x00ba, B:35:0x00c8, B:36:0x00d6, B:38:0x00e4, B:39:0x00e6, B:41:0x00ea, B:43:0x00ee, B:45:0x00f6, B:48:0x00fe, B:52:0x0126, B:59:0x0134, B:128:0x0265, B:129:0x026a, B:131:0x026c, B:133:0x028c, B:135:0x0290, B:137:0x029d, B:139:0x02da, B:171:0x0395, B:172:0x0398, B:180:0x03b9, B:181:0x03d1, B:182:0x03f2, B:184:0x03fa, B:185:0x0401, B:186:0x0428, B:189:0x042b, B:191:0x044b, B:192:0x0460, B:173:0x039c, B:174:0x03a0, B:175:0x03a3, B:176:0x03a7, B:177:0x03ab, B:178:0x03b1, B:179:0x03b5, B:138:0x02d7, B:194:0x0462, B:195:0x0467, B:60:0x0139, B:62:0x013d, B:90:0x0190, B:98:0x01e3, B:100:0x01ee, B:102:0x01f1, B:104:0x01f4, B:106:0x01f9, B:109:0x01ff, B:91:0x019b, B:93:0x01b2, B:95:0x01bd, B:92:0x01a6, B:94:0x01b5, B:96:0x01c2, B:97:0x01d7, B:99:0x01e6, B:110:0x0213, B:118:0x0241, B:124:0x0251, B:121:0x0247, B:123:0x024f, B:114:0x0237, B:116:0x023d, B:197:0x0469, B:198:0x046e, B:200:0x0470, B:201:0x0475, B:203:0x0477, B:204:0x047c), top: B:211:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.util.Map r19) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqs.zzb(java.util.Map):void");
    }

    public final void zzc(int i, int i2, boolean z) {
        synchronized (this.zzj) {
            this.zzd = i;
            this.zze = i2;
        }
    }

    public final void zzd(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean zze() {
        boolean z;
        synchronized (this.zzj) {
            z = this.zzq != null;
        }
        return z;
    }
}
