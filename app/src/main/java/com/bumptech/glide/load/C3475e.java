package com.bumptech.glide.load;

import androidx.annotation.Nullable;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.e */
/* loaded from: classes.dex */
public final class C3475e extends IOException {
    public C3475e(int i, String str, @Nullable IOException iOException) {
        super(str + ", status code: " + i, iOException);
    }
}
