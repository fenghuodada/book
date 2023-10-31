package androidx.profileinstaller;

import android.content.pm.PackageInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class ProfileInstaller {

    /* renamed from: a */
    public static final C1531a f3530a = new C1531a();
    @NonNull

    /* renamed from: b */
    public static final C1532b f3531b = new C1532b();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* loaded from: classes.dex */
    public @interface DiagnosticCode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* loaded from: classes.dex */
    public @interface ResultCode {
    }

    /* renamed from: androidx.profileinstaller.ProfileInstaller$a */
    /* loaded from: classes.dex */
    public class C1531a implements InterfaceC1533c {
        @Override // androidx.profileinstaller.ProfileInstaller.InterfaceC1533c
        /* renamed from: a */
        public final void mo10490a() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.InterfaceC1533c
        /* renamed from: b */
        public final void mo10489b(int i, @Nullable Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstaller$b */
    /* loaded from: classes.dex */
    public class C1532b implements InterfaceC1533c {
        @Override // androidx.profileinstaller.ProfileInstaller.InterfaceC1533c
        /* renamed from: a */
        public final void mo10490a() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }

        @Override // androidx.profileinstaller.ProfileInstaller.InterfaceC1533c
        /* renamed from: b */
        public final void mo10489b(int i, @Nullable Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstaller$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1533c {
        /* renamed from: a */
        void mo10490a();

        /* renamed from: b */
        void mo10489b(int i, @Nullable Object obj);
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: a */
    public static void m10492a(@NonNull PackageInfo packageInfo, @NonNull File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0155  */
    /* JADX WARN: Type inference failed for: r1v2, types: [byte[], androidx.profileinstaller.d[]] */
    /* JADX WARN: Type inference failed for: r2v18, types: [byte[], androidx.profileinstaller.d[]] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @androidx.annotation.WorkerThread
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m10491b(@androidx.annotation.NonNull android.content.Context r19, @androidx.annotation.NonNull java.util.concurrent.Executor r20, @androidx.annotation.NonNull androidx.profileinstaller.ProfileInstaller.InterfaceC1533c r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.ProfileInstaller.m10491b(android.content.Context, java.util.concurrent.Executor, androidx.profileinstaller.ProfileInstaller$c, boolean):void");
    }
}
