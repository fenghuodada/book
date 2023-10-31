package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.C0600a0;
import androidx.core.app.C0638p;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.C7513R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import libv2ray.V2rayConfig;

/* loaded from: classes.dex */
public final class zzebn extends zzbrn {
    private final Context zza;
    private final zzdqc zzb;
    private final zzbzy zzc;
    private final zzebc zzd;
    private final zzfen zze;

    @VisibleForTesting
    public zzebn(Context context, zzebc zzebcVar, zzbzy zzbzyVar, zzdqc zzdqcVar, zzfen zzfenVar) {
        this.zza = context;
        this.zzb = zzdqcVar;
        this.zzc = zzbzyVar;
        this.zzd = zzebcVar;
        this.zze = zzfenVar;
    }

    public static void zzc(Context context, zzdqc zzdqcVar, zzfen zzfenVar, zzebc zzebcVar, String str, String str2) {
        zzd(context, zzdqcVar, zzfenVar, zzebcVar, str, str2, new HashMap());
    }

    public static void zzd(Context context, zzdqc zzdqcVar, zzfen zzfenVar, zzebc zzebcVar, String str, String str2, Map map) {
        String zza;
        String str3 = true != com.google.android.gms.ads.internal.zzt.zzo().zzx(context) ? "offline" : "online";
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzid)).booleanValue() || zzdqcVar == null) {
            zzfem zzb = zzfem.zzb(str2);
            zzb.zza("gqi", str);
            zzb.zza("device_connectivity", str3);
            zzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzb.zza((String) entry.getKey(), (String) entry.getValue());
            }
            zza = zzfenVar.zza(zzb);
        } else {
            zzdqb zza2 = zzdqcVar.zza();
            zza2.zzb("gqi", str);
            zza2.zzb("action", str2);
            zza2.zzb("device_connectivity", str3);
            zza2.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry2 : map.entrySet()) {
                zza2.zzb((String) entry2.getKey(), (String) entry2.getValue());
            }
            zza = zza2.zzf();
        }
        zzebcVar.zzd(new zzebe(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), str, zza, 2));
    }

    public static void zzh(String[] strArr, int[] iArr, zzebp zzebpVar) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                Activity zza = zzebpVar.zza();
                zzdqc zzd = zzebpVar.zzd();
                zzebc zze = zzebpVar.zze();
                zzfen zzf = zzebpVar.zzf();
                com.google.android.gms.ads.internal.util.zzbr zzc = zzebpVar.zzc();
                String zzg = zzebpVar.zzg();
                String zzh = zzebpVar.zzh();
                com.google.android.gms.ads.internal.overlay.zzl zzb = zzebpVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzn(zza, zzc, zze, zzd, zzf, zzg, zzh);
                    zzo(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzd(zza, zzd, zzf, zze, zzg, "asnpdc", hashMap);
                return;
            }
        }
    }

    public static /* synthetic */ void zzi(Activity activity, zzdqc zzdqcVar, zzfen zzfenVar, zzebc zzebcVar, String str, com.google.android.gms.ads.internal.util.zzbr zzbrVar, String str2, com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzd(activity, zzdqcVar, zzfenVar, zzebcVar, str, "rtsdc", hashMap);
        Intent zzg = com.google.android.gms.ads.internal.zzt.zzq().zzg(activity);
        if (zzg != null) {
            activity.startActivity(zzg);
            zzn(activity, zzbrVar, zzebcVar, zzdqcVar, zzfenVar, str, str2);
        }
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    public static void zzj(final Activity activity, final zzdqc zzdqcVar, final zzfen zzfenVar, final zzebc zzebcVar, final String str, final com.google.android.gms.ads.internal.util.zzbr zzbrVar, final String str2, final com.google.android.gms.ads.internal.overlay.zzl zzlVar, boolean z, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzd(activity, zzdqcVar, zzfenVar, zzebcVar, str, "dialog_click", hashMap);
        com.google.android.gms.ads.internal.zzt.zzp();
        if (new C0600a0(activity).m12103a()) {
            zzn(activity, zzbrVar, zzebcVar, zzdqcVar, zzfenVar, str, str2);
            zzo(activity, zzlVar);
        } else if (Build.VERSION.SDK_INT < 33) {
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder zzG = com.google.android.gms.ads.internal.util.zzs.zzG(activity);
            zzG.setTitle(zzl(C7513R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzl(C7513R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebf
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i2) {
                    zzebn.zzi(activity, zzdqcVar, zzfenVar, zzebcVar, str, zzbrVar, str2, zzlVar, dialogInterface2, i2);
                }
            }).setNegativeButton(zzl(C7513R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebg
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i2) {
                    zzebc zzebcVar2 = zzebc.this;
                    String str3 = str;
                    Activity activity2 = activity;
                    zzdqc zzdqcVar2 = zzdqcVar;
                    zzfen zzfenVar2 = zzfenVar;
                    com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                    zzebcVar2.zzc(str3);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("dialog_action", "dismiss");
                    zzebn.zzd(activity2, zzdqcVar2, zzfenVar2, zzebcVar2, str3, "rtsdc", hashMap2);
                    if (zzlVar2 != null) {
                        zzlVar2.zzb();
                    }
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzebh
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface2) {
                    zzebc zzebcVar2 = zzebc.this;
                    String str3 = str;
                    Activity activity2 = activity;
                    zzdqc zzdqcVar2 = zzdqcVar;
                    zzfen zzfenVar2 = zzfenVar;
                    com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                    zzebcVar2.zzc(str3);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("dialog_action", "dismiss");
                    zzebn.zzd(activity2, zzdqcVar2, zzfenVar2, zzebcVar2, str3, "rtsdc", hashMap2);
                    if (zzlVar2 != null) {
                        zzlVar2.zzb();
                    }
                }
            });
            zzG.create().show();
            zzc(activity, zzdqcVar, zzfenVar, zzebcVar, str, "rtsdi");
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            zzc(activity, zzdqcVar, zzfenVar, zzebcVar, str, "asnpdi");
            if (z) {
                zzn(activity, zzbrVar, zzebcVar, zzdqcVar, zzfenVar, str, str2);
            }
        }
    }

    public static void zzk(final Activity activity, @Nullable final com.google.android.gms.ads.internal.overlay.zzl zzlVar, final com.google.android.gms.ads.internal.util.zzbr zzbrVar, final zzebc zzebcVar, final zzdqc zzdqcVar, final zzfen zzfenVar, final String str, final String str2, final boolean z) {
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzG = com.google.android.gms.ads.internal.util.zzs.zzG(activity);
        zzG.setTitle(zzl(C7513R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzl(C7513R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzl(C7513R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zzebn.zzj(activity, zzdqcVar, zzfenVar, zzebcVar, str, zzbrVar, str2, zzlVar, z, dialogInterface, i);
            }
        }).setNegativeButton(zzl(C7513R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zzebc zzebcVar2 = zzebc.this;
                String str3 = str;
                Activity activity2 = activity;
                zzdqc zzdqcVar2 = zzdqcVar;
                zzfen zzfenVar2 = zzfenVar;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                zzebcVar2.zzc(str3);
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "dismiss");
                zzebn.zzd(activity2, zzdqcVar2, zzfenVar2, zzebcVar2, str3, "dialog_click", hashMap);
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzebl
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzebc zzebcVar2 = zzebc.this;
                String str3 = str;
                Activity activity2 = activity;
                zzdqc zzdqcVar2 = zzdqcVar;
                zzfen zzfenVar2 = zzfenVar;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                zzebcVar2.zzc(str3);
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "dismiss");
                zzebn.zzd(activity2, zzdqcVar2, zzfenVar2, zzebcVar2, str3, "dialog_click", hashMap);
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        zzG.create().show();
    }

    private static String zzl(int i, String str) {
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        return zzd == null ? str : zzd.getString(i);
    }

    private final void zzm(String str, String str2, Map map) {
        zzd(this.zza, this.zzb, this.zze, this.zzd, str, str2, map);
    }

    private static void zzn(Context context, com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzebc zzebcVar, zzdqc zzdqcVar, zzfen zzfenVar, String str, String str2) {
        try {
            if (zzbrVar.zzf(ObjectWrapper.wrap(context), str2, str)) {
                return;
            }
        } catch (RemoteException e) {
            zzbzt.zzh("Failed to schedule offline notification poster.", e);
        }
        zzebcVar.zzc(str);
        zzc(context, zzdqcVar, zzfenVar, zzebcVar, str, "offline_notification_worker_not_scheduled");
    }

    private static void zzo(Context context, @Nullable final com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        String zzl = zzl(C7513R.string.offline_opt_in_confirmation, "You'll get a notification with the link when you're back online");
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzG = com.google.android.gms.ads.internal.util.zzs.zzG(context);
        zzG.setMessage(zzl).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzebi
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = com.google.android.gms.ads.internal.overlay.zzl.this;
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        AlertDialog create = zzG.create();
        create.show();
        Timer timer = new Timer();
        timer.schedule(new zzebm(create, timer, zzlVar), 3000L);
    }

    private static final PendingIntent zzp(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context, AdService.CLASS_NAME);
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        return zzfme.zza(context, 0, intent, zzfme.zza | 1073741824, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zzx = com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == zzx ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith(V2rayConfig.HTTP)));
                try {
                    Context context = this.zza;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzm(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zzd.getWritableDatabase();
                if (r8 == 1) {
                    this.zzd.zzg(writableDatabase, this.zzc, stringExtra2);
                } else {
                    zzebc.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                zzbzt.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void zzf() {
        zzebc zzebcVar = this.zzd;
        final zzbzy zzbzyVar = this.zzc;
        zzebcVar.zze(new zzfdg() { // from class: com.google.android.gms.internal.ads.zzeay
            @Override // com.google.android.gms.internal.ads.zzfdg
            public final Object zza(Object obj) {
                zzebc.zzb(zzbzy.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void zzg(IObjectWrapper iObjectWrapper, String str, String str2) {
        String str3;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.ads.internal.zzt.zzq().zzh(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent zzp = zzp(context, "offline_notification_clicked", str2, str);
        PendingIntent zzp2 = zzp(context, "offline_notification_dismissed", str2, str);
        C0638p c0638p = new C0638p(context, "offline_notification_channel");
        c0638p.f2306e = C0638p.m12059b(zzl(C7513R.string.offline_notification_title, "View the ad you saved when you were offline"));
        c0638p.f2307f = C0638p.m12059b(zzl(C7513R.string.offline_notification_text, "Tap to open ad"));
        c0638p.m12058c(16);
        Notification notification = c0638p.f2316o;
        notification.deleteIntent = zzp2;
        c0638p.f2308g = zzp;
        notification.icon = context.getApplicationInfo().icon;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap = new HashMap();
        try {
            notificationManager.notify(str2, 54321, c0638p.m12060a());
            str3 = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            hashMap.put("notification_not_shown_reason", e.getMessage());
            str3 = "offline_notification_failed";
        }
        zzm(str2, str3, hashMap);
    }
}
