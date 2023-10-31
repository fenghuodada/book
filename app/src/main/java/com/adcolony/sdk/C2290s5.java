package com.adcolony.sdk;

import android.content.Context;
import android.os.StatFs;
import androidx.concurrent.futures.C0484a;
import java.io.File;

/* renamed from: com.adcolony.sdk.s5 */
/* loaded from: classes.dex */
public final class C2290s5 {

    /* renamed from: a */
    public String f5576a;

    /* renamed from: b */
    public String f5577b;

    /* renamed from: c */
    public String f5578c;

    /* renamed from: d */
    public String f5579d;

    /* renamed from: e */
    public File f5580e;

    /* renamed from: f */
    public File f5581f;

    /* renamed from: g */
    public File f5582g;

    /* renamed from: a */
    public final void m9501a() {
        String absolutePath;
        double d;
        C2058b3 m9588d = C2201m0.m9588d();
        StringBuilder sb = new StringBuilder();
        Context context = C2201m0.f5363a;
        String str = "";
        if (context == null) {
            absolutePath = "";
        } else {
            absolutePath = context.getFilesDir().getAbsolutePath();
        }
        this.f5576a = C0484a.m12392a(sb, absolutePath, "/adc3/");
        this.f5577b = C0484a.m12392a(new StringBuilder(), this.f5576a, "media/");
        File file = new File(this.f5577b);
        this.f5580e = file;
        if (!file.isDirectory()) {
            this.f5580e.delete();
            this.f5580e.mkdirs();
        }
        if (!this.f5580e.isDirectory()) {
            m9588d.m9693j();
            return;
        }
        try {
            StatFs statFs = new StatFs(this.f5577b);
            d = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (RuntimeException unused) {
            d = 0.0d;
        }
        if (d < 2.097152E7d) {
            C2201m0.m9588d().m9689n().m9706d("Not enough memory available at media path, disabling AdColony.", 0, 1, false);
            m9588d.m9693j();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        Context context2 = C2201m0.f5363a;
        if (context2 != null) {
            str = context2.getFilesDir().getAbsolutePath();
        }
        this.f5578c = C0484a.m12392a(sb2, str, "/adc3/data/");
        File file2 = new File(this.f5578c);
        this.f5581f = file2;
        if (!file2.isDirectory()) {
            this.f5581f.delete();
        }
        this.f5581f.mkdirs();
        this.f5579d = C0484a.m12392a(new StringBuilder(), this.f5576a, "tmp/");
        File file3 = new File(this.f5579d);
        this.f5582g = file3;
        if (!file3.isDirectory()) {
            this.f5582g.delete();
            this.f5582g.mkdirs();
        }
    }

    /* renamed from: b */
    public final C2367y1 m9500b() {
        if (new File(C0484a.m12392a(new StringBuilder(), this.f5576a, "AppVersion")).exists()) {
            return C2080d1.m9655m(this.f5576a + "AppVersion");
        }
        return new C2367y1();
    }

    /* renamed from: c */
    public final void m9499c() {
        File file = this.f5580e;
        if (file == null || this.f5581f == null || this.f5582g == null) {
            return;
        }
        if (!file.isDirectory()) {
            this.f5580e.delete();
        }
        if (!this.f5581f.isDirectory()) {
            this.f5581f.delete();
        }
        if (!this.f5582g.isDirectory()) {
            this.f5582g.delete();
        }
        this.f5580e.mkdirs();
        this.f5581f.mkdirs();
        this.f5582g.mkdirs();
    }
}
