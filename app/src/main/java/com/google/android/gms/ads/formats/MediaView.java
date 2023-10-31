package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.MediaContent;

@Deprecated
/* loaded from: classes.dex */
public class MediaView extends FrameLayout {
    private MediaContent zza;
    private ImageView.ScaleType zzb;

    public MediaView(@NonNull Context context) {
        super(context);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.zzb = scaleType;
    }

    public void setMediaContent(@NonNull MediaContent mediaContent) {
        this.zza = mediaContent;
    }
}
