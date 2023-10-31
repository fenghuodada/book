package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.appcompat.view.menu.C0235r;
import androidx.constraintlayout.motion.widget.C0552c;
import androidx.multidex.C1528d;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Stream;

/* renamed from: androidx.multidex.c */
/* loaded from: classes.dex */
public final class C1526c implements Closeable {

    /* renamed from: a */
    public final File f3520a;

    /* renamed from: b */
    public final long f3521b;

    /* renamed from: c */
    public final File f3522c;

    /* renamed from: d */
    public final RandomAccessFile f3523d;

    /* renamed from: e */
    public final FileChannel f3524e;

    /* renamed from: f */
    public final FileLock f3525f;

    /* renamed from: androidx.multidex.c$a */
    /* loaded from: classes.dex */
    public static class C1527a extends File {

        /* renamed from: a */
        public long f3526a;

        public C1527a(File file, String str) {
            super(file, str);
            this.f3526a = -1L;
        }
    }

    public C1526c(File file, File file2) throws IOException {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f3520a = file;
        this.f3522c = file2;
        this.f3521b = m10498e(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f3523d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f3524e = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f3525f = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                m10501a(this.f3524e);
                throw e;
            } catch (Error e2) {
                e = e2;
                m10501a(this.f3524e);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                m10501a(this.f3524e);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            m10501a(this.f3523d);
            throw e4;
        }
    }

