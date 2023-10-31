package com.vungle.warren.log;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.warren.log.C9835f;
import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: com.vungle.warren.log.h */
/* loaded from: classes3.dex */
public final class C9840h extends C9831c {

    /* renamed from: g */
    public static final /* synthetic */ int f19664g = 0;

    /* renamed from: d */
    public C9835f.InterfaceC9838c f19665d;

    /* renamed from: e */
    public File f19666e;

    /* renamed from: f */
    public int f19667f;

    /* renamed from: com.vungle.warren.log.h$a */
    /* loaded from: classes3.dex */
    public class C9841a implements FilenameFilter {
        public C9841a() {
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return !str.endsWith(C9840h.this.f19625c);
        }
    }

    public C9840h(@Nullable File file) {
        super(file);
        this.f19667f = 100;
        if (this.f19623a != null) {
            this.f19666e = m1484e();
        }
    }

    @Nullable
    /* renamed from: e */
    public final File m1484e() {
        File file = null;
        File file2 = this.f19623a;
        if (file2 != null && file2.exists()) {
            File[] listFiles = file2.listFiles(new C9841a());
            if (listFiles != null && listFiles.length != 0) {
                Arrays.sort(listFiles, new C9830b());
                File file3 = listFiles[0];
                int m1492c = C9831c.m1492c(file3);
                if (m1492c > 0 && m1492c >= this.f19667f) {
                    try {
                        if (m1491d(file3, file3.getName() + this.f19625c)) {
                            file = m1484e();
                        }
                    } catch (Exception unused) {
                    }
                    if (file != null) {
                        return file;
                    }
                    return file3;
                }
                return file3;
            }
            return C9831c.m1493b(file2, this.f19624b + System.currentTimeMillis() + UUID.randomUUID().toString(), false);
        }
        Log.w("h", "No log cache dir found.");
        return null;
    }

    /* renamed from: f */
    public final void m1483f(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        File file = this.f19623a;
        if (file == null) {
            Log.w("h", "No log cache dir found.");
            return;
        }
        C9834e c9834e = new C9834e(str, str2, str3, str4, str5, TimeZone.getDefault().getID(), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date(System.currentTimeMillis())), str6, str7, str8);
        File m1493b = C9831c.m1493b(file, "crash_" + System.currentTimeMillis(), false);
        if (m1493b != null) {
            C9831c.m1494a(m1493b, c9834e.m1489b(), new C9842i(this, m1493b));
        }
    }
}
