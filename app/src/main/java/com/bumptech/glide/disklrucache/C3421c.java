package com.bumptech.glide.disklrucache;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.disklrucache.c */
/* loaded from: classes.dex */
public final class C3421c {

    /* renamed from: a */
    public static final Charset f9074a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static void m6764a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                m6764a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
