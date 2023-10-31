package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.collection.C0472d;
import androidx.core.app.C0624j0;
import androidx.core.graphics.drawable.IconCompat;
import com.github.appintro.AppIntroBaseFragmentKt;
import java.util.ArrayList;
import java.util.Iterator;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.app.x */
/* loaded from: classes.dex */
public final class C0646x {

    /* renamed from: a */
    public final Notification.Builder f2319a;

    /* renamed from: b */
    public final C0638p f2320b;

    /* renamed from: c */
    public final Bundle f2321c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [long[], java.lang.CharSequence, android.net.Uri, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v28 */
    public C0646x(C0638p c0638p) {
        Notification.Builder builder;
        boolean z;
        boolean z2;
        boolean z3;
        ?? r5;
        Bundle bundle;
        ArrayList<NotificationCompat$Action> arrayList;
        Bundle[] bundleArr;
        int i;
        CharSequence charSequence;
        Icon icon;
        Bundle bundle2;
        int i2;
        new ArrayList();
        this.f2321c = new Bundle();
        this.f2320b = c0638p;
        Context context = c0638p.f2302a;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = new Notification.Builder(context, c0638p.f2314m);
        } else {
            builder = new Notification.Builder(context);
        }
        this.f2319a = builder;
        Notification notification = c0638p.f2316o;
        ArrayList<String> arrayList2 = null;
        Notification.Builder lights = builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        int i3 = 0;
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(c0638p.f2306e).setContentText(c0638p.f2307f).setContentInfo(null).setContentIntent(c0638p.f2308g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon((Bitmap) null).setNumber(0).setProgress(0, 0, false);
        builder.setSubText(null).setUsesChronometer(false).setPriority(c0638p.f2309h);
        Iterator<NotificationCompat$Action> it = c0638p.f2303b.iterator();
        while (it.hasNext()) {
            NotificationCompat$Action next = it.next();
            if (next.f2244b == null && (i2 = next.f2250h) != 0) {
                next.f2244b = IconCompat.m11955b("", i2);
            }
            IconCompat iconCompat = next.f2244b;
            if (iconCompat != null) {
                icon = IconCompat.C0696a.m11947f(iconCompat, null);
            } else {
                icon = null;
            }
            Notification.Action.Builder builder2 = new Notification.Action.Builder(icon, next.f2251i, next.f2252j);
            RemoteInput[] remoteInputArr = next.f2245c;
            if (remoteInputArr != null) {
                int length = remoteInputArr.length;
                android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[length];
                if (remoteInputArr.length <= 0) {
                    for (int i4 = 0; i4 < length; i4++) {
                        builder2.addRemoteInput(remoteInputArr2[i4]);
                    }
                } else {
                    RemoteInput remoteInput = remoteInputArr[0];
                    throw null;
                }
            }
            Bundle bundle3 = next.f2243a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z4 = next.f2246d;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z4);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                builder2.setAllowGeneratedReplies(z4);
            }
            int i6 = next.f2248f;
            bundle2.putInt("android.support.action.semanticAction", i6);
            if (i5 >= 28) {
                builder2.setSemanticAction(i6);
            }
            if (i5 >= 29) {
                builder2.setContextual(next.f2249g);
            }
            if (i5 >= 31) {
                builder2.setAuthenticationRequired(next.f2253k);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", next.f2247e);
            builder2.addExtras(bundle2);
            this.f2319a.addAction(builder2.build());
        }
        Bundle bundle4 = c0638p.f2313l;
        if (bundle4 != null) {
            this.f2321c.putAll(bundle4);
        }
        int i7 = Build.VERSION.SDK_INT;
        this.f2319a.setShowWhen(c0638p.f2310i);
        this.f2319a.setLocalOnly(c0638p.f2312k).setGroup(null).setGroupSummary(false).setSortKey(null);
        this.f2319a.setCategory(null).setColor(0).setVisibility(0).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
        ArrayList<C0624j0> arrayList3 = c0638p.f2304c;
        ArrayList<String> arrayList4 = c0638p.f2317p;
        if (i7 < 28) {
            if (arrayList3 != null) {
                arrayList2 = new ArrayList<>(arrayList3.size());
                Iterator<C0624j0> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    C0624j0 next2 = it2.next();
                    String str = next2.f2286c;
                    if (str == null) {
                        if (next2.f2284a == null) {
                            str = "";
                        } else {
                            str = "name:" + ((Object) charSequence);
                        }
                    }
                    arrayList2.add(str);
                }
            }
            if (arrayList2 != null) {
                if (arrayList4 == null) {
                    arrayList4 = arrayList2;
                } else {
                    C0472d c0472d = new C0472d(arrayList4.size() + arrayList2.size());
                    c0472d.addAll(arrayList2);
                    c0472d.addAll(arrayList4);
                    arrayList4 = new ArrayList<>(c0472d);
                }
            }
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            for (String str2 : arrayList4) {
                this.f2319a.addPerson(str2);
            }
        }
        ArrayList<NotificationCompat$Action> arrayList5 = c0638p.f2305d;
        if (arrayList5.size() > 0) {
            if (c0638p.f2313l == null) {
                c0638p.f2313l = new Bundle();
            }
            Bundle bundle5 = c0638p.f2313l.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i8 = 0;
            while (i3 < arrayList5.size()) {
                String num = Integer.toString(i3);
                NotificationCompat$Action notificationCompat$Action = arrayList5.get(i3);
                Object obj = C0647y.f2322a;
                Bundle bundle8 = new Bundle();
                if (notificationCompat$Action.f2244b == null && (i = notificationCompat$Action.f2250h) != 0) {
                    notificationCompat$Action.f2244b = IconCompat.m11955b("", i);
                }
                IconCompat iconCompat2 = notificationCompat$Action.f2244b;
                bundle8.putInt("icon", iconCompat2 != null ? iconCompat2.m11954c() : i8);
                bundle8.putCharSequence(AppIntroBaseFragmentKt.ARG_TITLE, notificationCompat$Action.f2251i);
                bundle8.putParcelable("actionIntent", notificationCompat$Action.f2252j);
                Bundle bundle9 = notificationCompat$Action.f2243a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", notificationCompat$Action.f2246d);
                bundle8.putBundle("extras", bundle);
                RemoteInput[] remoteInputArr3 = notificationCompat$Action.f2245c;
                if (remoteInputArr3 == null) {
                    bundleArr = null;
                    arrayList = arrayList5;
                } else {
                    Bundle[] bundleArr2 = new Bundle[remoteInputArr3.length];
                    arrayList = arrayList5;
                    if (remoteInputArr3.length <= 0) {
                        bundleArr = bundleArr2;
                    } else {
                        RemoteInput remoteInput2 = remoteInputArr3[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", notificationCompat$Action.f2247e);
                bundle8.putInt("semanticAction", notificationCompat$Action.f2248f);
                bundle7.putBundle(num, bundle8);
                i3++;
                i8 = 0;
                arrayList5 = arrayList;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (c0638p.f2313l == null) {
                c0638p.f2313l = new Bundle();
            }
            c0638p.f2313l.putBundle("android.car.EXTENSIONS", bundle5);
            this.f2321c.putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 24) {
            r5 = 0;
            this.f2319a.setExtras(c0638p.f2313l).setRemoteInputHistory(null);
        } else {
            r5 = 0;
        }
        if (i9 >= 26) {
            this.f2319a.setBadgeIconType(0).setSettingsText(r5).setShortcutId(r5).setTimeoutAfter(0L).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(c0638p.f2314m)) {
                this.f2319a.setSound(r5).setDefaults(0).setLights(0, 0, 0).setVibrate(r5);
            }
        }
        if (i9 >= 28) {
            Iterator<C0624j0> it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                C0624j0 next3 = it3.next();
                Notification.Builder builder3 = this.f2319a;
                next3.getClass();
                builder3.addPerson(C0624j0.C0625a.m12068b(next3));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2319a.setAllowSystemGeneratedContextualActions(c0638p.f2315n);
            this.f2319a.setBubbleMetadata(null);
        }
    }
}
