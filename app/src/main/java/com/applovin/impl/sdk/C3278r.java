package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import androidx.activity.result.C0063d;
import com.applovin.impl.adview.C2808x;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p032d.C3124e;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.r */
/* loaded from: classes.dex */
public class C3278r {

    /* renamed from: b */
    private final C3214m f8652b;

    /* renamed from: c */
    private final C3349v f8653c;

    /* renamed from: a */
    private final String f8651a = "FileManagerOld";

    /* renamed from: d */
    private final Object f8654d = new Object();

    public C3278r(C3214m c3214m) {
        this.f8652b = c3214m;
        this.f8653c = c3214m.m7487A();
    }

    /* renamed from: a */
    private File m7083a(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    /* renamed from: b */
    private boolean m7074b(ByteArrayOutputStream byteArrayOutputStream, File file) {
        C3214m c3214m;
        boolean z;
        FileOutputStream fileOutputStream;
        if (C3349v.m6861a(this.f8652b)) {
            C3349v c3349v = this.f8653c;
            c3349v.m6855b("FileManagerOld", "Writing resource to filesystem: " + file.getName());
        }
        synchronized (this.f8654d) {
            FileOutputStream fileOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException e) {
                e = e;
            } catch (Throwable th) {
                th = th;
            }
            try {
                byteArrayOutputStream.writeTo(fileOutputStream);
                Utils.close(fileOutputStream, this.f8652b);
                z = true;
            } catch (IOException e2) {
                e = e2;
                fileOutputStream2 = fileOutputStream;
                if (C3349v.m6861a(this.f8652b)) {
                    this.f8653c.m6854b("FileManagerOld", "Unable to write data to file.", e);
                }
                c3214m = this.f8652b;
                Utils.close(fileOutputStream2, c3214m);
                z = false;
                return z;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (C3349v.m6861a(this.f8652b)) {
                    this.f8653c.m6854b("FileManagerOld", "Unknown failure to write file.", th);
                }
                c3214m = this.f8652b;
                Utils.close(fileOutputStream2, c3214m);
                z = false;
                return z;
            }
        }
        return z;
    }

