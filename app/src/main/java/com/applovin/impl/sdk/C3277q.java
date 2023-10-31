package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import androidx.activity.result.C0063d;
import com.applovin.impl.adview.C2808x;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p032d.C3124e;
import com.applovin.impl.sdk.p032d.C3125f;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.q */
/* loaded from: classes.dex */
public class C3277q {

    /* renamed from: b */
    private final C3214m f8647b;

    /* renamed from: c */
    private final C3349v f8648c;

    /* renamed from: a */
    private final String f8646a = "FileManager";

    /* renamed from: d */
    private final Object f8649d = new Object();

    /* renamed from: e */
    private final Set<String> f8650e = new HashSet();

    public C3277q(C3214m c3214m) {
        this.f8647b = c3214m;
        this.f8648c = c3214m.m7487A();
    }

    /* renamed from: a */
    private long m7107a() {
        long longValue = ((Long) this.f8647b.m7456a(C3109b.f7885bk)).longValue();
        if (longValue < 0 || !m7094b()) {
            return -1L;
        }
        return longValue;
    }

    /* renamed from: a */
    private long m7106a(long j) {
        return j / 1048576;
    }

    /* renamed from: a */
    private File m7095a(String str, boolean z, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (C3349v.m6862a()) {
                this.f8648c.m6855b("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (C3349v.m6862a()) {
            C2808x.m8855b("Looking up cached resource: ", str, this.f8648c, "FileManager");
        }
        if (str.contains("icon")) {
            str = str.replace(RemoteSettings.FORWARD_SLASH_STRING, "_").replace(".", "_");
        }
        File m7085e = m7085e(context);
        File file = new File(m7085e, str);
        if (z) {
            try {
                m7085e.mkdirs();
            } catch (Throwable th) {
                if (C3349v.m6862a()) {
                    C3349v c3349v = this.f8648c;
                    c3349v.m6854b("FileManager", "Unable to make cache directory at " + m7085e, th);
                }
                return null;
            }
        }
        return file;
    }

    /* renamed from: a */
    private void m7105a(long j, Context context) {
        C3349v c3349v;
        String str;
        if (m7094b()) {
            long intValue = ((Integer) this.f8647b.m7456a(C3109b.f7886bl)).intValue();
            if (intValue == -1) {
                if (!C3349v.m6862a()) {
                    return;
                }
                c3349v = this.f8648c;
                str = "Cache has no maximum size set; skipping drop...";
            } else if (m7106a(j) > intValue) {
                if (C3349v.m6862a()) {
                    this.f8648c.m6855b("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                for (File file : m7087d(context)) {
                    m7092b(file);
                }
                this.f8647b.m7468T().m7719a(C3125f.f8166f);
                return;
            } else if (!C3349v.m6862a()) {
                return;
            } else {
                c3349v = this.f8648c;
                str = "Cache is present but under size limit; not dropping...";
            }
            c3349v.m6855b("FileManager", str);
        }
    }

    /* renamed from: b */
    private boolean m7094b() {
        return ((Boolean) this.f8647b.m7456a(C3109b.f7884bj)).booleanValue();
    }

    /* renamed from: b */
    private boolean m7092b(File file) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f8648c;
            c3349v.m6855b("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            try {
                m7088c(file);
                return file.delete();
            } catch (Exception e) {
                if (C3349v.m6862a()) {
                    C3349v c3349v2 = this.f8648c;
                    c3349v2.m6854b("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", e);
                }
                m7086d(file);
                return false;
            }
        } finally {
            m7086d(file);
        }
    }

