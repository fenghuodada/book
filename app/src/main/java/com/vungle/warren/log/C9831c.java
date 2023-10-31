package com.vungle.warren.log;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.warren.utility.C10089k;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

/* renamed from: com.vungle.warren.log.c */
/* loaded from: classes3.dex */
public class C9831c {
    @Nullable

    /* renamed from: a */
    public final File f19623a;

    /* renamed from: b */
    public final String f19624b = "log_";

    /* renamed from: c */
    public final String f19625c = "_pending";

    /* renamed from: com.vungle.warren.log.c$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC9832a {
        /* renamed from: a */
        void mo1482a();

        /* renamed from: b */
        void mo1481b(File file, int i);
    }

    public C9831c(@Nullable File file) {
        if (file != null) {
            File m1493b = m1493b(file, "sdk_logs", true);
            this.f19623a = (m1493b == null || !m1493b.exists()) ? null : null;
        }
    }

    /* renamed from: a */
    public static boolean m1494a(File file, String str, @Nullable InterfaceC9832a interfaceC9832a) {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            try {
                fileWriter = new FileWriter(file, true);
                try {
                    int m1492c = m1492c(file);
                    if (m1492c > 0) {
                        fileWriter.append((CharSequence) "\n");
                    }
                    fileWriter.append((CharSequence) str);
                    fileWriter.flush();
                    C10089k.m1269a(fileWriter);
                    interfaceC9832a.mo1481b(file, m1492c + 1);
                    return true;
                } catch (IOException unused) {
                    fileWriter2 = fileWriter;
                    interfaceC9832a.mo1482a();
                    C10089k.m1269a(fileWriter2);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    C10089k.m1269a(fileWriter);
                    throw th;
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileWriter = null;
        }
    }

    @Nullable
    /* renamed from: b */
    public static File m1493b(@NonNull File file, @NonNull String str, boolean z) {
        boolean z2;
        File file2 = new File(file, str);
        if (file2.exists()) {
            z2 = true;
        } else if (z) {
            z2 = file2.mkdir();
        } else {
            try {
                z2 = file2.createNewFile();
            } catch (IOException e) {
                Log.e("c", "Can't create new file " + file2.getName(), e);
                z2 = false;
            }
        }
        if (z2) {
            return file2;
        }
        return null;
    }

    /* renamed from: c */
    public static int m1492c(File file) {
        if (file == null) {
            return 0;
        }
        LineNumberReader lineNumberReader = null;
        try {
            LineNumberReader lineNumberReader2 = new LineNumberReader(new FileReader(file.getAbsolutePath()));
            while (lineNumberReader2.readLine() != null) {
                try {
                } catch (Exception unused) {
                    lineNumberReader = lineNumberReader2;
                    C10089k.m1269a(lineNumberReader);
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    lineNumberReader = lineNumberReader2;
                    C10089k.m1269a(lineNumberReader);
                    throw th;
                }
            }
            int lineNumber = lineNumberReader2.getLineNumber();
            C10089k.m1269a(lineNumberReader2);
            return lineNumber;
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: d */
    public final boolean m1491d(@NonNull File file, @NonNull String str) {
        if (file.exists() && file.isFile()) {
            File file2 = new File(this.f19623a, str);
            if (file2.exists()) {
                return false;
            }
            return file.renameTo(file2);
        }
        return false;
    }
}
