package com.vungle.warren.log;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.vungle.warren.log.b */
/* loaded from: classes3.dex */
public final class C9830b implements Comparator<File> {
    @Override // java.util.Comparator
    public final int compare(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }
}
