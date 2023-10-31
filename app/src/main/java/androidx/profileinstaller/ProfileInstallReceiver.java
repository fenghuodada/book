package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.profileinstaller.ProfileInstaller;
import java.io.File;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    /* loaded from: classes.dex */
    public class C1530a implements ProfileInstaller.InterfaceC1533c {
        public C1530a() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.InterfaceC1533c
        /* renamed from: a */
        public final void mo10490a() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }

        @Override // androidx.profileinstaller.ProfileInstaller.InterfaceC1533c
        /* renamed from: b */
        public final void mo10489b(int i, @Nullable Object obj) {
            ProfileInstaller.f3531b.mo10489b(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
        Bundle extras;
        File codeCacheDir;
        int i;
        Context createDeviceProtectedStorageContext;
        int i2;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            ProfileInstaller.m10491b(context, new ExecutorC1545g(), new C1530a(), true);
            return;
        }
        boolean equals = "androidx.profileinstaller.action.SKIP_FILE".equals(action);
        ProfileInstaller.C1532b c1532b = ProfileInstaller.f3531b;
        if (equals) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    try {
                        ProfileInstaller.m10492a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        c1532b.mo10489b(10, null);
                        setResultCode(10);
                    } catch (PackageManager.NameNotFoundException e) {
                        c1532b.mo10489b(7, e);
                        setResultCode(7);
                    }
                } else if ("DELETE_SKIP_FILE".equals(string)) {
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    c1532b.mo10489b(11, null);
                    setResultCode(11);
                }
            }
        } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            if (Build.VERSION.SDK_INT >= 24) {
                Process.sendSignal(Process.myPid(), 10);
                i2 = 12;
            } else {
                i2 = 13;
            }
            c1532b.mo10489b(i2, null);
            setResultCode(i2);
        } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
            if ("DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
                if (Build.VERSION.SDK_INT >= 24) {
                    createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                    codeCacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
                } else {
                    codeCacheDir = context.getCodeCacheDir();
                }
                if (C1539a.m10481a(codeCacheDir)) {
                    i = 14;
                } else {
                    i = 15;
                }
                c1532b.mo10489b(i, null);
                setResultCode(i);
                return;
            }
            c1532b.mo10489b(16, null);
            setResultCode(16);
        }
    }
}
