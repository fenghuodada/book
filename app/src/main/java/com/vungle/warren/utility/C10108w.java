package com.vungle.warren.utility;

import androidx.annotation.VisibleForTesting;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.vungle.warren.utility.w */
/* loaded from: classes3.dex */
public final class C10108w {

    /* renamed from: a */
    public static final /* synthetic */ int f20355a = 0;

    /* renamed from: com.vungle.warren.utility.w$a */
    /* loaded from: classes3.dex */
    public static class C10109a extends IOException {
        public C10109a() {
            super("File is outside extraction target directory.");
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    public static void m1237a(InputStream inputStream, String str) throws IOException {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        File file = new File(str);
        C10089k.m1268b(file);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        C10089k.m1269a(inputStream);
                        C10089k.m1269a(bufferedOutputStream);
                        C10089k.m1269a(fileOutputStream);
                        return;
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                C10089k.m1269a(inputStream);
                C10089k.m1269a(bufferedOutputStream2);
                C10089k.m1269a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }
}
