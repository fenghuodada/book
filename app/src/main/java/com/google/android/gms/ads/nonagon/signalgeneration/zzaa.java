package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqr;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbcw;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcgw;
import com.google.android.gms.internal.ads.zzcuq;
import com.google.android.gms.internal.ads.zzdat;
import com.google.android.gms.internal.ads.zzdlz;
import com.google.android.gms.internal.ads.zzdpx;
import com.google.android.gms.internal.ads.zzdqh;
import com.google.android.gms.internal.ads.zzezy;
import com.google.android.gms.internal.ads.zzfaw;
import com.google.android.gms.internal.ads.zzffe;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzffq;
import com.google.android.gms.internal.ads.zzfft;
import com.google.android.gms.internal.ads.zzfgj;
import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfpo;
import com.google.android.gms.internal.ads.zzfux;
import com.google.android.gms.internal.ads.zzfuy;
import com.google.android.gms.internal.ads.zzfvi;
import com.google.android.gms.internal.ads.zzfvr;
import com.google.android.gms.internal.ads.zzfwb;
import com.google.android.gms.internal.ads.zzfwc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzaa extends zzbyj {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final zzbzz zzA;
    private String zzB;
    private final List zzD;
    private final List zzE;
    private final List zzF;
    private final List zzG;
    private final zzcgw zzf;
    private Context zzg;
    private final zzaqq zzh;
    private final zzfaw zzi;
    private final zzfwc zzk;
    private final ScheduledExecutorService zzl;
    @Nullable
    private zzbst zzm;
    private final zzc zzq;
    private final zzdqh zzr;
    private final zzfgj zzs;
    private zzdpx zzj = null;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final Set zzp = Collections.newSetFromMap(new WeakHashMap());
    private final AtomicInteger zzz = new AtomicInteger(0);
    private final boolean zzt = ((Boolean) zzba.zzc().zzb(zzbbk.zzgX)).booleanValue();
    private final boolean zzu = ((Boolean) zzba.zzc().zzb(zzbbk.zzgW)).booleanValue();
    private final boolean zzv = ((Boolean) zzba.zzc().zzb(zzbbk.zzgY)).booleanValue();
    private final boolean zzw = ((Boolean) zzba.zzc().zzb(zzbbk.zzha)).booleanValue();
    private final String zzx = (String) zzba.zzc().zzb(zzbbk.zzgZ);
    private final String zzy = (String) zzba.zzc().zzb(zzbbk.zzhb);
    private final String zzC = (String) zzba.zzc().zzb(zzbbk.zzhc);

    public zzaa(zzcgw zzcgwVar, Context context, zzaqq zzaqqVar, zzfaw zzfawVar, zzfwc zzfwcVar, ScheduledExecutorService scheduledExecutorService, zzdqh zzdqhVar, zzfgj zzfgjVar, zzbzz zzbzzVar) {
        List list;
        this.zzf = zzcgwVar;
        this.zzg = context;
        this.zzh = zzaqqVar;
        this.zzi = zzfawVar;
        this.zzk = zzfwcVar;
        this.zzl = scheduledExecutorService;
        this.zzq = zzcgwVar.zzm();
        this.zzr = zzdqhVar;
        this.zzs = zzfgjVar;
        this.zzA = zzbzzVar;
        if (((Boolean) zzba.zzc().zzb(zzbbk.zzhd)).booleanValue()) {
            this.zzD = zzX((String) zzba.zzc().zzb(zzbbk.zzhe));
            this.zzE = zzX((String) zzba.zzc().zzb(zzbbk.zzhf));
            this.zzF = zzX((String) zzba.zzc().zzb(zzbbk.zzhg));
            list = zzX((String) zzba.zzc().zzb(zzbbk.zzhh));
        } else {
            this.zzD = zza;
            this.zzE = zzb;
            this.zzF = zzc;
            list = zzd;
        }
        this.zzG = list;
    }

    public static /* bridge */ /* synthetic */ void zzF(zzaa zzaaVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzaaVar.zzN((Uri) it.next())) {
                zzaaVar.zzz.getAndIncrement();
                return;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzG(final zzaa zzaaVar, final String str, final String str2, final zzdpx zzdpxVar) {
        if (((Boolean) zzba.zzc().zzb(zzbbk.zzgI)).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbbk.zzgO)).booleanValue()) {
                zzcag.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzaa.this.zzI(str, str2, zzdpxVar);
                    }
                });
            } else {
                zzaaVar.zzq.zzd(str, str2, zzdpxVar);
            }
        }
    }

    public static final /* synthetic */ Uri zzP(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzW(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final zzh zzQ(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        char c;
        zzezy zzezyVar = new zzezy();
        if ("REWARDED".equals(str2)) {
            zzezyVar.zzo().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzezyVar.zzo().zza(3);
        }
        zzg zzn = this.zzf.zzn();
        zzcuq zzcuqVar = new zzcuq();
        zzcuqVar.zze(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzezyVar.zzs(str);
        if (zzlVar == null) {
            zzlVar = new com.google.android.gms.ads.internal.client.zzm().zza();
        }
        zzezyVar.zzE(zzlVar);
        if (zzqVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            zzqVar = c != 0 ? (c == 1 || c == 2) ? com.google.android.gms.ads.internal.client.zzq.zzd() : c != 3 ? c != 4 ? new com.google.android.gms.ads.internal.client.zzq() : com.google.android.gms.ads.internal.client.zzq.zzb() : com.google.android.gms.ads.internal.client.zzq.zzc() : new com.google.android.gms.ads.internal.client.zzq(context, AdSize.BANNER);
        }
        zzezyVar.zzr(zzqVar);
        zzezyVar.zzx(true);
        zzcuqVar.zzi(zzezyVar.zzG());
        zzn.zza(zzcuqVar.zzj());
        zzac zzacVar = new zzac();
        zzacVar.zza(str2);
        zzn.zzb(new zzae(zzacVar, null));
        new zzdat();
        zzh zzc2 = zzn.zzc();
        this.zzj = zzc2.zza();
        return zzc2;
    }

    private final zzfwb zzR(final String str) {
        final zzdlz[] zzdlzVarArr = new zzdlz[1];
        zzfwb zzm = zzfvr.zzm(this.zzi.zza(), new zzfuy() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzaa.this.zzv(zzdlzVarArr, str, (zzdlz) obj);
            }
        }, this.zzk);
        zzm.zzc(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // java.lang.Runnable
            public final void run() {
                zzaa.this.zzH(zzdlzVarArr);
            }
        }, this.zzk);
        return zzfvr.zze(zzfvr.zzl((zzfvi) zzfvr.zzn(zzfvi.zzv(zzm), ((Integer) zzba.zzc().zzb(zzbbk.zzhn)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfon() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                int i = zzaa.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzfon() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzj
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                int i = zzaa.zze;
                zzbzt.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    private final void zzS(List list, final IObjectWrapper iObjectWrapper, zzbsk zzbskVar, boolean z) {
        zzfwb zzb2;
        if (!((Boolean) zzba.zzc().zzb(zzbbk.zzhm)).booleanValue()) {
            zzbzt.zzj("The updating URL feature is not enabled.");
            try {
                zzbskVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                zzbzt.zzh("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (zzN((Uri) it.next())) {
                i++;
            }
        }
        if (i > 1) {
            zzbzt.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzN(uri)) {
                zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzaa.this.zzm(uri, iObjectWrapper);
                    }
                });
                if (zzV()) {
                    zzb2 = zzfvr.zzm(zzb2, new zzfuy() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzr
                        @Override // com.google.android.gms.internal.ads.zzfuy
                        public final zzfwb zza(Object obj) {
                            zzfwb zzl;
                            zzl = zzfvr.zzl(r0.zzR("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfon() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
                                @Override // com.google.android.gms.internal.ads.zzfon
                                public final Object apply(Object obj2) {
                                    return zzaa.zzP(r2, (String) obj2);
                                }
                            }, zzaa.this.zzk);
                            return zzl;
                        }
                    }, this.zzk);
                } else {
                    zzbzt.zzi("Asset view map is empty.");
                }
            } else {
                zzbzt.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                zzb2 = zzfvr.zzh(uri);
            }
            arrayList.add(zzb2);
        }
        zzfvr.zzq(zzfvr.zzd(arrayList), new zzy(this, zzbskVar, z), this.zzf.zzA());
    }

    private final void zzT(final List list, final IObjectWrapper iObjectWrapper, zzbsk zzbskVar, boolean z) {
        if (!((Boolean) zzba.zzc().zzb(zzbbk.zzhm)).booleanValue()) {
            try {
                zzbskVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                zzbzt.zzh("", e);
                return;
            }
        }
        zzfwb zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzaa.this.zzC(list, iObjectWrapper);
            }
        });
        if (zzV()) {
            zzb2 = zzfvr.zzm(zzb2, new zzfuy() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
                @Override // com.google.android.gms.internal.ads.zzfuy
                public final zzfwb zza(Object obj) {
                    return zzaa.this.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            zzbzt.zzi("Asset view map is empty.");
        }
        zzfvr.zzq(zzb2, new zzx(this, zzbskVar, z), this.zzf.zzA());
    }

    private static boolean zzU(@NonNull Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    private final boolean zzV() {
        Map map;
        zzbst zzbstVar = this.zzm;
        return (zzbstVar == null || (map = zzbstVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzW(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private static final List zzX(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfpo.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ zzffq zzr(zzfwb zzfwbVar, zzbyo zzbyoVar) {
        if (zzfft.zza() && ((Boolean) zzbcw.zze.zze()).booleanValue()) {
            try {
                zzffq zzb2 = ((zzh) zzfvr.zzo(zzfwbVar)).zzb();
                zzb2.zzd(new ArrayList(Collections.singletonList(zzbyoVar.zzb)));
                com.google.android.gms.ads.internal.client.zzl zzlVar = zzbyoVar.zzd;
                zzb2.zzb(zzlVar == null ? "" : zzlVar.zzp);
                return zzb2;
            } catch (ExecutionException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
                return null;
            }
        }
        return null;
    }

    public final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzO(uri) && !TextUtils.isEmpty(str)) {
                uri = zzW(uri, "nas", str);
            }
            arrayList.add(uri);
        }
        return arrayList;
    }

    public final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String zzh = this.zzh.zzc() != null ? this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (TextUtils.isEmpty(zzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzO(uri)) {
                uri = zzW(uri, "ms", zzh);
            } else {
                zzbzt.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
            }
            arrayList.add(uri);
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    public final /* synthetic */ void zzH(zzdlz[] zzdlzVarArr) {
        zzdlz zzdlzVar = zzdlzVarArr[0];
        if (zzdlzVar != null) {
            this.zzi.zzb(zzfvr.zzh(zzdlzVar));
        }
    }

    public final /* synthetic */ void zzI(String str, String str2, zzdpx zzdpxVar) {
        this.zzq.zzd(str, str2, zzdpxVar);
    }

    @VisibleForTesting
    public final boolean zzN(@NonNull Uri uri) {
        return zzU(uri, this.zzD, this.zzE);
    }

    @VisibleForTesting
    public final boolean zzO(@NonNull Uri uri) {
        return zzU(uri, this.zzF, this.zzG);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zze(IObjectWrapper iObjectWrapper, final zzbyo zzbyoVar, zzbyh zzbyhVar) {
        zzfwb zzh;
        zzfwb zzc2;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzfff zza2 = zzffe.zza(context, 22);
        zza2.zzh();
        if (((Boolean) zzba.zzc().zzb(zzbbk.zzjB)).booleanValue()) {
            zzfwc zzfwcVar = zzcag.zza;
            zzh = zzfwcVar.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzaa.this.zzq(zzbyoVar);
                }
            });
            zzc2 = zzfvr.zzm(zzh, new zzfuy() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                @Override // com.google.android.gms.internal.ads.zzfuy
                public final zzfwb zza(Object obj) {
                    return ((zzh) obj).zzc();
                }
            }, zzfwcVar);
        } else {
            zzh zzQ = zzQ(this.zzg, zzbyoVar.zza, zzbyoVar.zzb, zzbyoVar.zzc, zzbyoVar.zzd);
            zzh = zzfvr.zzh(zzQ);
            zzc2 = zzQ.zzc();
        }
        zzfvr.zzq(zzc2, new zzw(this, zzh, zzbyoVar, zzbyhVar, zza2, com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()), this.zzf.zzA());
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzf(zzbst zzbstVar) {
        this.zzm = zzbstVar;
        this.zzi.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbsk zzbskVar) {
        zzS(list, iObjectWrapper, zzbskVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbsk zzbskVar) {
        zzT(list, iObjectWrapper, zzbskVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzi(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzba.zzc().zzb(zzbbk.zziQ)).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbbk.zziR)).booleanValue()) {
                if (!((Boolean) zzba.zzc().zzb(zzbbk.zziU)).booleanValue()) {
                    zzfvr.zzq(((Boolean) zzba.zzc().zzb(zzbbk.zzjB)).booleanValue() ? zzfvr.zzk(new zzfux() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                        @Override // com.google.android.gms.internal.ads.zzfux
                        public final zzfwb zza() {
                            return zzaa.this.zzu();
                        }
                    }, zzcag.zza) : zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc(), new zzz(this), this.zzf.zzA());
                }
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                zzbzt.zzg("The webView cannot be null.");
            } else if (this.zzp.contains(webView)) {
                zzbzt.zzi("This webview has already been registered.");
            } else {
                this.zzp.add(webView);
                webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzr, this.zzs), "gmaSdk");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzba.zzc().zzb(zzbbk.zzhm)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbst zzbstVar = this.zzm;
            this.zzn = zzbx.zza(motionEvent, zzbstVar == null ? null : zzbstVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.zzn;
            obtain.setLocation(point.x, point.y);
            this.zzh.zzd(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbsk zzbskVar) {
        zzS(list, iObjectWrapper, zzbskVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbsk zzbskVar) {
        zzT(list, iObjectWrapper, zzbskVar, false);
    }

    public final /* synthetic */ Uri zzm(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzaqr e) {
            zzbzt.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ zzh zzq(zzbyo zzbyoVar) throws Exception {
        return zzQ(this.zzg, zzbyoVar.zza, zzbyoVar.zzb, zzbyoVar.zzc, zzbyoVar.zzd);
    }

    public final /* synthetic */ zzfwb zzu() throws Exception {
        return zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc();
    }

    public final /* synthetic */ zzfwb zzv(zzdlz[] zzdlzVarArr, String str, zzdlz zzdlzVar) throws Exception {
        zzdlzVarArr[0] = zzdlzVar;
        Context context = this.zzg;
        zzbst zzbstVar = this.zzm;
        Map map = zzbstVar.zzb;
        JSONObject zzd2 = zzbx.zzd(context, map, map, zzbstVar.zza, null);
        JSONObject zzg = zzbx.zzg(this.zzg, this.zzm.zza);
        JSONObject zzf = zzbx.zzf(this.zzm.zza);
        JSONObject zze2 = zzbx.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzg);
        jSONObject.put("scroll_view_signal", zzf);
        jSONObject.put("lock_screen_signal", zze2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbx.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdlzVar.zzd(str, jSONObject);
    }

    public final /* synthetic */ zzfwb zzw(final ArrayList arrayList) throws Exception {
        return zzfvr.zzl(zzR("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfon() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                return zzaa.this.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
