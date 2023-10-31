package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.C0498f;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ProfileVerifier {

    /* renamed from: a */
    public static final C0498f<CompilationStatus> f3532a = new C0498f<>();

    /* renamed from: b */
    public static final Object f3533b = new Object();
    @Nullable

    /* renamed from: c */
    public static CompilationStatus f3534c = null;

    /* loaded from: classes.dex */
    public static class CompilationStatus {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
        /* loaded from: classes.dex */
        public @interface ResultCode {
        }
    }

    @RequiresApi(33)
    /* renamed from: androidx.profileinstaller.ProfileVerifier$a */
    /* loaded from: classes.dex */
    public static class C1537a {
        @DoNotInline
        /* renamed from: a */
        public static PackageInfo m10484a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: androidx.profileinstaller.ProfileVerifier$b */
    /* loaded from: classes.dex */
    public static class C1538b {

        /* renamed from: a */
        public final int f3535a;

        /* renamed from: b */
        public final int f3536b;

        /* renamed from: c */
        public final long f3537c;

        /* renamed from: d */
        public final long f3538d;

        public C1538b(int i, int i2, long j, long j2) {
            this.f3535a = i;
            this.f3536b = i2;
            this.f3537c = j;
            this.f3538d = j2;
        }

        /* renamed from: a */
        public static C1538b m10483a(@NonNull File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                C1538b c1538b = new C1538b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return c1538b;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        /* renamed from: b */
        public final void m10482b(@NonNull File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f3535a);
                dataOutputStream.writeInt(this.f3536b);
                dataOutputStream.writeLong(this.f3537c);
                dataOutputStream.writeLong(this.f3538d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C1538b)) {
                return false;
            }
            C1538b c1538b = (C1538b) obj;
            return this.f3536b == c1538b.f3536b && this.f3537c == c1538b.f3537c && this.f3535a == c1538b.f3535a && this.f3538d == c1538b.f3538d;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f3536b), Long.valueOf(this.f3537c), Integer.valueOf(this.f3535a), Long.valueOf(this.f3538d));
        }
    }

    /* renamed from: a */
    public static CompilationStatus m10486a(int i, boolean z, boolean z2) {
        CompilationStatus compilationStatus = new CompilationStatus();
        f3534c = compilationStatus;
        f3532a.set(compilationStatus);
        return f3534c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:14|(1:82)(1:18)|19|(1:81)(1:23)|24|25|(1:27)(1:74)|28|29|(2:66|67)(1:31)|32|(8:39|(1:43)|(1:50)|51|(2:58|59)|55|56|57)|(1:65)|(1:43)|(3:45|48|50)|51|(1:53)|58|59|55|56|57) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b7, code lost:
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e7, code lost:
        r3 = 196608;
     */
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.EnumC0076a.LIBRARY})
    @androidx.annotation.WorkerThread
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m10485b(@androidx.annotation.NonNull android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.ProfileVerifier.m10485b(android.content.Context, boolean):void");
    }
}
