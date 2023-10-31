package androidx.multidex;

import java.io.File;
import java.io.FileFilter;

/* renamed from: androidx.multidex.b */
/* loaded from: classes.dex */
public final class C1525b implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
