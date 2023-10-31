package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3447d;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.u */
/* loaded from: classes.dex */
public final class C3659u implements InterfaceC3447d<InputStream> {

    /* renamed from: a */
    public final InterfaceC3483b f9621a;

    public C3659u(InterfaceC3483b interfaceC3483b) {
        this.f9621a = interfaceC3483b;
    }

    @Override // com.bumptech.glide.load.InterfaceC3447d
    /* renamed from: a */
    public final boolean mo6512a(@NonNull InputStream inputStream, @NonNull File file, @NonNull C3581i c3581i) {
        FileOutputStream fileOutputStream;
        InputStream inputStream2 = inputStream;
        InterfaceC3483b interfaceC3483b = this.f9621a;
        byte[] bArr = (byte[]) interfaceC3483b.mo6702c(65536, byte[].class);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream2.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream2 = fileOutputStream;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        interfaceC3483b.put(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        interfaceC3483b.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
                interfaceC3483b.put(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }
}