    /* renamed from: a */
    public static void m10501a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    /* renamed from: c */
    public static void m10500c(ZipFile zipFile, ZipEntry zipEntry, C1527a c1527a, String str) throws IOException, FileNotFoundException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(C0552c.m12192b("tmp-", str), ".zip", c1527a.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                Log.i("MultiDex", "Renaming to " + c1527a.getPath());
                if (createTempFile.renameTo(c1527a)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + c1527a.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + c1527a.getAbsolutePath() + "\")");
        } finally {
            m10501a(inputStream);
            createTempFile.delete();
        }
    }

    /* renamed from: d */
    public static long m10499d(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: e */
    public static long m10498e(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            C1528d.C1529a m10493a = C1528d.m10493a(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = m10493a.f3528b;
            randomAccessFile.seek(m10493a.f3527a);
            int min = (int) Math.min((long) Http2Stream.EMIT_BUFFER_SIZE, j);
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int read = randomAccessFile.read(bArr, 0, min);
                if (read == -1) {
                    break;
                }
                crc32.update(bArr, 0, read);
                j -= read;
                if (j == 0) {
                    break;
                }
                min = (int) Math.min((long) Http2Stream.EMIT_BUFFER_SIZE, j);
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            if (value == -1) {
                return value - 1;
            }
            return value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    /* renamed from: j */
    public static void m10494j(Context context, long j, long j2, ArrayList arrayList) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i = 2;
        while (it.hasNext()) {
            C1527a c1527a = (C1527a) it.next();
            edit.putLong(C0235r.m12816a("dex.crc.", i), c1527a.f3526a);
            edit.putLong("dex.time." + i, c1527a.lastModified());
            i++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f3525f.release();
        this.f3524e.close();
        this.f3523d.close();
    }

    /* renamed from: f */
    public final ArrayList m10497f(Context context, boolean z) throws IOException {
        String str;
        ArrayList arrayList;
        boolean z2;
        StringBuilder sb = new StringBuilder("MultiDexExtractor.load(");
        File file = this.f3520a;
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(z);
        sb.append(", )");
        Log.i("MultiDex", sb.toString());
        if (this.f3525f.isValid()) {
            if (!z) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
                if (sharedPreferences.getLong("timestamp", -1L) == m10499d(file) && sharedPreferences.getLong("crc", -1L) == this.f3521b) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    try {
                        arrayList = m10496g(context);
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    }
                    Log.i("MultiDex", "load found " + arrayList.size() + " secondary dex files");
                    return arrayList;
                }
            }
            if (z) {
                str = "Forced extraction must be performed.";
            } else {
                str = "Detected that extraction must be performed.";
            }
            Log.i("MultiDex", str);
            ArrayList m10495h = m10495h();
            m10494j(context, m10499d(file), this.f3521b, m10495h);
            arrayList = m10495h;
            Log.i("MultiDex", "load found " + arrayList.size() + " secondary dex files");
            return arrayList;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    /* renamed from: g */
    public final ArrayList m10496g(Context context) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = this.f3520a.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i - 1);
        for (int i2 = 2; i2 <= i; i2++) {
            C1527a c1527a = new C1527a(this.f3522c, str + i2 + ".zip");
            if (c1527a.isFile()) {
                c1527a.f3526a = m10498e(c1527a);
                long j = sharedPreferences.getLong("dex.crc." + i2, -1L);
                long j2 = sharedPreferences.getLong("dex.time." + i2, -1L);
                long lastModified = c1527a.lastModified();
                if (j2 == lastModified && j == c1527a.f3526a) {
                    arrayList.add(c1527a);
                } else {
                    throw new IOException("Invalid extracted dex: " + c1527a + " (key \"\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + c1527a.f3526a);
                }
            } else {
                throw new IOException("Missing extracted secondary dex file '" + c1527a.getPath() + "'");
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final ArrayList m10495h() throws IOException {
        Throwable th;
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder();
        File file = this.f3520a;
        sb.append(file.getName());
        sb.append(".classes");
        String sb2 = sb.toString();
        C1525b c1525b = new C1525b();
        File file2 = this.f3522c;
        File[] listFiles = file2.listFiles(c1525b);
        String str2 = "MultiDex";
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + file2.getPath() + ").");
        } else {
            for (File file3 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file3.getPath() + " of size " + file3.length());
                if (!file3.delete()) {
                    Log.w("MultiDex", "Failed to delete old file " + file3.getPath());
                } else {
                    Log.i("MultiDex", "Deleted old file " + file3.getPath());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            int i = 2;
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                C1527a c1527a = new C1527a(file2, sb2 + i + ".zip");
                arrayList.add(c1527a);
                Log.i(str2, "Extraction is needed for file " + c1527a);
                int i2 = 0;
                boolean z2 = false;
                while (i2 < 3 && !z2) {
                    int i3 = i2 + 1;
                    m10500c(zipFile, entry, c1527a, sb2);
                    String str3 = str2;
                    try {
                        c1527a.f3526a = m10498e(c1527a);
                        z = true;
                        str2 = str3;
                    } catch (IOException e) {
                        try {
                            str2 = str3;
                            Log.w(str2, "Failed to read crc from " + c1527a.getAbsolutePath(), e);
                            z = false;
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = str3;
                            th = th;
                            try {
                                zipFile.close();
                            } catch (IOException e2) {
                                Log.w(str2, "Failed to close resource", e2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str2 = str3;
                        zipFile.close();
                        throw th;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Extraction ");
                    if (z) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb3.append(str);
                    sb3.append(" '");
                    sb3.append(c1527a.getAbsolutePath());
                    sb3.append("': length ");
                    ZipEntry zipEntry = entry;
                    String str4 = sb2;
                    sb3.append(c1527a.length());
                    sb3.append(" - crc: ");
                    sb3.append(c1527a.f3526a);
                    Log.i(str2, sb3.toString());
                    if (!z) {
                        c1527a.delete();
                        if (c1527a.exists()) {
                            Log.w(str2, "Failed to delete corrupted secondary dex '" + c1527a.getPath() + "'");
                        }
                    }
                    sb2 = str4;
                    entry = zipEntry;
                    z2 = z;
                    i2 = i3;
                }
                String str5 = sb2;
                if (z2) {
                    i++;
                    entry = zipFile.getEntry("classes" + i + ".dex");
                    sb2 = str5;
                } else {
                    throw new IOException("Could not create zip file " + c1527a.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w(str2, "Failed to close resource", e3);
            }
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
