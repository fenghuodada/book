package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.C3576f;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C3464k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import com.bumptech.glide.util.C3860j;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.bitmap.v */
/* loaded from: classes.dex */
public interface InterfaceC3729v {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.v$a */
    /* loaded from: classes.dex */
    public static final class C3730a implements InterfaceC3729v {

        /* renamed from: a */
        public final C3464k f9704a;

        /* renamed from: b */
        public final InterfaceC3483b f9705b;

        /* renamed from: c */
        public final List<ImageHeaderParser> f9706c;

        public C3730a(InterfaceC3483b interfaceC3483b, InputStream inputStream, List list) {
            C3860j.m6404b(interfaceC3483b);
            this.f9705b = interfaceC3483b;
            C3860j.m6404b(list);
            this.f9706c = list;
            this.f9704a = new C3464k(inputStream, interfaceC3483b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3729v
        /* renamed from: a */
        public final int mo6532a() throws IOException {
            C3735z c3735z = this.f9704a.f9212a;
            c3735z.reset();
            return C3576f.m6609a(this.f9705b, c3735z, this.f9706c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3729v
        @Nullable
        /* renamed from: b */
        public final Bitmap mo6531b(BitmapFactory.Options options) throws IOException {
            C3735z c3735z = this.f9704a.f9212a;
            c3735z.reset();
            return BitmapFactory.decodeStream(c3735z, null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3729v
        /* renamed from: c */
        public final void mo6530c() {
            C3735z c3735z = this.f9704a.f9212a;
            synchronized (c3735z) {
                c3735z.f9716c = c3735z.f9714a.length;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3729v
        /* renamed from: d */
        public final ImageHeaderParser.ImageType mo6529d() throws IOException {
            C3735z c3735z = this.f9704a.f9212a;
            c3735z.reset();
            return C3576f.m6608b(this.f9705b, c3735z, this.f9706c);
        }
    }

    @RequiresApi(21)
    /* renamed from: com.bumptech.glide.load.resource.bitmap.v$b */
    /* loaded from: classes.dex */
    public static final class C3731b implements InterfaceC3729v {

        /* renamed from: a */
        public final InterfaceC3483b f9707a;

        /* renamed from: b */
        public final List<ImageHeaderParser> f9708b;

        /* renamed from: c */
        public final ParcelFileDescriptorRewinder f9709c;

        public C3731b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, InterfaceC3483b interfaceC3483b) {
            C3860j.m6404b(interfaceC3483b);
            this.f9707a = interfaceC3483b;
            C3860j.m6404b(list);
            this.f9708b = list;
            this.f9709c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3729v
        /* renamed from: a */
        public final int mo6532a() throws IOException {
            C3735z c3735z;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f9709c;
            InterfaceC3483b interfaceC3483b = this.f9707a;
            List<ImageHeaderParser> list = this.f9708b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                try {
                    c3735z = new C3735z(new FileInputStream(parcelFileDescriptorRewinder.mo6526a().getFileDescriptor()), interfaceC3483b);
                } catch (Throwable th) {
                    th = th;
                    c3735z = null;
                }
                try {
                    int mo6535c = imageHeaderParser.mo6535c(c3735z, interfaceC3483b);
                    try {
                        c3735z.close();
                    } catch (IOException unused) {
                    }
                    parcelFileDescriptorRewinder.mo6526a();
                    if (mo6535c != -1) {
                        return mo6535c;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (c3735z != null) {
                        try {
                            c3735z.close();
                        } catch (IOException unused2) {
                        }
                    }
                    parcelFileDescriptorRewinder.mo6526a();
                    throw th;
                }
            }
            return -1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3729v
        @Nullable
        /* renamed from: b */
        public final Bitmap mo6531b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f9709c.mo6526a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3729v
        /* renamed from: c */
        public final void mo6530c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3729v
        /* renamed from: d */
        public final ImageHeaderParser.ImageType mo6529d() throws IOException {
            C3735z c3735z;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f9709c;
            InterfaceC3483b interfaceC3483b = this.f9707a;
            List<ImageHeaderParser> list = this.f9708b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                try {
                    c3735z = new C3735z(new FileInputStream(parcelFileDescriptorRewinder.mo6526a().getFileDescriptor()), interfaceC3483b);
                } catch (Throwable th) {
                    th = th;
                    c3735z = null;
                }
                try {
                    ImageHeaderParser.ImageType mo6536b = imageHeaderParser.mo6536b(c3735z);
                    try {
                        c3735z.close();
                    } catch (IOException unused) {
                    }
                    parcelFileDescriptorRewinder.mo6526a();
                    if (mo6536b != ImageHeaderParser.ImageType.UNKNOWN) {
                        return mo6536b;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (c3735z != null) {
                        try {
                            c3735z.close();
                        } catch (IOException unused2) {
                        }
                    }
                    parcelFileDescriptorRewinder.mo6526a();
                    throw th;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: a */
    int mo6532a() throws IOException;

    @Nullable
    /* renamed from: b */
    Bitmap mo6531b(BitmapFactory.Options options) throws IOException;

    /* renamed from: c */
    void mo6530c();

    /* renamed from: d */
    ImageHeaderParser.ImageType mo6529d() throws IOException;
}
