package androidx.appcompat.app;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.appcompat.app.C0153z;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: androidx.appcompat.app.z */
/* loaded from: classes.dex */
public final class C0153z {

    /* renamed from: androidx.appcompat.app.z$a */
    /* loaded from: classes.dex */
    public static class ExecutorC0154a implements Executor {

        /* renamed from: a */
        public final Object f403a = new Object();

        /* renamed from: b */
        public final ArrayDeque f404b = new ArrayDeque();

        /* renamed from: c */
        public final Executor f405c;

        /* renamed from: d */
        public Runnable f406d;

        public ExecutorC0154a(ExecutorC0155b executorC0155b) {
            this.f405c = executorC0155b;
        }

        /* renamed from: a */
        public final void m12925a() {
            synchronized (this.f403a) {
                Runnable runnable = (Runnable) this.f404b.poll();
                this.f406d = runnable;
                if (runnable != null) {
                    this.f405c.execute(runnable);
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(final Runnable runnable) {
            synchronized (this.f403a) {
                this.f404b.add(new Runnable() { // from class: androidx.appcompat.app.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable2 = runnable;
                        C0153z.ExecutorC0154a executorC0154a = C0153z.ExecutorC0154a.this;
                        executorC0154a.getClass();
                        try {
                            runnable2.run();
                        } finally {
                            executorC0154a.m12925a();
                        }
                    }
                });
                if (this.f406d == null) {
                    m12925a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.app.z$b */
    /* loaded from: classes.dex */
    public static class ExecutorC0155b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* renamed from: a */
    public static void m12927a(@NonNull Context context, @NonNull String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                    Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (Exception e) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e);
                    if (openFileOutput == null) {
                        return;
                    }
                }
                try {
                    openFileOutput.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r3 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        if (r3 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        if (r2.isEmpty() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
        android.util.Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
        r9.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
        return r2;
     */
    @androidx.annotation.NonNull
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m12926b(@androidx.annotation.NonNull android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L6a
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            r7 = 1
            if (r6 == r7) goto L40
            r7 = 3
            if (r6 != r7) goto L27
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            if (r8 <= r5) goto L40
        L27:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L2d
            goto L17
        L2d:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L48
        L40:
            if (r3 == 0) goto L50
        L42:
            r3.close()     // Catch: java.io.IOException -> L50
            goto L50
        L46:
            r9 = move-exception
            goto L64
        L48:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L50
            goto L42
        L50:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L60
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L63
        L60:
            r9.deleteFile(r0)
        L63:
            return r2
        L64:
            if (r3 == 0) goto L69
            r3.close()     // Catch: java.io.IOException -> L69
        L69:
            throw r9
        L6a:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0153z.m12926b(android.content.Context):java.lang.String");
    }
}