    /* renamed from: a */
    public ByteArrayOutputStream m7079a(File file) {
        FileInputStream fileInputStream;
        if (file == null) {
            return null;
        }
        if (C3349v.m6861a(this.f8652b)) {
            this.f8653c.m6855b("FileManagerOld", "Reading resource from filesystem: " + file.getName());
        }
        synchronized (this.f8654d) {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e = e;
                fileInputStream = null;
            } catch (IOException e2) {
                e = e2;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
            }
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr, 0, 1024);
                        if (read < 0) {
                            Utils.close(fileInputStream, this.f8652b);
                            return byteArrayOutputStream;
                        }
                        try {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } catch (Exception unused) {
                            Utils.close(byteArrayOutputStream, this.f8652b);
                            Utils.close(fileInputStream, this.f8652b);
                            return null;
                        }
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                    if (C3349v.m6861a(this.f8652b)) {
                        this.f8653c.m6853c("FileManagerOld", "File not found. " + e);
                    }
                    Utils.close(fileInputStream, this.f8652b);
                    return null;
                } catch (IOException e4) {
                    e = e4;
                    if (C3349v.m6861a(this.f8652b)) {
                        this.f8653c.m6855b("FileManagerOld", "Failed to read file: " + file.getName() + e);
                    }
                    Utils.close(fileInputStream, this.f8652b);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (C3349v.m6861a(this.f8652b)) {
                    this.f8653c.m6854b("FileManagerOld", "Unknown failure to read file.", th);
                }
                Utils.close(fileInputStream, this.f8652b);
                return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124 A[Catch: all -> 0x014d, TryCatch #7 {all -> 0x014d, blocks: (B:30:0x00be, B:31:0x00c0, B:33:0x00c6, B:36:0x00d1, B:38:0x00d9, B:35:0x00ca, B:57:0x011c, B:59:0x0124, B:60:0x013a), top: B:71:0x0068 }] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.applovin.impl.sdk.c.b<java.lang.Boolean>, com.applovin.impl.sdk.c.b] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.ByteArrayOutputStream m7075a(java.lang.String r8, java.util.List<java.lang.String> r9, boolean r10, com.applovin.impl.sdk.p032d.C3124e r11) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C3278r.m7075a(java.lang.String, java.util.List, boolean, com.applovin.impl.sdk.d.e):java.io.ByteArrayOutputStream");
    }

    /* renamed from: a */
    public String m7082a(Context context, String str, String str2, List<String> list, boolean z, C3124e c3124e) {
        return m7081a(context, str, str2, list, z, false, c3124e);
    }

    /* renamed from: a */
    public boolean m7080a(ByteArrayOutputStream byteArrayOutputStream, File file) {
        if (file == null) {
            return false;
        }
        if (C3349v.m6861a(this.f8652b)) {
            C3349v c3349v = this.f8653c;
            c3349v.m6855b("FileManagerOld", "Caching " + file.getAbsolutePath() + "...");
        }
        if (byteArrayOutputStream == null || byteArrayOutputStream.size() <= 0) {
            if (C3349v.m6861a(this.f8652b)) {
                C3349v c3349v2 = this.f8653c;
                c3349v2.m6851d("FileManagerOld", "No data for " + file.getAbsolutePath());
            }
            return false;
        } else if (!m7074b(byteArrayOutputStream, file)) {
            if (C3349v.m6861a(this.f8652b)) {
                C3349v c3349v3 = this.f8653c;
                c3349v3.m6850e("FileManagerOld", "Unable to cache " + file.getAbsolutePath());
            }
            return false;
        } else if (C3349v.m6861a(this.f8652b)) {
            C3349v c3349v4 = this.f8653c;
            c3349v4.m6855b("FileManagerOld", "Caching completed for " + file);
            return true;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public boolean m7078a(File file, String str, List<String> list, C3124e c3124e) {
        return m7077a(file, str, list, true, c3124e);
    }

    /* renamed from: b */
    public boolean m7073b(String str, Context context) {
        boolean z;
        synchronized (this.f8654d) {
            File m7076a = m7076a(str, context);
            z = (m7076a == null || !m7076a.exists() || m7076a.isDirectory()) ? false : true;
        }
        return z;
    }

    /* renamed from: a */
    public File m7076a(String str, Context context) {
        File file;
        if (!StringUtils.isValidString(str)) {
            if (C3349v.m6861a(this.f8652b)) {
                this.f8653c.m6855b("FileManagerOld", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (C3349v.m6861a(this.f8652b)) {
            C2808x.m8855b("Looking up cached resource: ", str, this.f8653c, "FileManagerOld");
        }
        if (str.contains("icon")) {
            str = str.replace(RemoteSettings.FORWARD_SLASH_STRING, "_").replace(".", "_");
        }
        synchronized (this.f8654d) {
            File m7083a = m7083a(context);
            file = new File(m7083a, str);
            m7083a.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    public String m7081a(Context context, String str, String str2, List<String> list, boolean z, boolean z2, C3124e c3124e) {
        if (!StringUtils.isValidString(str)) {
            if (C3349v.m6861a(this.f8652b)) {
                this.f8653c.m6855b("FileManagerOld", "Nothing to cache, skipping...");
            }
            return null;
        }
        Uri parse = Uri.parse(str);
        String fileName = ((Boolean) this.f8652b.m7456a(C3109b.f8024eT)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
        if (StringUtils.isValidString(fileName) && StringUtils.isValidString(str2)) {
            fileName = C0063d.m13053a(str2, fileName);
        }
        String str3 = fileName;
        File m7076a = m7076a(str3, context);
        if (m7077a(m7076a, str, list, z, c3124e)) {
            if (C3349v.m6861a(this.f8652b)) {
                C2808x.m8855b("Caching succeeded for file ", str3, this.f8653c, "FileManagerOld");
            }
            return z2 ? Uri.fromFile(m7076a).toString() : str3;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m7077a(File file, String str, List<String> list, boolean z, C3124e c3124e) {
        if (file == null || !file.exists() || file.isDirectory()) {
            ByteArrayOutputStream m7075a = m7075a(str, list, z, c3124e);
            if (c3124e != null && m7075a != null) {
                c3124e.m7734a(m7075a.size());
            }
            return m7080a(m7075a, file);
        }
        if (C3349v.m6861a(this.f8652b)) {
            C2808x.m8855b("File exists for ", str, this.f8653c, "FileManagerOld");
        }
        if (c3124e != null) {
            c3124e.m7731b(file.length());
            return true;
        }
        return true;
    }
}