    /* renamed from: c */
    private long m7089c(Context context) {
        boolean z;
        long m7107a = m7107a();
        boolean z2 = m7107a != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List<String> m7423b = this.f8647b.m7423b(C3109b.f7891bq);
        long j = 0;
        for (File file : m7087d(context)) {
            if (!z2 || m7423b.contains(file.getName()) || m7084e(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= m7107a) {
                z = false;
            } else {
                if (C3349v.m6862a()) {
                    this.f8648c.m6855b("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                z = m7092b(file);
            }
            if (z) {
                this.f8647b.m7468T().m7719a(C3125f.f8165e);
            } else {
                j = file.length() + j;
            }
        }
        return j;
    }

    /* renamed from: c */
    private void m7088c(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f8649d) {
            boolean add = this.f8650e.add(absolutePath);
            while (!add) {
                try {
                    this.f8649d.wait();
                    add = this.f8650e.add(absolutePath);
                } catch (InterruptedException e) {
                    if (C3349v.m6862a()) {
                        C3349v c3349v = this.f8648c;
                        c3349v.m6854b("FileManager", "Lock '" + absolutePath + "' interrupted", e);
                    }
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* renamed from: d */
    private List<File> m7087d(Context context) {
        File[] listFiles;
        File m7085e = m7085e(context);
        return (!m7085e.isDirectory() || (listFiles = m7085e.listFiles()) == null) ? Collections.emptyList() : Arrays.asList(listFiles);
    }

    /* renamed from: d */
    private void m7086d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f8649d) {
            this.f8650e.remove(absolutePath);
            this.f8649d.notifyAll();
        }
    }

    /* renamed from: e */
    private File m7085e(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    /* renamed from: e */
    private boolean m7084e(File file) {
        boolean contains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f8649d) {
            contains = this.f8650e.contains(absolutePath);
        }
        return contains;
    }

    /* renamed from: a */
    public File m7097a(String str, Context context) {
        return m7095a(str, true, context);
    }

    /* renamed from: a */
    public String m7103a(Context context, String str, String str2, List<String> list, boolean z, C3124e c3124e) {
        return m7102a(context, str, str2, list, z, false, c3124e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* renamed from: a */
    public String m7101a(File file) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        String str = null;
        if (file == null) {
            return null;
        }
        boolean m6862a = C3349v.m6862a();
        ?? r1 = m6862a;
        if (m6862a) {
            C3349v c3349v = this.f8648c;
            c3349v.m6855b("FileManager", "Reading resource from filesystem: " + file.getName());
            r1 = c3349v;
        }
        try {
            try {
                m7088c(file);
                r1 = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e = e;
                r1 = 0;
            } catch (IOException e2) {
                e = e2;
                r1 = 0;
            } catch (Throwable th) {
                th = th;
                r1 = 0;
            }
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    bArr = new byte[8192];
                } catch (FileNotFoundException e3) {
                    e = e3;
                    r1 = r1;
                    if (C3349v.m6862a()) {
                        this.f8648c.m6853c("FileManager", "File not found. " + e);
                        r1 = r1;
                    }
                    return str;
                } catch (IOException e4) {
                    e = e4;
                    r1 = r1;
                    if (C3349v.m6862a()) {
                        this.f8648c.m6855b("FileManager", "Failed to read file: " + file.getName() + e);
                        r1 = r1;
                    }
                    return str;
                }
            } catch (Throwable th2) {
                th = th2;
                r1 = r1;
                if (C3349v.m6862a()) {
                    this.f8648c.m6854b("FileManager", "Unknown failure to read file.", th);
                    r1 = r1;
                }
                return str;
            }
            while (true) {
                int read = r1.read(bArr, 0, 8192);
                if (read < 0) {
                    break;
                }
                try {
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Exception unused) {
                    Utils.close(byteArrayOutputStream, this.f8647b);
                }
                return str;
            }
            str = byteArrayOutputStream.toString("UTF-8");
            return str;
        } finally {
            Utils.close(r1, this.f8647b);
            m7086d(file);
        }
    }

    /* renamed from: a */
    public void m7104a(Context context) {
        if (m7094b() && this.f8647b.m7415c()) {
            if (C3349v.m6862a()) {
                this.f8648c.m6855b("FileManager", "Compacting cache...");
            }
            m7105a(m7089c(context), context);
        }
    }

    /* renamed from: a */
    public boolean m7100a(File file, String str, List<String> list, C3124e c3124e) {
        return m7099a(file, str, list, true, c3124e);
    }

    /* renamed from: a */
    public boolean m7098a(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f8648c;
            c3349v.m6855b("FileManager", "Writing resource to filesystem: " + file.getName());
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            m7088c(file);
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read < 0) {
                    Utils.close(fileOutputStream, this.f8647b);
                    m7086d(file);
                    return true;
                }
                try {
                    fileOutputStream.write(bArr, 0, read);
                } catch (Exception e) {
                    if (C3349v.m6862a()) {
                        this.f8648c.m6854b("FileManager", "Failed to write next buffer to file", e);
                    }
                    Utils.close(fileOutputStream, this.f8647b);
                    m7086d(file);
                    return false;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            try {
                if (C3349v.m6862a()) {
                    this.f8648c.m6854b("FileManager", "Unknown failure to write file.", th);
                }
                Utils.close(fileOutputStream2, this.f8647b);
                m7086d(file);
                return false;
            } catch (Throwable th3) {
                Utils.close(fileOutputStream2, this.f8647b);
                m7086d(file);
                throw th3;
            }
        }
    }

    /* renamed from: b */
    public void m7093b(Context context) {
        try {
            m7097a(".nomedia", context);
            File file = new File(m7085e(context), ".nomedia");
            if (file.exists()) {
                return;
            }
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f8648c;
                c3349v.m6855b("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (!file.createNewFile() && C3349v.m6862a()) {
                this.f8648c.m6850e("FileManager", "Failed to create .nomedia file");
            }
        } catch (IOException e) {
            if (C3349v.m6862a()) {
                this.f8648c.m6854b("FileManager", "Failed to create .nomedia file", e);
            }
        }
    }

    /* renamed from: b */
    public boolean m7091b(InputStream inputStream, File file) {
        if (file == null) {
            return false;
        }
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f8648c;
            c3349v.m6855b("FileManager", "Caching " + file.getAbsolutePath() + "...");
        }
        if (!m7098a(inputStream, file)) {
            if (C3349v.m6862a()) {
                C3349v c3349v2 = this.f8648c;
                c3349v2.m6850e("FileManager", "Unable to cache " + file.getAbsolutePath());
            }
            return false;
        } else if (C3349v.m6862a()) {
            C3349v c3349v3 = this.f8648c;
            c3349v3.m6855b("FileManager", "Caching completed for " + file);
            return true;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    public boolean m7090b(String str, Context context) {
        File m7095a = m7095a(str, false, context);
        return (m7095a == null || !m7095a.exists() || m7095a.isDirectory()) ? false : true;
    }

    /* renamed from: a */
    public InputStream m7096a(String str, List<String> list, boolean z, C3124e c3124e) {
        if (z && !Utils.isDomainWhitelisted(str, list)) {
            if (C3349v.m6862a()) {
                C2808x.m8855b("Domain is not whitelisted, skipping precache for url: ", str, this.f8648c, "FileManager");
            }
            return null;
        }
        if (((Boolean) this.f8647b.m7456a(C3109b.f7917cQ)).booleanValue() && !str.contains("https://")) {
            if (C3349v.m6862a()) {
                this.f8648c.m6851d("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            }
            str = str.replace("http://", "https://");
        }
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f8648c;
            c3349v.m6855b("FileManager", "Loading " + str + "...");
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(((Integer) this.f8647b.m7456a(C3109b.f7915cO)).intValue());
            httpURLConnection.setReadTimeout(((Integer) this.f8647b.m7456a(C3109b.f7916cP)).intValue());
            httpURLConnection.setDefaultUseCaches(true);
            httpURLConnection.setUseCaches(true);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            int responseCode = httpURLConnection.getResponseCode();
            c3124e.m7735a(responseCode);
            if (responseCode >= 200 && responseCode < 300) {
                if (C3349v.m6862a()) {
                    C3349v c3349v2 = this.f8648c;
                    c3349v2.m6855b("FileManager", "Opened stream to resource " + str);
                }
                return httpURLConnection.getInputStream();
            }
            return null;
        } catch (Exception e) {
            if (C3349v.m6862a()) {
                C3349v c3349v3 = this.f8648c;
                c3349v3.m6854b("FileManager", "Error loading " + str, e);
            }
            c3124e.m7733a(e);
            return null;
        }
    }

    /* renamed from: a */
    public String m7102a(Context context, String str, String str2, List<String> list, boolean z, boolean z2, C3124e c3124e) {
        if (!StringUtils.isValidString(str)) {
            if (C3349v.m6862a()) {
                this.f8648c.m6855b("FileManager", "Nothing to cache, skipping...");
            }
            return null;
        }
        Uri parse = Uri.parse(str);
        String fileName = ((Boolean) this.f8647b.m7456a(C3109b.f8024eT)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
        if (StringUtils.isValidString(fileName) && StringUtils.isValidString(str2)) {
            fileName = C0063d.m13053a(str2, fileName);
        }
        String str3 = fileName;
        File m7097a = m7097a(str3, context);
        if (m7099a(m7097a, str, list, z, c3124e)) {
            if (C3349v.m6862a()) {
                C2808x.m8855b("Caching succeeded for file ", str3, this.f8648c, "FileManager");
            }
            return z2 ? Uri.fromFile(m7097a).toString() : str3;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m7099a(File file, String str, List<String> list, boolean z, C3124e c3124e) {
        InputStream inputStream;
        if (file != null && file.exists() && !file.isDirectory()) {
            if (C3349v.m6862a()) {
                C2808x.m8855b("File exists for ", str, this.f8648c, "FileManager");
            }
            if (c3124e != null) {
                c3124e.m7731b(file.length());
                return true;
            }
            return true;
        }
        try {
            inputStream = m7096a(str, list, z, c3124e);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean m7091b = m7091b(inputStream, file);
            Utils.close(inputStream, this.f8647b);
            return m7091b;
        } catch (Throwable th2) {
            th = th2;
            Utils.close(inputStream, this.f8647b);
            throw th;
        }
    }
}
