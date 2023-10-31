package com.unity3d.services.core.cache;

import android.content.Context;
import android.os.Environment;
import com.unity3d.services.core.log.C9549a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: com.unity3d.services.core.cache.a */
/* loaded from: classes3.dex */
public class C9467a {

    /* renamed from: a */
    private String f18595a;

    /* renamed from: b */
    private boolean f18596b = false;

    /* renamed from: c */
    private File f18597c = null;

    /* renamed from: d */
    private EnumC9468b f18598d = null;

    public C9467a(String str) {
        this.f18595a = str;
    }

    /* renamed from: a */
    private void m2245a(File file) {
        try {
            C9549a.m2019b(new File(file, ".nomedia").createNewFile() ? "Successfully created .nomedia file" : "Using existing .nomedia file");
        } catch (Exception e) {
            C9549a.m2023a("Failed to create .nomedia file", e);
        }
    }

    /* renamed from: a */
    public EnumC9468b m2247a() {
        return this.f18598d;
    }

    /* renamed from: a */
    public synchronized File m2246a(Context context) {
        File file;
        if (this.f18596b) {
            return this.f18597c;
        }
        this.f18596b = true;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            try {
                file = m2244a(context.getExternalCacheDir(), this.f18595a);
            } catch (Exception e) {
                C9549a.m2023a("Creating external cache directory failed", e);
                file = null;
            }
            if (m2243b(file)) {
                m2245a(file);
                this.f18597c = file;
                this.f18598d = EnumC9468b.EXTERNAL;
                C9549a.m2019b("Unity Ads is using external cache directory: " + file.getAbsolutePath());
                return this.f18597c;
            }
        } else {
            C9549a.m2019b("External media not mounted");
        }
        File filesDir = context.getFilesDir();
        if (!m2243b(filesDir)) {
            C9549a.m2017c("Unity Ads failed to initialize cache directory");
            return null;
        }
        this.f18597c = filesDir;
        this.f18598d = EnumC9468b.INTERNAL;
        C9549a.m2019b("Unity Ads is using internal cache directory: " + filesDir.getAbsolutePath());
        return this.f18597c;
    }

    /* renamed from: a */
    public File m2244a(File file, String str) {
        if (file == null) {
            return null;
        }
        File file2 = new File(file, str);
        file2.mkdirs();
        if (file2.isDirectory()) {
            return file2;
        }
        return null;
    }

    /* renamed from: b */
    public boolean m2243b(File file) {
        if (file != null && file.isDirectory()) {
            try {
                byte[] bytes = "test".getBytes("UTF-8");
                int length = bytes.length;
                byte[] bArr = new byte[length];
                File file2 = new File(file, "UnityAdsTest.txt");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                fileOutputStream.close();
                FileInputStream fileInputStream = new FileInputStream(file2);
                int read = fileInputStream.read(bArr, 0, length);
                fileInputStream.close();
                if (!file2.delete()) {
                    C9549a.m2019b("Failed to delete testfile " + file2.getAbsoluteFile());
                    return false;
                } else if (read != length) {
                    C9549a.m2019b("Read buffer size mismatch");
                    return false;
                } else if (new String(bArr, "UTF-8").equals("test")) {
                    return true;
                } else {
                    C9549a.m2019b("Read buffer content mismatch");
                    return false;
                }
            } catch (Exception e) {
                C9549a.m2019b("Unity Ads exception while testing cache directory " + file.getAbsolutePath() + ": " + e.getMessage());
            }
        }
        return false;
    }
}
