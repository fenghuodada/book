package com.vungle.warren.utility;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: com.vungle.warren.utility.k */
/* loaded from: classes3.dex */
public final class C10089k {
    @VisibleForTesting

    /* renamed from: a */
    public static final List<Class<?>> f20313a;

    /* renamed from: com.vungle.warren.utility.k$a */
    /* loaded from: classes3.dex */
    public class C10090a {
    }

    static {
        new C10090a();
        f20313a = Arrays.asList(LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class);
    }

    /* renamed from: a */
    public static void m1269a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m1268b(File file) throws IOException {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                m1268b(file2);
            }
        }
        if (file.delete()) {
            return;
        }
        throw new FileNotFoundException("Failed to delete file: " + file);
    }

    /* renamed from: c */
    public static void m1267c(File file) {
        Path path;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                path = file.toPath();
                Files.delete(path);
            } else if (!file.delete()) {
                Log.e("k", "Cannot delete " + file.getName());
            }
        } catch (IOException e) {
            Log.e("k", "Cannot delete " + file.getName(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x005a: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:40:0x005a */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.Closeable, java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Nullable
    /* renamed from: d */
    public static <T> T m1266d(File file) {
        Closeable closeable;
        IOException e;
        C10105t c10105t;
        String str;
        Closeable closeable2;
        ?? exists = file.exists();
        Closeable closeable3 = null;
        try {
            if (exists == 0) {
                return null;
            }
            try {
                exists = new FileInputStream(file);
                try {
                    c10105t = new C10105t(exists, f20313a);
                } catch (IOException e2) {
                    e = e2;
                    c10105t = null;
                } catch (ClassNotFoundException e3) {
                    e = e3;
                    c10105t = null;
                } catch (Exception e4) {
                    e = e4;
                    c10105t = null;
                } catch (Throwable th) {
                    th = th;
                    m1269a(closeable3);
                    m1269a(exists);
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                exists = 0;
                c10105t = null;
            } catch (ClassNotFoundException e6) {
                e = e6;
                exists = 0;
                c10105t = null;
            } catch (Exception e7) {
                e = e7;
                exists = 0;
                c10105t = null;
            } catch (Throwable th2) {
                th = th2;
                exists = 0;
            }
            try {
                T t = (T) c10105t.readObject();
                m1269a(c10105t);
                m1269a(exists);
                return t;
            } catch (IOException e8) {
                e = e8;
                str = "IOIOException";
                closeable2 = exists;
                Log.e("k", str, e);
                m1269a(c10105t);
                m1269a(closeable2);
                try {
                    m1268b(file);
                } catch (IOException unused) {
                }
                return null;
            } catch (ClassNotFoundException e9) {
                e = e9;
                str = "ClassNotFoundException";
                closeable2 = exists;
                Log.e("k", str, e);
                m1269a(c10105t);
                m1269a(closeable2);
                m1268b(file);
                return null;
            } catch (Exception e10) {
                e = e10;
                str = "cannot read serializable";
                closeable2 = exists;
                Log.e("k", str, e);
                m1269a(c10105t);
                m1269a(closeable2);
                m1268b(file);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable3 = closeable;
        }
    }

    /* renamed from: e */
    public static long m1265e(@Nullable File file) {
        long j = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    j += m1265e(file2);
                }
            }
            return j;
        }
        return file.length();
    }

    /* renamed from: f */
    public static void m1264f(@NonNull File file, @Nullable Serializable serializable) {
        FileOutputStream fileOutputStream;
        if (file.exists()) {
            m1267c(file);
        }
        if (serializable == null) {
            return;
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream);
                    try {
                        objectOutputStream2.writeObject(serializable);
                        objectOutputStream2.reset();
                        m1269a(objectOutputStream2);
                    } catch (IOException e) {
                        e = e;
                        objectOutputStream = objectOutputStream2;
                        Log.e("k", "IOIOException", e);
                        m1269a(objectOutputStream);
                        m1269a(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        objectOutputStream = objectOutputStream2;
                        m1269a(objectOutputStream);
                        m1269a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        m1269a(fileOutputStream);
    }
}
