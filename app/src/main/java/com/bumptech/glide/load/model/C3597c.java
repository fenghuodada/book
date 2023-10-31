package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3447d;
import com.bumptech.glide.util.C3846a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.model.c */
/* loaded from: classes.dex */
public final class C3597c implements InterfaceC3447d<ByteBuffer> {
    @Override // com.bumptech.glide.load.InterfaceC3447d
    /* renamed from: a */
    public final boolean mo6512a(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull C3581i c3581i) {
        try {
            C3846a.m6418b(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
