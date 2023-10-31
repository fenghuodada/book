package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.preferences.protobuf.C1169e;
import com.bumptech.glide.ComponentCallbacks2C3409b;
import com.bumptech.glide.gifdecoder.C3427b;
import com.bumptech.glide.gifdecoder.C3428c;
import com.bumptech.glide.gifdecoder.C3429d;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.EnumC3445b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import com.bumptech.glide.load.resource.C3770i;
import com.bumptech.glide.load.resource.gif.C3757c;
import com.bumptech.glide.util.C3855f;
import com.bumptech.glide.util.C3861k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.gif.a */
/* loaded from: classes.dex */
public final class C3753a implements InterfaceC3583k<ByteBuffer, C3757c> {

    /* renamed from: f */
    public static final C3754a f9733f = new C3754a();

    /* renamed from: g */
    public static final C3755b f9734g = new C3755b();

    /* renamed from: a */
    public final Context f9735a;

    /* renamed from: b */
    public final List<ImageHeaderParser> f9736b;

    /* renamed from: c */
    public final C3755b f9737c;

    /* renamed from: d */
    public final C3754a f9738d;

    /* renamed from: e */
    public final C3756b f9739e;

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.resource.gif.a$a */
    /* loaded from: classes.dex */
    public static class C3754a {
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.resource.gif.a$b */
    /* loaded from: classes.dex */
    public static class C3755b {

        /* renamed from: a */
        public final ArrayDeque f9740a;

        public C3755b() {
            char[] cArr = C3861k.f9956a;
            this.f9740a = new ArrayDeque(0);
        }

        /* renamed from: a */
        public final synchronized void m6514a(C3428c c3428c) {
            c3428c.f9109b = null;
            c3428c.f9110c = null;
            this.f9740a.offer(c3428c);
        }
    }

    public C3753a(Context context, ArrayList arrayList, InterfaceC3485d interfaceC3485d, InterfaceC3483b interfaceC3483b) {
        C3754a c3754a = f9733f;
        this.f9735a = context.getApplicationContext();
        this.f9736b = arrayList;
        this.f9738d = c3754a;
        this.f9739e = new C3756b(interfaceC3485d, interfaceC3483b);
        this.f9737c = f9734g;
    }

    /* renamed from: d */
    public static int m6515d(C3427b c3427b, int i, int i2) {
        int highestOneBit;
        int min = Math.min(c3427b.f9103g / i2, c3427b.f9102f / i);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder m11130b = C1169e.m11130b("Downsampling GIF, sampleSize: ", max, ", target dimens: [", i, "x");
            m11130b.append(i2);
            m11130b.append("], actual dimens: [");
            m11130b.append(c3427b.f9102f);
            m11130b.append("x");
            m11130b.append(c3427b.f9103g);
            m11130b.append("]");
            Log.v("BufferGifDecoder", m11130b.toString());
        }
        return max;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: a */
    public final boolean mo6504a(@NonNull ByteBuffer byteBuffer, @NonNull C3581i c3581i) throws IOException {
        ImageHeaderParser.ImageType imageType;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (((Boolean) c3581i.m6606c(C3767i.f9779b)).booleanValue()) {
            return false;
        }
        if (byteBuffer2 == null) {
            imageType = ImageHeaderParser.ImageType.UNKNOWN;
        } else {
            List<ImageHeaderParser> list = this.f9736b;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    ImageHeaderParser.ImageType mo6537a = list.get(i).mo6537a(byteBuffer2);
                    if (mo6537a != ImageHeaderParser.ImageType.UNKNOWN) {
                        imageType = mo6537a;
                        break;
                    }
                    i++;
                } else {
                    imageType = ImageHeaderParser.ImageType.UNKNOWN;
                    break;
                }
            }
        }
        if (imageType != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.InterfaceC3583k
    /* renamed from: b */
    public final InterfaceC3573x<C3757c> mo6503b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull C3581i c3581i) throws IOException {
        C3428c c3428c;
        ByteBuffer byteBuffer2 = byteBuffer;
        C3755b c3755b = this.f9737c;
        synchronized (c3755b) {
            C3428c c3428c2 = (C3428c) c3755b.f9740a.poll();
            if (c3428c2 == null) {
                c3428c2 = new C3428c();
            }
            c3428c = c3428c2;
            c3428c.f9109b = null;
            Arrays.fill(c3428c.f9108a, (byte) 0);
            c3428c.f9110c = new C3427b();
            c3428c.f9111d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            c3428c.f9109b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            c3428c.f9109b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return m6516c(byteBuffer2, i, i2, c3428c, c3581i);
        } finally {
            this.f9737c.m6514a(c3428c);
        }
    }

    @Nullable
    /* renamed from: c */
    public final C3760e m6516c(ByteBuffer byteBuffer, int i, int i2, C3428c c3428c, C3581i c3581i) {
        Bitmap.Config config;
        int i3 = C3855f.f9946b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C3427b m6762b = c3428c.m6762b();
            if (m6762b.f9099c > 0 && m6762b.f9098b == 0) {
                if (c3581i.m6606c(C3767i.f9778a) == EnumC3445b.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int m6515d = m6515d(m6762b, i, i2);
                C3754a c3754a = this.f9738d;
                C3756b c3756b = this.f9739e;
                c3754a.getClass();
                C3429d c3429d = new C3429d(c3756b, m6762b, byteBuffer, m6515d);
                c3429d.m6749h(config);
                c3429d.mo6755b();
                Bitmap mo6756a = c3429d.mo6756a();
                if (mo6756a == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C3855f.m6413a(elapsedRealtimeNanos));
                    }
                    return null;
                }
                return new C3760e(new C3757c(new C3757c.C3758a(new C3762g(ComponentCallbacks2C3409b.m6786b(this.f9735a), c3429d, i, i2, C3770i.f9784b, mo6756a))));
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C3855f.m6413a(elapsedRealtimeNanos));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C3855f.m6413a(elapsedRealtimeNanos));
            }
        }
    }
}
