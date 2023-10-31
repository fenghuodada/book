package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.EnumC3446c;
import com.bumptech.glide.load.InterfaceC3584l;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.util.C3846a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.gif.d */
/* loaded from: classes.dex */
public final class C3759d implements InterfaceC3584l<C3757c> {
    @Override // com.bumptech.glide.load.InterfaceC3447d
    /* renamed from: a */
    public final boolean mo6512a(@NonNull Object obj, @NonNull File file, @NonNull C3581i c3581i) {
        try {
            C3846a.m6418b(((C3757c) ((InterfaceC3573x) obj).get()).f9743a.f9753a.f9755a.getData().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC3584l
    @NonNull
    /* renamed from: b */
    public final EnumC3446c mo6511b(@NonNull C3581i c3581i) {
        return EnumC3446c.SOURCE;
    }
}
