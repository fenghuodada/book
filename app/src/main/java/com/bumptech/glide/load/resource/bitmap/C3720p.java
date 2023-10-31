package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.C1169e;
import com.bumptech.glide.load.C3578h;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.EnumC3445b;
import com.bumptech.glide.load.EnumC3582j;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import com.bumptech.glide.load.resource.bitmap.AbstractC3710l;
import com.bumptech.glide.util.C3860j;
import com.bumptech.glide.util.C3861k;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: com.bumptech.glide.load.resource.bitmap.p */
/* loaded from: classes.dex */
public final class C3720p {

    /* renamed from: f */
    public static final C3578h<EnumC3445b> f9677f = C3578h.m6607a(EnumC3445b.PREFER_ARGB_8888, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g */
    public static final C3578h<EnumC3582j> f9678g = C3578h.m6607a(EnumC3582j.SRGB, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h */
    public static final C3578h<Boolean> f9679h;

    /* renamed from: i */
    public static final C3578h<Boolean> f9680i;

    /* renamed from: j */
    public static final Set<String> f9681j;

    /* renamed from: k */
    public static final C3721a f9682k;

    /* renamed from: l */
    public static final ArrayDeque f9683l;

    /* renamed from: a */
    public final InterfaceC3485d f9684a;

    /* renamed from: b */
    public final DisplayMetrics f9685b;

    /* renamed from: c */
    public final InterfaceC3483b f9686c;

    /* renamed from: d */
    public final List<ImageHeaderParser> f9687d;

    /* renamed from: e */
    public final C3728u f9688e;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.p$a */
    /* loaded from: classes.dex */
    public class C3721a implements InterfaceC3722b {
        @Override // com.bumptech.glide.load.resource.bitmap.C3720p.InterfaceC3722b
        /* renamed from: a */
        public final void mo6541a(Bitmap bitmap, InterfaceC3485d interfaceC3485d) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C3720p.InterfaceC3722b
        /* renamed from: b */
        public final void mo6540b() {
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.p$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3722b {
        /* renamed from: a */
        void mo6541a(Bitmap bitmap, InterfaceC3485d interfaceC3485d) throws IOException;

        /* renamed from: b */
        void mo6540b();
    }

    static {
        AbstractC3710l.C3715e c3715e = AbstractC3710l.f9670a;
        Boolean bool = Boolean.FALSE;
        f9679h = C3578h.m6607a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f9680i = C3578h.m6607a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f9681j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f9682k = new C3721a();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = C3861k.f9956a;
        f9683l = new ArrayDeque(0);
    }

    public C3720p(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC3485d interfaceC3485d, InterfaceC3483b interfaceC3483b) {
        if (C3728u.f9696j == null) {
            synchronized (C3728u.class) {
                if (C3728u.f9696j == null) {
                    C3728u.f9696j = new C3728u();
                }
            }
        }
        this.f9688e = C3728u.f9696j;
        this.f9687d = arrayList;
        C3860j.m6404b(displayMetrics);
        this.f9685b = displayMetrics;
        C3860j.m6404b(interfaceC3485d);
        this.f9684a = interfaceC3485d;
        C3860j.m6404b(interfaceC3483b);
        this.f9686c = interfaceC3483b;
    }

    /* renamed from: c */
    public static Bitmap m6546c(InterfaceC3729v interfaceC3729v, BitmapFactory.Options options, InterfaceC3722b interfaceC3722b, InterfaceC3485d interfaceC3485d) throws IOException {
        if (!options.inJustDecodeBounds) {
            interfaceC3722b.mo6540b();
            interfaceC3729v.mo6530c();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = C3682c0.f9647b;
        lock.lock();
        try {
            try {
                Bitmap mo6531b = interfaceC3729v.mo6531b(options);
                lock.unlock();
                return mo6531b;
            } catch (IllegalArgumentException e) {
                IOException m6544e = m6544e(e, i, i2, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", m6544e);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        interfaceC3485d.mo6538d(bitmap);
                        options.inBitmap = null;
                        Bitmap m6546c = m6546c(interfaceC3729v, options, interfaceC3722b, interfaceC3485d);
                        C3682c0.f9647b.unlock();
                        return m6546c;
                    } catch (IOException unused) {
                        throw m6544e;
                    }
                }
                throw m6544e;
            }
        } catch (Throwable th) {
            C3682c0.f9647b.unlock();
            throw th;
        }
    }

    @Nullable
    @TargetApi(19)
    /* renamed from: d */
    public static String m6545d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: e */
    public static IOException m6544e(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        StringBuilder m11130b = C1169e.m11130b("Exception decoding bitmap, outWidth: ", i, ", outHeight: ", i2, ", outMimeType: ");
        m11130b.append(str);
        m11130b.append(", inBitmap: ");
        m11130b.append(m6545d(options.inBitmap));
        return new IOException(m11130b.toString(), illegalArgumentException);
    }

    /* renamed from: f */
    public static void m6543f(BitmapFactory.Options options) {
        m6542g(options);
        ArrayDeque arrayDeque = f9683l;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    /* renamed from: g */
    public static void m6542g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: a */
    public final C3687e m6548a(InterfaceC3729v interfaceC3729v, int i, int i2, C3581i c3581i, InterfaceC3722b interfaceC3722b) throws IOException {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z;
        byte[] bArr = (byte[]) this.f9686c.mo6702c(65536, byte[].class);
        synchronized (C3720p.class) {
            ArrayDeque arrayDeque = f9683l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m6542g(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        EnumC3445b enumC3445b = (EnumC3445b) c3581i.m6606c(f9677f);
        EnumC3582j enumC3582j = (EnumC3582j) c3581i.m6606c(f9678g);
        AbstractC3710l abstractC3710l = (AbstractC3710l) c3581i.m6606c(AbstractC3710l.f9675f);
        boolean booleanValue = ((Boolean) c3581i.m6606c(f9679h)).booleanValue();
        C3578h<Boolean> c3578h = f9680i;
        if (c3581i.m6606c(c3578h) != null && ((Boolean) c3581i.m6606c(c3578h)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        try {
            return C3687e.m6567b(m6547b(interfaceC3729v, options2, abstractC3710l, enumC3445b, enumC3582j, z, i, i2, booleanValue, interfaceC3722b), this.f9684a);
        } finally {
            m6543f(options2);
            this.f9686c.put(bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ca  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap m6547b(com.bumptech.glide.load.resource.bitmap.InterfaceC3729v r37, android.graphics.BitmapFactory.Options r38, com.bumptech.glide.load.resource.bitmap.AbstractC3710l r39, com.bumptech.glide.load.EnumC3445b r40, com.bumptech.glide.load.EnumC3582j r41, boolean r42, int r43, int r44, boolean r45, com.bumptech.glide.load.resource.bitmap.C3720p.InterfaceC3722b r46) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C3720p.m6547b(com.bumptech.glide.load.resource.bitmap.v, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.l, com.bumptech.glide.load.b, com.bumptech.glide.load.j, boolean, int, int, boolean, com.bumptech.glide.load.resource.bitmap.p$b):android.graphics.Bitmap");
    }
}
