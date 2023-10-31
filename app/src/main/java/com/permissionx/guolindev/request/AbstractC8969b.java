package com.permissionx.guolindev.request;

import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import androidx.core.app.C0600a0;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C10868p;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.permissionx.guolindev.request.b */
/* loaded from: classes3.dex */
public abstract class AbstractC8969b implements InterfaceC8971c {
    @JvmField
    @NotNull

    /* renamed from: a */
    public final C8992v f17136a;
    @JvmField
    @Nullable

    /* renamed from: b */
    public AbstractC8969b f17137b;

    public AbstractC8969b(@NotNull C8992v c8992v) {
        this.f17136a = c8992v;
    }

    @Override // com.permissionx.guolindev.request.InterfaceC8971c
    /* renamed from: b */
    public final void mo2828b() {
        C10868p c10868p;
        boolean canRequestPackageInstalls;
        boolean isExternalStorageManager;
        boolean z;
        AbstractC8969b abstractC8969b = this.f17137b;
        if (abstractC8969b != null) {
            abstractC8969b.request();
            c10868p = C10868p.f21418a;
        } else {
            c10868p = null;
        }
        if (c10868p == null) {
            ArrayList arrayList = new ArrayList();
            C8992v c8992v = this.f17136a;
            arrayList.addAll(c8992v.f17179h);
            arrayList.addAll(c8992v.f17180i);
            arrayList.addAll(c8992v.f17177f);
            Set<String> set = c8992v.f17176e;
            boolean contains = set.contains("android.permission.ACCESS_BACKGROUND_LOCATION");
            LinkedHashSet linkedHashSet = c8992v.f17178g;
            boolean z2 = true;
            if (contains) {
                if (ContextCompat.m12040a(c8992v.m2824a(), "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    linkedHashSet.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                } else {
                    arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                }
            }
            if (set.contains("android.permission.SYSTEM_ALERT_WINDOW") && c8992v.m2821d() >= 23) {
                if (Settings.canDrawOverlays(c8992v.m2824a())) {
                    linkedHashSet.add("android.permission.SYSTEM_ALERT_WINDOW");
                } else {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                }
            }
            if (set.contains("android.permission.WRITE_SETTINGS") && c8992v.m2821d() >= 23) {
                if (Settings.System.canWrite(c8992v.m2824a())) {
                    linkedHashSet.add("android.permission.WRITE_SETTINGS");
                } else {
                    arrayList.add("android.permission.WRITE_SETTINGS");
                }
            }
            if (set.contains("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                if (Build.VERSION.SDK_INT >= 30) {
                    isExternalStorageManager = Environment.isExternalStorageManager();
                    if (isExternalStorageManager) {
                        linkedHashSet.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                    }
                }
                arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
            }
            if (set.contains("android.permission.REQUEST_INSTALL_PACKAGES")) {
                if (Build.VERSION.SDK_INT >= 26 && c8992v.m2821d() >= 26) {
                    canRequestPackageInstalls = c8992v.m2824a().getPackageManager().canRequestPackageInstalls();
                    if (canRequestPackageInstalls) {
                        linkedHashSet.add("android.permission.REQUEST_INSTALL_PACKAGES");
                    }
                }
                arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
            }
            if (set.contains("android.permission.POST_NOTIFICATIONS")) {
                if (new C0600a0(c8992v.m2824a()).m12103a()) {
                    linkedHashSet.add("android.permission.POST_NOTIFICATIONS");
                } else {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                }
            }
            if (set.contains("android.permission.BODY_SENSORS_BACKGROUND")) {
                if (ContextCompat.m12040a(c8992v.m2824a(), "android.permission.BODY_SENSORS_BACKGROUND") != 0) {
                    z2 = false;
                }
                if (z2) {
                    linkedHashSet.add("android.permission.BODY_SENSORS_BACKGROUND");
                } else {
                    arrayList.add("android.permission.BODY_SENSORS_BACKGROUND");
                }
            }
            Fragment findFragmentByTag = c8992v.m2823b().findFragmentByTag("InvisibleFragment");
            if (findFragmentByTag != null) {
                c8992v.m2823b().beginTransaction().remove(findFragmentByTag).commitNowAllowingStateLoss();
            }
            if (Build.VERSION.SDK_INT != 26) {
                c8992v.m2824a().setRequestedOrientation(c8992v.f17174c);
            }
        }
    }
}
