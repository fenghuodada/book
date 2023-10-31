package com.bumptech.glide.load.resource;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EnumC3445b;
import com.bumptech.glide.load.EnumC3582j;
import com.bumptech.glide.load.resource.bitmap.AbstractC3710l;

/* renamed from: com.bumptech.glide.load.resource.g */
/* loaded from: classes.dex */
public final class C3751g implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a */
    public final /* synthetic */ int f9726a;

    /* renamed from: b */
    public final /* synthetic */ int f9727b;

    /* renamed from: c */
    public final /* synthetic */ boolean f9728c;

    /* renamed from: d */
    public final /* synthetic */ EnumC3445b f9729d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC3710l f9730e;

    /* renamed from: f */
    public final /* synthetic */ EnumC3582j f9731f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC3769h f9732g;

    /* renamed from: com.bumptech.glide.load.resource.g$a */
    /* loaded from: classes.dex */
    public class C3752a implements ImageDecoder.OnPartialImageListener {
        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public final boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C3751g(AbstractC3769h abstractC3769h, int i, int i2, boolean z, EnumC3445b enumC3445b, AbstractC3710l abstractC3710l, EnumC3582j enumC3582j) {
        this.f9732g = abstractC3769h;
        this.f9726a = i;
        this.f9727b = i2;
        this.f9728c = z;
        this.f9729d = enumC3445b;
        this.f9730e = abstractC3710l;
        this.f9731f = enumC3582j;
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    @SuppressLint({"Override"})
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        boolean z = false;
        if (this.f9732g.f9783a.m6533a(this.f9726a, this.f9727b, this.f9728c, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f9729d == EnumC3445b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C3752a());
        size = imageInfo.getSize();
        int i = this.f9726a;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.f9727b;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float mo6554b = this.f9730e.mo6554b(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * mo6554b);
        int round2 = Math.round(size.getHeight() * mo6554b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + mo6554b);
        }
        imageDecoder.setTargetSize(round, round2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28) {
            if (i3 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                imageDecoder.setTargetColorSpace(colorSpace);
                return;
            }
            return;
        }
        if (this.f9731f == EnumC3582j.DISPLAY_P3) {
            colorSpace3 = imageInfo.getColorSpace();
            if (colorSpace3 != null) {
                colorSpace4 = imageInfo.getColorSpace();
                isWideGamut = colorSpace4.isWideGamut();
                if (isWideGamut) {
                    z = true;
                }
            }
        }
        colorSpace2 = ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        imageDecoder.setTargetColorSpace(colorSpace2);
    }
}
