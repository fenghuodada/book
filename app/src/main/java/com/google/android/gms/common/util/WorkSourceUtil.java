package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@KeepForSdk
/* loaded from: classes.dex */
public class WorkSourceUtil {
    private static final int zza = Process.myUid();
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;
    @GuardedBy("WorkSourceUtil.class")
    private static Boolean zzj;

    /* JADX WARN: Can't wrap try/catch for region: R(26:1|2|3|4|(22:54|55|7|8|9|10|11|12|13|(13:46|47|16|(10:41|42|19|(7:36|37|22|(6:28|29|30|31|25|26)|24|25|26)|21|22|(0)|24|25|26)|18|19|(0)|21|22|(0)|24|25|26)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.zza = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L18
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L18
            r5[r3] = r6     // Catch: java.lang.Exception -> L18
            java.lang.reflect.Method r5 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L18
            goto L19
        L18:
            r5 = r4
        L19:
            com.google.android.gms.common.util.WorkSourceUtil.zzb = r5
            boolean r5 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 2
            if (r5 == 0) goto L31
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L31
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L31
            r5[r3] = r8     // Catch: java.lang.Exception -> L31
            r5[r2] = r6     // Catch: java.lang.Exception -> L31
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L31
            goto L32
        L31:
            r0 = r4
        L32:
            com.google.android.gms.common.util.WorkSourceUtil.zzc = r0
            java.lang.String r0 = "size"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L3d
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L3d
            goto L3e
        L3d:
            r0 = r4
        L3e:
            com.google.android.gms.common.util.WorkSourceUtil.zzd = r0
            java.lang.String r0 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L4d
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4d
            r5[r3] = r8     // Catch: java.lang.Exception -> L4d
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L4d
            goto L4e
        L4d:
            r0 = r4
        L4e:
            com.google.android.gms.common.util.WorkSourceUtil.zze = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            if (r0 == 0) goto L63
            java.lang.String r0 = "getName"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L63
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L63
            r5[r3] = r8     // Catch: java.lang.Exception -> L63
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L63
            goto L64
        L63:
            r0 = r4
        L64:
            com.google.android.gms.common.util.WorkSourceUtil.zzf = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            java.lang.String r5 = "WorkSourceUtil"
            if (r0 == 0) goto L7d
            java.lang.String r0 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L77
            java.lang.reflect.Method r0 = r1.getMethod(r0, r8)     // Catch: java.lang.Exception -> L77
            goto L7e
        L77:
            r0 = move-exception
            java.lang.String r8 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r8, r0)
        L7d:
            r0 = r4
        L7e:
            com.google.android.gms.common.util.WorkSourceUtil.zzg = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto La1
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.String r8 = "addNode"
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L9b
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L9b
            r7[r3] = r9     // Catch: java.lang.Exception -> L9b
            r7[r2] = r6     // Catch: java.lang.Exception -> L9b
            java.lang.reflect.Method r0 = r0.getMethod(r8, r7)     // Catch: java.lang.Exception -> L9b
            goto La2
        L9b:
            r0 = move-exception
            java.lang.String r6 = "Missing WorkChain class"
            android.util.Log.w(r5, r6, r0)
        La1:
            r0 = r4
        La2:
            com.google.android.gms.common.util.WorkSourceUtil.zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto Lb6
            java.lang.String r0 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Lb6
            java.lang.reflect.Method r0 = r1.getMethod(r0, r3)     // Catch: java.lang.Exception -> Lb6
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> Lb7
            goto Lb7
        Lb6:
            r0 = r4
        Lb7:
            com.google.android.gms.common.util.WorkSourceUtil.zzi = r0
            com.google.android.gms.common.util.WorkSourceUtil.zzj = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.<clinit>():void");
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void add(@NonNull WorkSource workSource, int i, @NonNull String str) {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    @NonNull
    @KeepForSdk
    public static WorkSource fromPackage(@NonNull Context context, @NonNull String str) {
        String str2;
        ApplicationInfo applicationInfo;
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "Could not find package: ";
        }
        if (applicationInfo == null) {
            str2 = "Could not get applicationInfo from package: ";
            Log.e("WorkSourceUtil", str2.concat(str));
            return null;
        }
        int i = applicationInfo.uid;
        WorkSource workSource = new WorkSource();
        add(workSource, i, str);
        return workSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.os.WorkSource fromPackageAndModuleExperimentalPi(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.NonNull java.lang.String r10, @androidx.annotation.NonNull java.lang.String r11) {
        /*
            r0 = 0
            java.lang.String r1 = "WorkSourceUtil"
            if (r9 == 0) goto L6e
            android.content.pm.PackageManager r2 = r9.getPackageManager()
            if (r2 == 0) goto L6e
            if (r11 == 0) goto L6e
            if (r10 != 0) goto L10
            goto L6e
        L10:
            r2 = -1
            r3 = 0
            com.google.android.gms.common.wrappers.PackageManagerWrapper r9 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo(r10, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            if (r9 != 0) goto L1f
            java.lang.String r9 = "Could not get applicationInfo from package: "
            goto L24
        L1f:
            int r2 = r9.uid
            goto L2b
        L22:
            java.lang.String r9 = "Could not find package: "
        L24:
            java.lang.String r9 = r9.concat(r10)
            android.util.Log.e(r1, r9)
        L2b:
            if (r2 >= 0) goto L2e
            return r0
        L2e:
            android.os.WorkSource r9 = new android.os.WorkSource
            r9.<init>()
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzg
            if (r0 == 0) goto L6a
            java.lang.reflect.Method r4 = com.google.android.gms.common.util.WorkSourceUtil.zzh
            if (r4 != 0) goto L3c
            goto L6a
        L3c:
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L63
            java.lang.Object r0 = r0.invoke(r9, r5)     // Catch: java.lang.Exception -> L63
            int r5 = com.google.android.gms.common.util.WorkSourceUtil.zza     // Catch: java.lang.Exception -> L63
            r6 = 1
            r7 = 2
            if (r2 == r5) goto L55
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L63
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L63
            r8[r3] = r2     // Catch: java.lang.Exception -> L63
            r8[r6] = r10     // Catch: java.lang.Exception -> L63
            r4.invoke(r0, r8)     // Catch: java.lang.Exception -> L63
        L55:
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L63
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L63
            r10[r3] = r2     // Catch: java.lang.Exception -> L63
            r10[r6] = r11     // Catch: java.lang.Exception -> L63
            r4.invoke(r0, r10)     // Catch: java.lang.Exception -> L63
            goto L6d
        L63:
            r10 = move-exception
            java.lang.String r11 = "Unable to assign chained blame through WorkSource"
            android.util.Log.w(r1, r11, r10)
            goto L6d
        L6a:
            add(r9, r2, r10)
        L6d:
            return r9
        L6e:
            java.lang.String r9 = "Unexpected null arguments"
            android.util.Log.w(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.fromPackageAndModuleExperimentalPi(android.content.Context, java.lang.String, java.lang.String):android.os.WorkSource");
    }

    @KeepForSdk
    public static int get(@NonNull WorkSource workSource, int i) {
        Method method = zze;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, Integer.valueOf(i));
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    @NonNull
    @KeepForSdk
    public static String getName(@NonNull WorkSource workSource, int i) {
        Method method = zzf;
        if (method != null) {
            try {
                return (String) method.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return null;
            }
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public static List<String> getNames(@NonNull WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int size = workSource == null ? 0 : size(workSource);
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                String name = getName(workSource, i);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static synchronized boolean hasWorkSourcePermission(@NonNull Context context) {
        synchronized (WorkSourceUtil.class) {
            Boolean bool = zzj;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (context == null) {
                return false;
            }
            Boolean valueOf = Boolean.valueOf(ContextCompat.m12040a(context, "android.permission.UPDATE_DEVICE_STATS") == 0);
            zzj = valueOf;
            return valueOf.booleanValue();
        }
    }

    @KeepForSdk
    public static boolean isEmpty(@NonNull WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
        }
        return size(workSource) == 0;
    }

    @KeepForSdk
    public static int size(@NonNull WorkSource workSource) {
        Method method = zzd;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }
}
